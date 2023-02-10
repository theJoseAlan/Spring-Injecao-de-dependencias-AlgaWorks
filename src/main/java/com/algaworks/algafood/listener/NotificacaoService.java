package com.algaworks.algafood.listener;

import com.algaworks.algafood.di.notification.NivelUrgencia;
import com.algaworks.algafood.di.notification.Notificador;
import com.algaworks.algafood.di.notification.TipoDoNotificador;
import com.algaworks.algafood.di.service.ClienteAtivadoEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

//"Captura" os eventos disparados
@Component
public class NotificacaoService {

    @TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
    @Autowired
    private Notificador notificador;

    @EventListener
    public void clienteAtivadoListener(ClienteAtivadoEvent event){
        notificador.notificar(event.getCliente(), "Seu cadastro no sistema agora está ativo!");
    }

}
