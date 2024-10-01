package com.resumo;

public class TipoPagamentoCartao implements TipoPagamento {

    private static TipoPagamentoCartao tipoPagamentoCartao = new TipoPagamentoCartao();

    private TipoPagamentoCartao() {}

    public static TipoPagamentoCartao getTipoPagamentoCartao() {
        return tipoPagamentoCartao;
    }
}