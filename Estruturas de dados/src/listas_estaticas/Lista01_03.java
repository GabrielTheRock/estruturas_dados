/*
Carregar um vetor [100] inteiros positivos ou
negativos. Classificar este vetor em ordem crescente e
apresentar os valores.
Programador: Gabriel Rocha
Data: 08/02/2020
*/

package listas_estaticas;

import java.util.Random;

public class Lista01_03 {
	
	public static void main(String[] args) {
		Random r = new Random();
		int[] vet = new int[100];
		for (int i = 0; i < 100; i++) {
			vet[i] = r.nextInt(10000) + 1;
		}
		System.out.println("Vetor não ordenado:\n");
		mostraVetor(vet);
		vet = ordenaVetor(vet);
		System.out.println("\n\nVetor já ordenado:\n");
		mostraVetor(vet);
	}
	
	static int[] ordenaVetor(int[] v) {
		for (int i = 0; i < 99; i++) {
			for (int j = i + 1; j < 100; j++) {
				if (v[i] > v[j]) {
					int aux = v[i];
					v[i] = v[j];
					v[j] = aux;
				}
			}
		}
		return v;
	}
	
	static void mostraVetor(int[] v) {
		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i] + " | ");
		}
	}
}
