package figuras;

public class Circulo extends Figura {

	private double raio;
	
	public Circulo() {
		super();
	}
	
	public Circulo(double raio) {
		super();
		this.raio = raio;
	}
	
	@Override
	public double  area() {
		return Math.PI * Math.pow(raio,2);
	}
}
