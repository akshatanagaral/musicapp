package com.muzix.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import com.muzix.app.model.Music;

public class MusicDaoJdbcImpl implements MusicDao {
	private Connection conn;

	private PreparedStatement smt;
	
	public MusicDaoJdbcImpl() throws SQLException  {
		conn=ConnectionUtil.getJdbcConnection();
	}

	@Override
	public Music addMusic(Music music) throws SQLException {
		String query = "insert into musiclist values(?,?,?)";
		
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

	@Override
	public Music updateMusic(Music music) throws SQLException {
		String query = "UPDATE musiclist SET songName = ?,filmName=? ,singerName =? WHERE songName=?";
	
		
		smt= conn.prepareStatement(query);
		
		smt.setString(1, music.getSongName());
		smt.setString(2, music.getFilmName());
	
		smt.setString(3, music.getSingerName());
		smt.setString(4, music.getSongName());
		
		int insertedRowCount = smt.executeUpdate();
		if(insertedRowCount>0) {
			return music;
		}
		return null;
	}
	

}
