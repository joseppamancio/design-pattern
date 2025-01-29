package vendas.observer;

import vendas.model.Pedido;

import java.util.List;

public interface VendaObserver {
    void notificar(List<Pedido> pedidos);
}
