package br.com.infnet.academia;

import java.math.BigDecimal;

public class PlanoMensal implements Servico{

    String nome = "Plano Mensal";
    @Override public BigDecimal calcularValor(Consumo consumo) {
        return consumo.getTarifaDiaria().multiply(new BigDecimal(consumo.getQuantidadeDeUso()).multiply(new BigDecimal(30)));
    }

    @Override public String getNome() {
        return nome;
    }
}
