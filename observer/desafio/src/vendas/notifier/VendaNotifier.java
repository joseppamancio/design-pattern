package vendas.notifier;

import vendas.model.Pedido;
import vendas.observer.VendaObserver;

import java.util.ArrayList;
import java.util.List;

public class VendaNotifier {
    private List<VendaObserver> observers = new ArrayList<>();

    public void adicionarObserver(VendaObserver observer) {
        observers.add(observer);
    }

    public void removerObserver(VendaObserver observer) {
        observers.remove(observer);
    }

    public void notificarObservers(List<Pedido> pedidos) {
        observers.forEach(observer -> observer.notificar(pedidos));
    }
}