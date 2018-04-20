
//Ejercicio 2 serie1 java


public class Cuadrado{

	private Double lado;


	public Double getLado(){
		return lado;
	}

	public void setLado(Double lad){
		this.lado = lad;
	}
	
	/** Calcula el Area del Cuadrado
		*/
	public void calcularAreaCuadrado(){
		System.out.println("El Area del Cuadrado: "+(Math.pow(lado,2)));
	}

	/** Calcula el Perimetro del Cuadrado
		*/
	public void calcularPerimetroCuadrado(){
		System.out.println("El Area del Circulo: "+ (4*lado));
	}

	/** Constructor de la clase Cuadrado
		*@param lad Ingresa el valor de los lados del cuadrado
		*/
	Cuadrado(Double lad){
		setLado(lad);
	}

}