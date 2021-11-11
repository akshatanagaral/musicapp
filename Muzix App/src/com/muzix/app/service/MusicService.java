package com.muzix.app.service;

import java.sql.SQLException;

import com.muzix.app.model.Music;

public interface MusicService {
	public String PlayList() throws Exception;
	public String FavouriteSongs() throws Exception;
	 public Music addFavouriteSongs(Music music) throws Exception;
	public String recomandedService() throws Exception;

}
