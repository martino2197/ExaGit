

public class Ejercicio7{

	public static void main (String[] args){
		MP3 A =new MP3();
		VIDEO B =new VIDEO();
		IMAGEN C =new IMAGEN();

		A.play(); //play para la clase MP3
		A.siguiente(); //siguiente para la clase MP3
		A.anterior(); //anterior para la clase MP3
		A.pausa(); //pausa para la clase MP3
		System.out.println();

		B.play(); //play para la clase VIDEO
		B.siguiente(); //siguiente para la clase VIDEO
		B.anterior(); //anterior para la clase VIDEO
		B.pausa(); //pausa para la clase VIDEO
		System.out.println();

		C.play(); //play para la clase IMAGEN
		C.siguiente(); //siguiente para la clase IMAGEN
		C.anterior(); //anterior para la clase IMAGEN
		System.out.println();

	}
}