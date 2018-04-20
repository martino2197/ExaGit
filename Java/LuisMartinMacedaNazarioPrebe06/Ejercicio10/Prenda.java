//Abstraccion de los componentes de una prenda
public class Prenda{
		protected String talla="chica"; //Encapsulamiento
		protected String color="Negro";	//Encapsulamiento

		public String getTalla(){
			return talla;
		}

		public void setTalla(String ta){
			this.talla=ta;
		}

 		public String getColor(){
			return color;
		}

		public void setColor(String co){
			this.color=co;
		}
		/**Metodo que imprime los datos de la prenda de la clase Prenda
		*/
		public void datosPrenda(){
			System.out.println("La talla es: " +getTalla());
			System.out.println("El color es: " +getColor());
		}
}
