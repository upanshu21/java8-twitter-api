package com.knoldus;

import com.typesafe.config.Config;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

/**
 * This is the class which contains twitter authentication related methods.
 */
public class TwitterConfiguration {
    /**
     * This method is used to create instance of twitter by connecting to twitter account.
     * @return twitter instance of the account
     */
    public static Twitter getTwitterInstance() {

        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("G0x6p9CyXx5RVbK21ciHZvB2H")
                .setOAuthConsumerSecret("NrAjcRC8FVYgwWM4qsBConn4HefS5IzUFHDoNDcs8dh2YBWcvL")
                .setOAuthAccessToken("3103621308-FoEGRFM2kNYDmFdHVl38WpA10DzkXIxehx4Jit0")
                .setOAuthAccessTokenSecret("Aah1pOyPT9noHAkEWOeLRAdQz1aZh9LglmJtA43np2jH8");
        TwitterFactory tf = new TwitterFactory(cb.build());
        Twitter twitter = tf.getInstance();
        return twitter;
    }

}



