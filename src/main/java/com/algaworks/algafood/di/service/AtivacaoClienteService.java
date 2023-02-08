package com.algaworks.algafood.di.service;

import com.algaworks.algafood.di.modelo.Cliente;
import com.algaworks.algafood.di.notification.Notificador;
import com.algaworks.algafood.di.notification.NotificadorEmail;
import org.springframework.stereotype.Component;

//@Component
public class AtivacaoClienteService {

    public Notificador notificador;

    public AtivacaoClienteService(Notificador notificador) {
        this.notificador = notificador;

        System.out.println("AtivacaoClienteService "+notificador);
    }

    public void ativar(Cliente cliente){
        cliente.ativar();

        notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
    }

}
