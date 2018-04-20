


public class CarroBWM extends Carro{

	String modelo="BWM";

	/** Constructor para la clase CarroBWM que luego llamara al constructor de la superclase Carro
	*@param pe Ingresa el valor del peso
	*@param al Ingresa el valor de la altura
	*/
	public CarroBWM(double pe, double al){
		super(pe,al);
	}

	/** Metodo para Imprimir con formato el peso y la altura del carro, utilizando los metodos get de la superclase carro
	*/
	public String toStringBWM(){
		return String.format("El peso es: %f\nLa altura es: %f\nEl modelo es: %s", super.getPeso(), super.getAltura(), this.modelo);
	}

}