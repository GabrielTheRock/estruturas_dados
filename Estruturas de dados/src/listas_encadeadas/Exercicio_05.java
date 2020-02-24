/*
Problema: Criar e carregar uma matriz [4 x 4] inteiro, onde os
valores da diagonal principal serão carregados pela
aplicação conforme o gráfico e os demais dados serão
digitados pelo usuário.
Programador: Gabriel Rocha
Data: 09/02/2020
*/

package listas_encadeadas;

import java.util.Random;

public class Exercicio_05 {
	
	public static void main(String[] args) {
		int[][] mat = new int[4][4];
		mat = carregaMatriz(mat);
		mostraMatriz(mat);
	}
	
	static int[][] carregaMatriz(int[][] m) {
		Random r = new Random();
		int diag = -1;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (i == j) {
					diag++;
					m[i][j] = (int) Math.round(Math.pow(3, diag));
				} else {
					m[i][j] = r.nextInt(1000) + 1;
				}
			}
		}
		return m;
	}
	
	static void mostraMatriz(int[][] m) {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(m[i][j] + " | ");
			}
			System.out.println();
		}
	}
}
