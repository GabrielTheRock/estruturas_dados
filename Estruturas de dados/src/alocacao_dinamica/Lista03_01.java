/*
 * Programador: Gabriel Rocha
 * Objetivo: implementar uma fila circular
 * Data: 12/03/2020
 */

package alocacao_dinamica;

import estruturas.FilaCircular;

public class Lista03_01 {

	public static void main(String[] args) {
		FilaCircular fc = new FilaCircular(5);
		fc.adiciona(19);
		fc.mostraFila();
		fc.adiciona(20);
		fc.mostraFila();
		fc.adiciona(15);
		fc.mostraFila();
		fc.remove();
		fc.mostraFila();
		fc.remove();
		fc.mostraFila();
		fc.adiciona(21);
		fc.mostraFila();
		fc.adiciona(12);
		fc.mostraFila();
		fc.adiciona(25);
		fc.mostraFila();
		fc.remove();
		fc.mostraFila();
		fc.remove();
		fc.mostraFila();
		fc.remove();
		fc.mostraFila();
	}
}
