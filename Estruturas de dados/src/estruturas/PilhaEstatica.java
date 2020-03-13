/*
 * Programador: Gabriel Rocha
 * Descrição: classe de uma pilha estática
 * Data: 28/02/2020
 */

package estruturas;

import java.util.Arrays;

public class PilhaEstatica <T> {
	
	private int topo;
	private T[] dados;
	private int capacidadeMax;
	
	@SuppressWarnings("unchecked")
	PilhaEstatica(int capac) {
		topo = -1;
		capacidadeMax = capac;
		dados = (T[]) new Object[capacidadeMax];
	}
	
	private boolean cheia() {
		return (topo == capacidadeMax - 1);
	}
	
	private boolean vazia() {
		return (topo == -1);
	}
	
	//push
	public void empilha(T n) {
		if(!cheia()) {
			topo++;
			dados[topo] = n;
		} else {
			System.out.println("Erro ao adicionar! A lista está cheia!");
		}
	}
	
	//pop
	public T desempilha() {
		T saiu = null;
		if(!vazia()) {
			saiu = dados[topo];
			dados[topo] = null;
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
