package com.algaworks.algafood;

import com.algaworks.algafood.di.notification.Notificador;
import com.algaworks.algafood.di.notification.NotificadorEmail;
import com.algaworks.algafood.di.service.AtivacaoClienteService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

@Configuration
public class ServiceConfig {

    @Bean
    public AtivacaoClienteService ativacaoClienteService(Notificador notificador){
        return new AtivacaoClienteService(notificador);
    }

}

