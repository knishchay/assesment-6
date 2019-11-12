package com.music.musicstore.modal;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.DBRef;

public class Artists {
	private String name;
	@DBRef
	List<Albums> albums;
	
	@DBRef
	List<Tracks>tracks;
	public Artists(String name, List<Albums> albums, List<Tracks> tracks) {
		super();
		this.name = name;
		this.albums = albums;
		
		this.tracks = tracks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Albums> getAlbums() {
		return albums;
	}
	public void setAlbums(List<Albums> albums) {
		this.albums = albums;
	}
	
	public List<Tracks> getTracks() {
		return tracks;
	}
	public void setTracks(List<Tracks> tracks) {
		this.tracks = tracks;
	}
	
}
