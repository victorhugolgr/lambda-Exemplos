package br.edu.devmedia.lambdas.colecoes;

import java.util.Arrays;
import java.util.List;

public class TesteColecoes {

	
	
	
	public static void main(String[] args) {
		listar();
	}
	
	
	public static void listar(){
		
		List<String> lista = Arrays.asList(new String[] {"F","A" ,"B" ,"B", "C"});
		lista.forEach(System.out::println);
		
		
		//filtra apenas os que são iguais a b
		//faz um count
		double count = lista.stream().filter(s -> s.equals("B")).count();

		System.out.printf("Quantidade de 'B' na lista: %s", count);
		
		
	}
}
