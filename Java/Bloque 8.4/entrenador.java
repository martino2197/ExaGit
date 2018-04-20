import java.util.Random;
import java.util.Vector;

public class entrenador {
	private String nombre;
	
	private Vector<pokemon> mochila = new Vector<pokemon>();
	
	private Random rand = new Random(System.nanoTime());
	
	//Constructor
	//Se genera de forma aleatoria un tipo de Pokemon en funcion del numero aux aleatorio
	//dentro del constructor
	public entrenador(String nombre){
		int aux = rand.nextInt(3);
		
		switch(aux){
			case 0:
				mochila.add(new charmander());
				break;
			case 1:
				mochila.add(new bulbasur());
				break;
			case 2:
				mochila.add(new squirtle());
				break;
		}
		this.nombre = nombre;
	}
	
	//Getter	
	public String getNombre(){
		return nombre;
	}
	
	//metodos
	//Se elige a un Pokemon de la mochila en funcion del indice recibido (i) y se devuelve,
	//si el indice no se encuentra en el vector se devuelve null
	public pokemon elige(int i){
		if(i < mochila.size()){
			return mochila.get(i);
		}
		else{
			return null;
		}
	}
	
	//Metodo que se llama cuando un entrenador trata de capturar a un Pokemon, devuelve
	//un booleano confirmando si lo ha capturado o no y solo lo capturara si existe
	//hueco en la mochila
	public boolean captura(pokemon enemigo){
		boolean capturado = false;
		
		if(enemigo.getHp() <= 20){
			mochila.add(enemigo);
			capturado = true;
				
			System.out.println("Has capturado un nuevo Pokemon!");
		}
		else{
			System.out.println("Imposible de capturar.");
		}
		
		return capturado;		
	}
	
	//Metodo que muestra los Pokemons que tenemos en la mochila junto con sus caracteristicas
	public void mostrar_mochila(){
		System.out.println("Tienes: "+mochila.size()+" Pokemon");
		
		for(int i = 0; i < mochila.size(); i++){
			System.out.println("Nº: "+i+" Tipo Pokemon: "+mochila.get(i).getNombre()+" Nivel: "+mochila.get(i).getNivel()+" Vida: "+mochila.get(i).getHp());
		}
	}
}











