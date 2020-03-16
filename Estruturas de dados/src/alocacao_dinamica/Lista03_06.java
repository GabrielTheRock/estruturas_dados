/*
 * Programador: Gabriel Rocha
 * Objetivo: implementar uma lista dinâmica de temperaturas
 * Data: 16/03/2020
 */

package alocacao_dinamica;

import java.text.DecimalFormat;
import java.util.Random;

public class Lista03_06 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("0.#");
		Random r = new Random();
		ListaLigada<String> ll = new ListaLigada<String>();
		for (int i = 0; i < 10; i++) {
			ll.adicionaFinal(df.format(r.nextDouble() * 100) + " °C");
		}
		ll.mostraLista();
		ll.adicionaPos(6, "X");
		ll.mostraLista();
		ll.adicionaInicio("X");
		ll.mostraLista();
		ll.adicionaFinal("X");
		ll.mostraLista();
		ll.removePos(7);
		ll.mostraLista();
		ll.removeFinal();
		ll.mostraLista();
		ll.removeInicio();
		ll.mostraLista();
	}
}
