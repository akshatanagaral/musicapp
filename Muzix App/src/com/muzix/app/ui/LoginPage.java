//package com.muzix.app.ui;
//
//import java.util.Scanner;
//
//public class LoginPage {
//	public boolean logIn()
//	{
//	        Scanner sc = new Scanner(System.in);
//	        String sp=" ";
//	        System.out.println("Enter the Username");
//	        String uname = sc.nextLine().toLowerCase();
//	        if(uname.length()<4){
//	            System.out.println("Invalid Username:");
//	            return false;
//	        }
//
//	        System.out.println("Enter the Password");
//	        String upass = sc.nextLine();
//	        if(!validate(uname,upass)){
//	            System.out.println("Invalid Password:");
//	            System.out.println("Password should be less than 8 and greater than 3");
//	            System.out.println("Password should not be same as use");
//	        System.out.println("Password should contain atleast one upper case alphabet");
//	        System.out.println("Password should contain atleast one Lower case alphabet");
//	        System.out.println("Password should contain atleast one numeric");
//	           
//	            return false;
//	        }
//
//	        System.out.println(uname+" you are Registered Successfully");
//	        System.out.println("---------------------------------------------------------------------------");
//	        System.out.println();
//
//	        System.out.println("Enter the Username");
//	        String lname = sc.nextLine().toLowerCase();
//	        System.out.println("Enter the Password");
//	        String lpass = sc.nextLine();
//
//	        if(uname.equals(lname) && upass.equals(lpass)){
//	            System.out.println("Welcome "+lname+" you have Logged-in Successfully");
//	            System.out.println("---------------------------------------------------------------------------");
//	            return true;
//	        }
//	        else{
//	            System.out.println("Username or password Mismatch");
//	            return false;
//	        }
//
//	}
//	public static boolean validate(String uname,String upass)
//	{
//
//
//	if(upass.length()>9||upass.length()<3)
//	{
//
//	return false;
//	}
//	if((upass.indexOf(uname)>-1))
//	{
//	System.out.println("0");
//	return false;
//	}
////	String u="(.[A-Z].)";
////	if(!(upass.matches(u)))
////	{
////
////	return false;
////	}
////	String u1="(.[a-z].)";
////	if(upass.matches(u1))
////	{
////
////	return false;
////	}
////	String u2="(.[0-9].)";
////	if(!upass.matches(u2))
////	{
////	return false;
////	}
//	return true;
//	}
//
//
//}
