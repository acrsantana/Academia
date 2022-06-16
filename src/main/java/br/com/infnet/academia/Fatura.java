package br.com.infnet.academia;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Fatura implements Imprimivel {

    private List<Consumo> listaDeConsumo;
    private Cliente cliente;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Fatura(Cliente cliente, List<Consumo> listaDeConsumo) {
        this.cliente = cliente;
        this.listaDeConsumo = listaDeConsumo;
    }

    public BigDecimal calcularValorTotal() {
        BigDecimal valor = BigDecimal.ZERO;
        for (Consumo consumo : listaDeConsumo) {
            valor = valor.add(consumo.getServico().calcularValor(consumo));
        }
        return valor;
    }

    @Override public StringBuilder imprimir() {
        DecimalFormat decFormat = new DecimalFormat("'R$ ' #,###,##0.00");
        StringBuilder sb = new StringBuilder();
        sb.append("==========================================\n");
        sb.append("Fatura do cliente: " + cliente.getNome() + "\n");
        sb.append("Data de emissão: " + formatter.format(LocalDate.now()) + "\n");
        sb.append("------------------------------------------\n");
        sb.append("\n");
        sb.append("Consumo\t\t\tQtd\t\t\tValor\n");
        for (Consumo consumo : listaDeConsumo) {
            sb.append(consumo.getServico().getNome() + "\t" +
                consumo.getQuantidadeDeUso() + "\t\t\t" +
                decFormat.format(consumo.getServico().calcularValor(consumo)) + "\n");
        }
        sb.append("\n");
        sb.append("------------------------------------------\n");
        sb.append("Valor total: " + decFormat.format(calcularValorTotal()));
        sb.append("\n");
        sb.append("==========================================\n");
        return sb;
    }
}
