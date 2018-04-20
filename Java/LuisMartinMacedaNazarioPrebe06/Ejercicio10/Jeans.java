//Herencia de Prenda a Jeans
public class Jeans extends Prenda{
		protected String nombre="Jeans";
		protected String corte="slim";

		public String getCorte(){
			return corte;
		}
		public String getNombre(){
			return nombre;
		}
		/**Metodo que imprime los datos de la prenda de la clase Jeans
		*/
		public void datosPrenda(){
			System.out.println("Prenda: " +getNombre());
			System.out.println("La talla es: " +getTalla());
			System.out.println("El color es: " +getColor());
			System.out.println("El corte es: " +getCorte());
		}
}
