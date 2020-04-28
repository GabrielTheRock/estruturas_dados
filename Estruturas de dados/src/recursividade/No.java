package recursividade;

public class No<T> {
	
	protected T dado;
	protected No<T> prox;
	
	public No(T n) {
		dado = n;
		prox = null;
	}
}
