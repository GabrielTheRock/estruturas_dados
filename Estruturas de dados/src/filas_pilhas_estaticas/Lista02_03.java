/*
 * Programador: Gabriel Rocha
 * Exercício: Implemente uma Pilha (pilha1) para o problema apresentado no Exercício 1.
Implemente também uma classe de teste que possui uma instância da classe
Lista (lista1) e uma instância da classe Pilha (pilha1). Cada elemento removido
da Lista deve ser adicionado no topo da Pilha. Cada elemento removido da Pilha
deve ser adicionado no final da Lista.
 * Data: 28/02/2020
 */

package filas_pilhas_estaticas;

import java.util.Arrays;

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

	public int removeInicio() {
		int c = 0;
		if (!vazia()) {
			tamanho--;
			c = dados[0];
			for(int i = 0; i < tamanho; i++) {
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
			dados[tamanho] = n;
			tamanho++;
		} else {
			System.out.println("Erro ao adicionar! A lista está cheia!");
		}
	}

	public int removeFinal() {
		int n = 0;
		if (!vazia()) {
			n = dados[tamanho - 1];
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
		System.out.println("Lista --> " + Arrays.toString(dados));
	}
}

public class Lista02_03 {

	public static void main(String[] args) {
		Pilha pilha1 = new Pilha(10);
		Lista lista1 = new Lista();
		for(int i = 1; i <= 9; i++) {
			pilha1.empilha(i);
			lista1.adicionaFinal(i);
		}
		lista1.mostraLista();
		pilha1.mostraPilha();
		lista1.adicionaFinal(pilha1.desempilha());
		lista1.mostraLista();
		pilha1.mostraPilha();
		pilha1.empilha(lista1.removeFinal());
		lista1.mostraLista();
		pilha1.mostraPilha();
	}

}
