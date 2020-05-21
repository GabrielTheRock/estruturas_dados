package duplamente_ligada;

import java.util.Date;

public class Videolocadora {
	
	private int codFilme;
	private String nomeFilme;
	private Date dataPublicacao;
	private int qnt;
	
	public int getCodFilme() {
		return codFilme;
	}
	public void setCodFilme(int codFilme) {
		this.codFilme = codFilme;
	}
	public String getNomeFilme() {
		return nomeFilme;
	}
	public void setNomeFilme(String nomeFilme) {
		this.nomeFilme = nomeFilme;
	}
	public Date getDataPublicacao() {
		return dataPublicacao;
	}
	public void setDataPublicacao(Date dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}
	public int getQnt() {
		return qnt;
	}
	public void setQnt(int qnt) {
		this.qnt = qnt;
	}
}
