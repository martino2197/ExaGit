/*herencia
*/

public class Barco extends VehiculoAcuatico{
	String nombreAcuatico;

	public Barco(String nombre){
		super(nombre);
	}

	public void encenderMotores(){
		System.out.println("Estoy encendiendo los motores");
	}

	@Override
	//sobrecarga es cuando un mismo metodo le ingresas distintos tipos de datos
	//sobreescribir es cuando cambias el comportamiento del metodo
	public void navegar(){
		System.out.println("Soy un Barco y mi nombre es "+ nombreAcuatico)
	}

}
