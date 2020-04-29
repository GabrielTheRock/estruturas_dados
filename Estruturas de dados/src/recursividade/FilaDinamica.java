package recursividade;

public class FilaDinamica <T> {
	
	No<T> inicio;
	
	public FilaDinamica() {
		inicio = null;
	}
	
	public boolean vazia() { 
		return inicio == null;
	}
	
	//adiciona elemento
	public void enqueue(T n) {
		if (vazia()) {
			No<T> elemento = new No<T>(n);
			inicio = elemento;
		} else {
			No<T> aux = inicio;
			while (aux.prox != null) {
				aux = aux.prox;
			}
			No<T> elemento = new No<T>(n);
			aux.prox = elemento;
		}
	}
	
	//remove elemento
	public T dequeue() {
		T r = null;
		if (vazia()) {
			System.err.println("Erro ao remover! A fila está vazia!");
		} else {
			r = inicio.dado;
			inicio = inicio.prox;
		}
		return r;
	}
	
	public void mostraFila() {
		if (inicio != null) {
			StringBuilder sb = new StringBuilder();
			No<T> aux = inicio;
			sb.append("Fila dinâmica --> [");
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
