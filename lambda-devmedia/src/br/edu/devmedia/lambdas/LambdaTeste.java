package br.edu.devmedia.lambdas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class LambdaTeste {

	private static JButton button = new JButton("Teste");

	public static void main(String[] args) {

	}

	// Sem expressão lambda
	private void initButton() {
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Botão cilcado!");

			}
		});
	}

	// Com Expressão lambda
	private void initButtonLambda() {
		button.addActionListener((event) -> imprimeTexto(event));
	}

	private void imprimeTexto(ActionEvent event) {
		System.out.println("Botão clicado!");
		System.out.println("Boão clicado 2!");
	}
}
