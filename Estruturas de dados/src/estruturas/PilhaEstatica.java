/*
 * Programador: Gabriel Rocha
 * Descrição: classe de uma pilha estática
 * Data: 28/02/2020
 */

package estruturas;

import java.util.Arrays;

class PilhaEstatica {
	
	private int topo;
	private int[] dados;
	private int capacidadeMax;
	
	PilhaEstatica(int capac) {
		topo = -1;
		capacidadeMax = capac;
		dados = new int[capacidadeMax];
	}
	
	private boolean cheia() {
		return (topo == capacidadeMax - 1);
	}
	
	private boolean vazia() {
		return (topo == -1);
	}
	
	//push
	public void empilha(int n) {
		if(!cheia()) {
			topo++;
			dados[topo] = n;
		} else {
			System.out.println("Erro ao adicionar! A lista está cheia!");
		}
	}
	
	//pop
	public int desempilha() {
		int saiu = -1;
		if(!vazia()) {
			saiu = dados[topo];
			dados[topo] = 0;
			topo--;
		} else {
			System.out.println("Erro ao remover! A pilha está vazia!");
		}
		return saiu;
	}
	
	public void mostraPilha() {
		System.out.println("Pilha --> " + Arrays.toString(dados));
	}
}
