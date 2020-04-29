package recursividade;

public class ListaLigadaRecursivaAlunos extends ListaLigadaRecursiva<Aluno> {
	
	@Override
	public void mostraLista() {
		StringBuilder sb = new StringBuilder();
		sb.append("    RA    Nome    Semestre    \n");
		No<Aluno> aux = inicio;
		while (aux != null) {
			sb.append("   " + aux.dado.getRa() + "   " + aux.dado.getNome() + "    " + aux.dado.getSemestre() + "\n");
			aux = aux.prox;
		}                                                                                             
		System.out.println(sb.toString());
	}
}
