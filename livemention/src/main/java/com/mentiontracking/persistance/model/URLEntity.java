package com.mentiontracking.persistance.model;

import java.io.Serializable;

public class URLEntity implements Serializable{
	
	 	/**
	 * 
	 */
	private static final long serialVersionUID = -1363845285038602125L;
		private String url;
	    private String expandedURL;
	    private String displayURL;
		public String getUrl() {
			return url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
		public String getExpandedURL() {
			return expandedURL;
		}
		public void setExpandedURL(String expandedURL) {
			this.expandedURL = expandedURL;
		}
		public String getDisplayURL() {
			return displayURL;
		}
		public void setDisplayURL(String displayURL) {
			this.displayURL = displayURL;
		}
	    
	    
	    

}
