package br.com.infnet.academia;

import java.math.BigDecimal;

public class Consumo {
    private BigDecimal tarifaDiaria;
    private int quantidadeDeUso = 0;
    private Servico servico;

    public Consumo(BigDecimal tarifaDiaria, Servico servico, int quantidadeDeUso) {
        this.servico = servico;
        this.quantidadeDeUso = quantidadeDeUso;
        this.tarifaDiaria = tarifaDiaria;
    }

    public BigDecimal getTarifaDiaria() {
        return tarifaDiaria;
    }

    public int getQuantidadeDeUso() {
        return quantidadeDeUso;
    }

    public Servico getServico() {
        return servico;
    }
}
