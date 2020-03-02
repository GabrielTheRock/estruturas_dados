/*
 * Programador: Gabriel Rocha
 * Objetivo: considerando o cenário do descrito no Exercício 6, realize a ordenação dos
Livros pelo título e apresente os resultados em tela.
 * Data: 02/03/2020
 */

package filas_pilhas_estaticas;

import java.util.Random;

public class Lista02_07 {

	public static void main(String[] args) {
		FilaLivros fila = new FilaLivros(10);
		PilhaLivros pilha = new PilhaLivros(10);
		fila = geraLivros(fila);
		System.out.println("Fila ANTES da ordenação");
		fila.mostraFila();
		//Implementando o método que ordena a fila
		fila.ordenaLivros();
		System.out.println("Fila DEPOIS da ordenação");
		fila.mostraFila();
		for(int i = 0; i < 10; i++) {
			System.out.println((i + 1) + "ª operação");
			pilha.empilha(fila.dequeue());
			pilha.mostraPilha();
			System.out.println();
			fila.mostraFila();
		}
		System.out.println("Pilha DEPOIS das operações");
		pilha.mostraPilha();
		System.out.println("Fila DEPOIS das operações");
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
