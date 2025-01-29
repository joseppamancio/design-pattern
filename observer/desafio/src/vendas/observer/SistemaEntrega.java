package vendas.observer;

import vendas.model.Pedido;

import java.util.List;

public class SistemaEntrega implements VendaObserver {
    @Override
    public void notificar(List<Pedido> pedidos) {
        System.out.println("[Entrega] Reservando caminhão para os pedidos: ");
        pedidos.forEach(pedido -> System.out.println("- " + pedido.getDescricao()));
    }
}