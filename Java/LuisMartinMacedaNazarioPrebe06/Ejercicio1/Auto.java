//Ejercicio 1 serie1 java

public class Auto{


	private String modelo;

	private int puertas;

	private Double altura;

	/** Constructor de la clase Auto
	*@param mod Ingresa el modelo de Auto
	*@param puer Ingresa el numero de puertas del Auto
	*@param alt Ingresa la altura del Auto
	*/

	public Auto(String mod, int puer, Double alt){
		this.modelo=mod;
		this.puertas=puer;
		this.altura=alt;
	}

	public String getModelo(){
		return modelo;
	}

	public void setModelo(String mod){
		this.modelo = mod;
	}

	public int getPuertas(){
		return puertas;
	}

	public void setPuertas(int puer){
		this.puertas = puer;
	}

	public double getAltura(){
		return altura;
	}

	public void setAltura(Double alt){
		this.altura=alt;
	}

	/** Es el metodo que se encarga de arrancar el Auto
	*/
	public void ArrancarAuto(){
		System.out.println("El auto " +getModelo()+ " arranco");
	}

	 /** Metodo que imprime en pantalla toda la informacion del Auto 
	*/
	public void InfoAuto(){
		System.out.println("El modelo de auto: " +getModelo());
		System.out.println("Cueanta con "+getPuertas()+" puertas");
		System.out.println("La altura del Auto: " +getAltura()+ "m");
	}

	/** Metodo que se encarga de cambiar el modelo del Auto 
	*/
	public void CambiarModelo(String mod){
		setModelo(mod);
		System.out.println("El nuevo modelo: "+getModelo());	
	}
}

