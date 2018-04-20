//Ejercicio2 serie1 java

import java.util.Scanner;

public class Ejercicio2{
	public static void main(String[] args) {

		
		System.out.println("Ingrese el radio del circulo y utilice , para separar los decimales");
		Scanner ra = new Scanner(System.in);
		double rad = ra.nextDouble();

		System.out.println("Ingrese el lado del Cuadrado y utilice , para separar los decimales");
		Scanner la = new Scanner(System.in);
		double lad = la.nextDouble();

		Circulo A = new Circulo(rad);
		Cuadrado B = new Cuadrado(lad);

		A.calcularAreaCirculo();

		System.out.println();

		A.calcularPerimetroCirculo();

		B.calcularAreaCuadrado();

		System.out.println();
		
		B.calcularPerimetroCuadrado();
	}
}