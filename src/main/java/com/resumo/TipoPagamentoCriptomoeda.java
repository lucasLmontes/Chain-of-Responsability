package com.resumo;

public class TipoPagamentoCriptomoeda implements TipoPagamento {

    private static TipoPagamentoCriptomoeda tipoPagamentoCriptomoeda = new TipoPagamentoCriptomoeda();

    private TipoPagamentoCriptomoeda() {}

    public static TipoPagamentoCriptomoeda getTipoPagamentoCriptomoeda() {
        return tipoPagamentoCriptomoeda;
    }
}