package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;

public class TestArrayString {

	public static void main(String[] args) {

		int[] idades = new int[5];// inicializa o array com 0

		for (int i = 0; i < idades.length; i++) {
			idades[i] = i * i;
		}

		for (int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);

		}

	}

}