

public class paso_arreglo{
	public static void main(String[] args) {

	int[] arreglo = {1,2,3,4,5};

	System.out.println("Efecto de pasar una referencia de un arreglo. ");

	for(int i = 0; i<arreglo.length; i++) 
			System.out.println("arreglo["+i+"]: "+arreglo[i]);
		
		modificarArreglo(arreglo);
		System.out.println("Los valores del arreglo modificado: ");

	for(int i = 0; i<arreglo.length; i++) 
			System.out.println("arreglo["+i+"]: "+arreglo[i]);	

	}

	public static void modificarArreglo(int[] a){
		for (int i=0; a.length; i++){
			a[i] *= 5;
		}

	}
}

