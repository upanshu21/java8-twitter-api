package com.knoldus;

import twitter4j.Query;
import twitter4j.Status;
import twitter4j.TwitterException;
import java.util.ArrayList;
import java.util.List;

/**
 * This class contains methods for retrieving twitter statuses.
 */
public class TwitterList extends TwitterConfiguration {
    /**
     * This method contains method to retrieve twitter statuses.
     * @param hashTag is the tweets needed to be retrieved
     * @return list of tweets
     */
    public List<Status> getTwitterStatus(String hashTag) {
        Query query = new Query(hashTag);
        List<Status> listOfTweets = new ArrayList<>();
        try {
            listOfTweets = getTwitterInstance().search(query).getTweets();
        } catch (TwitterException ex) {
            ex.printStackTrace();
        }
        return listOfTweets;
    }
}
