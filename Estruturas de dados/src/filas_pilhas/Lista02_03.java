package filas_pilhas;

import java.util.Arrays;

class TestePilha {
	
	private int topo;
	private int[] dados;
	private int capacidadeMax;
	
	TestePilha(int capac) {
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
		System.out.println(Arrays.toString(dados));
	}
}

public class Lista02_03 {

	public static void main(String[] args) {
		TestePilha pilha = new TestePilha(10);
		for(int i = 1; i <= 10; i ++) {
			pilha.empilha(i);
		}
		pilha.mostraPilha();
		pilha.desempilha();
		pilha.mostraPilha();
		pilha.empilha(10000);
		pilha.mostraPilha();
	}

}
