public class Rectangulo{
	private Double base;
	private Double altura;

	public Double getBase(){
		return base;
	}
	public void setBase(Double base){
		this.base = base;
	}
	public Double getAltura(){
		return altura;
	}
	public void setAltura(Double altura){
		this.altura = altura;
	}

	public Double calcularArea(){
		return base*altura;
	}
	public Double calcularPerimetro(){
		return 2*base+2*altura;
	}

	public Rectangulo agrandar(int x){
		return new Rectangulo(x*base, x*altura);
	}

	Rectangulo(Double base, Double altura){
		this.base = base;
		this.altura = altura;
	}

}


