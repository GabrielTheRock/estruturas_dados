/*
 * Programador: Gabriel Rocha
 * Objetivo: implementar pilhas com alocação dinâmica
 * Data: 12/03/2020 
 */

package alocacao_dinamica;

public class PilhaDinamica {
	
	private No inicio;
	
	public PilhaDinamica() {
		inicio = null;
	}
	
	public void enqueue(int n) {
		if (inicio == null) {
			No aux = new No(n);
			inicio = aux;
		} else {
			No aux = inicio;
			while (aux.prox != null) {
				aux = aux.prox;
			}
			No no = new No(n);
			aux.prox = no;
		}
	}
	
	public int dequeue() {
		int r = -1;
		if (inicio == null) {
			System.err.println("Erro ao remover! A pilha está vazia!");
		} else if (inicio.prox == null) {
			inicio = null;
		} else {
			No pen = inicio;
			No ult = inicio;
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
			No aux = inicio;
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