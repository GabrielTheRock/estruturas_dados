/*
 * Programador: Gabriel Rocha
 * Objetivo: implementar pilhas com alocação dinâmica
 * Data: 12/03/2020
 */

package alocacao_dinamica;

import java.util.Random;

public class Lista03_03 {

	public static void main(String[] args) {
		Random r = new Random();
		PilhaDinamica<Integer> pd = new PilhaDinamica<Integer>();
		for (int i = 0; i < 10; i++) {
			pd.push(r.nextInt(99) + 1);
		}
		pd.mostraPilha();
		pd.pop();
		pd.mostraPilha();
		pd.pop();
		pd.mostraPilha();
		pd.push(99);
		pd.mostraPilha();
	}

}
