
public class zoo {
	private final int n=10;
	public animal[] animales = new animal[n];
	public int numero;

	public void AgregarAnimal(animal a){
		if(numero == n){
			System.out.println("zoologico lleno");
		}
		else{
			
			animales[numero] =a;
			numero++;
		}

	}
}