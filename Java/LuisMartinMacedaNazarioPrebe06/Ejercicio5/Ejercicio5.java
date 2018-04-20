import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Ejercicio5{
	public static void main(String[] args) {
		ArrayList<String> nombrePro = new ArrayList<String>();
		ArrayList<Double> precioPro = new ArrayList<Double>();
		Scanner sn = new Scanner(System.in);
		Scanner x = new Scanner(System.in);
        boolean salir = false;
        String nombre;
        double precio, total;
        int opcion, indice;
		while (!salir) {
 
            System.out.println("1.---------------Agregar Producto al carrito");
            System.out.println("2.-------------Eliminar Producto del carrito");
            System.out.println("3.-------------Mostrar Contenido del carrito");
            System.out.println("4.--------------------------Finalizar Compra");
            System.out.println("5.-------------------------------------Salir");
 
            try {
 
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                    	System.out.print("\033[H\033[2J");  
    					System.out.flush(); 

                    	System.out.println("Introduce el nombre del Producto");
                    	nombre=x.nextLine();
                    	nombrePro.add(nombre);
                    	System.out.println("Introduce el precio del Producto");
                    	precio=x.nextDouble();
                    	precioPro.add(precio);
                    	x.nextLine();
                        break;
                    case 2:
                    	System.out.print("\033[H\033[2J");  
    					System.out.flush(); 

                    	System.out.println("Introduce el indice del Producto a eliminar");
                    	indice=x.nextInt();
                    	nombrePro.remove(indice);
                    	precioPro.remove(indice);
                        break;
                    case 3:
                    	System.out.print("\033[H\033[2J");  
    					System.out.flush(); 

                    	for(int i=0; i<nombrePro.size(); i++){
                    		System.out.println("Articulo Numero "+i+"  "+nombrePro.get(i)+"   "+precioPro.get(i));
                    	}
                        break;
                    case 4:
                    	System.out.print("\033[H\033[2J");  
    					System.out.flush(); 
    					total=0;

                    	for(int i=0; i<nombrePro.size(); i++){
                    		total+=precioPro.get(i);
                    	}
                    	if(total>500){
                    		System.out.println("Su compra supera los 500 pesos, debe eliminar algunos productos");
                   		}else{
                   			System.out.println("lista de productos comprados: ");
                   			for(int i=0; i<nombrePro.size(); i++){
                    		System.out.println(" "+nombrePro.get(i)+"   "+precioPro.get(i));
                    		}
                    		System.out.println("El total a pagar: "+total);
                    		System.out.println("Ingrese cualquier caracter para salir del prebemarket");
                    		x.next();
                    		salir = true;
                   		}
                        
                        break;
                    
                    case 5:
                    	salir = true;
                    	break;
                    default:
                        System.out.println("Solo números entre 1 y 5");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
	}
}