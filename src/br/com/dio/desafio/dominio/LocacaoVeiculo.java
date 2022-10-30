package br.com.dio.desafio.dominio;

import java.time.LocalDateTime;

public class LocacaoVeiculo {
    private Long numContratoLocacao;
    private Long cpfLocatario;
    private String idContratoLocacao;
    private LocalDateTime dataHoraMinInicio;
    private LocalDateTime dataHoraMinFimCombinada;
    private LocalDateTime dataHoraMinFimEfetiva;
    private Long diariasIncorridas;
    private String statusLocacao;

    private Locatario locatario;
    private Veiculo veiculo;
    private Double valorDiaria;

    // statusLocacao : // CRIADO, [CANCELADO -> <FIM>/VIGENTE -> ...],
    // ... DEVOLVIDO, EM VISTORIA ,  VISTORIADO [COM RESSALVA / SEM RESSALVA],
    // [PAGO -> COMPLETADO ] / [ PENDENTE -> PROTESTADO ,[ ACORDO -> COMPLETADO[] / LITIGIO ]


    public Long getNumContratoLocacao() {
        return numContratoLocacao;
    }

    public void setNumContratoLocacao(Long numContratoLocacao) {
        this.numContratoLocacao = numContratoLocacao;
    }

    public Long getCpfLocatario() {
        return cpfLocatario;
    }

    public void setCpfLocatario(Long cpfLocatario) {
        this.cpfLocatario = cpfLocatario;
    }

    public String getIdContratoLocacao() {
        return idContratoLocacao;
    }

    public void setIdContratoLocacao(String idContratoLocacao) {
        this.idContratoLocacao = idContratoLocacao;
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

    public String getStatusLocacao() {
        return statusLocacao;
    }

    public void setStatusLocacao(String statusLocacao) {
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

    public void setVeiculo(Veiculo veiculo) {
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
                ", cpfLocatario=" + cpfLocatario +
                ", idContratoLocacao='" + idContratoLocacao + '\'' +
                ", dataHoraMinInicio=" + dataHoraMinInicio +
                ", dataHoraMinFimCombinada=" + dataHoraMinFimCombinada +
                ", dataHoraMinFimEfetiva=" + dataHoraMinFimEfetiva +
                ", diariasIncorridas=" + diariasIncorridas +
                ", statusLocacao='" + statusLocacao + '\'' +
                ", locatario=" + locatario +
                ", veiculo=" + veiculo +
                ", valorDiaria=" + valorDiaria +
                '}';
    }
}

