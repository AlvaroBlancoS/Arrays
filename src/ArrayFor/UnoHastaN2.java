package ArrayFor;

import java.util.Scanner;

public class UnoHastaN2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cantidad;
		// Comprobar que es un número válido para crear un array
		// Si no lo es, volver al paso 1	
		do {
			System.out.println("Introduzca un número natural");
			cantidad = sc.nextInt();
		} while (cantidad <= 0);
		System.out.println("Has introducido el número: " + cantidad);
		// Creo el array
		int[] miArray = new int[cantidad];
		// Rellenar el array con números desde el 1 hasta n
		for (int i = 0; i < miArray.length; i++) {
			miArray[i] = i + 1;
		}
		// Mostrar el array en pantalla utilizando for
		for (int i = 0; i < miArray.length; i++) {
			System.out.print(miArray[i] + " - ");
		}

	}
}
