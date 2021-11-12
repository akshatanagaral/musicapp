package com.muzix.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.muzix.app.exception.DuplicateDataException;
import com.muzix.app.model.Music;


public class MusicDaoJdbcImpl implements MusicDao {
	private Connection conn;

	private PreparedStatement smt;
	
	public MusicDaoJdbcImpl() throws SQLException  {
		conn=ConnectionUtil.getJdbcConnection();
	}
	@Override
	public  List<String> PlayList() throws SQLException {
		String query = "select songName from Music" ;
		
		smt= conn.prepareStatement(query);
		
		ResultSet queryResult = smt.executeQuery();
		List<String> list = new ArrayList<>();
		while(queryResult.next())
		{
			String res =queryResult.getString("songName");
			list.add(res);
			//System.out.println(res);
		}
		return list;
    }

	@Override
	public List<String> FavouriteSongs () throws SQLException {
		String query = "select distinct favourite_songs from Favourite_songs";
		
		smt= conn.prepareStatement(query);
		
		ResultSet queryResult = smt.executeQuery();
		List<String> list = new ArrayList<>();
		while(queryResult.next())
		{
			Music m = new Music();
			String res =queryResult.getString("favourite_songs");
			list.add(res);
			//System.out.println(res);
		}
		return list;
    }

	@Override
	public List<String> recomandedService() throws SQLException {
		String foundType="";
		String query = "select distinct recomanded_songs from Recomanded_songs";
        smt=conn.prepareStatement(query);
		ResultSet queryResult = smt.executeQuery();
		List<String> list = new ArrayList<>();
		while(queryResult.next())
		{
			String res =queryResult.getString("recomanded_songs");
			list.add(res);
			//System.out.println(res);
		}
		return list;
	}

	@Override
	public Music addFavouriteSongs(Music music) throws SQLException {
      String query = "insert into Favourite_songs values(?,?,?)";

		try{
		smt= conn.prepareStatement(query);

		smt.setString(1, music.getSongName());
		smt.setString(2, music.getFilmName());
	    smt.setString(3, music.getSingerName());

		int insertedRowCount = smt.executeUpdate();
		if(insertedRowCount>0) {
			return music;
		}
	}
	
		catch(DuplicateDataException | SQLException e)
		{
			throw new DuplicateDataException("Song Already Exists");
		}
			
			return null;
		}
}
	


