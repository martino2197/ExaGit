import java.util.Scanner;

public class Ejercicio6{
	public static void main(String[] args) {

		
		System.out.println("Ingrese el Modelo de su nuevo Auto");
		//Scanner st = new Scanner(System.in);
		//String mod = st.nextLine();

		double pe=4;
		double al=1.5;


		CarroBWM A = new CarroBWM(pe, al);
		CarroVW B = new CarroVW(pe, al);
	

		System.out.println(A.toStringBWM());
		A.estado();

		System.out.println();
		System.out.println(B.toStringVW());
		B.estado();
	}
}