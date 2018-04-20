/*ClasscastException
Object x = new Integer(20);
String s = (String) x;
*/

/* NegativeArraySizeException
int[] arreglo = new int[-2]
*/

/* NullPointerException

Object[] a = new Object[3];
a[2].toString();       a[2] no tiene nada

*/

public class MiException extends Exception{
	@Override
	public String toString(){
		return "Mi propia excepcion";
	} 
	
	@Override
	public String getMessage(){
		return "Es nuestro propio mensaje";
	} 

	public void hola(){
		System.out.println("HOla mundo desde la Exception");
	}
}

