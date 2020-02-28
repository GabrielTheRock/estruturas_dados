/*
Problema: Carregar um vetor [5] inteiro. Enviar cada elemento
para uma função e esta irá retornar o seu fatorial que
será armazenado em um outro vetor. Exibir os dados
dos vetores.
Programador: Gabriel Rocha
Data: 08/02/2019
*/

package listas_estaticas;

public class Lista01_02 {
	
	public static void main(String[] args) {
		int[] vet = new int[5];
		int[] fat = new int[5];
		for (int i = 0; i < 5; i++) {
			vet[i] = (int) Math.round(Math.random() * 10);
			fat[i] = fatorial(vet[i]);
			System.out.println("Número: " + vet[i] + "\nSeu fatorial: " + fat[i] + "\n");
		}
	}
	
	static int fatorial(int n) {
		int fat = 1;
		for (int i = n; i > 1; i--) {
			fat = fat * (int) i;
		}
		return fat;
	}
}
