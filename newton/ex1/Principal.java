package br.com.newton.ex1;

public class Principal {

	public static void main(String[] args) {
        // Solicitar dados da Rede Social
        String nomeRedeSocial = "Exemplo Social";
        int anoFundacao = 2020;

        // Criar objeto RedeSocial
        RedeSocial redeSocial = new RedeSocial(nomeRedeSocial, anoFundacao);

        // Criar objetos Publicacao
        Publicacao publicacao1 = new Publicacao("Texto da publicação 1", "www.link1.com", "01/01/2023");
        Publicacao publicacao2 = new Publicacao("Texto da publicação 2", "www.link2.com", "02/01/2023");

        // Inserir as publicações na Rede Social
        redeSocial.inserePublicacao(publicacao1);
        redeSocial.inserePublicacao(publicacao2);

        // Chamar o método imprimePublicacoes
        redeSocial.imprimePublicacoes();
	}
}
