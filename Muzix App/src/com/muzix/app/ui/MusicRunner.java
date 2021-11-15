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

	      while (true) 
		     {
				System.out.println("Enter a option :\n [1 -Register New User] \n [2 - LogIn]");
				int choice = scan.nextInt();
				switch (choice)
				{
					case 1:
							appUI.RegisterUser();
							break;
					case 2:
							if(appUI.uesrLogIn()) 
								
							{
								while(true){
								System.out.println("Enter a option :\n[Enter 1 For Display TrackList]\n [Enter 2 For TO Diplay Favourite Songs  ] \n [Enter 3 TO Add FavouriteSongs ]\n[Enter 4 To Delete Favourite Song]\n[Enter 5 To Display Recomandation]\n [0 - Exit]");
								int option = scan.nextInt();
			
								switch (option) 
								{
						
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
									  appUI.deleteFavouriteSong();
									  break;
									  
								  case 5:
										appUI.displayRecomanded();
										break;
								   case 0:
									 System.exit(1);
									  break;
								  default:
										throw new IllegalArgumentException("Invalid Option: " + option);
								}
						}
							}
						else
						{
							System.out.println("You Have Entered Invalid username and password please verify username and Password");
							
						}
							System.out.println("\n");
				}

			}
		

	}

}
