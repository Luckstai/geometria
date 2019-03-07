package figuras;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Geometria {
	
	public static void main(String args[]) {
		Random gerador = new Random();
		List<Figura> figuras = new ArrayList<>();
		figuras.add(new Circulo(25* gerador.nextDouble() + 5));
		figuras.add(new Retangulo(5 + gerador.nextDouble() * 5, 15 + gerador.nextDouble() * 32));
	
        for(Figura f : figuras) {
            System.out.println(f.area());
        }
	}
}