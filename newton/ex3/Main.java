package br.com.newton.ex3;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
        ArrayList<Artigo> artigos = new ArrayList<>();

        Edicao edicao = new Edicao(1, 1, "01/01/2023", 1000);
        for (Artigo artigo : artigos) {
            edicao.adicionarArtigo(artigo);
        }

        RevistaCientifica revista = new RevistaCientifica("Revista Científica", 123456789, "Mensal");
        revista.adicionarEdicao(edicao);
	}	
}
