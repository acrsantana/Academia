package br.com.infnet.academia;

import java.math.BigDecimal;

public interface Servico {

    public BigDecimal calcularValor(Consumo consumo);
    public String getNome();
}
