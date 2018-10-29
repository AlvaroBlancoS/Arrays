package Simples;

public class LaSuma {
	private void imprimir(int[] arraySuma) {
		for (int i = 0; i < arraySuma.length; i++) {
			System.out.println(arraySuma[i] + " ");
		}
		System.out.println(" ");
	}

	private int sumaTotal(int[] arraySuma) {
		// TODO Auto-generated method stub
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

	public static void main(String[] args) {

		int[] arraySuma = { 2, 5, 1, 3, 4 };
		LaSuma programa = new LaSuma();
		int suma = 0;
		int mayor = 0;

		// proceso y salida
		programa.imprimir(arraySuma);
		suma = programa.sumaTotal(arraySuma);
		mayor = programa.mayor(arraySuma);
		System.out.println("La suma de los números es " + " " + suma);
		System.out.println("El mayor de los números es " + " " + mayor);
	}

}
