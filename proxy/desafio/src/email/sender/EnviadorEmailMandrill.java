package email.sender;

import email.EnviadorEmail;

import java.util.List;

public class EnviadorEmailMandrill implements EnviadorEmail {
    private List<String> emails;

    public EnviadorEmailMandrill(List<String> emails) {
        this.emails = emails;
    }

    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando mensagem para os seguintes e-mails: " + emails);
        System.out.println("Mensagem: " + mensagem);
    }
}