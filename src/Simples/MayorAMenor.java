package Simples;

public class MayorAMenor {
	private void imprimir(int[] arraySuma) {
		for (int i = 0; i < arraySuma.length; i++) {
			System.out.println(arraySuma[i] + " ");
		}
		System.out.println(" ");
	}

	private int sumaTotal(int[] arraySuma) {
		int suma = 0;
		for (int i = 0; i < arraySuma.length; i++) {
			suma = suma + arraySuma[i];
		}
		return suma;
	}

	private int mayor(int[] arraySuma) {
		int mayor = Integer.MIN_VALUE;
		for (int i = 0; i < arraySuma.length; i++)
			if (mayor < arraySuma[i])
				mayor = arraySuma[i];

		return mayor;
	}

	private int menor(int[] arraySuma) {
		int menor = arraySuma[0];
		for (int i = 1; i < arraySuma.length; i++)
			if (menor > arraySuma[i])
				menor = arraySuma[i];

		return menor;
	}

	private int diferencia(int[] arraySuma) {
		int dif = 0;
		for (int i = 1; i < arraySuma.length; i++) {
			// Comparar un número arraySuma[i] con el siguiente arraySuma[i+1]
			dif = dif + Math.abs(arraySuma[i - 1] - arraySuma[i]);
		}

		return dif;
	}

	private int diferencia2(int[] arraySuma) {
		int dif = 0;
		for (int i = arraySuma.length - 1; i > 0; i--) {
			// Comparar un número arraySuma[i] con el siguiente arraySuma[i+1]
			dif = dif + Math.abs(arraySuma[i - 1] - arraySuma[i]);
		}

		return dif;
	}

	private boolean orden(int[] arraySuma) {
		boolean res = false;
		String respuesta = "";
		for (int i = 0; i < arraySuma.length - 1; i++) {
			if (arraySuma[i] > arraySuma[i + 1]) {
				res = false;
			}
		}
		return res;

	}

	public static void main(String[] args) {

		int[] arraySuma = { 2, 5, 1, 3, 4 };
		MayorAMenor programa = new MayorAMenor();
		int suma = 0;
		int mayor = 0;
		int menor = 0;
		int rango = 0;
		int diferencia = 0;
		boolean orden;
		// proceso y salida
		programa.imprimir(arraySuma);
		suma = programa.sumaTotal(arraySuma);
		mayor = programa.mayor(arraySuma);
		menor = programa.menor(arraySuma);
		diferencia = programa.diferencia(arraySuma);
		orden = programa.orden(arraySuma);
		rango = mayor - menor;

		System.out.println("La suma de los números es " + " " + suma);
		System.out.println("El mayor de los números es " + " " + mayor);
		System.out.println("El rango es " + " " + rango);
		System.out.println("La suma de la diferencia es  " + " " + diferencia);
		System.out.println("El número del orden es" + " " + orden);
	}

}
