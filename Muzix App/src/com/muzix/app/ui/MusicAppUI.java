package com.muzix.app.ui;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;


import com.muzix.app.model.Music;
import com.muzix.app.service.MusicService;
import com.muzix.app.service.MusicServiceImpl;

public class MusicAppUI {
	private Scanner scan=new Scanner(System.in);
	private static MusicService service;
	
	public MusicAppUI() throws SQLException  {
		service=new MusicServiceImpl();
	}
	public void displayPlaylist() 
	{
		System.out.println("The PlayList : ");
		List<String> song=null;
		try {
			song = service.PlayList();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(song);
	}
		
	public void displayFavouriteSongs() 
	{
		System.out.println("The Favourite Songs are : ");
		List<String> song=null;
		try {
			song = service.FavouriteSongs();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(song);
	}
	
	public void displayRecomanded()
	{
		System.out.println("The Recomanded Songs are : ");
		List<String> song=null;
		try {
			song = service.recomandedService();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(song);
	}
	public void addFavouriteSongs(){
		System.out.println("Enter Song Details: ");
		System.out.println("Song Name:");
		String songName=scan.next()+scan.nextLine();
		System.out.println("Film Name:");
		String filmName=scan.next()+scan.nextLine();
		System.out.println("Singer Name:");
		String singerName=scan.next()+scan.nextLine();
	
		
	
		Music music=new Music(songName,filmName,singerName);
		Music savedMusic;
		try {
			savedMusic = service.addFavouriteSongs(music);
			System.out.println("Song Added Successfully:");
			System.out.println(savedMusic);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
