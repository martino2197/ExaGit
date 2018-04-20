

import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio4{
	public static void main(String[] args) {
		
		Scanner sn = new Scanner(System.in);
		Scanner x = new Scanner(System.in);
        boolean salir = false;
        int opcion, ord; //Guardaremos la opcion del usuario
 		Matriz A, B;

        while (!salir) {
 
            System.out.println("1.---------------Suma de Matrices");
            System.out.println("2.------------- Resta de Matrices");
            System.out.println("3.-----Multiplicacion de Matrices");
            System.out.println("4.--------------------------Salir");
 
            try {
 
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                    	System.out.print("\033[H\033[2J");  
    					System.out.flush(); 

                        System.out.println("Ingrese el Orden de las Matrices que se van a sumar");
                        ord = x.nextInt();
                        A=new Matriz(ord);
                        B=new Matriz(ord);

                        System.out.println("Ingrese los valores de la Matriz A");
                        System.out.println();

                        for(int i=0; i<A.getOrden(); i++){
							System.out.println();
							for(int j=0; j<A.getOrden(); j++){
								System.out.print("Ingrese el valor de la posicion ["+i+"]["+j+"]");
								double val = x.nextDouble();
								A.setValor(i,j,val);
							}
						}

						System.out.print("\033[H\033[2J");  
    					System.out.flush(); 

    					System.out.println("Ingrese los valores de la Matriz B");
                        System.out.println();

						for(int i=0; i<B.getOrden(); i++){
							System.out.println();
							for(int j=0; j<B.getOrden(); j++){
								System.out.print("Ingrese el valor de la posicion ["+i+"]["+j+"]");
								double val = x.nextDouble();
								B.setValor(i,j,val);
							}
						}
						System.out.println();
						System.out.println("Matriz A:");
						A.mostrarMatriz();
						System.out.println();
						System.out.println("Matriz B:");
						B.mostrarMatriz();
						System.out.println();
						System.out.println("Resultado de la suma");
						A.sumaMatriz(B);
						System.out.println();

                        break;
                    case 2:
                    	System.out.print("\033[H\033[2J");  
    					System.out.flush(); 

                        System.out.println("Ingrese el Orden de las Matrices que se van a restar");
                        ord = x.nextInt();
                        A=new Matriz(ord);
                        B=new Matriz(ord);

                        System.out.println("Ingrese los valores de la Matriz A");
                        System.out.println();

                        for(int i=0; i<A.getOrden(); i++){
							System.out.println();
							for(int j=0; j<A.getOrden(); j++){
								System.out.print("Ingrese el valor de la posicion ["+i+"]["+j+"]");
								double val = x.nextDouble();
								A.setValor(i,j,val);
							}
						}

						System.out.print("\033[H\033[2J");  
    					System.out.flush();

    					System.out.println("Ingrese los valores de la Matriz B");
                        System.out.println(); 

						for(int i=0; i<B.getOrden(); i++){
							System.out.println();
							for(int j=0; j<B.getOrden(); j++){
								System.out.print("Ingrese el valor de la posicion ["+i+"]["+j+"]");
								double val = x.nextDouble();
								B.setValor(i,j,val);
							}
						}
						System.out.println();
						System.out.println("Matriz A:");
						A.mostrarMatriz();
						System.out.println();
						System.out.println("Matriz B:");
						B.mostrarMatriz();
						System.out.println();
						System.out.println("Resultado de la resta");
						A.restaMatriz(B);
						System.out.println();
                        break;
                    case 3:
                    	System.out.print("\033[H\033[2J");  
    					System.out.flush(); 

                    	System.out.println("Ingrese el Orden de las Matrices que se van a Multiplicar");
                        ord = x.nextInt();
                        A=new Matriz(ord);
                        B=new Matriz(ord);

                        System.out.println("Ingrese los valores de la Matriz A");
                        System.out.println();

                        for(int i=0; i<A.getOrden(); i++){
							System.out.println();
							for(int j=0; j<A.getOrden(); j++){
								System.out.print("Ingrese el valor de la posicion ["+i+"]["+j+"]");
								double val = x.nextDouble();
								A.setValor(i,j,val);
							}
						}

						System.out.print("\033[H\033[2J");  
    					System.out.flush(); 

    					System.out.println("Ingrese los valores de la Matriz B");
                        System.out.println();

						for(int i=0; i<B.getOrden(); i++){
							System.out.println();
							for(int j=0; j<B.getOrden(); j++){
								System.out.print("Ingrese el valor de la posicion ["+i+"]["+j+"]");
								double val = x.nextDouble();
								B.setValor(i,j,val);
							}
						}
						System.out.println();
						System.out.println("Matriz A:");
						A.mostrarMatriz();
						System.out.println();
						System.out.println("Matriz B:");
						B.mostrarMatriz();
						System.out.println();
						System.out.println("Resultado de la multiplicacion");
						A.multiMatriz(A,B,A.getOrden());
						System.out.println();
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
	}
}