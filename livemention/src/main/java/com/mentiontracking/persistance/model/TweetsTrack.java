package com.mentiontracking.persistance.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "tweetsTrack")
public class TweetsTrack implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6284424217358063096L;
	
//	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private int indexer;
	
	@Id
	private String clientId;
	private String tags;
	private String runDate;
	
	
	private List<Status> tweets;
	
	
	public String getClientId() {
		return clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}
	public String getRunDate() {
		return runDate;
	}
	public void setRunDate(String runDate) {
		this.runDate = runDate;
	}
	public List<Status> getTweets() {
		return tweets;
	}
	public void setTweets(List<Status> tweets) {
		this.tweets = tweets;
	}
	public int getIndexer() {
		return indexer;
	}
	public void setIndexer(int indexer) {
		this.indexer = indexer;
	}
	
	
	
	
}
