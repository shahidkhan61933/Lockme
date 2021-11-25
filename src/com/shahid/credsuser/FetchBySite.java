package com.shahid.credsuser;


import java.util.LinkedList;
import java.util.List;

import com.shahid.app.Creads;

public class FetchBySite {
	
	public static boolean fectchbySite(List<Creads> credlist, String sitename) {
		List<Creads>siteList = new LinkedList<Creads>();
		try {
			int match =0;
			for (Creads usercred : credlist) {
				if (usercred.getSitename().equals(sitename)) {
					System.out.println(usercred);
					match++;
				}
			}
			if(match==0) {
				System.out.println("Site does not exits !");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
		
	}
	
}
