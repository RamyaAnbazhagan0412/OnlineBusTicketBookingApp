package com.display_bus;
import java.util.Scanner;
import com.UserRegistration.BackPageOption;
public class DeleteBusDetails {
	public static void deleteBus() throws Exception{
		Scanner sc=new Scanner(System.in );
		System.out.println("Enter Bus id");
		Integer busId=sc.nextInt();
		System.out.println("Also enter Bus name  for deletion");
		String busName=sc.nextLine();
		DisplayBus ur=new DisplayBus(busId, busName);

         BusDAO urDAO=new BusDAO();
         urDAO.busDAODelete(ur);
  	      System.out.println("Deleted bus details");
  		System.out.println("BusId= "+ur.busId+'\n'+"BusName= "+ur.busName);
  			} 


}
