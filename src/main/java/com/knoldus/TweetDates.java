package com.knoldus;

import twitter4j.Status;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import java.util.stream.Collectors;

/**
 * This class contains methods for tweet operations according to date.
 */
public class TweetDates extends TwitterList {

    /**
     * This method is used retrieve list of tweets for a particular date.
     * @param hashTag is the tweets needed to be retrieved
     * @param date is the date for which tweet are retrieved
     * @return list of tweets for given date
     */
    public List<Status> tweetsForParticularDate(String hashTag, String date) {

        LocalDate dateOfTweet = LocalDate.parse(date);
        return getTwitterStatus(hashTag).stream()
                .filter(status -> status.getCreatedAt()
                        .toInstant()
                        .atZone(ZoneId.systemDefault())
                        .toLocalDate()
                        .isEqual(dateOfTweet))
                .collect(Collectors.toList());
    }

    /**
     * This method is used to count the number on tweets on a given date.
     * @param hashTag is the tweets needed to be retrieved
     * @param date is the date for which count of tweet is calculated
     * @return count of tweets
     */
    public Long numberOfTweetsOnDate(String hashTag, String date) {

        LocalDate dateOfTweet = LocalDate.parse(date);
        return getTwitterStatus(hashTag).stream()
                .filter(status -> status.getCreatedAt()
                        .toInstant()
                        .atZone(ZoneId.systemDefault())
                        .toLocalDate()
                        .isEqual(dateOfTweet))
                .count();
    }

}
