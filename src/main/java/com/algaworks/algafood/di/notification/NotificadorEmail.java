package com.algaworks.algafood.di.notification;

import com.algaworks.algafood.di.modelo.Cliente;
import org.springframework.stereotype.Component;

@Component //Para ser reconhecida como um componente Spring
public class NotificadorEmail implements Notificador{

    public NotificadorEmail(){
        System.out.println("Notificadoremail");
    }


    @Override
    public void notificar(Cliente cliente, String menssagem){
        System.out.printf("Notificando %s através do e-mail %s: %s\n",
                cliente.getNome(),cliente.getEmail(), menssagem);
    }
}
