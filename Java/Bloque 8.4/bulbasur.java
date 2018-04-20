
public class bulbasur extends pokemon{
	
	public bulbasur() {
		super("Bulbasur");
		// TODO Auto-generated constructor stub
	}


	//Metodos
	public int ataque2() {
		int daño = 0;
		if(pm2 > 0){
			daño = ataque * 3;
		}
		
		return daño;
	}
}
