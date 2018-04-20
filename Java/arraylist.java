
import java.util.ArrayList;

public class ColecccionArrayList{

	public static void main(String[] args) {

	ArrayList<String> elementos= new ArrayList<String>();


	System.out.println("Primer ArrayList ");
	elementos.add("rojo");
	elementos.add(0,"azul");

	for(int i=0; i<elementos.size(); i++){
		System.out.printf("%s\n", elementos.get(i));

	}

	elementos.remove("azul");
	elementos.remove(0);
	System.out.println("ArrayList modificado");

	for(int i=0; i<elementos.size(); i++){
		System.out.printf("%s\n", elementos.get(i));

	}
	elementos.get(5);
 }
} 