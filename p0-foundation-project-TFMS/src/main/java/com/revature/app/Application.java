package com.revature.app;

import java.sql.SQLException;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.mysql.cj.protocol.x.SyncFlushDeflaterOutputStream;
import com.revature.constant.Constant;
import com.revature.service.impl.LoginImpl;

public class Application {

	private static final Logger logger= Logger.getLogger(Application.class);
	
	LoginImpl log=new LoginImpl();
     Scanner sc=new Scanner(System.in);
    
	public static void main(String[] args) throws SQLException {
		  LoginImpl log=new LoginImpl();
		  Scanner sc=new Scanner(System.in);

		 int user1=0;
		 do {
			 logger.info("==================================================");
			 logger.info("                     TFMS                          ");
			 logger.info("==================================================\n");

			 logger.info(Constant._1_REGISTER_NEW_USER);
			 logger.info(Constant._2_LOGIN);
			 System.out.println(Constant._3_EXIT);
			 
			 
			 logger.info(Constant.ENTER_YOUR_CHOICE_1_2);
			 int user = sc.nextInt();
			 
			 switch(user) {
			 case 1:
				 log.associateRegistrstion();break;
			 case 2:
				 log.associateLogin();;break;
				 
			 case 3:
				return;
				 
			default: logger.info(Constant.ENTER_CORRECT_CHOICE_PLEASE); 
				 
			 }

			 logger.info(Constant.GO_TO_TFMS_PAGE_PRESS_1);
			 user1= sc.nextInt();
			
		 }while(user1==1);
		 
	}

}
