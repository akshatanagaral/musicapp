package com.muzix.app.ui;

import java.sql.SQLException;
import java.util.Scanner;
public class MusicRunner {

	public static void main(String[] args) throws Exception {
		Scanner scan=new Scanner(System.in);
	      MusicAppUI appUI=null;
	      appUI = new MusicAppUI();
//		try {
//			appUI = new MusicAppUI();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		while(true){
			System.out.println("Enter option:\n  [1 - Display PlayList] \n [2 - Display Favourite Songs] \n [3-Add favouriteSongs] \n  [4-Display Recomandation] \n [0-Exit]");
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
