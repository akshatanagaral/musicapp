package com.muzix.app.service;

import java.sql.SQLException;
import java.util.List;

import com.muzix.app.model.Music;
import com.muzix.app.model.User;

public interface MusicService {
	 public User ReisterUser(User user) throws SQLException;
	 public boolean userLogIn(String userEmail, String password) throws SQLException;
	public List<Music> PlayList() throws Exception;
	public List<String> FavouriteSongs() throws Exception;
	 public Music addFavouriteSongs(Music music) throws Exception;
	public List<String> recomandedService() throws Exception;

}
