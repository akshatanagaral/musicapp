package com.muzix.app.service;

import java.sql.SQLException;
import java.util.List;

import com.muzix.app.model.Music;

public interface MusicService {
	public List<String> PlayList() throws Exception;
	public List<String> FavouriteSongs() throws Exception;
	 public Music addFavouriteSongs(Music music) throws Exception;
	public List<String> recomandedService() throws Exception;

}
