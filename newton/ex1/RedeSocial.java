package br.com.newton.ex1;
import java.util.ArrayList;

public class RedeSocial {

	private String dataCriacao;
	private String nomeUsuario;
	private String dataNascimento;
	private String senha;
	private ArrayList<Publicacao> publicacoes;
	
	public void imprimePublicacoes() {
        System.out.println("Total de publicações: " + Publicacao.getContadorPublicacao());
        for (Publicacao publi : publicacoes) {
            System.out.println("Data de publicação: " + publi.getDataPublicacao());
            System.out.println("Texto da publicação: " + publi.getTextoPublicacao());
            System.out.println("------------------------------");
        }
    }
	public void inserePublicacao(Publicacao publi) {
        publicacoes.add(publi);
    }
	
	public RedeSocial(String dataCriacao, String nomeUsuario, String dataNascimento, String senha) {
		super();
		this.dataCriacao = dataCriacao;
		this.nomeUsuario = nomeUsuario;
		this.dataNascimento = dataNascimento;
		this.senha = senha;
	}
	public RedeSocial(String nomeRedeSocial, int anoFundacao) {
		// TODO Auto-generated constructor stub
	}
	public String getDataCriacao() {
		return dataCriacao;
	}
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public String getSenha() {
		return senha;
	}
	public void setDataCriacao(String dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
