package filas_pilhas;

import java.util.Arrays;

class TesteFila {
	
	private int inicio;
	private int fim;
	private int tamanho;
	private int[] dados;
	
	TesteFila() {
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

public class Lista02_02 {

	public static void main(String[] args) {
		TesteFila fila = new TesteFila();
		for(int i = 1; i <= 10; i++) {
			fila.adiciona(i);
		}
		System.out.println("Implementando uma fila circular...\n");
		fila.adiciona(11111);
		fila.mostraFila();
		fila.remove();
		fila.mostraFila();
		fila.adiciona(700);
		fila.mostraFila();
		fila.remove();
		fila.mostraFila();
		fila.adiciona(800);
		fila.mostraFila();
	}

}
