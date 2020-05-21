package duplamente_ligada;

import java.util.Random;

import alocacao_dinamica.Livro;

public class Lista05_03 {

	public static void main(String[] args) {
		ListaDuplamenteLigada<Livro> ldl = new ListaDuplamenteLigada<Livro>();
		for (int i = 0; i < 10; i++) {
			ldl.adicionaInicio(geraLivros());
		}
		ldl.mostraLista();
		ldl.adicionaPos(5, geraLivros());
		ldl.mostraLista();
		ldl.removeInicio();
		ldl.mostraLista();
		ldl.adicionaFinal(geraLivros());
		ldl.mostraLista();
		ldl.removeFinal();
		ldl.mostraLista();
		ldl.removePos(5);
		ldl.mostraLista();
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
