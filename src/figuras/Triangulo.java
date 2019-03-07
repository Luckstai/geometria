package figuras;

public class Triangulo extends Poligono {

	public Triangulo(double base, double altura) {
		super(base, altura);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double area() {
		return getAltura() * getBase();
	}

}
