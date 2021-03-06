/*
 * Programador: Gabriel Rocha
 * Objetivo: implementar uma lista ligada de caracteres
 * Data: 13/03/2020
 */

package alocacao_dinamica;

import java.util.Random;

public class Lista03_05 {

	public static void main(String[] args) {
		Random r = new Random();
		ListaLigada<Character> ll = new ListaLigada<Character>();
		char[] carac = "abcdefghijklmnopqrstuvwxyz1234567890".toCharArray();
		for (int i = 0; i < 10; i++) {
			ll.adicionaFinal(carac[r.nextInt(36)]);
		}
		ll.mostraLista();
		ll.adicionaPos(6, 'X');
		ll.mostraLista();
		ll.adicionaInicio('X');
		ll.mostraLista();
		ll.adicionaFinal('X');
		ll.mostraLista();
		ll.removePos(7);
		ll.mostraLista();
		ll.removeFinal();
		ll.mostraLista();
		ll.removeInicio();
		ll.mostraLista();
	}
}
