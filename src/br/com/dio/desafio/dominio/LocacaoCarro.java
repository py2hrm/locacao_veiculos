package br.com.dio.desafio.dominio;

public class LocacaoCarro {
    private Long numContratoLocacao;
    private Long cpfLocatario;
    private String idContratoLocacao;
    private Long dataHoraMinInicio;
    private Long dataHoraMinFimCombinada;
    private Long dataHoraMinFimEfetiva;
    private Long diariasIncorridas;
    private String statusLocacao; // CRIADO, [CANCELADO -> <FIM>/VIGENTE -> ...],
                                    // ... DEVOLVIDO, EM VISTORIA ,  VISTORIADO [COM RESSALVA / SEM RESSALVA],
                                    // [PAGO -> COMPLETADO ] / [ PENDENTE -> PROTESTADO ,[ ACORDO -> COMPLETADO[] / LITIGIO ]
    private Long idLocatario;
    private Long idVeiculo;
    private double valorDiaria;
}

