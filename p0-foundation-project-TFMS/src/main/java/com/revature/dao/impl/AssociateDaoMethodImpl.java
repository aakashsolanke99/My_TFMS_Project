package com.revature.dao.impl;
import static java.lang.System.out;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.jdbc.CallableStatement;

import com.revature.config.DatabaseConnection;
import com.revature.constant.Constant;
import com.revature.dao.AssociateDaoMethod;

import com.revature.model.Associate;

public  class AssociateDaoMethodImpl implements AssociateDaoMethod {

	private static Connection con = DatabaseConnection.getConnection();
	private static final org.apache.log4j.Logger logger= org.apache.log4j.Logger.getLogger(AssociateDaoMethodImpl.class);
	Associate associate = new Associate();
	
	Scanner scInt= new Scanner(System.in);
	Scanner scString= new Scanner(System.in);
	public static int v = 0;
	
	public int addAssociateDetails(Associate associate) throws SQLException {
		String insertQuery = Constant.INSERT_QUERY;
		PreparedStatement ps = con.prepareStatement(insertQuery);
		ps.setString(1, associate.getAssociateId());
		ps.setString(2, associate.getAssociateName());
		ps.setString(3, associate.getAssociateTrack());
		ps.setString(4, associate.getAssociateQualification());
		ps.setString(5, associate.getAssociateExperience());
		int n = ps.executeUpdate();
		return n;
	}

	@Override
	public void deleteDetails(String  associateid) throws SQLException {
		CallableStatement stms= (CallableStatement) con.prepareCall("{call Delete_Associate_details(?)}");
		stms.setString(1, associateid);
		Boolean hasResult = stms.execute();
		logger.info(stms);
		logger.info(Constant.DATA_DELETED_SUCESSFUL);
		
	
}
	
	
	@Override
	public  void showDetails() throws SQLException {
		CallableStatement stms= (CallableStatement) con.prepareCall("{call show_Associate_details()}");
		Boolean hasResult = stms.execute();
		if(hasResult) {
			ResultSet res=stms.getResultSet();
			
			while(res.next()) {
				logger.info(Constant.ASSOCIATE2);
				logger.info(Constant.ASSOCIATE_ID+ " " +  res.getString("associate_id"));
				logger.info(Constant.ASSOCIATE_NAME+" "+ res.getString("associate_name"));
				logger.info(Constant.ASSOCIATE_TRACK_ANY_ONE_OF_THIS_ONLY_JAVA_MAINFRAME_TEASTING_DOTNET +" "+res.getString("Associate_track"));
				logger.info(Constant.ASSOCIATE_QUALIFICATION + " "+res.getString("Associate_qualification"));
				logger.info(Constant.ASSOCIATE_EXPERIENCE+ " "+ res.getString("Associate_experience"));
				 out.println("-------------------------------------------------------------");
			}
		}
		
		
	}
	
	public void showOneDetails(String associateid) throws SQLException {

		CallableStatement stms= (CallableStatement) con.prepareCall("{call getone_Associate_details(?)}");
		stms.setString(1, associateid);
		Boolean hasResult = stms.execute();
		if(hasResult) {
			ResultSet res=stms.getResultSet();
			
		while(res.next()) {
			v=v+1;
	
		logger.info(Constant.ASSOCIATE2);
		logger.info(Constant.ASSOCIATE_ID+ " " +  res.getString("associate_id"));
		logger.info(Constant.ASSOCIATE_NAME+" "+ res.getString("associate_name"));
		logger.info(Constant.ASSOCIATE_TRACK_ANY_ONE_OF_THIS_ONLY_JAVA_MAINFRAME_TEASTING_DOTNET +" "+res.getString("Associate_track"));
		logger.info(Constant.ASSOCIATE_QUALIFICATION + " "+res.getString("Associate_qualification"));
		logger.info(Constant.ASSOCIATE_EXPERIENCE+ " "+ res.getString("Associate_experience"));
		
		}
	}
	}

	@Override
	public void updateDetails(String associateid) throws SQLException {
		
		int check;
		do {
			out.println(Constant.SELECT_WHAT_YOU_WANT_TO_UPDATE);
			out.println(Constant._1_NAME);
			out.println(Constant._2_TRACK);
			out.println(Constant._3_QUALIFICATION);
			out.println(Constant._4_EXPERIENCE);
			out.println(Constant._5_EXIT);
            
			logger.info(Constant.ENTER_YOUR_CHOICE);
		    int  check1=scInt.nextInt();
			
			switch(check1) {
			
			case 1:
				out.print(Constant.ENTER_THE_NAME_WHICH_YOU_WANT_TO_CHANGE);
			    String newname= scString.nextLine();
				CallableStatement stms= (CallableStatement) con.prepareCall("{call update_Associate_name(?,?)}");
				stms.setString(1, associateid);
				stms.setString(2, newname);
				stms.execute();
				logger.info(Constant.NAME_UPDATED_SUCCESSFUL);
				;break;
				
			case 2:
				out.print(Constant.ENTER_THE_TRACK_WHICH_YOU_WANT_TO_CHANGE);
			    String track= scString.nextLine();
				CallableStatement stmstrack= (CallableStatement) con.prepareCall("{call update_Associate_name(?,?)}");
				stmstrack.setString(1, associateid);
				stmstrack.setString(2, track);
				stmstrack.execute();
				logger.info(Constant.TRACK_UPDATED_SUCESSFULLLY);
				;break;
				
			case 3:
				out.print(Constant.ENTER_THE_QUALIFICATION_WHICH_YOU_WANT_TO_CHANGE);
			    String Qualification= scString.nextLine();
				CallableStatement stmsQualification= (CallableStatement) con.prepareCall("{call update_Associate_name(?,?)}");
				stmsQualification.setString(1, associateid);
				stmsQualification.setString(2, Qualification);
				stmsQualification.execute();
				logger.info(Constant.QUALIFICATION_UPDATED_SUCESSFULLLY);
				;break;
				
			case 4: 
				out.print(Constant.ENTER_THE_EXPERIENCE_WHICH_YOU_WANT_TO_CHANGE);
			    String Experience= scString.nextLine();
				CallableStatement stmsExperience= (CallableStatement) con.prepareCall("{call update_Associate_name(?,?)}");
				stmsExperience.setString(1, associateid);
				stmsExperience.setString(2, Experience);
				stmsExperience.execute();
				logger.info(Constant.EXPERIENCE_UPDATED_SUCESSFULLLY);
				;break;
				
			case 5:
				
				break;
				
			default :
				logger.info(Constant.NO_MATCH_FOUND);
				
			}
			
			out.println(Constant.YOU_WANT_TO_UPDATE_MORE_PRESS_1_OTHEREWISE_PRESS_0);
			check=scInt.nextInt();
		}while(check==1);
		
	
	}
	
}