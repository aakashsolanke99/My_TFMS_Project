package com.revature.service.impl;
import com.revature.service.*;
import static java.lang.System.out;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.revature.constant.Constant;
import com.revature.model.Associate;
import com.revature.model.AssociateTrack;
import com.revature.model.Menu;

public class AssociateDetailsImp extends Associate implements AssociateDetails{
	
	static ArrayList<Associate> l=new ArrayList<Associate>();
	Constant constant= new Constant();
	Scanner scInt= new Scanner(System.in);
	Scanner scString= new Scanner(System.in);
	Menu menu= new Menu();
	
	int choice;	
	

	public void addDetails() {
		
		out.println(constant.ENTERASSOCIATEDETAILS);
		do {
			
		    
			out.print(constant.ASSOCIATEID);
			int Id =scInt.nextInt();
						
			out.print(constant.ASSOCIATENAME);
			String Name =scString.nextLine();
			
			out.print(constant.ASSOCIATETRACK);
			int count=0;
			String Track;
			do {
			 Track=scString.nextLine().toUpperCase();
			
			if(Track.equals(AssociateTrack.JAVA.toString()) || Track.equals(AssociateTrack.MAINFRAME.toString()) || Track.equals(AssociateTrack.TEASTING.toString()) || Track.equals(AssociateTrack.DOTNET.toString()) ) {
			    count++;
			}
			else {
				out.print("Invalid input please enter correct input:- \n");
				
			}
			}while(count!=1);
			
			out.print(constant.ASSOCIATEQUALIFICATION);
			String Qualification = scString.nextLine();
			
			out.print(constant.ASSOCIATEEXPERIENCE);
			String Experience =scString.nextLine();
			
			Associate a1=new Associate(Id,Name,Track,Qualification,Experience);
			l.add(a1);
			
			int sizeoflist=l.size();
			out.print("\n--------------------------------------------");
			out.print("\nNumber of Associates are :- "+sizeoflist);
			out.print("\n--------------------------------------------\n");
			out.print("\nIf you want to enter more data press - 1  Otherwise press- 0:-");
			choice =scInt.nextInt();
		

		}while(choice==1);
	 			
	}	
		
       

		public void listAssociateDetails() {
        	
           out.println(constant.SHOWASSOCIATEDETAILS+ "\n");
           
           for (Associate associate : l) {
		      out.println(constant.ASSOCIATEID +" "+ associate.getAssociateId());
	          out.println(constant.ASSOCIATENAME + " "+ associate.getAssociateName());
	          out.println(constant.ASSOCIATETRACK + " "+ associate.getAssociateTrack());
		      out.println(constant.ASSOCIATEQUALIFICATION + " " + associate.getAssociateQualification());
		      out.println(constant.ASSOCIATEEXPERIENCE +" "+ associate.getAssociateExperience()+"\n");
		      out.println("-------------------------------------------------------------");
		
             }

    } 	
		
		
	public void deleteAssociateaDetails() {
		int temp;
		Iterator<Associate> itr = l.iterator();
		do {
			
			while(itr.hasNext()) {
				out.print("Enter Associate Id which yoy want delete:-");
				int del=scInt.nextInt();
				
				if(itr.next().getAssociateId()==del) {
				     itr.remove();
				     out.print("\nData Deleted Successful for Associate Id:-"+ del+"\n");
       			     break;
				}
		}
			
		if(l.isEmpty()) {
		    out.print("\nTher is no data present! Enter data first\n");
			break;
		}else {
				out.print("\nYou want to delete more then press :- 2 Otherwise press- 0 \n");
			    temp= scInt.nextInt();
			  }
			
		}while(temp==2);
		
	}
	
	
	public void updateAssociateDetails() {
		int cheak;
		do {
			out.print("\nEnter the associate Id for which you want to update:- ");
			int tempAssoc= scInt.nextInt();
			
			out.println(" -------- Select what you want to update --------");
			out.println("1.Name");
			out.println("2.Track");
			out.println("3.qualification");
			out.println("4.Experience");
            
			System.out.println("\nEnter your choice:-");
			int cheak1=scInt.nextInt();
			switch(cheak1 ) {
			
			case 1:
				for (Associate associate : l) {
					
					if(tempAssoc==(associate.getAssociateId())) {
						
					    out.print("\nEnter the updated name :-");
					    String newname= scString.nextLine();
						associate.setAssociateName(newname);
					}
					else {
						out.print("\nWrong Associate Id provide correct Associate Id please ...");
					}
				
			
			        }  
			;break;
			
			case 2 :
				for (Associate associate : l) {
					     
                        if(tempAssoc==(associate.getAssociateId())) {
					    out.println("Enter the updated Track :- \n");
					    String newname= scString.nextLine();
						associate.setAssociateTrack(newname);
					}
					
				}
				;break;
				
			case 3 :
				for (Associate associate : l) {
					     
                        if(tempAssoc==(associate.getAssociateId())) {
					    out.println("Enter the updated Associate qualification :- \n");
					    String newname= scString.nextLine();
						associate.setAssociateQualification(newname);
					}
					
				}
				;break;
				
			case 4 :
				for (Associate associate : l) {
					     
                        if(tempAssoc==(associate.getAssociateId())) {
					    out.println("Enter the updated  Experience :- \n");
					    String newname= scString.nextLine();
						associate.setAssociateExperience(newname);;
					}
					
				}
				;break;
			}
			
			out.println("\nyou want to update more press:- 1 Otherewise press- 0\n");
			cheak=scInt.nextInt();
			
		}while(cheak==1);
		
	
		}

}
