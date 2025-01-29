import email.EnviadorEmail;
import email.proxy.ProxyEnviadorEmail;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Lista de e-mails originais
        List<String> emails = Arrays.asList("user1@example.com", "blocked@example.com", "user2@example.com");

        // Lista negra simulada carregada de um XML (aqui definida como exemplo)
        List<String> listaNegra = Arrays.asList("blocked@example.com");

        // Criando o Proxy e enviando e-mails
        EnviadorEmail proxyEnviador = new ProxyEnviadorEmail(emails, listaNegra);
        proxyEnviador.enviar("Esta é uma mensagem de teste.");
    }
}