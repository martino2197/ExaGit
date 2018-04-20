//interfaz suele ser unicamente para la firma de metodos
//clase abstracta puede tener atributos y por lo menos debe tener un metodo abstracto

//ArrayException.java
//

import java.util.Scanner;
import java.util.InputMismatchException;

public class ArrayException{
	public static void main(String[] args) {
		/*try{
			int[] numeros = {1,2,3,4};
			System.out.println("" + numeros[8]);
			System.out.println("Todo bien");

		} catch(ArrayIndexOutOfBoundsException aioobe){
			System.out.println("Te excediste del rango del arreglo");
		}*/
		
		Scanner sc = new Scanner(System.in);	

		int x,y;

		System.out.println("Ingresa un numero");

		try{
			x=sc.nextInt();
		}catch(InputMismatchException ime){
			System.out.println("No se ingreso un numero");
		}finally{
			System.out.println("Siempre se ejecuta");
			x=4;
		}

		String cadena;

		System.out.println("Ingresa un numero para ser el divisor");

		try{
			
			//sc.nextLine();
			cadena = sc.nextLine();

			y = Integer.parseInt(cadena);

			System.out.println("El resultado es: " + (x/y));

		}catch(NumberFormalException nfe){
			System.out.println("No se ingreso un numero");
		}catch(ArithmeticException ae){
			System.out.println("No se puede dividir entre 0");
		}

	}

}
