public class MainZoo{
	public static void main(String[] args){
		zoo z = new zoo();
		z.AgregarAnimal(new jirafa());
		z.AgregarAnimal(new leon());
		for (int i=0; i < z.numero; i++){
			animal a = z.animales[i];
			a.alimentar(new carne());
			a.alimentar(new manzana());

			if(a instanceof leon){

			leon l = (leon) a;
			l.rugir();

			//animal obj = new leon(); upcasting

			//leon obt = (leon) new animal(); downcasting
			}
		}
	}
}