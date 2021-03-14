package br.com.cskmacedo.iteratorcomparator;

public class Funcionario {

	private String nome;
	private int idade;
	
	public Funcionario(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public int setIdade(int idade) {
		return this.idade = idade;
	}
}
