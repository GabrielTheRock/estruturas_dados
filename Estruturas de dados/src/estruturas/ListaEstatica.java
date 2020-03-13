/*
 * Programador: Gabriel Rocha
 * Descrição: classe de uma lista estática
 * Data: 22/02/2020
 */

package estruturas;

import java.util.Arrays;

public class ListaEstatica <T> {
	
	public T[] dados;
	private int tamanho;
	private int fim;

	@SuppressWarnings("unchecked")
	public ListaEstatica(int tamMax) {
		dados = (T[]) new Object[tamMax];
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

	public void adicionaInicio(T n) {
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

	public T removeInicio() {
		T c = null;
		if (!vazia()) {
			c = dados[0];
			tamanho--;
			fim--;
			for(int i = 0; i <= fim; i++) {
				dados[i] = dados[i + 1];
			}
			dados[tamanho] = null;
		} else {
			System.out.println("Erro ao remover! A lista está vazia!");
		}
		return c;
	}

	public void adicionaFinal(T n) {
		if(!cheia()) {
			tamanho++;
			fim++;
			dados[fim] = n;
		} else {
			System.out.println("Erro ao adicionar! A lista está cheia!");
		}
	}

	public T removeFinal() {
		T n = null;
		if (!vazia()) {
			tamanho--;
			n = dados[fim];
			dados[fim] = null;
			fim--;
		} else {
			System.out.println("Erro ao remover! A lista está vazia!");
		}
		return n;
	}

	public void adicionaPos(int pos, T n) {
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

	public T removePos(int pos) {
		T n = null;
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
				dados[tamanho] = null;
			}
		} else {
			System.out.println("Erro ao adicionar! A lista está vazia!");
		}
		return n;
	}

	public void mostraLista() {
		System.out.println("Lista --> " + Arrays.toString(dados));
	}
}