package vendas;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import org.w3c.dom.*;
import vendas.model.Pedido;
import vendas.observer.SistemaEntrega;
import vendas.observer.SistemaFaturamento;
import vendas.notifier.VendaNotifier;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Leitura do arquivo XML
            File file = new File("desafio/src/resources/pedidos.xml");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(file);

            NodeList pedidoNodes = doc.getElementsByTagName("pedido");
            List<Pedido> pedidos = new ArrayList<>();

            for (int i = 0; i < pedidoNodes.getLength(); i++) {
                Node node = pedidoNodes.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    String descricao = element.getElementsByTagName("descricao").item(0).getTextContent();
                    double valor = Double.parseDouble(element.getElementsByTagName("valor").item(0).getTextContent());
                    pedidos.add(new Pedido(descricao, valor));
                }
            }

            // Configuração dos observadores
            VendaNotifier notifier = new VendaNotifier();
            notifier.adicionarObserver(new SistemaEntrega());
            notifier.adicionarObserver(new SistemaFaturamento());

            // Notificação
            notifier.notificarObservers(pedidos);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}