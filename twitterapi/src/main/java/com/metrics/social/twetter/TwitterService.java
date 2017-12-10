package com.metrics.social.twetter;




import java.util.List;
import java.util.stream.Collectors;

import org.springframework.social.twitter.api.SearchResults;
import org.springframework.social.twitter.api.Tweet;
import org.springframework.social.twitter.api.Twitter;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository(value = "twitterService")
@Service(value = "twitterService")
public class TwitterService {
  // private Logger logger = Logger.getLogger(TwitterService.class);
   //
   public void tweet(Twitter twitter, String tweetText) {
      try {
         twitter.timelineOperations().updateStatus(tweetText);
      } catch (RuntimeException ex) {
    	  ex.printStackTrace();
    	  
       //  logger.error("Unable to tweet" + tweetText, ex);
      }
   }
   public void getListTweets(Twitter twitter, String keywords){
	   
	  // @SuppressWarnings("unused")
	   SearchResults searchResults = twitter.searchOperations().search("awled moufida");
	   
	   List<Tweet> tweetsL = searchResults.getTweets();
	   
	   List<String> tweets =
			   searchResults.getTweets().stream()
			   .map(Tweet::getText).collect(Collectors.toList());
	   
	   for(Tweet tweet:tweetsL){
		   System.out.println(tweet.getFromUser()+","+tweet.getText()+", favoriteCount::"+tweet.getFavoriteCount()+", isFavorated::"+tweet.isFavorited()
		   +" ,retwiitCount::"+tweet.getRetweetCount());
	   }
	   
	   System.out.println("=================");
	   
   }
   
}
