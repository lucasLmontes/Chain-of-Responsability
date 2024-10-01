package com.resumo;

import java.util.ArrayList;
import java.util.List;

public abstract class Funcionario {

    protected List<TipoPagamento> listaPagamentos = new ArrayList<>();
    private Funcionario funcionarioSuperior;

    public Funcionario getFuncionarioSuperior() {
        return funcionarioSuperior;
    }

    public void setFuncionarioSuperior(Funcionario funcionarioSuperior) {
        this.funcionarioSuperior = funcionarioSuperior;
    }

    public abstract String getDescricaoCargo();

    public String aprovarDesconto(Pagamento pagamento) {
        if (listaPagamentos.contains(pagamento.getTipoPagamento())) {
            return getDescricaoCargo();
        } else {
            if (funcionarioSuperior != null) {
                return funcionarioSuperior.aprovarDesconto(pagamento);
            } else {
                return "Sem aprovação";
            }
        }
    }
}
