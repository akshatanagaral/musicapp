package com.muzix.app.dao;

import java.sql.SQLException;

import com.muzix.app.model.Music;

public interface MusicDao {
 public Music addMusic(Music music) throws SQLException; 
	 
	 public  Music updateMusic(Music music) throws SQLException;

}
