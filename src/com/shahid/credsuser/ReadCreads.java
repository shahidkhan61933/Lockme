package com.shahid.credsuser;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.LinkedList;
import java.util.List;

import com.shahid.app.Creads;
import com.shahid.app.User;

public class ReadCreads {

	public static List<Creads> readCreads(User user) {
		Creads cred = new Creads();
		List<Creads> creadsList = new LinkedList<Creads>();
		try {
			File f = new File(user.getName() + "lockme-db-creads.txt");
			if (f.exists()) {
				FileInputStream file = new FileInputStream(user.getName() + "lockme-db-creads.txt");
				ObjectInputStream input = new ObjectInputStream(file);
				creadsList = (List<Creads>) input.readObject();
				input.close();
				file.close();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return creadsList;
	}

}
