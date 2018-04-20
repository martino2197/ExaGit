public class paso_arreglo{
	public static void main(String[] args) {
		int[] arreglo = {20,5,7,9,45,3,5,2,23};
		System.out.println("Distribucion");

		//para cada elementro del arreglo imprimir una varrad del grafico

		for (int contador =0; contador<arreglo.length; contador++){
			if(contador==10)
				System.out.println("%5d",100);
			else
				System.out.println("%02d-%02d: ",contador*10,contador*10+9);

			//imprimir asteriscos

			for(int asteriscos=0; asteriscos<arreglo[contador];asteriscos++)
				System.out.println("*");

			System.out.println();
		}

		
	}

}

