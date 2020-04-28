package recursividade;


public class ListaLigadaRecursiva<T> {
	
	private No<T> inicio;
	
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
