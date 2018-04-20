public class Main{
	public static void main(String[] args) {


		Rectangulo r1 = new Rectangulo(5D, 10D);
		Rectangulo r2 = new	Rectangulo(10D, 20D);
		Rectangulo r3 = r1.agrandar(5);

		System.out.println("Rectangulo numero uno");
		new Mostrar(r1);
		System.out.println("Rectangulo numero dos");
		new Mostrar(r2);
		System.out.println("Rectangulo resultante");
		new Mostrar(r3);		
	}
}