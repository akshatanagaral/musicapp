package com.muzix.app.ui;

import java.sql.SQLException;
import java.util.Scanner;
public class MusicRunner {

	public static void main(String[] args) throws Exception {
		Scanner scan=new Scanner(System.in);
	      MusicAppUI appUI=null;
	      LoginPage l=new LoginPage();
	      appUI = new MusicAppUI();
//		try {
//			appUI = new MusicAppUI();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		while(true){
//			System.out.println("Enter option:\n  [1 - Display PlayList] \n [2 - Display Favourite Songs] \n [3-Add favouriteSongs] \n  [4-Display Recomandation] \n [0-Exit]");
//			int option=scan.nextInt();
	      boolean b=l.logIn();
	      System.out.println("welcome to our muzix player and enjoy our service");
	      while(b)
			{
			System.out.println("Enter option:\n[Enter 1 For Display TrackList]\n [Enter 2 TO Display Favourite Songs] \n [Enter 3 For TO Add FavouriteSongs]\n[Enter 4 To Display Recomandation]\n[Enter 0 Exit]");
				int option=scan.nextInt();
			
		  switch(option){
		  case 1:
			  appUI.displayPlaylist();
			  break;
		  case 2:
				appUI.displayFavouriteSongs();
				break;
		  case 3:
			  appUI.addFavouriteSongs();
			  break;
		  case 4:
				appUI.displayRecomanded();
				break;
		   case 0:
			 System.exit(1);
			  break;
		  default:
				throw new IllegalArgumentException("Invalid Option: " + option);
		  }
		  System.out.println("\n");
		}
		

	}

}
