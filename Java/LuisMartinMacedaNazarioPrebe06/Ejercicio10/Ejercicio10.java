
public class Ejercicio10{

	public static void main (String[] args){
		
		Prenda A = new Jeans(); //poliformismo
		Prenda B = new Cazadora(); //poliformismo

		A.setTalla("32");
		A.setColor("Azul");
		A.datosPrenda(); //poliformismo
		System.out.println();

		A.setTalla("Chica");
		A.setColor("Cafe");
		B.datosPrenda(); //poliformismos
		System.out.println();
	}
}