package figuras;

public abstract class Poligono extends Figura2D {

	private double base, altura;
	
	public Poligono(double base, double altura) {
		this.base = base;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
}
