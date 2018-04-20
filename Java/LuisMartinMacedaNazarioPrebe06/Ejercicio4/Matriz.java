

public class Matriz{

	private double matriz[][]; 
	private int orden;

	/** Constructor de la clase Matriz
	*@param ord Ingresa el orden de la matriz
	*/
	public Matriz(int ord){
		this.orden=ord;
		matriz = new double[orden][orden];
	}

	public double getValor(int a, int b){
		return  matriz[a][b];
	}

	public int getOrden(){
		return  orden;
	}

	public void setValor(int a, int b, double va){
		this.matriz[a][b] = va;
	}

	/** Metodo que se encarga de imprimir en pantalla el contenido de la matriz
	*/
	public void mostrarMatriz(){
		for(int i=0; i<this.orden; i++){
			System.out.println();
			for(int j=0; j<this.orden; j++){
			System.out.print(" "+getValor(i,j)+" ");
			}
		}
	}

	/** Metodo encargado de realizar la suma de matrices
	*@param A Ingresa la matriz con la cual se hara la suma
	*/
	public void sumaMatriz(Matriz A){

		for(int i=0; i<this.orden; i++){
			System.out.println();
			for(int j=0; j<this.orden; j++){
			System.out.print(" "+(getValor(i,j)+A.getValor(i,j))+" ");
			}
		}
	}

	/** Metodo encargado de realizar la resta de matrices
	*@param A Ingresa la matriz con la cual se hara la resta
	*/
	public void restaMatriz(Matriz A){

		for(int i=0; i<this.orden; i++){
			System.out.println();
			for(int j=0; j<this.orden; j++){
			System.out.print(" "+(getValor(i,j)-A.getValor(i,j))+" ");
			}
		}
	}

	/** Metodo encargado de realizar la multiplicacion de matrices
	*@param A Ingresa la primera matriz
	*@param B Ingresa la segunda matriz
	*@param C Ingresa el orden de ambas matrices
	*/
	public void multiMatriz(Matriz A, Matriz B, int ord){
		Matriz C = new Matriz(ord);

		for(int i=0; i<this.orden; i++){
			System.out.println();
			for(int j=0; j<this.orden; j++){
				for(int k=0; k<this.orden; k++){
					C.setValor(i,j,C.getValor(i,j)+(A.getValor(i,k)*B.getValor(k,j)));
					//System.out.println(" "+C.getValor(k,j)+" ");
				}
				System.out.print(" "+C.getValor(i,j)+" ");
			}
		}
	}
}
