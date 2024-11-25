package com.ipartek.ejercicioPOO4;

public class Libro {
	private String referencia;
	private String titulo;
	private String autor;
	private int ejemplares;
	private int prestados;
	
	
	public Libro(String referencia, String titulo, String autor, int ejemplares, int prestados) {
		setReferencia(referencia);
		setTitulo(titulo);
		setAutor(autor);
		setEjemplares(ejemplares);
		setPrestados(prestados);
	}

	public Libro() {
		super();
	}




	public String getReferencia() {
		return referencia;
	}


	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public int getEjemplares() {
		return ejemplares;
	}


	public void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}


	public int getPrestados() {
		return prestados;
	}


	public void setPrestados(int prestados) {
		this.prestados = prestados;
	}

	@Override
	public String toString() {
		return "LIBRO\n: referencia: " + referencia + "\ntitulo: " + titulo + "\nautor: " + autor + "\nejemplares: "
				+ ejemplares + "\nprestados: " + prestados;
	}
	
	
	
	
	

}
