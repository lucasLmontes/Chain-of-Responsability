package com.resumo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PagamentoTest {
    FuncionarioDiretorVendas diretorVendas;
    FuncionarioSupervisor supervisor;
    FuncionarioGerente gerente;
    FuncionarioAtendente atendente;

    @BeforeEach
    public void setUp() {
        diretorVendas = new FuncionarioDiretorVendas(null);
        supervisor = new FuncionarioSupervisor(diretorVendas);
        gerente = new FuncionarioGerente(supervisor);
        atendente = new FuncionarioAtendente(gerente);
    }

    @Test
    public void deveRetornarAtendenteParaPagamentoDinheiro() {
        assertEquals("Atendente", atendente.aprovarDesconto(new Pagamento(TipoPagamentoDinheiro.getTipoPagamentoDinheiro())));
    }

    @Test
    public void deveRetornarGerenteParaPagamentoCartao() {
        assertEquals("Gerente", atendente.aprovarDesconto(new Pagamento(TipoPagamentoCartao.getTipoPagamentoCartao())));
    }

    @Test
    public void deveRetornarSupervisorParaPagamentoBoleto() {
        assertEquals("Supervisor", atendente.aprovarDesconto(new Pagamento(TipoPagamentoBoleto.getTipoPagamentoBoleto())));
    }

    @Test
    public void deveRetornarDiretorVendasParaPagamentoCriptomoeda() {
        assertEquals("Diretor de Vendas", atendente.aprovarDesconto(new Pagamento(TipoPagamentoCriptomoeda.getTipoPagamentoCriptomoeda())));
    }

    @Test
    public void deveRetornarSemAprovacaoParaPagamentoNaoDefinido() {
        TipoPagamento pagamentoNaoDefinido = new TipoPagamento() {};
        assertEquals("Sem aprovação", atendente.aprovarDesconto(new Pagamento(pagamentoNaoDefinido)));
    }
}
