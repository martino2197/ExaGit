//Herencia de Prenda a Cazadora
public class Cazadora extends Prenda{
		protected String nombre="Cazadora";
		protected String material="Cuero";

		public String getMaterial(){
			return material;
		}

		public String getNombre(){
			return nombre;
		}
		/**Metodo que imprime los datos de la prenda de la clase Cazadora
		*/
		public void datosPrenda(){
			System.out.println("Prenda: " +getNombre());
			System.out.println("La talla es: " +getTalla());
			System.out.println("El color es: " +getColor());
			System.out.println("El material es: " +getMaterial());
		}
}
