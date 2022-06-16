package br.com.infnet.academia;

import java.math.BigDecimal;

public class PlanoDiario implements Servico{

    @Override public BigDecimal calcularValor(Consumo consumo) {
        return consumo.getTarifaDiaria().multiply(new BigDecimal(consumo.getQuantidadeDeUso()));
    }
}
