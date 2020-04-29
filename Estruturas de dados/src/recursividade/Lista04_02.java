/*
 * Programador: Gabriel Rocha
 * Descrição: implementação de uma lista ligada usando métodos recursivos
 * Data: 29/04/2020
 */

package recursividade;

import java.util.Random;

public class Lista04_02 {

	static Random r = new Random();
	
	public static void main(String[] args) {
		ListaLigadaRecursivaAlunos lista = new ListaLigadaRecursivaAlunos();
		for (int i = 0; i < 10; i++) {
			Aluno a = new Aluno();
			a.setRa(r.nextInt(9999));
			a.setNome(geraString());
			a.setSemestre(r.nextInt(6) + 1);
			lista.adicionaInicio(a);
		}
		lista.mostraLista();
		lista.removePosicao(10);
		lista.mostraLista();
		lista.removeFinal();
		lista.mostraLista();
	}
	
	static String geraString() {
		StringBuilder sb = new StringBuilder();
		char[] letras = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'x', 'y'};
		for (int i = 0; i < 5; i++) {
			sb.append(letras[r.nextInt(10)]);
		}
		return sb.toString();
	}
}
