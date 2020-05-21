/*
 * Programador: Gabriel Rocha
 * Descrição: classe de uma fila circular estática
 * Data: 28/02/2020
 */

package estruturas;

import java.util.Arrays;

public class FilaCircular <T> {
	
	private int fim;
	private int tamanho;
	private T[] dados;
	
	@SuppressWarnings("unchecked")
	public FilaCircular(int lim) {
		fim = 0;
		tamanho = 0;
		dados = (T[]) new Object[lim];
	}
	
	private boolean cheia() {
		return (tamanho == dados.length);
	}
	
	private boolean vazia() {
		return (tamanho == 0);
	}
	
	//enqueue
	public void enqueue(T n) {
		if(!cheia()) {
			tamanho++;
			if (fim == dados.length - 1) {
				dados[fim] = n;
				fim = 0;
			} else {
				dados[fim] = n;
				fim++;
			}
		} else {
			System.err.println("Erro ao adicionar! A fila está cheia!");
		}
	}
	
	public T dequeue() {
		T r = null;
		if(!vazia()) {
			tamanho--;
			r = dados[0];
			for(int i = 0; i < fim; i++) {
				dados[i] = dados[i + 1];
			}
			fim--;
		} else {
			System.out.println("Erro ao remover! A fila está vazia!");
		}
		return r;
	}
	
	public void mostraFila() {
		System.out.println("Fila circular --> " + Arrays.toString(dados));
	}
}
