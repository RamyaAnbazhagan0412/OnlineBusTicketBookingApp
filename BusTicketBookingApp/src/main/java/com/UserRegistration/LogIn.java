package com.UserRegistration;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class LogIn {

	public static void login() throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your EmailId ");
		String userEmailId=sc.nextLine();
		System.out.println("Enter  Password");
		String userPassword=sc.nextLine();
       // System.out.println(userEmailId+userPassword);
		UserRegistration ur=new UserRegistration(userEmailId,userPassword);
		List<UserRegistration> userRegistrationList=new ArrayList<UserRegistration>();
		Connection connection =DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
		String query="SELECT email_id,PASSWORD FROM bus_ticket_booking_app_registration WHERE email_id='"+ur.emailId+"' AND PASSWORD='"+ur.password+"'";
		Statement statement=connection.createStatement();
		ResultSet rs=statement.executeQuery(query);
		
		if(rs.next())
		{
			String emailId=rs.getString("email_id");
			String password=rs.getString("PASSWORD");
			UserRegistration busObj=new UserRegistration(emailId,password);
			userRegistrationList.add(busObj);
			if(userEmailId.equals(emailId)&&userPassword.equals(password))
			{
				
			}
		else {
				  		System.err.println("Entered  data is invalid"+'\n'+"Please Login");
				  		System.out.println("EmailId= "+ur.emailId+'\n'+"Password= "+ur.password);
				  		System.out.println("");
				  		LogIn.login();
				  		
				  	}

		
		}
			    

	}

}
