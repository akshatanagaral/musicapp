package com.muzix.app.service;

import com.muzix.app.model.Music;

public interface MusicService {
	public Music addMusic(Music music) throws Exception;
	public Music updateMusic(Music music)  throws Exception;

}
