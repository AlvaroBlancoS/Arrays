package ArrayFor;

import java.util.Scanner;

public class UnoHastaN {

	public static void main(String[] args) {
		// Solicitar el n�mero al usuario
		Scanner sc = new Scanner(System.in);
		int cantidad;
		// Comprobar que es un n�mero v�lido para crear un array
		// Si no lo es, volver al paso 1
		do {
			System.out.println("Introduzca un n�mero natural");
			cantidad = sc.nextInt();
		} while (cantidad <= 0);
		System.out.println("Has introducido el n�mero: " + cantidad);
		// Creo el array
		int[] miArray = new int[cantidad];
		// Rellenar el array con n�meros desde el 1 hasta n
		for (int i = 0; i < miArray.length; i++) {
			miArray[i] = i + 1;
		}
		// Mostrar el array en pantalla utilizando for
		for (int i = 0; i < miArray.length; i++) {
			System.out.print(miArray[i] + " - ");
		}
	}

}
