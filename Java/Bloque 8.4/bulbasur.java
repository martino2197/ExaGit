
public class bulbasur extends pokemon{
	
	public bulbasur() {
		super("Bulbasur");
		// TODO Auto-generated constructor stub
	}


	//Metodos
	public int ataque2() {
		int da�o = 0;
		if(pm2 > 0){
			da�o = ataque * 3;
		}
		
		return da�o;
	}
}
