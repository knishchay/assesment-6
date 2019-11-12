package com.music.musicstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.music.musicstore.modal.Albums;
import com.music.musicstore.modal.Artists;
import com.music.musicstore.modal.Tracks;
import com.music.musicstore.service.MusicRepo;


@RestController
public class MusicController {
	@Autowired
	MusicRepo repo;
	
	@PostMapping("/tracks")
	public Tracks create(@RequestBody Tracks track) {
		return repo.createTracks(track);
		
	}
	
	
	
	@GetMapping("/tracks")
	public List<Tracks> findTracks(){
		return  repo.findTracksAll();
	}
	
	@PostMapping("/albums")
	public Albums create(@RequestBody Albums album) {
		return repo.createAlbums(album);
		
	}
	@GetMapping("/albums")
	public List<Albums> findAlbums(){
		return  repo.findAlbumsAll();
	}
	@PostMapping("/artists")
	public Artists createArtists(@RequestBody Artists artist) {
		return repo.createArtists(artist);
		
	}
	@GetMapping("/artists")
	public List<Artists> findArtists(){
		return  repo.findArtistsAll();
	}l
	
	
}
