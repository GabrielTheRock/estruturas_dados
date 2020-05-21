/*
 * Programador: Gabriel Rocha
 * Descrição: classe de livros
 * Data: 16/03/2020
 */

package duplamente_ligada;

public class Livro {
	
	private String titulo;
	private int qntExem;
	
	public Livro() {
		titulo = "";
		qntExem = 0;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getQntExem() {
		return qntExem;
	}

	public void setQntExem(int qntExem) {
		this.qntExem = qntExem;
	}
}
