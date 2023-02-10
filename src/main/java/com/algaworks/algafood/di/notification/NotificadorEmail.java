package com.algaworks.algafood.di.notification;

import com.algaworks.algafood.di.modelo.Cliente;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
@Component //Para ser reconhecida como um componente Spring
//@Profile("prod") //Roda na produção. Mas o aplication.proprierties deve ser alterado
//Para funcionar deve mudar o aplication.proproperties
public class NotificadorEmail implements Notificador{

    @Value("${notificador.email.host-servidor}") //Injetando valor usando uma expression do Spring
    private String host;

    @Value("${notificador.email.porta-servidor}")
    private Integer porta;

    @Override
    public void notificar(Cliente cliente, String mensagem){

        System.out.println("Host: "+host+"\nPorta: "+porta);

        System.out.printf("Notificando %s através do e-mail %s: %s\n",
                cliente.getNome(),cliente.getEmail(),mensagem);
    }

}
