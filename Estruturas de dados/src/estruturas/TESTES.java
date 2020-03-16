package estruturas;

import java.util.Random;

public class TESTES {
	
	public static void main(String[] args) {
		ListaLigada<Integer> ll = new ListaLigada<Integer>();
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			ll.adicionaFinal(r.nextInt(99) + 1);
		}
		ll.mostraLista();
		
	}
}