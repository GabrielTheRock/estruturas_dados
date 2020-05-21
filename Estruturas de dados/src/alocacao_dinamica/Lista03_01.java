/*
 * Programador: Gabriel Rocha
 * Objetivo: implementar uma fila circular
 * Data: 12/03/2020
 */

package alocacao_dinamica;

import estruturas.FilaCircular;

public class Lista03_01 {

	public static void main(String[] args) {
		FilaCircular<Integer> fc = new FilaCircular<Integer>(5);
		fc.enqueue(19);
		fc.mostraFila();
		fc.enqueue(20);
		fc.mostraFila();
		fc.enqueue(15);
		fc.mostraFila();
		fc.dequeue();
		fc.mostraFila();
		fc.dequeue();
		fc.mostraFila();
		fc.enqueue(21);
		fc.mostraFila();
		fc.enqueue(12);
		fc.mostraFila();
		fc.enqueue(25);
		fc.mostraFila();
		fc.dequeue();
		fc.mostraFila();
		fc.dequeue();
		fc.mostraFila();
		fc.dequeue();
		fc.mostraFila();
	}
}
