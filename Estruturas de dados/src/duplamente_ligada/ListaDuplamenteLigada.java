package duplamente_ligada;

public class ListaDuplamenteLigada<T> {
	
	protected No<T> inicio;
	
	public ListaDuplamenteLigada() {
		inicio = null;
	}
	
	public void adicionaInicio(T n) {
		No<T> aux = new No<T>(n);
		if (inicio == null) {
			inicio = aux;
		} else {
			aux.prox = inicio;
			inicio.ant = aux;
			inicio = aux;
		}
	}
	
	public T removeInicio() {
		No<T> r = null;
		if (inicio == null) {
			System.err.println("Erro ao remover! A lista está vazia!");
		} else {
			r = inicio;
			inicio = inicio.prox;
			inicio.ant = null;
		}
		return r.dado;
	}
	
	public void adicionaPos(int pos, T n) {
		if (pos <= 0 || pos > calculaTamanho(inicio, 1)) {
			System.err.println("Erro ao adicionar! Posição inválida!");
		} else {
			if (pos == 1) {
				adicionaInicio(n);
			} else if (pos == calculaTamanho(inicio, 1)) {
				adicionaFinal(n);
			} else {
				No<T> aux = new No<T>(n);
				No<T> elementoPos = elementoPosicao(inicio, 1, pos);
				No<T> antec = elementoPos.ant;
				antec.prox = aux;
				aux.prox = elementoPos;
			}
		}
	}
	
	public T removePos(int pos) {
		No<T> r = null;
		if (pos <= 0 || pos > calculaTamanho(inicio, 1)) {
			System.err.println("Erro ao remover! Posição inválida!");
		} else if (pos == 1) {
			removeInicio();
		} else if (pos == calculaTamanho(inicio, 1)) {
			removeFinal();
		} else {
			No<T> elementoPos = elementoPosicao(inicio, 1, pos);
			r = elementoPos;
			No<T> antec = elementoPos.ant;
			antec.prox = elementoPos.prox;
			elementoPos = null;
		}
		return r.dado;
	}
	
	public void adicionaFinal(T n) {
		if (inicio == null) {
			adicionaInicio(n);
		} else {
			No<T> aux = new No<T>(n);
			No<T> ult = ultimoElemento(inicio);
			ult.prox = aux;
			aux.ant = ult;
		}
	}
	
	public T removeFinal() {
		No<T> r = null;
		if (inicio == null) {
			System.err.println("Erro ao remover! A lista está vazia!");
		} else {
			No<T> ult = ultimoElemento(inicio);
			r = ult;
			ult = ult.ant;
			ult.prox = null;
		}
		return r.dado;
	}
	
	private No<T> elementoPosicao(No<T> n, int tam, int pos) {
		if (tam == pos) {
			return n;
		} else {
			return elementoPosicao(n.prox, tam + 1, pos);
		}
	}
	
	private int calculaTamanho(No<T> n, int tam) {
		if (n.prox == null) {
			return tam;
		} else {
			return calculaTamanho(n.prox, tam + 1);
		}
	}
	
	private No<T> ultimoElemento(No<T> n) {
		if (n.prox == null) {
			return n;
		} else {
			return ultimoElemento(n.prox);
		}
	}
	
	public void mostraLista() {
		StringBuilder sb = new StringBuilder();
		if (inicio != null) {
			No<T> aux = inicio;
			sb.append("Lista duplamente ligada --> [");
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
