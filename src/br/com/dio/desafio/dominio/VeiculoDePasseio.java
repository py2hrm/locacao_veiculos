package br.com.dio.desafio.dominio;

public class VeiculoDePasseio extends Veiculo{
    private Integer numPassageiros;

    public Integer getNumPassageiros() {
        return numPassageiros;
    }

    public void setNumPassageiros(Integer numPassageiros) {
        this.numPassageiros = numPassageiros;
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
                ", numPassageiros=" + getNumPassageiros() +
                '}';
    }
}
