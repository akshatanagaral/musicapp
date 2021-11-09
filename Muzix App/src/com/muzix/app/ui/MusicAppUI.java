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
		
	public void addMusic() {
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
			savedMusic = service.addMusic(music);
			System.out.println("Music Added Successfully:");
			System.out.println(savedMusic);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void updateMusic() throws Exception 
	{
		System.out.println("Enter Song Details :  ");
		System.out.print("Song Name : ");
		String songName=scan.next()+scan.nextLine();;
	
	
		try {
				System.out.print("Fim Name : ");
				String filmName=scan.next()+scan.nextLine();
				System.out.print("Singer Name : ");
				String singerName=scan.next()+scan.nextLine();
				
				Music music= new Music(songName, filmName,singerName);
				 service.updateMusic(music);
				 System.out.println("Update Successfully");
						
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
