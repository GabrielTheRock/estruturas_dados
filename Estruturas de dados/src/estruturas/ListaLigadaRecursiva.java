/*
 * Programador: Gabriel Rocha
 * Descrição: implementação de uma lista ligada usando métodos recursivos
 * Data: 29/04/2020
 */

package estruturas;

public class ListaLigadaRecursiva<T> {
	
	protected No<T> inicio;
	
	public ListaLigadaRecursiva() {
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
		if (vazia()) {
			System.err.println("Erro ao remover! A lista está vazia!");
		} else {
			r = inicio.dado;
			inicio = inicio.prox;
		}
		return r;
	}
	
	public void adicionaPosicao(int pos, T n) {
		if (pos <= 0) {
			System.err.println("Erro ao adicionar! Posição inválida!");
		} else if (pos == 1) {
			adicionaInicio(n);
		} else {
			int tam = calculaTamanho(inicio, 1);
			if (pos > tam) {
				System.err.println("Erro ao adicionar! Posição inválida!");
			} else if (pos == tam) {
				adicionaFinal(n);
			} else {
				No<T> antec = elementoPosicaoMenosUm(inicio, 1, pos);
				No<T> posic = antec.prox;
				No<T> aux = new No<T>(n);
				antec.prox = aux;
				aux.prox = posic;
			}
		}
	}
	
	public T removePosicao(int pos) {
		T rem = null;
		if (pos <= 0) {
			System.err.println("Erro ao remover! Posição inválida!");
		} else if (pos == 1) {
			removeInicio();
		} else {
			int tam = calculaTamanho(inicio, 1);
			if (pos > tam) {
				System.err.println("Erro ao remover! Posição inválida!");
			} else if (pos == tam) {
				removeFinal();
			} else {
				No<T> antec = elementoPosicaoMenosUm(inicio, 1, pos);
				No<T> posic = antec.prox;
				rem = posic.dado;
				antec.prox = posic.prox;
				posic = null;
			}
		}
		return rem;
	}
	
	public void adicionaFinal(T n) {
		if (vazia()) {
			adicionaInicio(n);
		} else {
			No<T> ult = penultimoElemento(inicio).prox;
			No<T> aux = new No<T>(n);
			ult.prox = aux;
		}
	}
	
	public T removeFinal() {
		T rem = null;
		if (vazia()) {
			System.err.println("Erro ao remover! A lista está vazia!");
		} else {
			No<T> penult = penultimoElemento(inicio);
			rem = penult.prox.dado;
			penult.prox = null;
		}
		return rem;
	}
	
	private int calculaTamanho(No<T> n, int tam) {
		if (n.prox == null) {
			return tam;
		} else {
			return calculaTamanho(n.prox, tam + 1);
		}
	}
	
	private No<T> elementoPosicaoMenosUm(No<T> n, int tam, int pos) {
		if (tam == pos - 1) {
			return n;
		} else {
			return elementoPosicaoMenosUm(n.prox, tam + 1, pos);
		}
	}
	
	private No<T> penultimoElemento(No<T> n) {
		if (n.prox.prox == null) {
			return n;
		} else {
			return penultimoElemento(n.prox);
		}
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
