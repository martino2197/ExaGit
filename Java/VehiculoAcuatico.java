/*herencia
*/

public class VehiculoAcuatico extends Vehiculo{
	String nombreAcuatico;

	public VehiculoAcuatico(String nombre){
		super(nombre);
	}

	public void navegar(){
		System.out.println(super.transportar()+ " Acuatico ");
	}

}
