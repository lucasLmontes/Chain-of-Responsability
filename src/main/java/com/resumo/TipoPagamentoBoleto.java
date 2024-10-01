package com.resumo;

public class TipoPagamentoBoleto implements TipoPagamento {

    private static TipoPagamentoBoleto tipoPagamentoBoleto = new TipoPagamentoBoleto();

    private TipoPagamentoBoleto() {}

    public static TipoPagamentoBoleto getTipoPagamentoBoleto() {
        return tipoPagamentoBoleto;
    }
}