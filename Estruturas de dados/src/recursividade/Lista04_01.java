/*
 * Programador: Gabriel Rocha
 * Descrição: implementação de uma lista ligada usando métodos recursivos
 * Data: 29/04/2020
 */

package recursividade;

import java.util.Random;

public class Lista04_01 {
	
	static Random r = new Random();
	
	public static void main(String[] args) {
		ListaLigadaRecursivaFuncionarios lista = new ListaLigadaRecursivaFuncionarios();
		for (int i = 0; i < 10; i++) {
			Funcionario f = new Funcionario();
			f.setCpf(r.nextInt(9999));
			f.setId(r.nextInt(100));
			f.setRg(Integer.toString(r.nextInt(20000) + 10000));
			f.setNome(geraString());
			f.setDepar(geraString());
			lista.adicionaInicio(f);
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
