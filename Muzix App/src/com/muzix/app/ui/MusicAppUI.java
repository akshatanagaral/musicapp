package com.muzix.app.ui;

import java.sql.SQLException;

import java.util.InputMismatchException;
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
		
	public void displayFavouriteSongs() 
	{
		System.out.println("The Favourite Songs are : ");
		String song=null;
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
		String song=null;
		try {
			song = service.recomandedService();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(song);
	}
}
