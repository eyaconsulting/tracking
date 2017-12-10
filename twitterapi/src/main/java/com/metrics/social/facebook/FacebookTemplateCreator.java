package com.metrics.social.facebook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.social.connect.Connection;
import org.springframework.social.connect.support.ConnectionFactoryRegistry;
import org.springframework.social.facebook.api.Facebook;
import org.springframework.social.facebook.api.impl.FacebookTemplate;
import org.springframework.social.facebook.connect.FacebookConnectionFactory;
import org.springframework.social.oauth2.AccessGrant;
import org.springframework.social.oauth2.GrantType;
import org.springframework.social.oauth2.OAuth2Operations;
import org.springframework.social.oauth2.OAuth2Parameters;
import org.springframework.stereotype.Component;

import com.google.common.base.Preconditions;

@Component
public class FacebookTemplateCreator {
	

	   @Autowired
	   private Environment env;
	   //
	   public Facebook getFacebookTemplate(String accountName) {
	      String accessToken = env.getProperty(accountName + ".accessToken");
	      Preconditions.checkNotNull(accessToken);	      
	      FacebookTemplate facebookTemplate = new FacebookTemplate(accessToken);
	      //FacebookTemplate facebookTemplate = new FacebookTemplate("9601b48743b733695a58b0ac67500207" , "","248954412118698");
	      
	     
	      
	      
	      return facebookTemplate;
	   }


}
