package com.shahid.test;

import java.util.List;

import com.shahid.app.User;

public class LoginUser {
	public static boolean login(User user) {
		List<User> userList = ReadUsers.getUsers();
		int match = 0;
		for (User userinfo : userList) {
			if (user.getName().equals(userinfo.getName()) && user.getPassword().equals(userinfo.getPassword())) {
				System.out.println("Login SuccessFull");
				match++;
				return true;

			}

		}
		if (match == 0) {
			System.out.println("Login Failed");
		}
		return false;

	}

}
