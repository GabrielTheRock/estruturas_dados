package filas_pilhas_estaticas;

public class Lista02_02 {

	public static void main(String[] args) {
		FilaCircular filac = new FilaCircular(10);
		Fila fila = new Fila(10);
		for(int i = 1; i <= 10; i++) {
			filac.adiciona(i);
			fila.adiciona(i);
		}
		System.out.println("Implementando uma fila circular...");
		filac.mostraFila();
		filac.remove();
		filac.mostraFila();
		filac.adiciona(700);
		filac.mostraFila();
		filac.remove();
		filac.mostraFila();
		filac.adiciona(800);
		filac.mostraFila();
		filac.adiciona(1887);
		System.out.println("\nImplementando uma fila estática...");
		fila.mostraFila();
		fila.remove();
		fila.mostraFila();
		fila.remove();
		fila.mostraFila();
		fila.adiciona(9888);
		fila.mostraFila();
		fila.adiciona(8765);
		fila.mostraFila();
		fila.adiciona(9655);
	}

}
