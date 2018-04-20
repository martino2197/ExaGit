//clase Carro


public class Carro{

	protected double peso;
	protected double altura;
	protected boolean encendido = false;

	/** Constructor de la clase Carro
	*@param pe Ingresa el peso del carro
	*@param al Ingresa la altura del carro
	*/
	public Carro(double pe, double al){
		this.peso=pe;
		this.altura=al;
	}


	/** Metodo para encender el carro
	*/
	public void encender(){
		this.encendido = true;
		System.out.println("El Carro se encendio");
	}

	/** Metodo para apagar el carro
	*/
	public void apagar(){
		this.encendido = false;
		System.out.println("El Carro se apago");
	}

	public double getPeso(){
		return peso;
	}

	public double getAltura(){
		return altura;
	}

	/** Metodo para imprimir el estado actual del carro (encendido o apagado)
	*/
	public void estado(){
		if(this.encendido==true){
			System.out.println("El auto esta encendido");
		}else{
			System.out.println("El auto esta apagado");
		}
		
	}

	/** Metodo para Imprimir con formato el peso y la altura del carro
	*/
	public String toString(){
		return String.format("El peso es: %f\nLa altura es: %f", peso, altura);
	}

}

