/*
 * Programador: Gabriel Rocha
 * Descrição: implementação uma fila para os funcionários
 * Data: 29/04/2020
 */

package recursividade;

import java.util.Random;

public class Lista04_03 {
	
	static Random r = new Random();
	
	public static void main(String[] args) {
		FilaDinamica<Funcionario> fd = new FilaDinamica<Funcionario>();
		for (int i = 0; i < 10; i++) {
			Funcionario f = new Funcionario();
			f.setCpf(r.nextInt(9999));
			f.setId(r.nextInt(100));
			f.setRg(Integer.toString(r.nextInt(20000) + 10000));
			f.setNome(geraString());
			f.setDepar(geraString());
			fd.enqueue(f);
		}
		fd.mostraFila();
		fd.dequeue();
		fd.mostraFila();
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
