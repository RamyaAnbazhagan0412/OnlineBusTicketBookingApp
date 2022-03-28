package com.UserRegistration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LoginValidation {
	public static boolean loginValidation() throws Exception {
		boolean isValid =true;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your EmailId ");
		String userEmailId=sc.nextLine();
		System.out.println("Enter  Password");
		String userPassword=sc.nextLine();
   		UserRegistration ur=new UserRegistration(userEmailId,userPassword);
   		Connection connection =DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
		String query="SELECT admin_emailId,PASSWORD FROM admin_login WHERE admin_emailId='"+ur.emailId+"' AND PASSWORD='"+ur.password+"'";
		Statement statement=connection.createStatement();
		ResultSet rs=statement.executeQuery(query);
		
		if(rs.next())
		{
			String emailId=rs.getString("admin_emailId");
			String password=rs.getString("PASSWORD");
			UserRegistration busObj=new UserRegistration(emailId,password);
		//	userRegistrationList.add(busObj);
			if(userEmailId.equals(emailId)&&userPassword.equals(password))
			{
								isValid=true;
				
			}
		}
		
		
		return isValid;
		}
}
