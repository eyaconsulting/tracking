package com.mentiontracking.persistance.model;

import java.io.Serializable;

public class SampleTest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3920238694578964955L;
	
	
	private String name;
	private long[] taille;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long[] getTaille() {
		return taille;
	}
	public void setTaille(long[] taille) {
		this.taille = taille;
	}
	
	
	

}
