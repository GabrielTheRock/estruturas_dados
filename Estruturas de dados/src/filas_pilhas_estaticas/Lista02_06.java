/*
 * Programador: Gabriel Rocha
 * Objetivo: Considerando o cen�rio descrito no Exerc�cio 5, implemente uma Pilha de
Livros que dever� conter cada elemento removido da Fila. Ou seja, os elementos
removidos da Fila ser�o inseridos em uma Pilha. Realize pelo menos 15
simula��es que demonstrem o processo de retirada da Fila e inclus�o na Pilha.
 * Data: 02/03/2020
 */

package filas_pilhas_estaticas;

import java.util.Random;

public class Lista02_06 {

	public static void main(String[] args) {
		FilaLivros fila = new FilaLivros(10);
		PilhaLivros pilha = new PilhaLivros(10);
		fila = geraLivros(fila);
		System.out.println("Fila ANTES das opera��es");
		fila.mostraFila();
		for(int i = 0; i < 10; i++) {
			System.out.println((i + 1) + "� opera��o");
			pilha.empilha(fila.dequeue());
			pilha.mostraPilha();
			System.out.println();
			fila.mostraFila();
		}
		System.out.println("Fila DEPOIS das opera��es");
		fila.mostraFila();
	}
	
	static FilaLivros geraLivros(FilaLivros fila) {
		Random r = new Random();
		StringBuilder titulo = new StringBuilder();
		String[] letras = {"a", "c", "i", "o", "n", "l", "t", "p", "q"};
		for(int j = 0; j < 10; j++) {
			Livro livro = new Livro();
			for(int i = 0; i < 5; i++) {
				titulo.append(letras[r.nextInt(9)]);
			}
			livro.setTitulo(titulo.toString());
			livro.setQntExem(r.nextInt(1000) + 1);
			titulo.delete(0, 10);
			fila.enqueue(livro);
		}
		return fila;
	}

}
