package br.com.cskmacedo;

import java.util.HashSet;
import java.util.Set;

public class TesteModelo {

	public static void main(String[] args) {
		
		Set<String> modelos = new HashSet<>();
		modelos.add("Gol");
		modelos.add("Saveiro");
		modelos.add("Voyage");
		modelos.add("Touareg");
		modelos.add("Kombi");
		
		try {
			for (String mod : modelos) {
				System.out.println(mod);
			}
		} catch(Exception ex) {
			System.out.println("Ocorreu um erro de execução, detalhes sobre o erro: " + ex);
		}
	}
}
