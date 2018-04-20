

import java.util.Scanner;

public class juego{
	public static void main(String[] args) {


		Dado dado1 = new Dado();
		Dado dado2 = new Dado();
		int suma=0;

		System.out.println("Ingresa el numero de Lanzamientos: ");

		Scanner numero = new Scanner(System.in);
		int Lanzamientos = numero.nextInt();		
		
		for(int i=0; i<Lanzamientos; i++){
		dado1.Lanzamiento();
		dado2.Lanzamiento();
		suma=dado1.cara() + dado2.cara() ;
		System.out.println("La suma de los dados = " + suma);
		}
	

		
		
	}
}