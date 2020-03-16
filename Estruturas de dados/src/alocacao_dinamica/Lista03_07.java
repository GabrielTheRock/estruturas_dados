/*
 * Programador: Gabriel Rocha
 * Objetivo: implementar uma lista dinâmica de Strings
 * Data: 16/03/2020
 */

package alocacao_dinamica;

import java.util.Random;

public class Lista03_07 {

	public static void main(String[] args) {
		ListaLigada<String> ll = new ListaLigada<String>();
		for (int i = 0; i < 10; i++) {
			ll.adicionaFinal(geraString());
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
	
	private static String geraString() {
		Random r = new Random();
		StringBuilder sb = new StringBuilder();
		char[] carac = "abcdefghijklmnopqrstuvwxyz1234567890".toCharArray();
		for (int i = 0; i < 5; i++) {
			sb.append(carac[r.nextInt(36)]);
		}
		return sb.toString();
	}
}
