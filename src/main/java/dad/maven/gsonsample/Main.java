package dad.maven.gsonsample;

import java.util.Scanner;

public class Main {

	public static void pedirDatos(Object[] _dato) {
		Scanner in = new Scanner(System.in);
		String dato;
		boolean datoValido = false;

		// Preguntamos por el nombre
		do {
			System.out.print("> Introduzca el nombre de la persona: ");
			dato = in.nextLine();
			if (datoValido = dato.matches("^[a-zA-Z]+$"))
				_dato[0] = dato;
			else
				System.out.println("> ERROR: Se esperaba un nombre válido.");
		} while (!datoValido);

		// Preguntamos por los apellidos
		do {
			System.out.print("> Introduzca los apellidos de la persona: ");
			dato = in.nextLine();
			if (datoValido = dato.matches("^[a-zA-Z]+( [a-zA-Z]+)*$"))
				_dato[1] = dato;
			else
				System.out.println("> ERROR: Se esperaban apellidos válidos.");
		} while (!datoValido);

		// Preguntamos por la edad
		do {
			System.out.print("> Introduzca la edad de la persona: ");
			dato = in.nextLine();
			if (datoValido = dato.matches("^[0-9]+$"))
				_dato[2] = Integer.parseInt(dato);
			else
				System.out.println("> ERROR: Se esperaban apellidos válidos.");

		} while (!datoValido);

		in.close();
	}

	public static void main(String[] args) {
		final int CANTIDAD_DATOS = 3;
		Persona p = new Persona();

		Object[] _dato = new Object[CANTIDAD_DATOS];

		pedirDatos(_dato);
		p.inicializar((String) _dato[0], (String) _dato[1], (Integer) _dato[2]);

		System.out.println(p.toJSON());
	}

}
