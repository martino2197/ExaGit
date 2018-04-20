
public class Persona{


	private String nombre;
	private int edad;
	private double estatura;
	private double peso;
	/** Constructor de la clase Persona
	*@param nom ingresa el nombre de la persona
	*@param ed ingresa la edad de la persona
	*@param est ingresa la estatura de la persona
	*@param pe ingresa el peso de la persona
	*/
	public Persona(String nom, int ed, double est, double pe){
		this.nombre=nom;
		this.edad=ed;
		this.estatura=est;
		this.peso=pe;
	}

	public String getNombre(){
		return nombre;
	}

	public void setNombre(String nom){
		this.nombre = nom;
	}

	public int getEdad(){
		return edad;
	}

	public void setEdad(int ed){
		this.edad = ed;
	}

	public double getEstatura(){
		return estatura;
	}

	public void setEstatura(double est){
		this.estatura=est;
	}

	public double getPeso(){
		return peso;
	}

	public void setPeso(double pe){
		this.peso=pe;
	}

	/** Metodo utilizado para limpiar pantalla
	*/
	public static void clearScreen() {  
    System.out.print("\033[H\033[2J");  
    System.out.flush();  
	}  


	/*public void ArrancarAuto(){
		System.out.println("El auto " +getModelo()+ " arranco");
	}

	public void InfoAuto(){
		System.out.println("El modelo de auto: " +getModelo());
		System.out.println("Cueanta con "+getPuertas()+" puertas");
		System.out.println("La altura del Auto: " +getAltura()+ "m");
	}

	public void CambiarModelo(String mod){
		setModelo(mod);
		System.out.println("El nuevo modelo: "+getModelo());	
	}*/
}
