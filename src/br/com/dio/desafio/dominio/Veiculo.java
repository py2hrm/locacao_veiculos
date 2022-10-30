package br.com.dio.desafio.dominio;

import java.util.Set;

public abstract class Veiculo {
    private Long idVeiculo;
    private String nomeModelo;
    private Integer anoFabricacao;
    private String placaVeiculo;
    private TipoCombustivel tipoCombustivel;
    private Boolean flagDisponivel;
    private CategoriasCNH categoriaCNHRequerida;
    private Cor cor;

    public Long getIdVeiculo() {
        return idVeiculo;
    }

    public void setIdVeiculo(Long idVeiculo) {
        this.idVeiculo = idVeiculo;
    }

    public String getNomeModelo() {
        return nomeModelo;
    }

    public void setNomeModelo(String nomeModelo) {
        this.nomeModelo = nomeModelo;
    }

    public Integer getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(Integer anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public void setPlacaVeiculo(String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
    }

    public TipoCombustivel getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(TipoCombustivel tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public Boolean getFlagDisponivel() {
        return flagDisponivel;
    }

    public void setFlagDisponivel(Boolean flagDisponivel) {
        this.flagDisponivel = flagDisponivel;
    }

    public CategoriasCNH getCategoriaCNHRequerida() {
        return categoriaCNHRequerida;
    }

    public void setCategoriaCNHRequerida(CategoriasCNH categoriaCNHRequerida) {
        this.categoriaCNHRequerida = categoriaCNHRequerida;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }


}

