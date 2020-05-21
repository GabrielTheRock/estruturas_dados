package estruturas;

public class TESTES {
	
	public static void main(String[] args) {
		ListaDuplamenteLigada<Integer> pd = new ListaDuplamenteLigada<Integer>();
		for (int i = 0; i < 10; i++) {
			pd.adicionaInicio(i + 1);
		}
		pd.mostraLista();
		pd.adicionaPos(5, 555);
		pd.mostraLista();
		pd.removeInicio();
		pd.mostraLista();
		pd.adicionaFinal(9999);
		pd.mostraLista();
		pd.removeFinal();
		pd.mostraLista();
		pd.removePos(5);
		pd.mostraLista();
	}
}