//package com.muzix.app.dao;
//
//import java.util.HashMap;
//import java.util.Map;
//
//import com.muzix.app.model.Music;
//
//public class MusicDaoImpl implements MusicDao {
//	private static Map<String, Music> musics=new HashMap();
//
//	@Override
//	public Music addMusic(Music music) {
//		if(musics.containsKey(music.getSongName())){
//			musics.put(music.getSongName(),music);
//			}
//	  return music;
//	}
//
//	@Override
//	public Music updateMusic(Music music) {
//		if(musics.containsKey(music.getSongName())==true){
//			musics.put(music.getSongName(),music);
//			return music;
//	}
//			return null;
//	}
//
//}



