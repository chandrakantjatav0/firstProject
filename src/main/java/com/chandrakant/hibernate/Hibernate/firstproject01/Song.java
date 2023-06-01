package com.chandrakant.hibernate.Hibernate.firstproject01;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Generated;

@Entity

public class Song { // table name
	// Songid, SongName, Singer
	@Id
	//@GeneratedValue  //it gives Primary key Primary Key to the Table 
	@Column(name = "Songid")
	private int id;

	@Column(name = "SongName")
	private String SongName;

	@Column(name = "Singer")
	private String Artist;

	public static void main(String[] args) {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSongName() {
		return SongName;
	}

	public void setSongName(String songName) {
		SongName = songName;
	}

	public String getArtist() {
		return Artist;
	}

	public void setArtist(String artist) {
		Artist = artist;
	}

	@Override
	public String toString() {
		return "Song [id=" + id + ", SongName=" + SongName + ", Artist=" + Artist + "]";
	}

	public void setSinger(String string) {
		// TODO Auto-generated method stub
		
	}

}
