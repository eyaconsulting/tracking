package com.mentiontracking.persistance.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;

public class TwitterTrack implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2187370091856088553L;
	
//	@GeneratedValue(strategy=GenerationType.AUTO)
	private int indexer;
		
	
	private Date  runDate ;
	@Id
	private String clientId ;
	private int  tweetCount ;
	private int  retweetCount ;
	private int  favoriteCount ;
	private int  reachCount ;
	
	private List<String>  hashtags ;
	private List<String>  users ;
	private List<GeoLocation>  geolocation ;
	
	
	public String getClientId() {
		return clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	public int getTweetCount() {
		return tweetCount;
	}
	public void setTweetCount(int tweetCount) {
		this.tweetCount = tweetCount;
	}
	public int getRetweetCount() {
		return retweetCount;
	}
	public void setRetweetCount(int retweetCount) {
		this.retweetCount = retweetCount;
	}
	public int getFavoriteCount() {
		return favoriteCount;
	}
	public void setFavoriteCount(int favoriteCount) {
		this.favoriteCount = favoriteCount;
	}
	public int getReachCount() {
		return reachCount;
	}
	public void setReachCount(int reachCount) {
		this.reachCount = reachCount;
	}
	public Date getRunDate() {
		return runDate;
	}
	public void setRunDate(Date runDate) {
		this.runDate = runDate;
	}
	
	public List<String> getHashtags() {
		return hashtags;
	}
	public void setHashtags(List<String> hashtags) {
		this.hashtags = hashtags;
	}
	public List<String> getUsers() {
		return users;
	}
	public void setUsers(List<String> users) {
		this.users = users;
	}
	public List<GeoLocation> getGeolocation() {
		return geolocation;
	}
	public void setGeolocation(List<GeoLocation> geolocation) {
		this.geolocation = geolocation;
	}
	public int getIndexer() {
		return indexer;
	}
	public void setIndexer(int indexer) {
		this.indexer = indexer;
	}
	
	
	
	

}
