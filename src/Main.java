import br.com.dio.desafio.dominio.*;

import java.time.LocalDateTime;

import static br.com.dio.desafio.dominio.TipoCombustivel.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Instanciando veiculos...");

        VeiculoDePasseio veiculo1 = new VeiculoDePasseio( );
        //1L, "HB20", 2022, "FAA0001", FLEX, true, CategoriasCNH.B, Cor.AZUL, 5
        veiculo1.setIdVeiculo(1L);
        veiculo1.setNomeModelo("HB20");
        veiculo1.setAnoFabricacao(2022);
        veiculo1.setPlacaVeiculo("FAA0001");
        veiculo1.setTipoCombustivel(FLEX);
        veiculo1.setFlagDisponivel(true);
        veiculo1.setCategoriaCNHRequerida(CategoriasCNH.B);
        veiculo1.setCor(Cor.AZUL);
        veiculo1.setNumPassageiros(5);
        System.out.println(veiculo1);

        VeiculoUtilitario veiculo2 = new VeiculoUtilitario();
        //2L, "F100", 2022, "FAA0002", GASOLINA, true, CategoriasCNH.C, Cor.BRANCO, 2, 1500L
        veiculo2.setIdVeiculo(2L);
        veiculo2.setNomeModelo("F100");
        veiculo2.setAnoFabricacao(2022);
        veiculo2.setPlacaVeiculo("FAA0002");
        veiculo2.setTipoCombustivel(GASOLINA);
        veiculo2.setFlagDisponivel(true);
        veiculo2.setCategoriaCNHRequerida(CategoriasCNH.C);
        veiculo2.setCor(Cor.BRANCO);
        veiculo2.setNumEixos(2);
        veiculo2.setCapacidadeCargaKG(1500L);
        System.out.println(veiculo2);

        VeiculoUtilitario veiculo3 = new VeiculoUtilitario();
        //3L, "Mercedes MicroOnibus", 2020, "FAA0004", DIESEL, true, CategoriasCNH.E, Cor.VERMELHO, 2, 1500L
        veiculo3.setIdVeiculo(3L);
        veiculo3.setNomeModelo("Mercedes MicroOnibus");
        veiculo3.setAnoFabricacao(2022);
        veiculo3.setPlacaVeiculo("FAA0003");
        veiculo3.setTipoCombustivel(DIESEL);
        veiculo3.setFlagDisponivel(true);
        veiculo3.setCategoriaCNHRequerida(CategoriasCNH.E);
        veiculo3.setCor(Cor.VERMELHO);
        veiculo3.setNumEixos(2);
        veiculo3.setCapacidadeCargaKG(1500L);
        System.out.println(veiculo3);
/*

        Veiculo veiculo3 = new Veiculo(3L, "Mercedes MicroOnibus", 2020, "FAA0004", DIESEL, true, CategoriasCNH.E);
        System.out.println(veiculo3);
*/
        System.out.println("--------------");
        System.out.println("Instanciando locatarios...");
        Locatario locatario1 = new Locatario( 1L, "Assaltaro Banco", 123345565789L, 11, 987654321L, "doismeiameia@tapana.oreia.com", CategoriasCNH.B );
        System.out.println(locatario1);
        Locatario locatario2 = new Locatario( 2L, "Fujiro Nakonbi", 123345565790L, 11, 987654322L, "doismeiameia@chutena.oreia.com", CategoriasCNH.C );
        System.out.println(locatario2);
        Locatario locatario3 = new Locatario( 3L, "Batero Noposti", 123345565791L, 11, 987654323L, "doismeiameia@mordidana.oreia.com", CategoriasCNH.D );
        System.out.println(locatario3);
        Locatario locatario4 = new Locatario( 4L, "Kadaum Porsik", 123345565792L, 11, 987654324L, "doismeiameia@sopradana.oreia.com", CategoriasCNH.B );
        System.out.println(locatario4);
        Locatario locatario5 = new Locatario( 5L, "Boah Sohtik", 123345565793L, 11, 987654325L, "doismeiameia@beijadana.oreia.com", CategoriasCNH.A );
        System.out.println(locatario5);

        System.out.println("--------------");
        System.out.println("Instanciando lojas da locadora...");

        LojaLocadora loja1 = new LojaLocadora( 1L, "Shopping Vila Olimpia", 05050000d, "SAO PAULO", UF.SP, Boolean.TRUE );
        System.out.println(loja1);
        LojaLocadora loja2 = new LojaLocadora( 2L, "Shopping Eldorado", 05592123d,"SAO PAULO", UF.SP, Boolean.TRUE  );
        System.out.println(loja2);

        System.out.println("--------------");
        System.out.println("Instanciando locacao de veiculos...");

        System.out.println("--------------");
        System.out.println("checando se CNH locatario habilita alugar veiculo ...");


        LocacaoVeiculo locacaoVeiculo1 = new LocacaoVeiculo();
        locacaoVeiculo1.setLocatario(locatario1);
        locacaoVeiculo1.setVeiculo(veiculo3);
        locacaoVeiculo1.setNumContratoLocacao(1L);
        locacaoVeiculo1.setidLojaLocadora(1L);
        locacaoVeiculo1.setDataHoraMinInicio(LocalDateTime.now());
        locacaoVeiculo1.setDataHoraMinFimCombinada(LocalDateTime.now().plusDays(4));
        locacaoVeiculo1.setDataHoraMinFimEfetiva(LocalDateTime.now().plusDays(5));
        locacaoVeiculo1.setDiariasIncorridas(5L);
        locacaoVeiculo1.setStatusLocacao(StatusesContratoLocacao.PENDENTE_PAGAMENTO);
        locacaoVeiculo1.setValorDiaria(257d);

        System.out.println("Categoria CNH locatario: " + locacaoVeiculo1.getLocatario().getCategoriaCNHLocatario() );
        System.out.println("categoria CNH requerida: " + veiculo3.getCategoriaCNHRequerida());

        Integer categoriaLocatario = locacaoVeiculo1.getLocatario().getCategoriaCNHLocatario().ordinal();
        System.out.println( categoriaLocatario );;

        Integer categoriaVeiculo = veiculo3.getCategoriaCNHRequerida().ordinal();
        System.out.println( categoriaVeiculo );;

        if ( categoriaLocatario < categoriaVeiculo ) {
            System.out.println("categoria do locatario nao permite alugar este veiculo ");
        }








    }
}

