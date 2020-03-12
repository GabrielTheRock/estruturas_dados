/*
 * Programador: Gabriel Rocha
 * Objetivo: implementação de uma lista ligada
 * Data: 10/03/2020
 */

package alocacao_dinamica;

class No {
	
	public int dado;
	public No prox;
	
	public No(int n) {
		dado = n;
		prox = null;
	}
}

public class ListaLigada {
	
	private No inicio;
	
	public ListaLigada() {
		inicio = null;
	}
	
	public void adicionaInicio(int n) {
		if (inicio == null) {
			No no = new No(n);
			inicio = no;
		} else {
			No aux = new No(n);
			aux.prox = inicio;
			inicio = aux;
		}
	}
	
	public int removeInicio() {
		int r = -1;
		if (inicio == null) {
			System.err.println("Erro ao remover! A lista está vazia!");
		} else {
			r = inicio.dado;
			inicio = inicio.prox;
		}
		return r;
	}
	
	public void adicionaFinal(int n) {
		if (inicio == null) {
			No no = new No(n);
			inicio = no;
		} else {
			No aux = inicio;
			while (aux.prox != null) {
				aux = aux.prox;
			}
			No no = new No(n);
			aux.prox = no;
		}
	}
	
	public int removeFinal() {
		int r = -1;
		if (inicio == null) {
			System.err.println("Erro ao remover! A lista está vazia!");
		} else if (inicio.prox == null) {
			r = inicio.dado;
			inicio = null;
		} else {
			No aux1 = inicio;
			No aux2 = inicio;
			while (aux1.prox != null) {
				aux2 = aux1;
				aux1 = aux1.prox;
			}
			r = aux1.dado;
			aux2.prox = null;
		}
		return r;
	}
	
	public void mostraLista() {
		if (inicio != null) {
			StringBuilder sb = new StringBuilder();
			No aux = inicio;
			sb.append("Lista ligada --> [");
			while (aux != null) {
				sb.append(aux.dado + ", ");
				aux = aux.prox;
			}
			int rem = sb.toString().lastIndexOf(" ");
			System.out.println(sb.delete(rem - 1, rem + 1).append("]").toString());
		} else {
			System.err.println("Erro ao mostrar! A lista está vazia!");
		}
	}
}
