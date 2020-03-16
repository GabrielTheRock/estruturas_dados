/*
 * Programador: Gabriel Rocha
 * Objetivo: implementar uma lista dinâmica de livros
 * Data: 16/03/2020
 */

package alocacao_dinamica;

import java.util.Random;

public class Lista03_08 {

	public static void main(String[] args) {
		ListaLivros ll = new ListaLivros();
		FilaLivros fl = new FilaLivros();
		PilhaLivros pl = new PilhaLivros();
		for (int i = 0; i < 10; i++) {
			ll.adicionaFinal(geraLivros());
		}
		ll.mostraLista();
		fl.push(ll.removeInicio());
		fl.mostraFila();
		pl.enqueue(ll.removeFinal());
		pl.mostraPilha();
	}

	private static Livro geraLivros() {
		Random r = new Random();
		StringBuilder sb = new StringBuilder();
		Livro l = new Livro();
		char[] carac = "abcdefghijklmnopqrstuvwxyz1234567890".toCharArray();
		for (int i = 0; i < 4; i++) {
			sb.append(carac[r.nextInt(36)]);
		}
		l.setTitulo(sb.toString());
		l.setQntExem(r.nextInt(99) + 1);
		return l;
	}
}
