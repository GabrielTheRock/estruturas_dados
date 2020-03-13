/*
 * Programador: Gabriel Rocha
 * Objetivo: implementar pilhas com alocação dinâmica
 * Data: 12/03/2020 
 */

package alocacao_dinamica;

public class PilhaDinamica <T> {
	
	private No<T> inicio;
	
	public PilhaDinamica() {
		inicio = null;
	}
	
	public void enqueue(T n) {
		if (inicio == null) {
			No<T> aux = new No<T>(n);
			inicio = aux;
		} else {
			No<T> aux = inicio;
			while (aux.prox != null) {
				aux = aux.prox;
			}
			No<T> no = new No<T>(n);
			aux.prox = no;
		}
	}
	
	public T dequeue() {
		T r = null;
		if (inicio == null) {
			System.err.println("Erro ao remover! A pilha está vazia!");
		} else {
			No<T> pen = inicio;
			No<T> ult = inicio;
			while (ult.prox != null) {
				pen = ult;
				ult = ult.prox;
			}
			r = ult.dado;
			pen.prox = null;
		}
		return r;
	}
	
	public void mostraPilha() {
		if (inicio != null) {
			StringBuilder sb = new StringBuilder();
			No<T> aux = inicio;
			sb.append("Pilha dinâmica --> [");
			while (aux != null) {
				sb.append(aux.dado + ", ");
				aux = aux.prox;
			}
			int rem = sb.toString().lastIndexOf(" ");
			System.out.println(sb.delete(rem - 1, rem + 1).append("]").toString());
		} else {
			System.err.println("Erro ao mostrar! A pilha está vazia!");
		}
	}
}