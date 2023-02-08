package com.algaworks.algafood.di.notification;

import com.algaworks.algafood.di.modelo.Cliente;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//Só notifica por e-mail, se pôr em SMS só vai notificar por sms por reconhecer como primário
@Primary //Bean principal, assim essa classe de notificação ganha mais prioridade. Resolve ambiguidade
@Component //Para ser reconhecida como um componente Spring
public class NotificadorEmail implements Notificador{


    @Override
    public void notificar(Cliente cliente, String mensagem){

        System.out.printf("Notificando %s através do e-mail %s: %s\n",
                cliente.getNome(),cliente.getEmail(),mensagem);
    }

}
