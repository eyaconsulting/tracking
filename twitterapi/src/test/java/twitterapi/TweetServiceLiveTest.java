package twitterapi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.social.twitter.api.Twitter;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.metrics.social.twetter.TwitterConfig;
import com.metrics.social.twetter.TwitterService;
import com.metrics.social.twetter.TwitterTemplateCreator;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { TwitterConfig.class })
public class TweetServiceLiveTest {
	
  
   @Autowired(required = true)
   @Qualifier(value = "twitterService")
   private TwitterService twitterService;
   @Autowired
   @Qualifier(value = "twitterCreator")
   private TwitterTemplateCreator twitterCreator;
   //
   // tests
   @Test
   public void whenTweeting_thenNoExceptions() {
      Twitter twitterTemplate = twitterCreator.getTwitterTemplate("SpringAtSO");
      twitterService.tweet(twitterTemplate, "First Tweet");
   }
}
