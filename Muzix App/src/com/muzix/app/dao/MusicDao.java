package com.muzix.app.dao;

import java.sql.SQLException;

import com.muzix.app.model.Music;

public interface MusicDao {
 public String FavouriteSongs() throws SQLException; 
	 
	 public  String recomandedService() throws SQLException;
		

}
