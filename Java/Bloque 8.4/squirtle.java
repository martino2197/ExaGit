
public class squirtle extends pokemon{
	
	public squirtle() {
		super("Squirtle");
		// TODO Auto-generated constructor stub
	}

	//Metodos
	public int ataque2() {
		int da�o = 0;
		if(pm2 > 0){
			da�o = ataque * 4;
		}
		
		return da�o;
	}
}
