/*
 * Programador: Gabriel Rocha
 * Data:19/02/2020
 * Problema: Implementar listas estáticas
 */

package listas_estaticas;

import java.util.Arrays;

class ListaChar {
	
	private char[] dados;
	private int tamanho;
	
	public ListaChar() {
		dados = new char[10];
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
	
	public void adicionaInicio(char n) {
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
		char c = 0;
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
	
	public void adicionaFinal(char n) {
		if(!cheia()) {
			dados[tamanho] = n;
			tamanho++;
		} else {
			System.out.println("Erro ao adicionar! A lista está cheia!");
		}
	}
	
	public int removeFinal() {
		char n = 0;
		if (!vazia()) {
			tamanho--;
			dados[tamanho] = n;
		} else {
			System.out.println("Erro ao remover! A lista está vazia!");
		}
		return n;
	}
	
	public void adicionaPos(int pos, char valor) {
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
		for(char letra: dados) {
			if(letra != 0) {
				sb.append(letra);
			}
		}
		return sb.toString();
	}
}

public class Lista01_08 {

	public static void main(String[] args) {
		ListaChar lc = new ListaChar();
		for(int i = 0; i < 5; i++) {
			lc.adicionaInicio('a');
		}
		for(int j = 0; j < 5; j++) {
			lc.adicionaFinal('b');
		}
		lc.removeFinal();
		lc.removeInicio();
		lc.mostraLista();
		System.out.println("Dados concatenados: " + lc.concatenaDados());
	}

}
