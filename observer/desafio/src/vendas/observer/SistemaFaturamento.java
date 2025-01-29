package vendas.observer;

import vendas.model.Pedido;

import java.util.List;

public class SistemaFaturamento implements VendaObserver {
    @Override
    public void notificar(List<Pedido> pedidos) {
        double total = pedidos.stream().mapToDouble(Pedido::getValor).sum();
        System.out.println("[Faturamento] Total faturado: R$ " + total);
    }
}
