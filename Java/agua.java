//recibir arreglo ingresado por el usuario cualq long
//la altura podra ser cualquier num int positivo
//imprimir mapa en la consola
//1+1+1+1+1+1

//prebecario #06

import java.util.Scanner;

public class agua{
	public static void main(String[] args) {

	System.out.println("Ingresa la longitud de tu arreglo: ");

	Scanner longitud = new Scanner(System.in);
	int longitudArreglo = longitud.nextInt();

	int[] arr=new int[longitudArreglo];

	for(int i=0; i<arr.length; i++){
		System.out.println("Ingresa el valor de la posicon "+i+" del arreglo: ");
		Scanner valor = new Scanner(System.in);
		arr[i]=valor.nextInt();
	}

	int agua=0;
	int i=0;
	int k=1;
	int n=0;

	while(i<longitudArreglo){
		
		if(arr[i]<=arr[k]){
			for(int j=0; j<=n; j++)
			{
			agua+=Math.abs(arr[i]-arr[i+j]);
			}
		n=0;
		i=k;
		//i++;
		k++;
		}
		else{
		n++;
		k++;
		}
		if(k==longitudArreglo){
			i++;
			k=i+1;
			n=1;
			System.out.println("if1");
		}
		if((i+1)==longitudArreglo){
			//i++;
			//k=i+1;
			n=0;
			i++;
			System.out.println("if2");
		}

	}
	System.out.println("Los cuadros de agua son = " + agua);
 }
 
}