package estruturas;

public class TESTES {

	public static void main(String[] args) {
		ListaEstatica lista = new ListaEstatica(10);
		for(int i = 1; i <= 10; i++) {
			lista.adicionaPos(i, i);
		}
		lista.mostraLista();
		lista.removePos(5);
		lista.mostraLista();
		lista.removePos(1);
		lista.mostraLista();
	}

}
