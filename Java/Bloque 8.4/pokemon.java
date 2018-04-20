import java.util.Random;


public abstract class pokemon {
	protected int nivel, ataque, hp, pm1, pm2;
	protected String nombre;
	
	private Random rand = new Random(System.nanoTime());
	
	//Constructor
	public pokemon(String nombre) {
		nivel = rand.nextInt(5) + 1; //Le sumo 1 al nivel, para tener como minimo el nivel 1
		
		this.ataque = nivel * 5;
		this.hp = nivel * 10;
		this.pm1 = 10;
		this.pm2 = 10;
		
		this.nombre = nombre;
	}	
	
	//Getters
	public int getNivel(){
		return nivel;
	}
	
	public int getHp() {
		return hp;
	}	
	
	public int getPm1() {
		return pm1;
	}

	public void setPm1(int pm1) {
		this.pm1 = pm1;
	}

	public int getPm2() {
		return pm2;
	}
	
	public String getNombre(){
		return nombre;
	}

	public void setPm2(int pm2) {
		this.pm2 = pm2;
	}

	//metodos
	public int ataque1(){
		int daño = 0;
		
		if(pm1 > 0){
			daño = ataque;
		}
		
		return daño;
	}
	
	public void daño(int puntos){
		hp -= puntos;
	}
	
	//Sera sobreescrito
	public abstract int ataque2();

	//Datos
	//Sipmlemente mostrar por pantalla las datos del pikachu en cuestion
	public void mostrar(){
		System.out.println("Nombre: "+nombre+" Nivel: "+nivel+" Hp: "+hp);
	}
}
