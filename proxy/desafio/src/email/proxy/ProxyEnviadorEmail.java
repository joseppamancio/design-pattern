package email.proxy;

import email.EnviadorEmail;
import email.sender.EnviadorEmailMandrill;

import java.util.List;
import java.util.stream.Collectors;

public class ProxyEnviadorEmail implements EnviadorEmail {
    private EnviadorEmailMandrill enviadorEmailMandrill;
    private List<String> listaNegra;

    public ProxyEnviadorEmail(List<String> emails, List<String> listaNegra) {
        this.listaNegra = listaNegra;
        List<String> emailsFiltrados = emails.stream()
                .filter(email -> !listaNegra.contains(email))
                .collect(Collectors.toList());
        this.enviadorEmailMandrill = new EnviadorEmailMandrill(emailsFiltrados);
    }

    @Override
    public void enviar(String mensagem) {
        System.out.println("[LOG] Filtrando e-mails com base na lista negra...");
        enviadorEmailMandrill.enviar(mensagem);
    }
}