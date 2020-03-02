/*
 * Programador: Gabriel Rocha
 * Objetivo: A classe Livro possuí os seguintes atributos que são criados na classe concreta e
acessados por meio dos métodos públicos da classe (getters e setters). Dado o
cenário implemente uma Fila em que:
- Sejam criados em uma classe os atributos título do tipo de dado String e
quantidade de exemplares do tipo de dado inteiro. Estes atributos devem ser
acessados por meio de seus métodos públicos (getters e setters). Esta classe deve
receber em seu método construtor a quantidade de elementos que a Fila terá em
sua capacidade.
- Implemente uma classe que terá os métodos de enqueue e dequeue, para realizar
as operações de adicionar e remover os elementos da Fila. Esta classe deverá
conter um vetor estático chamado Livro dados[ ]
- Crie um método que receba os dados de entrada para a Fila.
- Crie um método que realize a exibição dos elementos da Fila
 * Data: 02/03/2020
 */

package filas_pilhas_estaticas;

import java.util.Random;

class FilaLivros {
	
	private int fim;
	private int tamMaximo;
	private Livro[] dados;
	
	FilaLivros(int tam) {
		fim = -1;
		dados = new Livro[tam];
		tamMaximo = tam;
	}
	
	private boolean cheia() {
		return (fim == tamMaximo - 1);
	}
	
	private boolean vazia() {
		return (fim == -1);
	}
	
	public void enqueue(Livro liv) {
		if(!cheia()) {
			fim++;
			dados[fim] = liv;
		} else {
			System.out.println("Erro ao enfileirar! A fila está cheia!");
		}
	}
	
	public Livro dequeue() {
		Livro liv = new Livro();
		Livro vazio = new Livro();
		if(!vazia()) {
			liv = dados[0];
			fim--;
			for(int i = 0; i <= fim; i++) {
				dados[i] = dados[i + 1];
			}
			dados[fim + 1] = vazio;
		} else {
			System.out.println("Erro ao desenfileirar! A fila está vazia!");
		}
		return liv;
	}
	
	public void mostraFila() {
		for(int i = 0; i < tamMaximo; i++) {
			if(dados[i] != null) {
				System.out.println(dados[i].getTitulo() + " " + dados[i].getQntExem());
			}
		}
		System.out.println();
	}
	
	public void ordenaLivros() {
		for(int i = 0; i < 9; i++) {
			for(int j = i + 1; j < 10; j++) {
				if(dados[i].getTitulo().compareToIgnoreCase(dados[j].getTitulo()) >= 1) {
					Livro aux = dados[i];
					dados[i] = dados[j];
					dados[j] = aux;
				}
			}
		}
	}
}

public class Lista02_05 {

	public static void main(String[] args) {
		FilaLivros fila = new FilaLivros(10);
		fila = geraLivros(fila);
		fila.mostraFila();
		fila.dequeue();
		fila.mostraFila();
	}
	
	static FilaLivros geraLivros(FilaLivros fila) {
		Random r = new Random();
		StringBuilder titulo = new StringBuilder();
		String[] letras = {"a", "x", "r", "f", "g", "w", "d", "t", "y"};
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
