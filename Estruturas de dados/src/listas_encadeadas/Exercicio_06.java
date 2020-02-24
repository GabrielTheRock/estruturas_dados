/*
 * Programador: Gabriel Rocha
 * Data:19/02/2020
 * Problema: Implementar listas estáticas
 */

package listas_encadeadas;

import java.util.Arrays;
import java.util.Random;

class Lista {
	
	public int[] dados;
	private int tamanho;

	public Lista() {
		dados = new int[10];
		Arrays.fill(dados, 0);
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
			for(int i = tamanho - 1; i >= 1; i--) {
				dados[i] = dados[i - 1];
			}
			dados[0] = n;
		} else {
			System.out.println("Erro ao adicionar! A lista está cheia!");
		}
	}

	public void removeInicio() {
		int c = 0;
		if (!vazia()) {
			tamanho--;
			for(int i = 0; i < tamanho; i++) {
				dados[i] = dados[i + 1];
			}
			dados[tamanho] = c;
		} else {
			System.out.println("Erro ao remover! A lista está vazia!");
		}
	}

	public void adicionaFinal(int n) {
		if(!cheia()) {
			dados[tamanho] = n;
			tamanho++;
		} else {
			System.out.println("Erro ao adicionar! A lista está cheia!");
		}
	}

	public int removeFinal() {
		int n = 0;
		if (!vazia()) {
			tamanho--;
			dados[tamanho] = n;
		} else {
			System.out.println("Erro ao remover! A lista está vazia!");
		}
		return n;
	}

	public void adicionaPos(int pos, int valor) {
		if (dados.length == tamanho) {
			System.out.println("Erro ao adiconar! A lista está cheia!");
		} else if (pos < 0 || pos > tamanho) {
			System.out.println("Erro ao adicionar! Posição inválida!");
		} else if (pos == 0) {
			adicionaInicio(valor);
		} else if (pos == tamanho) {
			adicionaFinal(valor);
		} else {
			tamanho++;
			for(int i = tamanho - 1; i > pos; i--) {
				dados[i] = dados[i - 1];
			}
			dados[pos] = valor;
		}
	}

	public void removePos(int pos) {
		if (pos < 0 || pos >= tamanho) {
			System.out.println("Erro ao remover! A lista está vazia!");
		} else if (vazia()) {
			System.out.println("Erro ao remover! A lista está vazia!");
		} else if (pos == 0) {
			removeInicio();
		} else if (pos == tamanho - 1) {
			removeFinal();
		} else {
			tamanho--;
			for(int i = pos; i < tamanho; i++) {
				dados[i] = dados[i + 1];
			}
			dados[tamanho] = 0;
		}
	}

	public void mostraLista() {
		System.out.println(Arrays.toString(dados));
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
	
	//Implementando metodoA
	public void metodoA (int pos, int valor) {
		if(dados.length == tamanho) {
			System.out.println("ERRO!");
		} else if(pos <= 0 || pos > tamanho + 1) {
			System.out.println("Posição inválida!");
		} else if(pos == 1) {
			adicionaInicio(valor);
		} else if(pos == tamanho) {
			adicionaFinal(valor);
		} else {
			for(int i = tamanho; i >= pos; i--) {
				dados[i] = dados[i - 1];
				dados[pos - 1] = valor;
				tamanho++;
			}
		}
	}
}

public class Exercicio_06 {

	public static void main(String[] args) {
		Lista lista = new Lista();
		Random r = new Random();
		for(int i = 0; i < 8; i++) {
			lista.adicionaInicio(r.nextInt(100) + 2);
		}
		System.out.println("Lista antes de ser submetida ao método A:");
		lista.mostraLista();
		lista.metodoA(4, 9999);
		System.out.println("Lista após ser submetida ao método A com os parâmetros 4 e 9999:");
		lista.mostraLista();
	}

}
