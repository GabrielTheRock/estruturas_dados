package alocacao_dinamica;

public class FilaLivros extends FilaDinamica<Livro> {
	
	@Override
	public void mostraFila() {
		StringBuilder sb = new StringBuilder();
		sb.append("Título   Exemplares\n");
		No<Livro> aux = inicio;
		while (aux != null) {
			sb.append(" " + aux.dado.getTitulo() + "        " + aux.dado.getQntExem() + "\n");
			aux = aux.prox;
		}
		System.out.println(sb.toString());
	}
}
