package com.mentiontracking.persistance.model;

import java.io.Serializable;


import twitter4j.GeoLocation;
import twitter4j.Scopes;

public class Status implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8520998395094649717L;

	
	private String createdAt;
	private long id;
	private String text;
	
	private String source;
	private boolean truncated;
	private long inReplyToUserId;
	private long inReplyToStatusId;
	private String inReplyToScreenName;
	private  GeoLocation geoLocation;
	private Place place;
	private boolean favorited;
	private boolean retweeted;
	private int favoriteCount;
	private User user;
	private boolean retweet;
	private Status retweetedStatus;
	private long[] contributors;
	private int retweetCount;
	private boolean retweetedByMe;
	private long currentUserRetweetId;
	private boolean possiblySensitive;
	private String lang;
	private Scopes scopes;
	private String[] withheldInCountries;
	private long quotedStatusId;
	private Status quotedStatus;
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public boolean isTruncated() {
		return truncated;
	}
	public void setTruncated(boolean truncated) {
		this.truncated = truncated;
	}
	public long getInReplyToUserId() {
		return inReplyToUserId;
	}
	public void setInReplyToUserId(long inReplyToUserId) {
		this.inReplyToUserId = inReplyToUserId;
	}
	public long getInReplyToStatusId() {
		return inReplyToStatusId;
	}
	public void setInReplyToStatusId(long inReplyToStatusId) {
		this.inReplyToStatusId = inReplyToStatusId;
	}
	public String getInReplyToScreenName() {
		return inReplyToScreenName;
	}
	public void setInReplyToScreenName(String inReplyToScreenName) {
		this.inReplyToScreenName = inReplyToScreenName;
	}
	public GeoLocation getGeoLocation() {
		return geoLocation;
	}
	public void setGeoLocation(GeoLocation geoLocation) {
		this.geoLocation = geoLocation;
	}
	public Place getPlace() {
		return place;
	}
	public void setPlace(Place place) {
		this.place = place;
	}
	public boolean isFavorited() {
		return favorited;
	}
	public void setFavorited(boolean favorited) {
		this.favorited = favorited;
	}
	public boolean isRetweeted() {
		return retweeted;
	}
	public void setRetweeted(boolean retweeted) {
		this.retweeted = retweeted;
	}
	public int getFavoriteCount() {
		return favoriteCount;
	}
	public void setFavoriteCount(int favoriteCount) {
		this.favoriteCount = favoriteCount;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public boolean isRetweet() {
		return retweet;
	}
	public void setRetweet(boolean retweet) {
		this.retweet = retweet;
	}
	public Status getRetweetedStatus() {
		return retweetedStatus;
	}
	public void setRetweetedStatus(Status retweetedStatus) {
		this.retweetedStatus = retweetedStatus;
	}
	public long[] getContributors() {
		return contributors;
	}
	public void setContributors(long[] contributors) {
		this.contributors = contributors;
	}
	public int getRetweetCount() {
		return retweetCount;
	}
	public void setRetweetCount(int retweetCount) {
		this.retweetCount = retweetCount;
	}
	public boolean isRetweetedByMe() {
		return retweetedByMe;
	}
	public void setRetweetedByMe(boolean retweetedByMe) {
		this.retweetedByMe = retweetedByMe;
	}
	public long getCurrentUserRetweetId() {
		return currentUserRetweetId;
	}
	public void setCurrentUserRetweetId(long currentUserRetweetId) {
		this.currentUserRetweetId = currentUserRetweetId;
	}
	public boolean isPossiblySensitive() {
		return possiblySensitive;
	}
	public void setPossiblySensitive(boolean possiblySensitive) {
		this.possiblySensitive = possiblySensitive;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	public Scopes getScopes() {
		return scopes;
	}
	public void setScopes(Scopes scopes) {
		this.scopes = scopes;
	}
	public String[] getWithheldInCountries() {
		return withheldInCountries;
	}
	public void setWithheldInCountries(String[] withheldInCountries) {
		this.withheldInCountries = withheldInCountries;
	}
	public long getQuotedStatusId() {
		return quotedStatusId;
	}
	public void setQuotedStatusId(long quotedStatusId) {
		this.quotedStatusId = quotedStatusId;
	}
	public Status getQuotedStatus() {
		return quotedStatus;
	}
	public void setQuotedStatus(Status quotedStatus) {
		this.quotedStatus = quotedStatus;
	}
	
	
	
	

}
