package estruturas;

import java.util.Random;

public class TESTES {
	
	public static void main(String[] args) {
		Random r = new Random();
		ListaLigada<Integer> ll = new ListaLigada<Integer>();
		for (int i = 0; i < 10; i++) {
			ll.adicionaInicio(r.nextInt(999) + 100);
		}
		ll.mostraLista();
		ll.removeFinal();
		ll.mostraLista();
		ll.removeInicio();
		ll.mostraLista();
	}

}
