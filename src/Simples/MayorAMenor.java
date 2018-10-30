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

	public static void main(String[] args) {

		int[] arraySuma = { 2, 5, 1, 3, 4 };
		MayorAMenor programa = new MayorAMenor();
		int suma = 0;
		int mayor = 0;
		int menor = 0;
		int rango = 0;

		// proceso y salida
		programa.imprimir(arraySuma);
		suma = programa.sumaTotal(arraySuma);
		mayor = programa.mayor(arraySuma);
		menor = programa.menor(arraySuma);
		rango = mayor - menor;
		System.out.println("La suma de los números es " + " " + suma);
		System.out.println("El mayor de los números es " + " " + mayor);
		System.out.println("El rango es " + " " + rango);
	}

}
