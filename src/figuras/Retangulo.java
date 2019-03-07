package figuras;

public class Retangulo extends Quadrilatero implements Diagonal{
		
	public Retangulo(double base, double altura) {
		super(base, altura);
	}

	@Override
	public double area() {
		return this.getAltura() * this.getBase();	
	}
	
	public double calcularDiagonal() {
		return 1.0;
	}
}
