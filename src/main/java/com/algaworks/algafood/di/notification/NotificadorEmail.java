package com.algaworks.algafood.di.notification;

import com.algaworks.algafood.di.modelo.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
@Component //Para ser reconhecida como um componente Spring
//@Profile("prod") //Roda na produção. Mas o aplication.proprierties deve ser alterado
//Para funcionar deve mudar o aplication.proproperties
public class NotificadorEmail implements Notificador{

    @Autowired
    private NotificadorProperties properties;

    @Override
    public void notificar(Cliente cliente, String mensagem){

        System.out.println("Host: "+properties.getHostServidor()+"\nPorta: "+properties.getPortaServidor());

        System.out.printf("Notificando %s através do e-mail %s: %s\n",
                cliente.getNome(),cliente.getEmail(),mensagem);
    }

}
