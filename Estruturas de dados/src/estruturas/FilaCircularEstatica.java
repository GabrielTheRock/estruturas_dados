/*
 * Programador: Gabriel Rocha
 * Descrição: classe de uma fila circular estática
 * Data: 28/02/2020
 */

package estruturas;

import java.util.Arrays;

class FilaCircularEstatica {
	
	private int inicio;
	private int fim;
	private int tamanho;
	private int[] dados;
	
	FilaCircularEstatica() {
		inicio = 0;
		fim = 0;
		tamanho = 0;
		dados = new int[10];
	}
	
	private boolean cheia() {
		return (tamanho == 10);
	}
	
	private boolean vazia() {
		return (tamanho == 0);
	}
	
	//enqueue
	public void adiciona(int n) {
		if(!cheia()) {
			tamanho++;
			if(fim == tamanho - 1) {
				fim = 0;
				dados[fim] = n;
			} else {
				fim++;
				dados[fim] = n;
			}
		} else {
			System.out.println("Erro ao adicionar! A fila está cheia!");
		}
	}
	
	//dequeue
	public int remove() {
		int saiu = -1;
		if(!vazia()) {
			saiu = dados[inicio];
			dados[inicio] = 0;
			tamanho--;
			if(inicio == tamanho - 1) {
				inicio = 0;
			} else {
				inicio++;
			}
		} else {
			System.out.println("Erro ao remover! A fila está vazia!");
		}
		return saiu;
	}
	
	public void mostraFila() {
		System.out.println(Arrays.toString(dados));
	}
}
