package com.algaworks.algafood.di.notification;

import com.algaworks.algafood.di.modelo.Cliente;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
@Component
@Profile("dev") //Roda no desenvolvimento. Mas o aplication.proprierties deve ser alterado
public class NotificadoremailMock implements Notificador{

    public NotificadoremailMock() {
        System.out.println("Notificador Email Mock");
    }

    @Override
    public void notificar(Cliente cliente, String mensagem){

        System.out.printf("MOCK: Notificação seria enviada para %s através do e-mail %s: %s\n",
                cliente.getNome(),cliente.getEmail(),mensagem);
    }

}
