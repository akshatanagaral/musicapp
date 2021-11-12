package com.muzix.app.dao;

import java.sql.SQLException;
import java.util.List;

import com.muzix.app.model.Music;

public interface MusicDao {
	public List<String> PlayList() throws SQLException;
    public List<String> FavouriteSongs() throws SQLException; 
    public Music addFavouriteSongs(Music music) throws SQLException;
	 public  List<String> recomandedService() throws SQLException;
	

}
