
public class squirtle extends pokemon{
	
	public squirtle() {
		super("Squirtle");
		// TODO Auto-generated constructor stub
	}

	//Metodos
	public int ataque2() {
		int daño = 0;
		if(pm2 > 0){
			daño = ataque * 4;
		}
		
		return daño;
	}
}
