package com.muzix.app.dao;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;
import com.muzix.app.model.Music;
public class MusicDaoImplTest {
	MusicDao dao=new MusicDaoImpl();

	@Test
	public void testAddMusic() throws SQLException {
		Music song=new Music("sun sathiya","ABCD2","Shreya Ghoshal");
		assertEquals(song, dao.addMusic(song));
	}
	
	@Test
	public void testUpdateMusic() throws SQLException   {
		Music song=new Music("Butt bomma","Alavaikuntpuramalo","Armaan Malik");
	   assertEquals(song, dao.updateMusic(song));
	}

}
