/*
Problema: Carregar uma matriz [4 x 4 inteiro]. Apresentar:
- Soma dos valores no intervalo de 1 a 100
- Quantidade de números impares entre 30 a 50
- Quantidade de números divisíveis por 8
- Quantidade de números ímpares divisíveis por 3
- Fatorial do maior número informado na matriz
Programador: Gabriel Rocha
Data: 09/02/2020
*/

package listas_encadeadas;

import java.math.BigInteger;
import java.util.Random;

public class Exercicio_04 {
	
	public static void main(String[] args) {
		Random r = new Random();
		int[][] mat = new int[4][4];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				mat[i][j] = r.nextInt(500) + 1;
			}
		}
		mostraMatriz(mat);
		verificaMatriz(mat);
	}
	
	static void mostraMatriz(int[][] m) {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(m[i][j] + " | ");
			}
			System.out.println();
		}
	}

	static void verificaMatriz(int[][] m) {
		int im3 = 0, im3050 = 0, div8 = 0, maior = 0, soma100 = 0; 
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (m[i][j] > maior) {
					maior = m[i][j];
				}
				if (m[i][j] % 2 != 0) {
					if (m[i][j] % 3 == 0) {
						im3++;
					}
					if (m[i][j] >= 30 && m[i][j] <= 50) {
						im3050++;
					}
				} else if (m[i][j] % 8 == 0) {
					div8++;
				}
				if (m[i][j] >= 1 && m[i][j] <= 100) {
					soma100 += m[i][j];
				}
			}
		}
		System.out.println("\nSoma dos valores no intervalo de 1 a 100: " + soma100);
		System.out.println("Quantidade de números impares entre 30 a 50: " + im3050);
		System.out.println("Quantidade de números divisíveis por 8: " + div8);
		System.out.println("Quantidade de números ímpares divisíveis por 3: " + im3);
		System.out.println("Fatorial do maior número informado na matriz: " + fatorial(maior));
	}
	
	public static String fatorial(int n) {
		BigInteger fact = new BigInteger("1");
		for (int i = 1; i <= n; i++) {
			fact = fact.multiply(new BigInteger(i + ""));
		}
		return fact.toString();
	}
}
