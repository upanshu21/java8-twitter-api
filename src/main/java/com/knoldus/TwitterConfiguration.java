package com.knoldus;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;
import java.util.Properties;

/**
 * This is the class which contains twitter authentication related methods.
 */
public class TwitterConfiguration {
    /**
     * This method is used to create instance of twitter by connecting to twitter account.
     * @return twitter instance of the account
     */
    public static Twitter getTwitterInstance() {

        Config config = ConfigFactory.load();
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey(config.getString("consumer.key"))
                .setOAuthConsumerSecret(config.getString("consumer.secret"))
                .setOAuthAccessToken("token.key")
                .setOAuthAccessTokenSecret("token.secret");
        TwitterFactory tf = new TwitterFactory(cb.build());
        Twitter twitter = tf.getInstance();
        return twitter;
    }

}



