package com.muzix.app.service;
import java.sql.SQLException;

import com.muzix.app.dao.MusicDao;
import com.muzix.app.dao.MusicDaoJdbcImpl;
import com.muzix.app.model.Music;


public class MusicServiceImpl implements MusicService {
	private MusicDao daoObject;
	
	public MusicServiceImpl() throws SQLException{
	
		daoObject=new MusicDaoJdbcImpl();
	}

	@Override
	public  String FavouriteSongs() throws Exception {
		return daoObject.FavouriteSongs() ;
	
	}

	@Override
	public String recomandedService() throws SQLException {
		return daoObject.recomandedService() ;
	}

}
