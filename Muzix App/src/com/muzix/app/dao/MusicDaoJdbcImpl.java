package com.muzix.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import com.muzix.app.model.Music;

public class MusicDaoJdbcImpl implements MusicDao {
	private Connection conn;

	private PreparedStatement smt;
	
	public MusicDaoJdbcImpl() throws SQLException  {
		conn=ConnectionUtil.getJdbcConnection();
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
	}
	


