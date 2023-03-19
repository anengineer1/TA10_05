package utils;

import classes.Password;

public class PasswordsPrinter {
	public static void print(Password[] passwords, boolean[] passwords_is_strong) {
		for (int i = 0; i < passwords.length; i++) {
			System.out.print(passwords[i].getContrasena() + " ");
			System.out.println(passwords_is_strong[i]);
		}
	}
}
