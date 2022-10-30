package br.com.dio.desafio.dominio;

import java.time.LocalDateTime;

public class LocacaoVeiculo {
    private Long numContratoLocacao;
    private long idLojaLocadora;
    private LocalDateTime dataHoraMinInicio;
    private LocalDateTime dataHoraMinFimCombinada;
    private LocalDateTime dataHoraMinFimEfetiva;
    private Long diariasIncorridas;
    private StatusesContratoLocacao statusLocacao;

    private Locatario locatario;
    private Veiculo veiculo;
    private Double valorDiaria;

    public LocacaoVeiculo() {
    }
    public LocacaoVeiculo(Long numContratoLocacao, long idLojaLocadora,
                          LocalDateTime dataHoraMinInicio, LocalDateTime dataHoraMinFimCombinada,
                          LocalDateTime dataHoraMinFimEfetiva, Long diariasIncorridas,
                          StatusesContratoLocacao statusLocacao, Locatario locatario, Veiculo veiculo,
                          Double valorDiaria) {
        this.numContratoLocacao = numContratoLocacao;
        this.idLojaLocadora = idLojaLocadora;
        this.dataHoraMinInicio = dataHoraMinInicio;
        this.dataHoraMinFimCombinada = dataHoraMinFimCombinada;
        this.dataHoraMinFimEfetiva = dataHoraMinFimEfetiva;
        this.diariasIncorridas = diariasIncorridas;
        this.statusLocacao = statusLocacao;
        this.locatario = locatario;
        this.veiculo = veiculo;
        this.valorDiaria = valorDiaria;
    }

    public Long getNumContratoLocacao() {
        return numContratoLocacao;
    }

    public void setNumContratoLocacao(Long numContratoLocacao) {
        this.numContratoLocacao = numContratoLocacao;
    }

    public long getIdContratoLocacao() {
        return idLojaLocadora;
    }

    public void setidLojaLocadora(long idLojaLocadora) {
        this.idLojaLocadora = idLojaLocadora;
    }

    public LocalDateTime getDataHoraMinInicio() {
        return dataHoraMinInicio;
    }

    public void setDataHoraMinInicio(LocalDateTime dataHoraMinInicio) {
        this.dataHoraMinInicio = dataHoraMinInicio;
    }

    public LocalDateTime getDataHoraMinFimCombinada() {
        return dataHoraMinFimCombinada;
    }

    public void setDataHoraMinFimCombinada(LocalDateTime dataHoraMinFimCombinada) {
        this.dataHoraMinFimCombinada = dataHoraMinFimCombinada;
    }

    public LocalDateTime getDataHoraMinFimEfetiva() {
        return dataHoraMinFimEfetiva;
    }

    public void setDataHoraMinFimEfetiva(LocalDateTime dataHoraMinFimEfetiva) {
        this.dataHoraMinFimEfetiva = dataHoraMinFimEfetiva;
    }

    public Long getDiariasIncorridas() {
        return diariasIncorridas;
    }

    public void setDiariasIncorridas(Long diariasIncorridas) {
        this.diariasIncorridas = diariasIncorridas;
    }

    public StatusesContratoLocacao getStatusLocacao() {
        return statusLocacao;
    }

    public void setStatusLocacao(StatusesContratoLocacao statusLocacao) {
        this.statusLocacao = statusLocacao;
    }

    public Locatario getLocatario() {
        return locatario;
    }

    public void setLocatario(Locatario locatario) {
        this.locatario = locatario;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(VeiculoUtilitario veiculo3) {


        this.veiculo = veiculo;
    }

    public Double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(Double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    @Override
    public String toString() {
        return "LocacaoVeiculo{" +
                "numContratoLocacao=" + numContratoLocacao +
                ", idContratoLocacao='" + idLojaLocadora + '\'' +
                ", dataHoraMinInicio=" + dataHoraMinInicio +
                ", dataHoraMinFimCombinada=" + dataHoraMinFimCombinada +
                ", dataHoraMinFimEfetiva=" + dataHoraMinFimEfetiva +
                ", diariasIncorridas=" + diariasIncorridas +
                ", statusLocacao=" + statusLocacao +
                ", locatario=" + locatario +
                ", veiculo=" + veiculo +
                ", valorDiaria=" + valorDiaria +
                '}';
    }

}

