/*
 * Programador: Gabriel Rocha
 * Objetivo: implementação de uma lista ligada
 * Data: 10/03/2020
 */

package estruturas;

class No <T> {
	
	public T dado;
	public No<T> prox;
	
	public No(T n) {
		dado = n;
		prox = null;
	}
}

public class ListaLigada <T> {
	
	private No<T> inicio;
	
	public ListaLigada() {
		inicio = null;
	}
	
	public void adicionaInicio(T n) {
		if (inicio == null) {
			No<T> no = new No<T>(n);
			inicio = no;
		} else {
			No<T> aux = new No<T>(n);
			aux.prox = inicio;
			inicio = aux;
		}
	}
	
	public T removeInicio() {
		T r = null;
		if (inicio == null) {
			System.err.println("Erro ao remover! A lista está vazia!");
		} else {
			r = inicio.dado;
			inicio = inicio.prox;
		}
		return r;
	}
	
	public void adicionaFinal(T n) {
		if (inicio == null) {
			No<T> no = new No<T>(n);
			inicio = no;
		} else {
			No<T> aux = inicio;
			while (aux.prox != null) {
				aux = aux.prox;
			}
			No<T> no = new No<T>(n);
			aux.prox = no;
		}
	}
	
	public T removeFinal() {
		T r = null;
		if (inicio == null) {
			System.err.println("Erro ao remover! A lista está vazia!");
		} else if (inicio.prox == null) {
			r = inicio.dado;
			inicio = null;
		} else {
			No<T> aux1 = inicio;
			No<T> aux2 = inicio;
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
			No<T> aux = inicio;
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
