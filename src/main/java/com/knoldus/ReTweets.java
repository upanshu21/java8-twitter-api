package com.knoldus;

import twitter4j.Status;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReTweets extends TwitterList {

    public List<Integer> reTweetCountHigherToLower(String hashTag) {

        return getTwitterStatus(hashTag).stream()
                .map(Status::getRetweetCount)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}
