package com.livemention;

import java.util.Date;
import java.util.List;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mentiontracking.persistance.model.SampleTest;
import com.mentiontracking.persistance.model.TweetsTrack;
import com.mentiontracking.persistance.model.TwitterTrack;

@RestController
@ApplicationPath("/")
public class TwitterController {
	
	@Autowired
	TwitterTrackRepository twitterTrackRepository ;
	
	@Autowired
	TweetsTrackRepository tweetsTrackRepository;
	
	
	@RequestMapping("/hello")
	public String savePayment() {

	
		return "hello";

	}
	
	
	@RequestMapping("/getTwitterTracks")
    public List<TwitterTrack> greeting(@RequestParam(value="clientId") String clientId) {
        
		return twitterTrackRepository.findByClientId(clientId);
    }
	

	@RequestMapping("/saveTrack")
    public TwitterTrack greeting(@RequestBody TwitterTrack twitterTrack) {
        
		return twitterTrackRepository.save(twitterTrack);
    }
	
	@RequestMapping("/saveTweets")
	@Consumes(MediaType.APPLICATION_JSON)
	  public TweetsTrack greeting(@RequestBody TweetsTrack tweetsTrack ) {
        
		System.out.println(new Date() + "//" + tweetsTrack.getTweets().size() );
		return tweetsTrackRepository.save(tweetsTrack);
    }
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@RequestMapping("/saveSample")
    public SampleTest greeting( @RequestBody SampleTest SampleTest ) {
        
		System.out.println(new Date() + "//" + SampleTest);
		return null;
    }
	
	@GET
	@Path("hello")
	@Produces("text/html")
	public String doGetAsHtml() {
		return "======";
	}
	
	

}
