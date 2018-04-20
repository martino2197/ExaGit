
import java.util.Scanner;
import java.util.ArrayList;


public class Ejercicio3{
	public static void main(String[] args) {

		
		System.out.println("Ingrese el numero de personas que desea agregar");
		Scanner nu = new Scanner(System.in);
		int numero = nu.nextInt();
		ArrayList<Persona> personas=new ArrayList<Persona>();

		for(int i=0; i<numero; i++){
			System.out.println();

			System.out.println("Nombre: ");
			nu.nextLine();
			String nombre=nu.nextLine();
			System.out.println("Edad: ");
			int edad=nu.nextInt();
			System.out.println("Estatura (cm): ");
			double estatura=nu.nextDouble();
			System.out.println("Peso (kg): ");
			double Peso=nu.nextDouble();
			personas.add(new Persona(nombre, edad, estatura, Peso));
		}

		System.out.print("\033[H\033[2J");  
    	System.out.flush();  
    	
		ArrayList<String> nom = new ArrayList<String>();
		ArrayList<Integer> eda = new ArrayList<Integer>();
		ArrayList<Double> est = new ArrayList<Double>();
		ArrayList<Double> pes = new ArrayList<Double>();
		

		for(Persona i : personas){
			System.out.println();

			System.out.println("Nombre: "+i.getNombre());
			System.out.println("Edad: "+i.getEdad());
			System.out.println("Estatura (cm): "+i.getEstatura());
			System.out.println("Peso: "+i.getPeso());

			nom.add(i.getNombre());
			eda.add(i.getEdad());
			est.add(i.getEstatura());
			pes.add(i.getPeso());
		}

		System.out.println();
		System.out.println("ArrayList nombre");
		for(String i : nom){
			System.out.println(i);
		}
		System.out.println();
		System.out.println("ArrayList edad con Integer");
		for(Integer i : eda){
			System.out.println(i);
		}
		System.out.println();
		System.out.println("ArrayList estatura con Double");
		for(Double i : est){
			System.out.println(i);
		}
		System.out.println();
		System.out.println("ArrayList peso con Double");
		for(Double i : pes){
			System.out.println(i);
		}
	}
}