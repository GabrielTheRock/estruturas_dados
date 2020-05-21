package duplamente_ligada;

import java.util.Date;
import java.util.Random;

public class Lista05_04 {

	public static void main(String[] args) {
		ListaDuplamenteLigada<Videolocadora> ldl = new ListaDuplamenteLigada<Videolocadora>();
		for (int i = 0; i < 10; i++) {
			ldl.adicionaInicio(geraFilmes());
		}
		ldl.mostraLista();
		ldl.adicionaPos(5, geraFilmes());
		ldl.mostraLista();
		ldl.removeInicio();
		ldl.mostraLista();
		ldl.adicionaFinal(geraFilmes());
		ldl.mostraLista();
		ldl.removeFinal();
		ldl.mostraLista();
		ldl.removePos(5);
		ldl.mostraLista();
	}
	
	private static Videolocadora geraFilmes() {
		Random r = new Random();
		Date date = new Date();
		date.getTime();
		StringBuilder sb = new StringBuilder();
		Videolocadora v = new Videolocadora();
		char[] carac = "abcdefghijklmnopqrstuvwxyz1234567890".toCharArray();
		for (int i = 0; i < 4; i++) {
			sb.append(carac[r.nextInt(36)]);
		}
		v.setNomeFilme(sb.toString());
		v.setQnt(r.nextInt(99) + 1);
		v.setCodFilme(r.nextInt(999) + 100);
		v.setDataPublicacao(date);
		return v;
	}
}
