/*
 * Programador: Gabriel Rocha
 * Objetivo: implementação de uma lista ligada
 * Data: 10/03/2020
 */

package estruturas;

public class ListaLigada <T> {
	
	public No<T> inicio;
	
	public ListaLigada() {
		inicio = null;
	}
	
	private boolean vazia() {
		return inicio == null;
	}
	
	public void adicionaInicio(T n) {
		No<T> aux = new No<T>(n);
		aux.prox = inicio;
		inicio = aux;
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
	
	public void adicionaPos(int pos, T n) {
		No<T> add = new No<T>(n);
		if (pos == 1) {
			adicionaInicio(n);
		} else {
			int cont = 1;
			No<T> aux = inicio;
			while (aux.prox != null && cont < pos - 1) {
				aux = aux.prox;
				cont++;
			}
			if (cont == pos - 1) {
				add.prox = aux.prox;
				aux.prox = add;
			} else {
				System.err.println("Erro ao adicionar! Posição inválida!");
			}
		}
	}
	
	public T removePos(int pos) {
		T r = null;
		if (vazia()) {
			System.err.println("Erro ao remover! A lista está vazia!");
		} else if (pos == 1) {
			removeInicio();
		} else {
			int cont = 1;
			No<T> aux1 = inicio;
			No<T> aux2 = inicio;
			while (aux2.prox != null && cont < pos) {
				aux1 = aux2;
				aux2 = aux2.prox;
				cont++;
			}
			if (cont < pos) {
				System.err.println("Erro ao adicionar! Posição inválida!");
			} else {
				r = aux2.dado;
				aux1.prox = aux2.prox;
				aux2 = null;
			}
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
		StringBuilder sb = new StringBuilder();
		if (inicio != null) {
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
