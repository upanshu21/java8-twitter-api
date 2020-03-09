package com.knoldus;

/**
 * This class is the main class.
 */
public class Operations {

    public static void main(String[] args) {
        TweetDates objectOfTweetDates = new TweetDates();
        Likes objectOfLikes = new Likes();
        Post objectOfPost = new Post();

        System.out.println(objectOfPost.filterPostNewerToOlder("#messi",10));
        System.out.println(objectOfPost.filterPostOlderToNewer("#messi",10,5));
        System.out.println(objectOfLikes.likesCountHigherToLower("#messi"));
        System.out.println(objectOfTweetDates.tweetsForParticularDate("#messi", "2020-03-08"));
        System.out.println(objectOfTweetDates.numberOfTweetsOnDate("#messi","2020-03-08"));

        System.out.println(System.getenv("key"));
    }
}
