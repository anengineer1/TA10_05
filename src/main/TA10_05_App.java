package main;

import java.util.Scanner;
import classes.Password;
import utils.PasswordsPrinter;

public class TA10_05_App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca la cantidad de passwords a generar");
		int passwords_quantity = sc.nextInt();
		try {
			Password passwords[] = new Password[passwords_quantity];
			boolean passwords_is_strong[] = new boolean[passwords_quantity];

			System.out.println("Introduzca el tamaño de los passwords:");
			int passwords_length = sc.nextInt();

			for (int i = 0; i < passwords_quantity; i++) {
				passwords[i] = new Password(passwords_length);
				passwords_is_strong[i] = passwords[i].esFuerte();
			}

			PasswordsPrinter.print(passwords, passwords_is_strong);

		} catch (NegativeArraySizeException e) {
			System.out.println("No se pueden generar las arrays con dimensión negativa");
		} finally {
			sc.close();
		}

	}

}
