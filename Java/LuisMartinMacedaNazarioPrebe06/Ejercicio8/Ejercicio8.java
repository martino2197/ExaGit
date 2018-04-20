import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio8{
	public static void main(String[] args) {
		
		Scanner sn = new Scanner(System.in);
		Scanner val = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
 		double A, B; //Variables con las que se realizaran las operaciones

        while (!salir) {
 
            System.out.println("1.---------------Suma");
            System.out.println("2.------------- Resta");
            System.out.println("3.-----Multiplicacion");
            System.out.println("4.-----------Division");
            System.out.println("5.--------------Salir");
 
            try {
 
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                    	System.out.print("\033[H\033[2J");  
    					System.out.flush(); 

                        System.out.println("Ingrese el primer numero");
                        A = val.nextDouble();
                        
                        System.out.println("Ingrese el segundo numero");
                        B = val.nextDouble();
                       
						System.out.println("Resultado: "+A+"+"+B+"="+(A+B));
						//val.nextInt();
						System.out.println();

                        break;
                    case 2:
                    	System.out.print("\033[H\033[2J");  
    					System.out.flush(); 
    					//limpia pantalla
                         System.out.println("Ingrese el primer numero");
                        A = val.nextDouble();
                        
                        System.out.println("Ingrese el segundo numero");
                        B = val.nextDouble();
                       
						System.out.println("Resultado: "+A+"-"+B+"="+(A-B));
						//val.nextInt();
						System.out.println();

                        break;
                    case 3:
                    	System.out.print("\033[H\033[2J");  
    					System.out.flush(); 
    					//limpia pantalla
                    	 System.out.println("Ingrese el primer numero");
                        A = val.nextDouble();
                        
                        System.out.println("Ingrese el segundo numero");
                        B = val.nextDouble();
                       
						System.out.println("Resultado: "+A+"*"+B+"="+(A*B));
						//val.nextInt();
						System.out.println();
                        break;
                    case 4:
                    	System.out.print("\033[H\033[2J");  
    					System.out.flush(); 
    					//limpia pantalla
                    	System.out.println("Ingrese el primer numero");
                        A = val.nextDouble();
                        
                        System.out.println("Ingrese el segundo numero");
                        B = val.nextDouble();
                       
						System.out.println("Resultado: "+A+"/"+B+"="+(A/B));
						//val.nextInt();
						System.out.println();
                        break;
                    case 5:
                    	salir = true;
                    	break;
                    default:
                        System.out.println("Solo números entre 1 y 5");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                val.nextLine();
                sn.next();
            }
        }
	}
}