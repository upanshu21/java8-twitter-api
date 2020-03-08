package com.knoldus;

import twitter4j.Status;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * This class contains methods for filtering twitter posts.
 */
public class Post extends TwitterList {
    /**
     * This method is used to arrange post on basis of new to old.
     * @param hashTag is the tweets needed to be retrieved
     * @param limit is the limit of tweets
     * @return list of tweets in arranged order of new to old
     */
    public List<Status> filterPostNewerToOlder(String hashTag, int limit) {

        return getTwitterStatus(hashTag).stream()
                .limit(limit)
                .collect(Collectors.toList());
    }

    /**
     * This method is used to arrange post in order of old to new.
     * @param hashTag is the tweets needed to be retrieved
     * @param limit is the limit of tweets
     * @param offset is the position after which element needs to be retrieved
     * @return list of tweets from older to new
     */
    public List<Status> filterPostOlderToNewer(String hashTag, int limit, int offset) {

        return getTwitterStatus(hashTag).stream()
                .limit(limit)
                .skip(offset)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}
