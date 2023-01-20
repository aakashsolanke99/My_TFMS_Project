package com.revature.model;
import static java.lang.System.*;
import java.util.Scanner;

import com.revature.constant.Constant;
import com.revature.dao.impl.AssociateDaoImp;


public class Menu {

	

	public void showMenu(){
		
	Scanner s=new Scanner(System.in);
	AssociateDaoImp aakash = new AssociateDaoImp();
	Constant constant = new Constant();

   char ch1;
	do {
		out.println(constant.MENU);
		out.println(Constant._1_ENTER_ASSOCIATE_DETAILS);
	    out.println(Constant._2_DISPLAY_ASSOCIATE_DETAILS);
	    out.println(Constant._3_DISPLAY_ONE_ASSOCIATE_DETAILS);
		out.println(Constant._4_DELETE_ASSOCIATE_DETAILS);
		out.println(Constant._5_UPDATE_ASSOCIATE_DETAILS);
		out.println(Constant._6_EXIT);
		
		out.println(constant.CHOICE);
		int ch= s.nextInt();
		
		switch(ch) {
		
		case 1: aakash.addDetails(); break;
		case 2: aakash.listAssociateDetails();break;
		case 3: aakash.listOneAssociateDetails();break;
		case 4: aakash.deleteAssociateaDetails();break;
		case 5: aakash.updateAssociateDetails();break;
		case 6: out.println(Constant.BY_BY_HAVE_A_NICE_DAY);break; 
		default:out.println(Constant.INVALID_CHOICE_PLEASE_ENTER_CORRECT_CHOICE);
		
		}
		
		out.print(Constant.IF_YOU_WANT_TO_SEE_MENU_ENTER_YES_NO);
		
	    ch1=s.next().charAt(0);
		s.nextLine();

	}while(ch1=='Y'||ch1=='y');


}
}
