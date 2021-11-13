package com.muzix.app.dao;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;

import com.muzix.app.model.Music;

public class MusicDaoJdbcImplTest {
	MusicDaoImpl dao=new MusicDaoImpl();

	@Test
	 public void testAddFavouriteSongs() throws SQLException
	{

         Music m=new Music("Hope","ABC","xxxtentaction");
         assertEquals(m, dao.addFavouriteSongs(m));
	}
}
