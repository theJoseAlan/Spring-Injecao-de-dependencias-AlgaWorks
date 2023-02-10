package com.algaworks.algafood.di.notification;

import com.algaworks.algafood.di.modelo.Cliente;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
@Component //Para ser reconhecida como um componente Spring
@Profile("prod") //Roda na produção. Mas o aplication.proprierties deve ser alterado
//Para funcionar, o seguinte código deve ficar no aplication.properties:  e descomentar o serviceConfig
public class NotificadorEmail implements Notificador{

    public NotificadorEmail(){
        //System.out.println("Notificador Email Real");
    }

    @Override
    public void notificar(Cliente cliente, String mensagem){

        System.out.printf("Notificando %s através do e-mail %s: %s\n",
                cliente.getNome(),cliente.getEmail(),mensagem);
    }

}
