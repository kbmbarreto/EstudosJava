package br.com.cskmacedo;

import java.util.ArrayList;
import java.util.Collections;

public class Testes {

	public static void main(String[] args) {
		String opcao1 = "Volkswagen";
		String opcao2 = "Chevrolet";
		String opcao3 = "Honda";
		String opcao4 = "Toyota";
		String opcao5 = "Citroen";

		ArrayList<String> montadoras = new ArrayList<>();
		montadoras.add(opcao1);
		montadoras.add(opcao2);
		montadoras.add(opcao3);
		montadoras.add(opcao4);
		montadoras.add(opcao5);

		Collections.sort(montadoras);
		montadoras.forEach(montadora -> {
			System.out.println("Montadora: " + montadora);
		});

		System.out.println("");
		System.out.println("Informações:");
		System.out.println("");
		System.out.println("Quantidade de montadoras cadastradas: " + montadoras.size());
	}
}
