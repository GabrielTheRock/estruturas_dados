/*
 * Programador: Gabriel Rocha
 * Descrição: classe de uma fila circular estática
 * Data: 28/02/2020
 */

package estruturas;

import java.util.Arrays;

public class FilaCircular <T> {
	
	private int inicio;
	private int fim;
	private int tamanho;
	private T[] dados;
	
	@SuppressWarnings("unchecked")
	public FilaCircular(int lim) {
		inicio = 0;
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
	public void adiciona(T n) {
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
	
	public T remove() {
		T r = null;
		if (vazia()) {
			System.err.println("Erro ao remover! A fila está vazia!");
		} else if (inicio == dados.length - 1) {
			tamanho--;
			r = dados[inicio];
			dados[inicio] = null;
			inicio = 0;
		} else {
			tamanho--;
			r = dados[inicio];
			dados[inicio] = null;
			inicio++;
		}
		return r;
	}
	
	public void mostraFila() {
		System.out.println("Fila circular --> " + Arrays.toString(dados));
	}
}
