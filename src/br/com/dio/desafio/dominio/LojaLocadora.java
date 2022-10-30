package br.com.dio.desafio.dominio;

public class LojaLocadora {
    private Long idLojaLocadora;
    private String nomeLojaLocadora;
    private Double cepLojaLocadora;
    private String cidadeLojaLocadora;
    private UF ufLojaLocadora;
    private Boolean flagAtivo;

    public LojaLocadora(Long idLojaLocadora, String nomeLojaLocadora, Double cepLojaLocadora,
                        String cidadeLojaLocadora, UF ufLojaLocadora, Boolean flagAtivo) {
        this.idLojaLocadora = idLojaLocadora;
        this.nomeLojaLocadora = nomeLojaLocadora;
        this.cepLojaLocadora = cepLojaLocadora;
        this.cidadeLojaLocadora = cidadeLojaLocadora;
        this.ufLojaLocadora = ufLojaLocadora;
        this.flagAtivo = flagAtivo;
    }

    public Long getIdLojaLocadora() {
        return idLojaLocadora;
    }

    public void setIdLojaLocadora(Long idLojaLocadora) {
        this.idLojaLocadora = idLojaLocadora;
    }

    public String getNomeLojaLocadora() {
        return nomeLojaLocadora;
    }

    public void setNomeLojaLocadora(String nomeLojaLocadora) {
        this.nomeLojaLocadora = nomeLojaLocadora;
    }

    public Double getCepLojaLocadora() {
        return cepLojaLocadora;
    }

    public void setCepLojaLocadora(Double cepLojaLocadora) {
        this.cepLojaLocadora = cepLojaLocadora;
    }

    public String getCidadeLojaLocadora() {
        return cidadeLojaLocadora;
    }

    public void setCidadeLojaLocadora(String cidadeLojaLocadora) {
        this.cidadeLojaLocadora = cidadeLojaLocadora;
    }

    public UF getUfLojaLocadora() {
        return ufLojaLocadora;
    }

    public void setUfLojaLocadora(UF ufLojaLocadora) {
        this.ufLojaLocadora = ufLojaLocadora;
    }

    public Boolean getFlagAtivo() {
        return flagAtivo;
    }

    public void setFlagAtivo(Boolean flagAtivo) {
        this.flagAtivo = flagAtivo;
    }

    @Override
    public String toString() {
        return "LojaLocadora{" +
                "idLojaLocadora=" + idLojaLocadora +
                ", nomeLojaLocadora='" + nomeLojaLocadora + '\'' +
                ", cepLojaLocadora=" + cepLojaLocadora +
                ", cidadeLojaLocadora='" + cidadeLojaLocadora + '\'' +
                ", ufLojaLocadora=" + ufLojaLocadora +
                ", flagAtivo=" + flagAtivo +
                '}';
    }
}
