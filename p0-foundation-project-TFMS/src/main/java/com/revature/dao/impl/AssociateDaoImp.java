package com.revature.dao.impl;
import com.revature.service.*;
import static java.lang.System.out;

import java.sql.SQLException;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.revature.app.Application;
import com.revature.constant.Constant;
import com.revature.dao.AssociateDao;
import com.revature.model.Associate;
import com.revature.model.AssociateTrack;
import com.revature.model.Menu;

public class AssociateDaoImp extends Associate implements AssociateDao{
	
	private static final Logger logger= Logger.getLogger(AssociateDaoImp.class);

	
	Scanner scInt= new Scanner(System.in);
	Scanner scString= new Scanner(System.in);
	Menu menu= new Menu();
	
	int choice;	
	static AssociateDaoMethodImpl imp = new AssociateDaoMethodImpl();

	public void addDetails() {
		
		logger.info(Constant.ENTERASSOCIATEDETAILS);
		do {
			
		    
			out.print(Constant.ASSOCIATEID);
			String Id =scString.nextLine();
						
			out.print(Constant.ASSOCIATENAME);
			String Name =scString.nextLine();
			
			out.print(Constant.ASSOCIATETRACK);
			int count=0;
			String Track;
			do {
			 Track=scString.nextLine().toUpperCase();
			
			if(Track.equals(AssociateTrack.JAVA.toString()) || Track.equals(AssociateTrack.MAINFRAME.toString()) || Track.equals(AssociateTrack.TEASTING.toString()) || Track.equals(AssociateTrack.DOTNET.toString()) ) {
			    count++;
			}
			else {
				out.print(Constant.INVALID_INPUT_PLEASE_ENTER_CORRECT_INPUT);
				
			}
			}while(count!=1);
			
			out.print(Constant.ASSOCIATEQUALIFICATION);
			String Qualification = scString.nextLine();
			
			out.print(Constant.ASSOCIATEEXPERIENCE);
			String Experience =scString.nextLine();
			
			Associate a1=new Associate(Id,Name,Track,Qualification,Experience);

			try {
				imp.addAssociateDetails(a1);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			logger.info(Constant.RECORD_INSERTED_SUCCESFULLY);
			
			out.print(Constant.IF_YOU_WANT_TO_ENTER_MORE_DATA_PRESS_1_OTHERWISE_PRESS_0);
			choice =scInt.nextInt();
		

		}while(choice==1);
	 			
	}	
		
       

		public void listAssociateDetails() {
        	
           logger.info(Constant.SHOWASSOCIATEDETAILS+ "\n");
           
        	  try {
				imp.showDetails();
			} catch (SQLException e) {
			
				e.printStackTrace();
			}
		      logger.info("-------------------------------------------------------------");
		

    } 	
		
		public void listOneAssociateDetails() {
			  logger.info(Constant.SHOWASSOCIATEDETAILS+ "\n");
			  try {
				  out.print(Constant.ENTER_THE_ASSOCIATE_ID_FOR_WHICH_YOU_WANT_TO_UPDATE);
				  String deleteid= scString.nextLine();
				  imp.showOneDetails(deleteid);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			  logger.info("-------------------------------------------------------------");
		}
		
		
	public void deleteAssociateaDetails() {
		int temp;
    	do {
			
    		try {
    			out.print(Constant.ENTER_ASSOCIATE_ID_WHICH_YOU_WANT_DELETE);
        		String del=scString.nextLine();
    			imp.deleteDetails(del);
    		} catch (SQLException e) {
    			
    			e.printStackTrace();
    		}
				out.print(Constant.YOU_WANT_TO_DELETE_MORE_THEN_PRESS_1_OTHERWISE_PRESS_0);
			temp= scInt.nextInt();
	
			
		}while(temp==1);
		
	}
	
	
	public void updateAssociateDetails() {
			out.print(Constant.ENTER_THE_ASSOCIATE_ID_FOR_WHICH_YOU_WANT_TO_UPDATE);
			String tempAssoc= scString.nextLine();
			try {
				imp.updateDetails(tempAssoc);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}



	
	


