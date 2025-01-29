import venda.factory.LojaFactory;
import venda.factory.ModuloVendaFactory;
import venda.Venda;

public class Main {
    public static void main(String[] args) {
        ModuloVendaFactory factory = new LojaFactory();
        Venda venda = new Venda(factory);
        venda.realizar();
    }
}
