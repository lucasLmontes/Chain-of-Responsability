package com.resumo;

public class FuncionarioDiretorVendas extends Funcionario {

    public FuncionarioDiretorVendas(Funcionario superior) {
        listaPagamentos.add(TipoPagamentoCriptomoeda.getTipoPagamentoCriptomoeda());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Diretor de Vendas";
    }
}