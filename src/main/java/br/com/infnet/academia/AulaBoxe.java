package br.com.infnet.academia;

import java.math.BigDecimal;

public class AulaBoxe implements Servico{

    String nome = "Aula de Boxe";
    @Override public BigDecimal calcularValor(Consumo consumo) {
        return consumo.getTarifaDiaria().multiply(new BigDecimal(consumo.getQuantidadeDeUso()));
    }

    @Override public String getNome() {
        return nome;
    }
}
