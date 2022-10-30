package br.com.dio.desafio.dominio;

public class VeiculoUtilitario extends Veiculo{
    private Integer numEixos;
    private Long capacidadeCargaKG;

    public Integer getNumEixos() {
        return numEixos;
    }

    public void setNumEixos(Integer numEixos) {
        this.numEixos = numEixos;
    }

    public Long getCapacidadeCargaKG() {
        return capacidadeCargaKG;
    }

    public void setCapacidadeCargaKG(Long capacidadeCargaKG) {
        this.capacidadeCargaKG = capacidadeCargaKG;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "idVeiculo=" + getIdVeiculo() +
                ", nomeModelo='" + getNomeModelo() + '\'' +
                ", anoFabricacao=" + getAnoFabricacao() +
                ", placaVeiculo='" + getPlacaVeiculo() + '\'' +
                ", tipoCombustivel=" + getTipoCombustivel() +
                ", flagDisponivel=" + getFlagDisponivel() +
                ", categoriaCNHRequerida=" + getCategoriaCNHRequerida() +
                ", cor=" + getCor() +
                ", numEixos=" + getNumEixos() +
                ", capacidadeCargaKG=" + getCapacidadeCargaKG() +
                '}';
    }

}
