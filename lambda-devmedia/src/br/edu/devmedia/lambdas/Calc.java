package br.edu.devmedia.lambdas;

public class Calc {

	public static double calcular(double x, double y, OperacaioMatematica operacao){
		return operacao.operar(x, y);
	}
}
