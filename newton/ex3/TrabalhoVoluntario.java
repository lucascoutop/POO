package br.com.newton.ex3;

import java.util.Date;

public class TrabalhoVoluntario extends Projeto{
	
	private String nomProjeto;
    private String descricao;
    private Date datainicio;
    private Date datafim;
    private String tipoTrabalho;
    private int duracaoTrabalho;

    public TrabalhoVoluntario(String nomProjeto, String descricao, Date datainicio, Date datafim, String tipoTrabalho, int duracaoTrabalho) {
        super(nomProjeto, descricao, datainicio, datafim);
        this.tipoTrabalho = tipoTrabalho;
        this.duracaoTrabalho = duracaoTrabalho;
    }

    public String getTipoTrabalho() {
        return tipoTrabalho;
    }

    public void setTipoTrabalho(String tipoTrabalho) {
        this.tipoTrabalho = tipoTrabalho;
    }

    public int getDuracaoTrabalho() {
        return duracaoTrabalho;
    }

    public void setDuracaoTrabalho(int duracaoTrabalho) {
        this.duracaoTrabalho = duracaoTrabalho;
    }

    public boolean validaProjeto() {
        if (this.getDuracaoTrabalho() > 2) {
            return true;
        } else {
            return false;
        }
    }

    public String imprimeProjeto() {
        return "Nome do Projeto: " + this.getNomProjeto() + 
               "\nDescrição: " + this.getDescricao() + 
               "\nData de início: " + this.getDatainicio() + 
               "\nData de fim: " + this.getDatafim() + 
               "\nTipo de trabalho: " + this.getTipoTrabalho() + 
               "\nDuração do trabalho: " + this.getDuracaoTrabalho();
	
    }
}
