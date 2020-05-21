package duplamente_ligada;

import java.util.Random;

public class Lista05_02 {

	public static void main(String[] args) {
		Random r = new Random();
		ListaDuplamenteLigada<Double> ldl = new ListaDuplamenteLigada<Double>();
		for (int i = 0; i < 10; i++) {
			ldl.adicionaInicio(r.nextDouble() * 100);
		}
		ldl.mostraLista();
		ldl.adicionaPos(5, 555.11);
		ldl.mostraLista();
		ldl.removeInicio();
		ldl.mostraLista();
		ldl.adicionaFinal(9999.78);
		ldl.mostraLista();
		ldl.removeFinal();
		ldl.mostraLista();
		ldl.removePos(5);
		ldl.mostraLista();
	}
}
