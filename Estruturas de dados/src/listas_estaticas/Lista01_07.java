/*
 * Programador: Gabriel Rocha
 * Data:19/02/2020
 * Problema: Implementar listas estáticas
 */

package listas_estaticas;

public class Lista01_07 {

	public static void main(String[] args) {
		Lista lista = new Lista(10);
		for(int i = 0; i < 10; i++) {
			lista.adicionaInicio(i + 1);
		}
		lista.mostraLista();
		lista.removeFinal();
		lista.mostraLista();
		lista.removeInicio();
		lista.mostraLista();
		lista.adicionaInicio(9999);
		lista.mostraLista();
		lista.adicionaFinal(8888);
		lista.mostraLista();
	}
}
