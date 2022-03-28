package com.display_bus;

import java.util.Scanner;

import com.UserRegistration.BackPageOption;
public class InsertBus {
	public static void insertBus() throws Exception{
		Scanner sc=new Scanner(System.in );
		System.out.println("Enter Bus Name ");
		String busName=sc.nextLine();
		System.out.println("Enter Bus From ");
		String busFrom=sc.nextLine();
		System.out.println("Enter Bus To");
		String busTo=sc.nextLine();
		System.out.println("Enter bus Date ");
		String busDate=sc.nextLine();
		System.out.println("Enter bus Timing ");
		String busTiming=sc.nextLine();
		System.out.println("Enter bus Tickets Available ");
		Integer busTickets=sc.nextInt();
		System.out.println("Enter bus Ticket Price ");
		Integer busTicketPrice=sc.nextInt();
		DisplayBus ur=new DisplayBus( busName, busFrom,busTo,busDate ,busTiming,busTickets,busTicketPrice);
		BusDAO urDAO=new BusDAO();
         urDAO.busDAO(ur);
  	      System.out.println("Entered bus details");
  		System.out.println("BusName= "+ur.busName+'\n'+"BusFrom= "+ur.busFrom+'\n'+"BusTo= "+ur.busTo+'\n'+"BusDate= "+ur.busDate+'\n'+"BusTiming= "+ur.busTiming+'\n'+"BusTicketsAvailable= "+ur.busTickets+'\n'+"BusTicketPrice= "+ur.busTicketPrice);
  	
	} 
		
		
	}




