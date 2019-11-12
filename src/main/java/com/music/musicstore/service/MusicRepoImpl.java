package com.music.musicstore.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.music.musicstore.modal.Albums;
import com.music.musicstore.modal.Artists;
import com.music.musicstore.modal.Tracks;

@Repository
public class MusicRepoImpl implements MusicRepo{
	
	
	@Autowired
	private MongoTemplate mongo;

	@Override
	public Tracks createTracks(Tracks tracks) {
		return mongo.save(tracks);
	}

	@Override
	public List<Tracks> findTracksAll() {
		return mongo.findAll(Tracks.class);
	}
	@Override
	public Artists createArtists(Artists artist) {
		return mongo.save(artist);
	}
	@Override
	public List<Artists> findArtistsAll() {
		return mongo.findAll(Artists.class);
	}
	@Override
	public Albums createAlbums(Albums album) {
		return mongo.save(album);
	}
	@Override
	public List<Albums> findAlbumsAll() {
		return mongo.findAll(Albums.class);
	}
	
}
