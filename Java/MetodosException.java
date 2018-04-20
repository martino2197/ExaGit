import java.util.Scanner;

public class MetodosException{

	public void lanzarException() throws MiException{ //nombre de la excepcion \
		Scanner sc = new Scanner(System.in);
		System.out.println("Presiona 1 para lanzar la excepcion");
		int i = sc.nextInt();
		if (i == 1)
			throw new MiException();
	}
}