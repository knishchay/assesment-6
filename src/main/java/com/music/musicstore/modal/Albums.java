package com.music.musicstore.modal;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.DBRef;

public class Albums {
	private String albumname;
	@DBRef
	List<Artists>albumArtist;
	@DBRef
	List<Tracks>albumTracks;
	public Albums() {
		super();
	}
	public Albums(String albumname, List<Artists> albumArtist, List<Tracks> albumTracks) {
		super();
		this.albumname = albumname;
		this.albumArtist = albumArtist;
		this.albumTracks = albumTracks;
	}
	public String getAlbumname() {
		return albumname;
	}
	public void setAlbumname(String albumname) {
		this.albumname = albumname;
	}
	public List<Artists> getAlbumArtist() {
		return albumArtist;
	}
	public void setAlbumArtist(List<Artists> albumArtist) {
		this.albumArtist = albumArtist;
	}
	public List<Tracks> getAlbumTracks() {
		return albumTracks;
	}
	public void setAlbumTracks(List<Tracks> albumTracks) {
		this.albumTracks = albumTracks;
	}
	
	
	
}
