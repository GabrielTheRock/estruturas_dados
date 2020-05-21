package estruturas;

public class No<T> {
	
	public T dado;
	public No<T> prox;
	public No<T> ant;
	
	public No(T n) {
		dado = n;
		prox = null;
		ant = null;
	}
}
