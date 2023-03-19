package classes;

import java.util.Random;

public class Password {

	final private int LONGITUD_POR_DEFECTO = 0;
	// final private String contrasena;

	private int longitud;
	private String contrasena;

	public Password() {
		this.longitud = this.LONGITUD_POR_DEFECTO;
		genRndPassword();
	}

	public Password(int longitud) {
		this.longitud = longitud;
		genRndPassword();
	}

	public void genRndPassword() {
		String password = "";
		for (int i = 0; i < this.longitud; i++) {
			password += String.valueOf(generarPassword());
		}
		this.contrasena = password;
	}

	private char generarPassword() {
		Random rnd = new Random();
		int selector = rnd.nextInt(3);
		char value_to_return = '0';
		if (selector == 0) {
			value_to_return = ((char) (rnd.nextInt(26) + 'a'));
		} else if (selector == 1) {
			value_to_return = (char) (rnd.nextInt(10) + '0');
		} else {
			value_to_return = Character.toUpperCase((char) (rnd.nextInt(26) + 'a'));
		}
		return value_to_return;
	}

	public boolean esFuerte() {
		// counters
		int digits = 0;
		int lower_case = 0;
		int upper_case = 0;
		for (int i = 0; i < this.longitud; i++) {
			if (Character.isUpperCase(this.contrasena.charAt(i))) {
				upper_case++;
			} else if (Character.isLowerCase(this.contrasena.charAt(i))) {
				lower_case++;
			} else {
				digits++;
			}

		}
		return ((upper_case > 2) && (lower_case > 1) && (digits > 5));
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContrasena() {
		return this.contrasena;
	}

	public int getLongitud() {
		return this.longitud;
	}

}
