package com.algaworks.algafood.di.service;

import com.algaworks.algafood.di.modelo.Cliente;
import com.algaworks.algafood.di.notification.NivelUrgencia;
import com.algaworks.algafood.di.notification.Notificador;
import com.algaworks.algafood.di.notification.TipoDoNotificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//O ideal é usar pontos de injeção no construtor, para identificar as depend~encias daquela classe
//No atributo, ele dificulta os testes

@Component
public class AtivacaoClienteService {

    //@Qualifier("urgente") //O id facilita a alteração no @Autowared
    @TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
    @Autowired(required = false) //Ponto de injeção via atributo
    //O required false faz com que não dependa do component em NotificadorEmail
    //Se descomentar o @component do NotificadorEmail, o if lá embaixo vai ser ativadoNotificadorEmail
    public Notificador notificador;

    /*
    @Autowired //Definindo para o Spring entender que é  construtor padrão para instanciar
    // (quando há mais de um construtor)
    public AtivacaoClienteService(Notificador notificador) {
        this.notificador = notificador;
    }*/

    /*
    @Autowired //Ponto de injeção via Setter
    public void setNotificador(Notificador notificador) {
        this.notificador = notificador;
    }*/

    public void ativar(Cliente cliente){
        cliente.ativar();

        notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");

        //Para receber com mais de um notificador, no atributo precisa pôr List<Notificador>
        /*for(Notificador notificador : notificadores){
            notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
        }*/

        //Se for usado sem lista de Notificador, ou seja, com apenas uma das classes (NotificadorSMS ou NotificadorEmail)
        /*if(notificador != null){
            notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
        }else {
            System.out.println("Não existe notificador, mas  cliente foi ativado!");
        }*/
    }

}
