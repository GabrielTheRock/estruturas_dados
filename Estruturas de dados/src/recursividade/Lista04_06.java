/*
 * Programador: Gabriel Rocha
 * Objetivo: implementar um algoritmo que realize os movimentos da Torre de Hanoi usando recursividade
 */

package recursividade;

import java.util.Scanner;

public class Lista04_06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		while (n < 3 || n > 8) {
			n = input.nextInt();
		}
		hanoi(n, 1, 3, 2);
		input.close();
	}
	
	static void hanoi(int n, int origem, int destino, int aux) {
		if (n > 0) {
			hanoi(n - 1, origem, aux, destino);
			System.out.println(origem + " -> " + destino);
			hanoi(n - 1, aux, destino, origem);
		}
	}
}
