package com.mentiontracking.persistance.model;

import java.io.Serializable;




public class User implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7161871364398736075L;
	private long id;
    private String name;
    private String email;
    private String screenName;
    private String location;
    private String description;
    private URLEntity[] descriptionURLEntities;
    private URLEntity urlEntity;
    private boolean isContributorsEnabled;
    private String profileImageUrl;
    private String profileImageUrlHttps;
    private boolean isDefaultProfileImage;
    private String url;
    private boolean isProtected;
    private int followersCount;

    private Status status;

    private String profileBackgroundColor;
    private String profileTextColor;
    private String profileLinkColor;
    private String profileSidebarFillColor;
    private String profileSidebarBorderColor;
    private boolean profileUseBackgroundImage;
    private boolean isDefaultProfile;
    private boolean showAllInlineMedia;
    private int friendsCount;
    private String createdAt;
    private int favouritesCount;
    private int utcOffset;
    private String timeZone;
    private String profileBackgroundImageUrl;
    private String profileBackgroundImageUrlHttps;
    private String profileBannerImageUrl;
    private boolean profileBackgroundTiled;
    private String lang;
    private int statusesCount;
    private boolean isGeoEnabled;
    private boolean isVerified;
    private boolean translator;
    private int listedCount;
    private boolean isFollowRequestSent;
    private String[] withheldInCountries;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getScreenName() {
		return screenName;
	}
	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public URLEntity[] getDescriptionURLEntities() {
		return descriptionURLEntities;
	}
	public void setDescriptionURLEntities(URLEntity[] descriptionURLEntities) {
		this.descriptionURLEntities = descriptionURLEntities;
	}
	public URLEntity getUrlEntity() {
		return urlEntity;
	}
	public void setUrlEntity(URLEntity urlEntity) {
		this.urlEntity = urlEntity;
	}
	public boolean isContributorsEnabled() {
		return isContributorsEnabled;
	}
	public void setContributorsEnabled(boolean isContributorsEnabled) {
		this.isContributorsEnabled = isContributorsEnabled;
	}
	public String getProfileImageUrl() {
		return profileImageUrl;
	}
	public void setProfileImageUrl(String profileImageUrl) {
		this.profileImageUrl = profileImageUrl;
	}
	public String getProfileImageUrlHttps() {
		return profileImageUrlHttps;
	}
	public void setProfileImageUrlHttps(String profileImageUrlHttps) {
		this.profileImageUrlHttps = profileImageUrlHttps;
	}
	public boolean isDefaultProfileImage() {
		return isDefaultProfileImage;
	}
	public void setDefaultProfileImage(boolean isDefaultProfileImage) {
		this.isDefaultProfileImage = isDefaultProfileImage;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public boolean isProtected() {
		return isProtected;
	}
	public void setProtected(boolean isProtected) {
		this.isProtected = isProtected;
	}
	public int getFollowersCount() {
		return followersCount;
	}
	public void setFollowersCount(int followersCount) {
		this.followersCount = followersCount;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public String getProfileBackgroundColor() {
		return profileBackgroundColor;
	}
	public void setProfileBackgroundColor(String profileBackgroundColor) {
		this.profileBackgroundColor = profileBackgroundColor;
	}
	public String getProfileTextColor() {
		return profileTextColor;
	}
	public void setProfileTextColor(String profileTextColor) {
		this.profileTextColor = profileTextColor;
	}
	public String getProfileLinkColor() {
		return profileLinkColor;
	}
	public void setProfileLinkColor(String profileLinkColor) {
		this.profileLinkColor = profileLinkColor;
	}
	public String getProfileSidebarFillColor() {
		return profileSidebarFillColor;
	}
	public void setProfileSidebarFillColor(String profileSidebarFillColor) {
		this.profileSidebarFillColor = profileSidebarFillColor;
	}
	public String getProfileSidebarBorderColor() {
		return profileSidebarBorderColor;
	}
	public void setProfileSidebarBorderColor(String profileSidebarBorderColor) {
		this.profileSidebarBorderColor = profileSidebarBorderColor;
	}
	public boolean isProfileUseBackgroundImage() {
		return profileUseBackgroundImage;
	}
	public void setProfileUseBackgroundImage(boolean profileUseBackgroundImage) {
		this.profileUseBackgroundImage = profileUseBackgroundImage;
	}
	public boolean isDefaultProfile() {
		return isDefaultProfile;
	}
	public void setDefaultProfile(boolean isDefaultProfile) {
		this.isDefaultProfile = isDefaultProfile;
	}
	public boolean isShowAllInlineMedia() {
		return showAllInlineMedia;
	}
	public void setShowAllInlineMedia(boolean showAllInlineMedia) {
		this.showAllInlineMedia = showAllInlineMedia;
	}
	public int getFriendsCount() {
		return friendsCount;
	}
	public void setFriendsCount(int friendsCount) {
		this.friendsCount = friendsCount;
	}
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	public int getFavouritesCount() {
		return favouritesCount;
	}
	public void setFavouritesCount(int favouritesCount) {
		this.favouritesCount = favouritesCount;
	}
	public int getUtcOffset() {
		return utcOffset;
	}
	public void setUtcOffset(int utcOffset) {
		this.utcOffset = utcOffset;
	}
	public String getTimeZone() {
		return timeZone;
	}
	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}
	public String getProfileBackgroundImageUrl() {
		return profileBackgroundImageUrl;
	}
	public void setProfileBackgroundImageUrl(String profileBackgroundImageUrl) {
		this.profileBackgroundImageUrl = profileBackgroundImageUrl;
	}
	public String getProfileBackgroundImageUrlHttps() {
		return profileBackgroundImageUrlHttps;
	}
	public void setProfileBackgroundImageUrlHttps(String profileBackgroundImageUrlHttps) {
		this.profileBackgroundImageUrlHttps = profileBackgroundImageUrlHttps;
	}
	public String getProfileBannerImageUrl() {
		return profileBannerImageUrl;
	}
	public void setProfileBannerImageUrl(String profileBannerImageUrl) {
		this.profileBannerImageUrl = profileBannerImageUrl;
	}
	public boolean isProfileBackgroundTiled() {
		return profileBackgroundTiled;
	}
	public void setProfileBackgroundTiled(boolean profileBackgroundTiled) {
		this.profileBackgroundTiled = profileBackgroundTiled;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	public int getStatusesCount() {
		return statusesCount;
	}
	public void setStatusesCount(int statusesCount) {
		this.statusesCount = statusesCount;
	}
	public boolean isGeoEnabled() {
		return isGeoEnabled;
	}
	public void setGeoEnabled(boolean isGeoEnabled) {
		this.isGeoEnabled = isGeoEnabled;
	}
	public boolean isVerified() {
		return isVerified;
	}
	public void setVerified(boolean isVerified) {
		this.isVerified = isVerified;
	}
	public boolean isTranslator() {
		return translator;
	}
	public void setTranslator(boolean translator) {
		this.translator = translator;
	}
	public int getListedCount() {
		return listedCount;
	}
	public void setListedCount(int listedCount) {
		this.listedCount = listedCount;
	}
	public boolean isFollowRequestSent() {
		return isFollowRequestSent;
	}
	public void setFollowRequestSent(boolean isFollowRequestSent) {
		this.isFollowRequestSent = isFollowRequestSent;
	}
	public String[] getWithheldInCountries() {
		return withheldInCountries;
	}
	public void setWithheldInCountries(String[] withheldInCountries) {
		this.withheldInCountries = withheldInCountries;
	}
    
    
    


}
