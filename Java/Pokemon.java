
import java.util.Scanner;

public class Pokemon{
  public String nombre;
  private int vida;
  private int nivel;
  private int ataque;


public void PokemonNew(String nombre){
  this.nombre = nombre;
  this.vida = 100;
  this.nivel = 5;
  this.ataque = 10;
  }


public static void battle(Pokemon pokemon1, Pokemon pokemon2){
  do{
    System.out.println(pokemon1+" comienza la batalla "+pokemon2);
    pokemon2.vida = pokemon2.vida - pokemon1.ataque;

    System.out.println(pokemon1 +" hizo "+ pokemon1.ataque +" de dano a "+
    pokemon2 +" y el "+ pokemon2 +" ha recibido "+ pokemon2.vida +" de dano.");

    pokemon1.vida = pokemon1.vida - pokemon2.ataque;

    System.out.println(pokemon2 +" hizo "+ pokemon2.ataque +" de dano a "+ 
    pokemon1 +" y el "+ pokemon1 +" ha recibido "+ pokemon1.vida +" de dano.");

  }while(pokemon1.vida >= 1 || pokemon2.vida >= 1);
  if(pokemon1.vida < 1)
    System.out.println(pokemon1 +" ha perdido la pelea");
  else
    System.out.println(pokemon2 +" ha perdido la pelea");
  }

public static void main(String[] args) {
  System.out.println("hola prueba");
  Scanner sc = new Scanner(System.in);
  String nombre = sc.next();
  Pokemon pokemon1 = new Pokemon();
  pokemon1.PokemonNew(nombre);

  Pokemon pokemon2 = new Pokemon();
  pokemon2.PokemonNew("perro");

  Pokemon.battle(pokemon1,pokemon2);
 }

}





/* public class principal {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    String nombre;
    int opcion;
    
    System.out.println("Cual es tu nombre?");
    nombre = s.nextLine();
    
    entrenador yo = new entrenador(nombre);
    batalla bat = new batalla(yo);
    
    do{     
      yo.mostrar_mochila();
      System.out.println();
      System.out.println();
      
      System.out.println("Elige una opcion: ");
      System.out.println("1) Empezar una batalla");
      System.out.println("2) Salir");
      
      opcion = s.nextInt();
      
      if(opcion == 1){
        bat.comienza();
      }
      
    }while(opcion != 2);
  }
}
*/