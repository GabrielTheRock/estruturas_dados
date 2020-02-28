package filas_pilhas_estaticas;

import java.util.Arrays;

public class Fila {
	
	private int tamanho;
	private int fim;
	private int[] dados;
	private int tamMaximo;
	
	Fila(int lim) {
		tamanho = 0;
		fim = -1;
		tamMaximo = lim;
		dados = new int[lim];
	}
	
	private boolean cheia() {
		return (tamanho == tamMaximo);
	}
	
	private boolean vazia() {
		return (tamanho == 0);
	}
	
	//enqueue
	public void adiciona(int n) {
		if(!cheia()) {
			tamanho++;
			fim++;
			dados[fim] = n;
		} else {
			System.out.println("Erro ao adicionar! A fila está cheia!");
		}
	}
	
	//dequeue
	public int remove() {
		int r = -1;;
		if(!vazia()) {
			tamanho--;
			r = dados[0];
			for(int i = 0; i < tamanho; i++) {
				dados[i] = dados[i + 1];
			}
			dados[fim] = 0;
			fim--;
		} else {
			System.out.println("Erro ao remover! A fila está vazia!");
		}
		return r;
	}
	
	public void mostraFila() {
		System.out.println("Fila --> " + Arrays.toString(dados));
	}
}
