package com.knoldus;

import twitter4j.Status;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * This class contains method for likes operations.
 */
public class Likes extends TwitterList {
    /**
     * This method is used to count likes on tweet form high to low.
     * @param hashTag is the tweets needed to be retrieved
     * @return list of count of likes
     */
    public List<Integer> likesCountHigherToLower(String hashTag) {

        return getTwitterStatus(hashTag).stream()
                .map(Status::getFavoriteCount)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}
