/*
 * Programador: Gabriel Rocha
 * Objetivo: implementar fila com alocação dinâmica de memória
 * Data: 13/03/2020
 */

package alocacao_dinamica;

import java.util.Random;

public class Lista03_04 {
	
	public static void main(String[] args) {
		Random r = new Random();
		FilaDinamica<Integer> fd = new FilaDinamica<Integer>();
		int i = 0;
		while (i < 10) {
			i++;
			fd.push(r.nextInt(999) + 100);
		}
		fd.mostraFila();
		fd.push(98777);
		fd.mostraFila();
		fd.pop();
		fd.mostraFila();
	}
}
