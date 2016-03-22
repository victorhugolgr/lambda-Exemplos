package br.edu.devmedia.lambdas;

public class TesteCalculadora {

	public static void main(String[] args) {
		double resultado = Calc.calcular(20d, 30d, (x,y) -> x + y);
		System.out.println(resultado);
		
	}
	
}
