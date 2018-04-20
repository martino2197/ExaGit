//clase dado, esta clase dado tiene un dato tipo entero que sera el valor que tome la cara,
// ademas de contar con un metedo que sera el encargado de arrogar el dado, este metodo pertenecera
// a la clase y no al objeto

import java.util.Random;

public class Dado{

	private int cara;

	public int cara(){
		return cara;
	}

	public void Lanzamiento(){
		Random aleatorio = new Random();
		this.cara = aleatorio.nextInt(6) + 1;
	}
}
