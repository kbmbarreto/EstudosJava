package br.com.cskmacedo;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Montadora {
	
	private String nome;
	private String origem;
	private List<Montadora> montadoras = new LinkedList<Montadora>();
	
	public Montadora(String nome, String origem) {
		super();
		this.nome = nome;
		this.origem = origem;
	}
	
	public List<Montadora> getMontadoras() {
		return Collections.unmodifiableList(montadoras);
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getOrigem() {
		return origem;
	}
	
	public void adiciona(Montadora montadora) {
		this.montadoras.add(montadora);
	}
	
	@Override
	public String toString() {
		return "[Montadora: " + nome + " // Origem: " + getOrigem() + "]";
	}
}
