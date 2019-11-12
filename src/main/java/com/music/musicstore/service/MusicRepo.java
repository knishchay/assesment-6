package com.music.musicstore.service;

import java.util.List;

import com.music.musicstore.modal.Albums;
import com.music.musicstore.modal.Artists;
import com.music.musicstore.modal.Tracks;

public interface MusicRepo {
	Tracks createTracks(Tracks track);

	List<Tracks> findTracksAll();
	
	Artists createArtists(Artists artist);
	
	List<Artists> findArtistsAll();
	
	Albums createAlbums(Albums album);
	List<Albums> findAlbumsAll();
}
