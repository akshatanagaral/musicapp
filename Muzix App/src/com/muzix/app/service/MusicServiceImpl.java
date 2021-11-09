package com.muzix.app.service;
import java.sql.SQLException;

import com.muzix.app.dao.MusicDao;
import com.muzix.app.dao.MusicDaoJdbcImpl;
import com.muzix.app.model.Music;


public class MusicServiceImpl implements MusicService {
	private MusicDao daoObject;
	public MusicServiceImpl() throws SQLException{
		//daoObj=new EmployeeDaoImpl();
		daoObject=new MusicDaoJdbcImpl();
	}

	@Override
	public Music addMusic(Music music) throws Exception {
		return daoObject.addMusic(music);
	
	}

	@Override
	public Music updateMusic(Music music) throws Exception {
	
		return daoObject.updateMusic(music);
	}

}
