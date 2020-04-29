package recursividade;

public class ListaLigadaRecursivaFuncionarios extends ListaLigadaRecursiva<Funcionario> {
	
	@Override
	public void mostraLista() {
		StringBuilder sb = new StringBuilder();
		sb.append("    Id    Nome    RG    CPF    Departamento\n");
		No<Funcionario> aux = inicio;
		while (aux != null) {
			sb.append("   " + aux.dado.getId() + "   " + aux.dado.getNome() + "    " + aux.dado.getRg() +
					"   " + aux.dado.getCpf() + "    " + aux.dado.getDepar() + "\n");
			aux = aux.prox;
		}                                                                                             
		System.out.println(sb.toString());
	}
}
