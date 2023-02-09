package com.algaworks.algafood.di.notification;

import com.algaworks.algafood.di.modelo.Cliente;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

//Só notifica por e-mail, se pôr em SMS só vai notificar por sms por reconhecer como primário
//@Primary //Bean principal, assim essa classe de notificação ganha mais prioridade. Resolve ambiguidade
//@Qualifier("urgente") //Qualifica o componente. ("urgente") é o identificador. Deve ser colocado o mesmo onde houver o @Autowired
@TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
@Component //Para ser reconhecida como um componente Spring
@Profile("prod") //Roda na produção. Mas o aplication.proprierties deve ser alterado
public class NotificadorEmail implements Notificador{

    public NotificadorEmail(){
        System.out.println("Notificador Email Real");
    }

    @Override
    public void notificar(Cliente cliente, String mensagem){

        System.out.printf("Notificando %s através do e-mail %s: %s\n",
                cliente.getNome(),cliente.getEmail(),mensagem);
    }

}
