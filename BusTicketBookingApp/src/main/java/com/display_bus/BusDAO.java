package com.display_bus;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.UserRegistration.BackPageOption;
import com.UserRegistration.UserRegistration;

public class BusDAO {
				public void busDAO(DisplayBus ds) throws Exception {
				Connection connection =DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
				//System.out.println(connection);
				String query="INSERT INTO bus_ticket_booking_app_display (bus_name,bus_from,bus_to,bus_date,bus_timing ,bus_tickets,bus_ticket_price)VALUES('"+ds.busName+"','"+ds.busFrom+"','"+ds.busTo+"',NOW(),'"+ds.busTiming+"','"+ds.busTickets+"','"+ds.busTicketPrice+"')";
				Statement statement=connection.createStatement();
				int rows=statement.executeUpdate(query);
				System.out.println("Bus inserted:"+rows);
				connection.close();
			}
				public void busDAOUpdate_Bus_from(DisplayBus ds)throws Exception
				{
					Connection connection=DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
					//System.out.println(connection);
					String query2="update bus_ticket_booking_app_display set bus_from='"+ds.busFrom+"' where bus_id='"+ds.busId+"'";
					System.out.println(query2);
					Statement statement=connection.createStatement();
					int rows=statement.executeUpdate(query2);
					System.out.println("Bus from location updated"+rows);
					connection.close();
					
				}
				public void busDAOUpdateBus_To(DisplayBus ds)throws Exception
				{
					Connection connection=DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
					//System.out.println(connection);
					String query2="update bus_ticket_booking_app_display set bus_to='"+ds.busTo+"' where bus_id='"+ds.busId+"'";
					System.out.println(query2);
					Statement statement=connection.createStatement();
					int rows=statement.executeUpdate(query2);
					System.out.println("Bus to location updated"+rows);
					connection.close();
					
				}
				public void busDAOUpdate_Timing(DisplayBus ds)throws Exception
				{
					Connection connection=DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
					//System.out.println(connection);
					String query2="update bus_ticket_booking_app_display set bus_timing='"+ds.busTiming+"' where bus_id='"+ds.busId+"'";
					System.out.println(query2);
					Statement statement=connection.createStatement();
					int rows=statement.executeUpdate(query2);
					System.out.println("Bus timing updated"+rows);
					connection.close();
					
				}
				public void busDAOUpdateBus_Name(DisplayBus ds)throws Exception
				{
					Connection connection=DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
					//System.out.println(connection);
					String query2="update bus_ticket_booking_app_display set bus_from='"+ds.busFrom+"' where bus_id='"+ds.busId+"'";
					System.out.println(query2);
					Statement statement=connection.createStatement();
					int rows=statement.executeUpdate(query2);
					System.out.println("Bus name updated"+rows);
					connection.close();
					
				}
			 public static  List<DisplayBus>busDAOSelect() throws Exception {
						//Class.forName("com.mysql.cj.jdbc.Driver");
						List<DisplayBus> displayBus=new ArrayList<DisplayBus>();
						Connection connection =DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
						String query="SELECT *FROM bus_ticket_booking_app_display";
						Statement statement=connection.createStatement();
						ResultSet rs=statement.executeQuery(query);
						System.err.println("\nBus Id \t\t\t Bus Name  \t\t\t Bus From \t\t\t Bus To \t\t\t Bus Date \t\t\t Bus Timing ");
						while(rs.next())
						{
							//userName, String emailId, String password, String phoneNumber
//bus_id INT PRIMARY KEY AUTO_INCREMENT,

							Integer id=rs.getInt("bus_id");
							String busName=rs.getString("bus_name");
							String busFrom=rs.getString("bus_from");
							String busTo=rs.getString("bus_to");
							String busDate=rs.getString("bus_date");
							String busTiming=rs.getString("bus_timing");
							Integer busTickets=rs.getInt("bus_tickets");
							Integer busTicketPrice=rs.getInt("bus_ticket_Price");
							System.out.format(  "\n%d \t\t\t %s  \t\t\t %s \t\t\t%s \t\t\t%s \t\t\t %s \t\t\t %d \t\t\t %d",id,busName,busFrom,busTo,busDate,busTiming,busTickets,busTicketPrice);
						//	DisplayBus busObj=new DisplayBus(busName,busFrom,busTo,busDate,busTiming,busTickets,busTicketPrice);
			               // displayBus.add(busObj);
						
							
						}
						connection.close();
						return displayBus;
					}	
				
				public void busDAODelete(DisplayBus ds)throws Exception
				{
					Connection connection=DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
					//System.out.println(connection);
					String query3="DELETE FROM  bus_ticket_booking_app_display WHERE  bus_id='"+ds.busName+"' AND bus_from='"+ds.busId+"'";
					//System.out.println(query3);
					Statement statement=connection.createStatement();
					int rows=statement.executeUpdate(query3);
					System.out.println("no of rows deleted"+rows);
					connection.close();
					
				}
				
				

		}


