package com.algaworks.algafood.di.service;

import com.algaworks.algafood.di.modelo.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

//O ideal é usar pontos de injeção no construtor, para identificar as depend~encias daquela classe
//No atributo, ele dificulta os testes

@Component
public class AtivacaoClienteService {

    //Permite publicar evento. Isso serve para disparar o ClienteAtivadoEvent
    @Autowired
    private ApplicationEventPublisher eventPublisher;

    public void ativar(Cliente cliente){
        cliente.ativar();

        eventPublisher.publishEvent(new ClienteAtivadoEvent(cliente));

    }

}
