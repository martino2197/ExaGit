
public class charmander extends pokemon{
	
	
	public charmander() {
		super("Charmander");
		// TODO Auto-generated constructor stub
	}

	//metodos
	public int ataque2() {
		int da�o = 0;
		if(pm2 > 0){
			da�o = ataque * 2;
		}
		
		return da�o;
	}
}
