package com.muzix.app.dao;

import static org.junit.Assert.*;
import java.sql.SQLException;
import java.util.List;

import org.junit.Test;
import com.muzix.app.model.Music;
import com.muzix.app.model.User;

public class MusicDaoJdbcImplTest {
	MusicDaoImpl dao=new MusicDaoImpl();

	@Test
	public void testReisterUser() throws SQLException 
	{
		User m= new User("manojtv","12345678","manojtv123@gmail.com");
		assertEquals(m,dao.ReisterUser(m));
		
	}

	@Test
	public void testUserLogIn() throws SQLException {

		String email ="jones";
		String password ="123456789";
		assertTrue(dao.userLogIn(email, password));
	}

	@Test
	 public void testPlayList() throws SQLException {
		List<Music> m=dao.PlayList();
		assertEquals(m,dao.PlayList());
	}

	@Test
	public void testAddFavouriteSongs() throws SQLException
	{

		Music m=new Music("Hope","ABC","xxxtentaction");
		assertEquals(m, dao.addFavouriteSongs(m));
	}

	@Test
	 public void testRecomandedService() throws SQLException {
		List<String> m=dao.recomandedService();
		assertEquals(m,dao.recomandedService());
	}


	@Test
	public void testGetAllUser() throws SQLException {
		List<User> i =dao.getAllUser();
		assertEquals(i, dao.getAllUser());
	}
}
