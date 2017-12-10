package com.metrics.social.facebook;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.social.facebook.api.Facebook;
import org.springframework.social.facebook.api.Page;
import org.springframework.social.facebook.api.PagedList;
import org.springframework.social.facebook.api.Post;
import org.springframework.social.facebook.api.Reference;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.util.SocketUtils;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

import com.sun.org.apache.xalan.internal.xsltc.runtime.Parameter;

@Repository(value = "facebookService")
@Service(value = "facebookService")
public class FacebookService {
	
	 public void getListFacebooks(Facebook facebook, String keywords){
		   
		   @SuppressWarnings("unused")
		   PagedList<Reference> results = facebook.userOperations().search(keywords);
		   PagedList<Page> pageList = facebook.pageOperations().search(keywords);
		   for(Page page:pageList){
			   System.out.println("=="+page.getId()+"==="+page.getDescription());
			   Map<String, Object> maps =  page.getExtraData();
			   int likespage = page.getLikes(); 
			   System.out.println("likes "+likespage);
			   
			   HttpHeaders headers = new HttpHeaders();
			    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
			    HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
			   
			   //RequestEntity requestEntity = new FacebookService();
			   RestOperations restOperations  = facebook.restOperations();
			   restOperations.exchange("https://graph.facebook.com/v2.5/"+page.getId()+"/feed", HttpMethod.GET, entity, String.class);
			  // JsonNode responseNode = fetchConnectionList(graphApi.getBaseGraphApiUrl() + page.getId() + "/feed", pagedListParameters);
				
		   }
		   
		   //facebook.feedOperations().getFeed()
		   
		   for(Reference reference:results){
			   System.out.println("=="+reference.getName()+"==="+reference.getId()+"===");
			   List<Post> feed = facebook.feedOperations().getFeed(reference.getId());
			   for(Post post:feed){
				  System.out.println("reference ::"+ reference.getId()+"::"+ post.getName()+"::"+post.getMessage());
			   }
		   }
		   
		  
		   
		   System.out.println();
		   
	   }

}
