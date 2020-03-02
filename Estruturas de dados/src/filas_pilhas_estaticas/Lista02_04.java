/*
 * Programador: Gabriel Rocha
 * Descrição: A classe Livro possui atributos que são criados na classe concreta e acessados
por meio dos métodos públicos da classe (getters e setters). Dado o cenário
implemente uma Pilha em que:
- Sejam criados em uma classe os atributos título do tipo de dado String e
quantidade de exemplares do tipo de dado inteiro. Estes atributos devem ser
acessados por meio de seus métodos públicos (getters e setters). Esta classe deve
receber em seu método construtor a quantidade de elementos que a Pilha terá em
sua capacidade.
- Implemente uma classe que terá os métodos de push e pop, para realizar as
operações de adicionar e remover os elementos da Pilha. Esta classe deverá
conter um vetor estático chamado Livro dados[ ]
- Crie um método que receba os dados de entrada para a Pilha.
- Crie um método que realize a exibição dos elementos da Pilha.
 * Data: 28/02/2020
 */

package filas_pilhas_estaticas;

class Livro {
	
	private String titulo;
	private int qntExem;
	
	Livro() {
		titulo = "vazio";
		qntExem = 0;
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getQntExem() {
		return qntExem;
	}

	public void setQntExem(int qntExem) {
		this.qntExem = qntExem;
	}
}

class PilhaLivros {
	
	private int tamMaximo;
	private int topo;
	private Livro[] dados;
	
	PilhaLivros(int max) {
		tamMaximo = max;
		topo = -1;
		dados = new Livro[max];
	}
	
	private boolean cheia() {
		return (topo == tamMaximo - 1);
	}
	
	private boolean vazia() {
		return (topo == -1);
	}
	
	//push
	public void empilha(Livro l) {
		if(!cheia()) {
			topo++;
			dados[topo] = l;
		} else {
			System.out.println("Erro ao empilhar! A pilha está cheia!");
		}
	}
	
	//pop
	public Livro desempilha() {
		Livro l = null;
		if(!vazia()) {
			l = dados[topo];
			dados[topo] = null;
			topo--;
		} else {
			System.out.println("Erro ao desempilhar! A pilha está vazia!");
		}
		return l;
	}
	
	public void mostraPilha() {
		for(int i = 0; i <= topo; i++) {
			System.out.println(dados[i].getTitulo() + " " + dados[i].getQntExem());
		}
	}
}

public class Lista02_04 {

	public static void main(String[] args) {
		PilhaLivros pilha = new PilhaLivros(20);
		Livro gulliver = new Livro();
		gulliver.setTitulo("As Viagens de Gulliver");
		gulliver.setQntExem(10);
		Livro belafera = new Livro();
		belafera.setTitulo("A Bela e a Fera");
		belafera.setQntExem(10);
		pilha.empilha(gulliver);
		pilha.empilha(belafera);
		pilha.mostraPilha();
	}

}
