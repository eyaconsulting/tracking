package com.livemention;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

import com.mentiontracking.persistance.model.TwitterTrack;

@Document(collection = "twitter")
public interface TwitterTrackRepository extends MongoRepository<TwitterTrack, String> {

	List<TwitterTrack> findByClientId(@Param("clientId") String clientId);
	
	
	@SuppressWarnings("unchecked")
	TwitterTrack  save(TwitterTrack twitterTrack);
	
		
	

}
