package br.com.cskmacedo;

public class Modelo {
	
	private String modelo;
	private int codigo;
	
	public Modelo(String modelo, int codigo) {
		this.modelo = modelo;
		this.codigo = codigo;
	}

	public String getModelo() {
		return modelo;
	}

	public int getCodigo() {
		return codigo;
	}
	
}
