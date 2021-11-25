package com.shahid.credsuser;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.List;

import com.shahid.app.Creads;
import com.shahid.app.User;

public class StoreCreads {

	public static boolean storeCreds(Creads cred, User user) {
		List<Creads> creadlist = ReadCreads.readCreads(user);

		if (!creadlist.isEmpty()) {
			creadlist = ReadCreads.readCreads(user);
		} else {
			creadlist = new LinkedList<Creads>();
			System.out.println("First Cread Stored");
		}
		creadlist.add(cred);		
		try {
			FileOutputStream file = new FileOutputStream(user.getName() + "lockme-db-creads.txt");
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(creadlist);
			out.close();
			file.close();
			System.out.println("Registration Successfull");

		} catch (Exception e) {
			System.out.println("Registration Failed");
		}

		return true;
	}
}
