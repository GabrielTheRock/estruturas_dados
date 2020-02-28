package filas_pilhas_estaticas;

import java.util.Arrays;

public class FilaCircular {
	
	private int inicio;
	private int fim;
	private int tamanho;
	private int[] dados;
	
	FilaCircular(int lim) {
		inicio = 0;
		fim = 0;
		tamanho = 0;
		dados = new int[lim];
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
		System.out.println("Fila circular -- > " + Arrays.toString(dados));
	}
}
