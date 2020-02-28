package listas_estaticas;

import java.util.Arrays;

class Lista {
	
	public int[] dados;
	private int tamanho;
	private int fim;

	public Lista(int tamMax) {
		dados = new int[tamMax];
		Arrays.fill(dados, 0);
		fim = -1;
		tamanho = 0;
	}

	public boolean vazia() {
		if (tamanho == 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean cheia() {
		if(tamanho == dados.length) {
			return true;
		} else {
			return false;
		}
	}

	public void adicionaInicio(int n) {
		if (!cheia()) {
			tamanho++;
			fim++;
			for(int i = fim; i >= 1; i--) {
				dados[i] = dados[i - 1];
			}
			dados[0] = n;
		} else {
			System.out.println("Erro ao adicionar! A lista está cheia!");
		}
	}

	public int removeInicio() {
		int c = -1;
		if (!vazia()) {
			c = dados[0];
			tamanho--;
			fim--;
			for(int i = 0; i <= fim; i++) {
				dados[i] = dados[i + 1];
			}
			dados[tamanho] = 0;
		} else {
			System.out.println("Erro ao remover! A lista está vazia!");
		}
		return c;
	}

	public void adicionaFinal(int n) {
		if(!cheia()) {
			tamanho++;
			fim++;
			dados[fim] = n;
		} else {
			System.out.println("Erro ao adicionar! A lista está cheia!");
		}
	}

	public int removeFinal() {
		int n = -1;
		if (!vazia()) {
			tamanho--;
			n = dados[fim];
			dados[fim] = 0;
			fim--;
		} else {
			System.out.println("Erro ao remover! A lista está vazia!");
		}
		return n;
	}

	public void adicionaPos(int pos, int n) {
		if(!cheia()) {
			if(pos == 1) {
				adicionaInicio(n);
			} else if(pos <= 0 || pos > dados.length) {
				System.out.println("Erro ao adicionar! Posição inválida!");
			} else if(pos == tamanho) {
				adicionaFinal(n);
			} else {
				tamanho++;
				fim++;
				for(int i = fim; i > pos - 1; i++) {
					dados[i] = dados[i - 1];
				}
				dados[pos - 1] = n;
			}
		} else {
			System.out.println("Erro ao adicionar! A lista está cheia!");
		}
	}

	public int removePos(int pos) {
		int n = -1;
		if(!vazia()) {
			if(pos == 1) {
				n = removeInicio();
			} else if(pos <= 0 || pos > dados.length) {
				System.out.println("Erro ao adicionar! Posição inválida!");
			} else if(pos == tamanho) {
				n = removeFinal();
			} else {
				tamanho--;
				n = dados[fim];
				fim--;
				for(int i = pos - 1; i <= fim; i++) {
					dados[i] = dados[i + 1];
				}
				dados[tamanho] = 0;
			}
		} else {
			System.out.println("Erro ao adicionar! A lista está vazia!");
		}
		return n;
	}
	
	public String concatenaDados() {
		StringBuilder sb = new StringBuilder();
		for(int letra: dados) {
			if(letra != 0) {
				sb.append(letra);
			}
		}
		return sb.toString();
	}

	public void mostraLista() {
		System.out.println("Lista --> " + Arrays.toString(dados));
	}
}
