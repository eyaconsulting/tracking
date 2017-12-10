package com.livemention;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.mentiontracking.persistance.model.TweetsTrack;


public interface TweetsTrackRepository extends MongoRepository<TweetsTrack, String> {	
		
	
	@SuppressWarnings("unchecked")
	TweetsTrack  save(TweetsTrack tweetsTrack);
	
	

}
