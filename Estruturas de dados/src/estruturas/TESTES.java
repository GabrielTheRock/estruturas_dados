package estruturas;

import java.util.Random;

public class TESTES {
	
	public static void main(String[] args) {
		Random r = new Random();
		ListaLigada ll = new ListaLigada();
		for (int i = 0; i < 10; i++) {
			ll.adicionaInicio(r.nextInt(999) + 1);
		}
		ll.mostraLista();
		ll.removeFinal();
		ll.mostraLista();
		ll.removeInicio();
		ll.mostraLista();
	}

}
