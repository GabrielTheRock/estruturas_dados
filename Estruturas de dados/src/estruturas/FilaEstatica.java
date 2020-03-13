package estruturas;

import java.util.Arrays;

public class FilaEstatica <T> {
	
	private int tamanho;
	private int fim;
	private T[] dados;
	private int tamMaximo;
	
	@SuppressWarnings("unchecked")
	FilaEstatica(int lim) {
		tamanho = 0;
		fim = -1;
		tamMaximo = lim;
		dados = (T[]) new Object[lim];
	}
	
	private boolean cheia() {
		return (tamanho == tamMaximo);
	}
	
	private boolean vazia() {
		return (tamanho == 0);
	}
	
	//enqueue
	public void adiciona(T n) {
		if(!cheia()) {
			tamanho++;
			fim++;
			dados[fim] = n;
		} else {
			System.out.println("Erro ao adicionar! A fila está cheia!");
		}
	}
	
	//dequeue
	public T remove() {
		T r = null;
		if(!vazia()) {
			tamanho--;
			r = dados[0];
			for(int i = 0; i < tamanho; i++) {
				dados[i] = dados[i + 1];
			}
			dados[fim] = null;
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

