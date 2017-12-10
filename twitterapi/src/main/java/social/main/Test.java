package social.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.social.facebook.api.Facebook;
import org.springframework.social.twitter.api.Twitter;

import com.metrics.social.facebook.FacebookService;
import com.metrics.social.facebook.FacebookTemplateCreator;
import com.metrics.social.twetter.TwitterConfig;
import com.metrics.social.twetter.TwitterService;
import com.metrics.social.twetter.TwitterTemplateCreator;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(TwitterConfig.class);
        TwitterService twitterService = ctx.getBean(TwitterService.class);
        TwitterTemplateCreator twitterCreator = ctx.getBean(TwitterTemplateCreator.class);
        Twitter twitterTemplate = twitterCreator.getTwitterTemplate("SpringAtSO");
       // twitterService.tweet(twitterTemplate, "First Tweet");        
       //twitterService.getListTweets(twitterTemplate, "");
        
        //facebook
        FacebookService facebookService = ctx.getBean(FacebookService.class);
        FacebookTemplateCreator templateCreator = ctx.getBean(FacebookTemplateCreator.class);
        Facebook facebookTemplate = templateCreator.getFacebookTemplate("SpringAtFB");
        facebookService.getListFacebooks(facebookTemplate, "Elhiwar Ettounsi");
        
       
    }
}
