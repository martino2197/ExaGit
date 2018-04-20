
//Ejercicio 2 serie1 java


public class Circulo{

	private Double radio;
	private final Double pi=3.1416; // la variable pi se declara "final double" debido a que ese valor va a ser constante dentro de nuestro programa

	public Double getRadio(){
		return radio;
	}

	public void setRadio(Double rad){
		this.radio = rad;
	}

	/** Calcula el Area del Circulo
		*/
	public void calcularAreaCirculo(){
		System.out.println("El Area del Circulo: " +pi*(Math.pow(radio,2)));
	}

	/** Calcula el Perimetro del Circulo
		*/
	public void calcularPerimetroCirculo(){
		System.out.println("El Area del Circulo: " +pi*(2*radio));
	}

	/** Constructor de la clase Circulo
		*@param rad Ingresa el valor que tomara el radio del circulo
		*/
	Circulo(Double rad){
		setRadio(rad);
	}

}