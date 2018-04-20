
public class ManejoException{
	public static void main(String[] args) {
		MetodosException me = new MetodosException();

		try{
			me.lanzarException();
		}catch(MiException mie){
			System.out.println(mie);
			mie.hola();
			mie.getMessage();
		}
	}
}
