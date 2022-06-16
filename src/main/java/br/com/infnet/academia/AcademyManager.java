package br.com.infnet.academia;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AcademyManager {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(1l, "João da Silva Santos", "123456789-10");
        List<Consumo> listaDeConsumo = new ArrayList<>();

        listaDeConsumo.add(new Consumo(new BigDecimal(10), new PlanoDiario(), 2));
        listaDeConsumo.add(new Consumo(new BigDecimal(6), new PlanoMensal(), 1));
        listaDeConsumo.add(new Consumo(new BigDecimal(35), new AulaBoxe(), 1));

        Fatura fatura = new Fatura(cliente, listaDeConsumo);
//        System.out.println(fatura.calcularValorTotal());

        Impressao impressao = new Impressao();
        impressao.imprimir(fatura);
    }
}
