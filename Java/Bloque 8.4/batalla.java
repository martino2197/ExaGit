import java.util.Random;
import java.util.Scanner;


public class batalla {
	private entrenador yo;
	private Scanner s = new Scanner(System.in);
	
	private pokemon enemigo, mio;
	
	private Random rand = new Random(System.nanoTime());
	
	//Constructor
	public batalla(entrenador yo){
		this.yo = yo;
	}
	
	//Batalla
	//Con este metodo se comienza la batalla y el se encarga de llamar al resto de metodos
	//Se genera de forma aleatoria un enemigo de tipo aleatorio en funcion del numero aux 
	public void comienza(){		
		int aux = rand.nextInt(3);
		
		switch(aux){
			case 0:
				enemigo = new charmander();
				break;
			case 1:
				enemigo = new bulbasur();
				break;
			case 2:
				enemigo = new squirtle();
				break;
		}
		mio = elige();
		pelea();		
	}
	
	//Genera la pelea entre los dos pokemons, de modo que se puede elegir que ataque realiar
	public void pelea(){
		boolean disponible = true;
		int opcion;
		
		do{
			enemigo.mostrar();
			mio.mostrar();
			
			do{
				System.out.println("Elige que ataque realizar: ");
				System.out.println("1) Placaje. PM: "+mio.getPm1());
				System.out.println("2) Rayo. PM: "+mio.getPm2());
				System.out.println("3) Captura al Enemigo");
				
				System.out.println("Selecciona una opcion: ");
				opcion = s.nextInt();				
				
			}while(opcion < 0 || opcion > 3);
			
			switch(opcion){
				case 1:
					enemigo.daño(mio.ataque1());
					break;
				case 2:
					enemigo.daño(mio.ataque2());
					break;
				case 3:
					disponible = !(yo.captura(enemigo));
			}
			
		}while(mio.getHp() > 0 && enemigo.getHp() > 0 && disponible);
	}
	
	//Con este metodo se elege a que pokemon utilizar en la batalla
	public pokemon elige(){
		int opcion;
		
		System.out.println("Elige tu Pokemon: ");
		opcion = s.nextInt();
		
		return yo.elige(opcion);
	}
}
