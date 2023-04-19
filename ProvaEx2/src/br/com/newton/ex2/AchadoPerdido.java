package br.com.newton.ex2;

public abstract class AchadoPerdido implements Publicacao{

    public String titulo;
    public String descricao;
    public String foto;
    public String tipo;
    public String local_achado;
    public String data_hora;
    public String status;

    public AchadoPerdido() {

    }

    public void visualizaDetalhes(){
        System.out.println(titulo + foto + local_achado + tipo + status);
    }

    public String BuscaTitulo(String texto){
        if(texto == this.titulo){
            return "Titulo:" +titulo+ "Descrição:" +descricao+ "Local:" +local_achado;
        }else
            return "Não encontrado";
    }

    public AchadoPerdido(String titulo, String descricao, String foto, String tipo, String local_achado, String data_hora, String status) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.foto = foto;
        this.tipo = tipo;
        this.local_achado = local_achado;
        this.data_hora = data_hora;
        this.status = status;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getLocal_achado() {
        return local_achado;
    }

    public void setLocal_achado(String local_achado) {
        this.local_achado = local_achado;
    }

    public String getData_hora() {
        return data_hora;
    }

    public void setData_hora(String data_hora) {
        this.data_hora = data_hora;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
