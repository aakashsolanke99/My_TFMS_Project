package com.revature.model;
import static java.lang.System.*;
import java.util.Scanner;

import com.revature.constant.Constant;

public class Menu {

	public void showMenu(){
		
	Scanner s=new Scanner(System.in);
	Userdetails aakash = new Userdetails();
	Constant constant = new Constant();

   int ch=0;
	do {
		out.println(constant.MENU);
		out.println("1. Enter Associate Details");
	    out.println("2. Display Associate Details");
		out.println("3. Delete Associate Details");
		out.println("4. Update Associate Details");
		out.println("5. Exit");
		
		out.println(constant.CHOICE);
		ch= s.nextInt();
		
		switch(ch) {
		
		case 1: aakash.addDetails(); break;
		case 2: aakash.listAssociateDetails();break;
		case 3: aakash.deleteAssociateaDetails();break;
		case 4: aakash.updateAssociateDetails();break;
		case 5: out.println("\nBy By Have a nice day!");break; 
		default:out.println("\nInvalid choice please enter correct choice \n");
		
		}
		
		out.print("\nIf you want to see menu enter (YES/NO)");
		
		char ch1=s.next().charAt(0);
		s.nextLine();
		if(ch1=='N'||ch1=='n') {
			break;
		}
	}while(ch!=5);
    s.close();
}
}
