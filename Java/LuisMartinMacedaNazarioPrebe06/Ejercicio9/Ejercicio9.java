/*poliformismo*/

public class Ejercicio9{

	public static void main (String[] args){
		
		Consola A = new PC(); 
		Consola B = new PS4();
		Consola C = new XBOXONE();

		A.encender();
		A.estadoGraficos();
		A.hardware();
		A.apagar();
		System.out.println();

		B.encender();
		B.estadoGraficos();
		B.hardware();
		B.apagar();
		System.out.println();

		C.encender();
		C.estadoGraficos();
		C.hardware();
		C.apagar();
		System.out.println();
	}
}