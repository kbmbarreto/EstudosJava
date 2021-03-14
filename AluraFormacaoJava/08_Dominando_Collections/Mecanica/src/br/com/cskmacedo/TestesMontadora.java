package br.com.cskmacedo;

public class TestesMontadora {

	public static void main(String[] args) {
		
		Montadora javaColecoes = new Montadora("Volkswagen", "Alemanha");
		javaColecoes.adiciona(new Montadora("Volkswagen", "Alemanha"));
		
		System.out.println(javaColecoes.getMontadoras());
	}
	
}
