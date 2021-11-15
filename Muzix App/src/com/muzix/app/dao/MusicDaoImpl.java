package com.muzix.app.dao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.muzix.app.model.Music;
import com.muzix.app.model.User;

public class MusicDaoImpl implements  MusicDao {
	private static Map<String, Music> mu=new HashMap<>();

	@Override
	public List<Music> PlayList() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> FavouriteSongs() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Music addFavouriteSongs(Music music) throws SQLException {
		mu.put(music.getSongName(), music);
		return music;
	}
	@Override
	public boolean deleteFavouriteSong(Music music) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<String> recomandedService() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public User ReisterUser(User user) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean userLogIn(String userEmail, String password) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

}
