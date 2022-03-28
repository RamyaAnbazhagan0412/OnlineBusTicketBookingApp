package com.display_bus;

import java.util.Scanner;

import com.UserRegistration.BackPageOption;

public class Update {
	public static void UpdateBusFrom() throws Exception{
		Scanner sc=new Scanner(System.in );
		System.out.println("Enter Bus id ");
		Integer busId=sc.nextInt();
		System.out.println("Enter Bus From  to be Updated");
		String busFrom=sc.nextLine();
		DisplayBus ur=new DisplayBus(busId, busFrom);

         BusDAO urDAO=new BusDAO();
         urDAO.busDAOUpdate_Bus_from(ur);
  	      System.out.println("Updated bus details");
  		System.out.println("BusId= "+ur.busId+'\n'+"BusFrom= "+ur.busFrom);
  		BackPageOption.backPage();

  	
	} 
	public static void UpdateBusName() throws Exception{
		Scanner sc=new Scanner(System.in );
		System.out.println("Enter Bus id ");
		Integer busId=sc.nextInt();
		System.out.println("Enter Bus name to be  update ");
		String busUpdatedName=sc.nextLine();
		
				DisplayBus ur=new DisplayBus(busId,busUpdatedName);

         BusDAO urDAO=new BusDAO();
         urDAO.busDAOUpdateBus_Name(ur);
  	      System.out.println("Entered bus details");
  		System.out.println("BusId= "+ur.busId+'\n'+"BusName= "+ur.busName);
  		BackPageOption.backPage();

	} 


	public static void UpdateBusTo() throws Exception{
		Scanner sc=new Scanner(System.in );
		System.out.println("Enter Bus id ");
		Integer busId=sc.nextInt();
		System.out.println("Enter Bus To");
		String busTo=sc.nextLine();
		DisplayBus ur=new DisplayBus(busId,busTo);

         BusDAO urDAO=new BusDAO();
         urDAO.busDAOUpdateBus_To(ur);
  	      System.out.println("Entered bus details");
  		System.out.println("BusId= "+ur.busId+'\n'+"BusTo= "+ur.busTo);
  		BackPageOption.backPage();

	} 


	public static void UpdateBusTiming() throws Exception{
		Scanner sc=new Scanner(System.in );
		System.out.println("Enter Bus id ");
		Integer busId=sc.nextInt();
		System.out.println("Enter bus Timing  to be Updated");
		String busTiming=sc.nextLine();
		DisplayBus ur=new DisplayBus(busId ,busTiming);

         BusDAO urDAO=new BusDAO();
         urDAO.busDAOUpdate_Timing(ur);
  	      System.out.println("Entered bus details");
  		System.out.println("BusId= "+ur.busId+'\n'+"BusTo= "+ur.busTiming);
  		BackPageOption.backPage();

  	
	} 
	public static void UpdateBusDate() throws Exception{
		Scanner sc=new Scanner(System.in );
		System.out.println("Enter Bus id ");
		Integer busId=sc.nextInt();
		System.out.println("Enter bus Date  to be Updated");
		String busTiming=sc.nextLine();
		DisplayBus ur=new DisplayBus(busId ,busTiming);

         BusDAO urDAO=new BusDAO();
         urDAO.busDAOUpdate_Timing(ur);
  	      System.out.println("Entered bus details");
  		System.out.println("BusId= "+ur.busId+'\n'+"BusDate= "+ur.busDate);
  		BackPageOption.backPage();

  	
	} 

	public static void UpdateBusTicketsAvailable() throws Exception{
		Scanner sc=new Scanner(System.in );
		System.out.println("Enter Bus id");
		Integer busId=sc.nextInt();
		System.out.println("Enter bus Tickets Available to be Updated");
		Integer busTicketsAvailable=sc.nextInt();
		DisplayBus ur=new DisplayBus(busId ,busTicketsAvailable);

         BusDAO urDAO=new BusDAO();
         urDAO.busDAOUpdate_Timing(ur);
  	      System.out.println("Entered bus details");
  		System.out.println("BusId= "+ur.busId+'\n'+"BusTicketsAvailable= "+ur.busTickets);
  		BackPageOption.backPage();

  	
	} 

	public static void UpdateBusTicketPrice() throws Exception{
		Scanner sc=new Scanner(System.in );
		System.out.println("Enter Bus id ");
		Integer busId=sc.nextInt();
		System.out.println("Enter bus Price  to be Updated");
		String busTicketPrice=sc.nextLine();
		DisplayBus ur=new DisplayBus(busId ,busTicketPrice);

         BusDAO urDAO=new BusDAO();
         urDAO.busDAOUpdate_Timing(ur);
  	      System.out.println("Entered bus details");
  		System.out.println("BusId= "+ur.busId+'\n'+"BusTicketPrice= "+ur.busTicketPrice);
  		BackPageOption.backPage();

  	
	} 
	




}
