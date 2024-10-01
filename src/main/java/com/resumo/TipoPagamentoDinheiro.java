package com.resumo;

public class TipoPagamentoDinheiro implements TipoPagamento {

    private static TipoPagamentoDinheiro tipoPagamentoDinheiro = new TipoPagamentoDinheiro();

    private TipoPagamentoDinheiro() {}

    public static TipoPagamentoDinheiro getTipoPagamentoDinheiro() {
        return tipoPagamentoDinheiro;
    }
}