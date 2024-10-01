package com.resumo;

public class FuncionarioSupervisor extends Funcionario {

    public FuncionarioSupervisor(Funcionario superior) {
        listaPagamentos.add(TipoPagamentoBoleto.getTipoPagamentoBoleto());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Supervisor";
    }
}