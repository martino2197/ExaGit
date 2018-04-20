

public class ControlRemoto {
	private Encendible e1, e2;
	private Apagable e3, e4;

	public ControlRemoto(Encendible e1, Encendible e2, Apagable e3, Apagable e4){
		this.e1=e1;
		this.e2=e2;
		this.e3=e3;
		this.e4=e4;
	}


	public void oprimirBoton1(){
		e1.encender();
	}

	public void oprimirBoton2(){
		e2.encender();
	}

	public void apagarBoton3(){
		e3.apagar();
	}

	public void apagarBoton4(){
		e4.apagar();
	}
}
