package com.algaworks.algafood.di.notification;

import com.algaworks.algafood.di.modelo.Cliente;
import org.springframework.stereotype.Component;

//@Qualifier("normal") //Esse id é interessante para indicar a prioridade //Essa anotação foi substituida pela nossa (@TipoDoNotificador)
@TipoDoNotificador(NivelUrgencia.URGENTE)
@Component //Para ser reconhecida como um componente Spring
public class NotificadorSMS implements Notificador{


    @Override
    public void notificar(Cliente cliente, String mensagem){

        System.out.printf("Notificando %s por SMS através do telefone %s: %s\n",
                cliente.getNome(),cliente.getTelefone(),mensagem);
    }

}
