package com.shahid.credsuser;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.util.LinkedList;
import java.util.List;

import com.shahid.app.Creads;
import com.shahid.app.User;

public class FetchCreds {

	public static boolean fetchUser(Creads cred, User user) {
		List<Creads> credlist = new LinkedList<Creads>();

		for (Creads usercred : credlist) {
			System.out.println("User Cred" + usercred);

		}

		return false;
	}
}
