package com.muzix.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.format.DateTimeFormatter;

import com.btc.app.model.Employee;
import com.muzix.app.model.Music;
import com.muzix.app.ui.SongNotFoundException;

public class MusicDaoJdbcImpl implements MusicDao {
	private Connection conn;

	private PreparedStatement smt;
	
	public MusicDaoJdbcImpl() throws SQLException  {
		conn=ConnectionUtil.getJdbcConnection();
	}
	@Override
	public  String PlayList() throws SQLException {
		String query = "select distinct songName from Music";
		
		smt= conn.prepareStatement(query);
		
		ResultSet queryResult = smt.executeQuery();
		while(queryResult.next())
		{
			String res =queryResult.getString("songName");
			System.out.println(res);
		}
		return null;
    }

	@Override
	public String FavouriteSongs () throws SQLException {
		String query = "select distinct favourite_songs from Favourite_songs";
		
		smt= conn.prepareStatement(query);
		
		ResultSet queryResult = smt.executeQuery();
		while(queryResult.next())
		{
			String res =queryResult.getString("favourite_songs");
			System.out.println(res);
		}
		return null;
    }

	@Override
	public String recomandedService() throws SQLException {
		String foundType="";
		String query = "select distinct recomanded_songs from Recomanded_songs";
        smt=conn.prepareStatement(query);
		ResultSet queryResult = smt.executeQuery();
		while(queryResult.next())
		{
			String res =queryResult.getString("recomanded_songs");
			System.out.println(res);
		}
		return null;
	}

	@Override
	public Music addFavouriteSongs(Music music) throws SQLException {
      String query = "insert into Favourite_songs values(?,?,?)";

		
		smt= conn.prepareStatement(query);

		smt.setString(1, music.getSongName());
		smt.setString(2, music.getFilmName());
	    smt.setString(3, music.getSingerName());

		int insertedRowCount = smt.executeUpdate();
		if(insertedRowCount>0) {
			return music;
		}
		return null;
	}
}
	


