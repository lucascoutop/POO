package br.com.newton.ex1;
import java.util.ArrayList;

public class Publicacao {

	private String textoPublicacao;
    private String linkMidia;
    private String dataPublicacao;
    private static double contadorPublicacao = 0;

    public Publicacao(String textoPublicacao, String linkMidia, String dataPublicacao) {
        this.textoPublicacao = textoPublicacao;
        this.linkMidia = linkMidia;
        this.dataPublicacao = dataPublicacao;
        contadorPublicacao++;
    }

    public void setTextoPublicacao(String textoPublicacao) {
        this.textoPublicacao = textoPublicacao;
    }

    public void setLinkMidia(String linkMidia) {
        this.linkMidia = linkMidia;
    }

    public void setDataPublicacao(String dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public String getTextoPublicacao() {
        return textoPublicacao;
    }

    public String getLinkMidia() {
        return linkMidia;
    }

    public String getDataPublicacao() {
        return dataPublicacao;
    }

    public static double getContadorPublicacao() {
        return contadorPublicacao;
    }
	
}
