package com.shahid.test;

import java.util.List;
import java.util.Scanner;

import com.shahid.app.Creads;
import com.shahid.app.User;
import com.shahid.credsuser.FetchBySite;
import com.shahid.credsuser.FetchCreds;
import com.shahid.credsuser.ReadCreads;
import com.shahid.credsuser.StoreCreads;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("==Welcome TO Lockme Digital Locker ==");
		System.out.println("==Please Select Your Option ==");
		System.out.println("==1) Register 2)Login===");
		int option = scanner.nextInt();
		switch (option) {
		case 1:
			User userReg = registerDate();
			Registration.register(userReg);
			break;
		case 2:
			
			User userlog = loginData();
			LoginUser.login(userlog);
			boolean response = LoginUser.login(userlog);
			if(response) {
				optionLongin(userlog);
				
				

			}
			break;
		default:
		}
		

	}

	private static User registerDate() {
		User user = new User();
		Scanner scanner = new Scanner(System.in);
		System.out.println("==Enter Registration Details ==");
		System.out.println("== Enter Username ==");
		user.setName(scanner.nextLine());
		System.out.println("== Enter Password ==");
		user.setPassword(scanner.nextLine());
		System.out.println("==Confirm Password==");
		user.setCnfpassword(scanner.nextLine());
		System.out.println("==Enter Gmail==");
		user.setEmail(scanner.nextLine());
//	2	scanner.close();
		return user;

	}

	private static User loginData() {
		User user = new User();
		Scanner scanner = new Scanner(System.in);
		System.out.println("==Enter Login Details==");
		System.out.println("==Enter UserName ==");
		user.setName(scanner.nextLine());
		System.out.println("==Enter Password==");
		user.setPassword(scanner.nextLine());
//		scanner.close();
		return user;

	}

	private static Creads storCreads() {
		Creads cread = new Creads();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Id ");
		cread.setId(scanner.nextLine());
		System.out.println("Enter site name");
		cread.setSitename(scanner.nextLine());
		System.out.println("Enter userName ");
		cread.setUsername(scanner.nextLine());
		System.out.println("Enter Password");
		cread.setPassword(scanner.nextLine());
//		scanner.close();
		return cread;

	}

	private static void optionLongin(User userLog) {

		Scanner sc = new Scanner(System.in);
		System.out.println("======Please Selec 1) Store Creds 2)Fetch Cred=====");
		int option = sc.nextInt();
		switch (option) {
		case 1:
			Creads userCred = storCreads();
			StoreCreads.storeCreds(userCred, userLog);
			break;

		case 2:
			List<Creads> credlist = ReadCreads.readCreads(userLog);
			fetchAllORBysite(credlist);
			break;

		default:
			throw new IllegalArgumentException("Unexpected value: " + option);
		}
	}

	private static String getSitename() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Site name");
		String sitename = scanner.nextLine();
		return sitename;
	}
	private static Creads fetchAllORBysite(List<Creads> credlist) {
		Scanner sc = new Scanner(System.in);
		System.out.println("======Please Selec 1) fetch all 2)Fetch By site");
		int option = sc.nextInt();
		switch (option) {
		case 1:
			System.out.println(credlist);
			break;
		case 2:
			String sitename = getSitename();
			FetchBySite.fectchbySite(credlist,sitename);
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + option);

		}
		return null;
	}
	

}
