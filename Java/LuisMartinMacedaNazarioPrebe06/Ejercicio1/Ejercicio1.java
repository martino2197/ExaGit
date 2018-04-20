//Ejercicio1 serie1 java

import java.util.Scanner;


public class Ejercicio1{
	public static void main(String[] args) {
		
		System.out.println("Ingrese el Modelo de su nuevo Auto");
		Scanner st = new Scanner(System.in);
		String mod = st.nextLine();

		int puer=4;
		double alt=1.5;
		
		Auto A = new Auto(mod, puer, alt);
		Auto B = new Auto(mod, puer, alt);
		Auto C = new Auto(mod, puer, alt);

		A.ArrancarAuto();
		System.out.println();
		B.InfoAuto();

		System.out.println("Ingrese el nuevo Nombre de modelo para su Auto");
		Scanner str = new Scanner(System.in);
		String newmod = str.nextLine();
		System.out.println();
		C.CambiarModelo(newmod);
	}
}