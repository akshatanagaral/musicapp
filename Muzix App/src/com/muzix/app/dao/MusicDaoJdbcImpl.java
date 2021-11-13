package com.muzix.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.muzix.app.exception.DuplicateDataException;
import com.muzix.app.model.Music;
import com.muzix.app.model.User;


public class MusicDaoJdbcImpl implements MusicDao {
	private Connection conn;

	private PreparedStatement smt;
	
	public MusicDaoJdbcImpl() throws SQLException  {
		conn=ConnectionUtil.getJdbcConnection();
	}
	@Override
    public User ReisterUser(User user) {
		
		String query = "insert into user values(?,?,?)";
		try {
		   conn=ConnectionUtil.getJdbcConnection();
		   smt= conn.prepareStatement(query);
		
			
			smt.setString(1, user.getUserName());
			smt.setString(2, user.getUserEmail());
			smt.setString(3, user.getPassword());
			
			
			int insertedRowCount = smt.executeUpdate();
			if(insertedRowCount>0) {
				return user;
			}
		} catch (DuplicateDataException | SQLException e) {
			// TODO: handle exception
		   throw new DuplicateDataException("user Already Exists");
		}
		
		return null;
	}
	@Override
	public boolean userLogIn(String userName, String password) {
		// TODO Auto-generated method stub
		String query="select * from user where uname=? and password=?";
		try {
			smt=conn.prepareStatement(query);
			smt.setString(1, userName);
			smt.setString(2, password);
			
			ResultSet queryResult = smt.executeQuery();
			
			
			if(queryResult.next()) {
				return true;
			}
			
		} catch (SQLException  | NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			return false;
	}
	@Override
	public  List<Music> PlayList() throws SQLException {
		String query = "select * from Music" ;
		
		smt= conn.prepareStatement(query);
		
		ResultSet queryResult = smt.executeQuery();
		List<Music> list = new ArrayList<>();
		while(queryResult.next())
			{
			Music m = new Music();
			//String res =queryResult.getString("songName");
			m.setSongName(queryResult.getString("songName"));
			m.setFilmName(queryResult.getString("filmName"));
			m.setSingerName(queryResult.getString("singerName"));
			list.add(m);
			//System.out.println(res);
		}
		return list;
    }

	@Override
	public List<String> FavouriteSongs () throws SQLException {
		String query = "select  * from Favourite_songs";
		
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
		String query = "select  * from Recomanded_songs";
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
		     conn=ConnectionUtil.getJdbcConnection();
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
	


