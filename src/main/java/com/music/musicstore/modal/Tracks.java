package com.music.musicstore.modal;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "tracks")
public class Tracks {
	
	@Id
	private String Id;
	private String TrackName;
	@DBRef
	List<Artists> artists;
	
	public Tracks() {
		super();
	}
	
	

	public Tracks(String id, String trackName, List<Artists> artists) {
		super();
		Id = id;
		this.TrackName = trackName;
		this.artists = artists;
	}



	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getTrackName() {
		return TrackName;
	}
	public void setTrackName(String trackName) {
		TrackName = trackName;
	}
	public List<Artists> getArtists() {
		return artists;
	}
	public void setTrackArtists(List<Artists> artists) {
		this.artists = artists;
	}
	

}
