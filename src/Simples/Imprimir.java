package Simples;

public class Imprimir {
	private void imprimir(int[] arrayImprimir) {
		for (int i = 0; i < arrayImprimir.length; i++) {
			System.out.println(arrayImprimir[i] + " ");
		}
			System.out.println(" ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayImprimir = { 2, 5, 1, 3, 4, 23 };
		/* Es un buen método para no utilizar Static 
		que acabamos de crear la clase*/
		Imprimir programa = new Imprimir();
		int suma = 0;
		int mayor = 0;
		
		//Proceso y salida
		programa.imprimir(arrayImprimir);
	}



}
