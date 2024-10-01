package com.resumo;

public class FuncionarioAtendente extends Funcionario {

    public FuncionarioAtendente(Funcionario superior) {
        listaPagamentos.add(TipoPagamentoDinheiro.getTipoPagamentoDinheiro());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Atendente";
    }
}