package com.UserRegistration;

import java.util.Scanner;

public class BackPageOption {
	public static  void backPage() throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println('\n'+"Enter 1 to go before page");
		int n=sc.nextInt();
		if(n==1){
			ForAdmin.forAdmin();
		}
		}

}
