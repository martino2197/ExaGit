
public class MainInterface{
	public static void main (String[] args){
		ControlRemoto control =new ControlRemoto(new Foco(), new Bomba(), new Computadora(), new Foco());

		control.oprimirBoton1();
		control.oprimirBoton2();

		control.apagarBoton3();
		control.apagarBoton4();

	}
}