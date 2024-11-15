package br.com.cantaruttim.arquitetura.todos;

import org.springframework.stereotype.Component;

@Component
public class EmailSender {
    
    public void enviar(String mensagem){
        System.out.println("Enviado email: " + mensagem);
    }
}
