package recursividade;

public class Lista04_01 {
	
	public static void main(String[] args) {
		ListaLigadaRecursiva<Integer> lista = new ListaLigadaRecursiva<Integer>();
		for (int i = 1; i <= 10; i++) {
			lista.adicionaInicio(i);
		}
		lista.mostraLista();
		lista.removeInicio();
		lista.mostraLista();
	}
}
