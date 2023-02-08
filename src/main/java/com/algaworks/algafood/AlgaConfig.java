package com.algaworks.algafood;

import com.algaworks.algafood.di.notification.NotificadorEmail;
import com.algaworks.algafood.di.service.AtivacaoClienteService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration //Serve como defeinição de beans
public class AlgaConfig {

    @Bean //Indica que o método instancia, configura e inicializa um objeto
    public NotificadorEmail notificadorEmail(){
        NotificadorEmail notificador = new NotificadorEmail("smtp.algamail.com.br");
        notificador.setCaixaAlta(true);

        return notificador;
    }

    @Bean
    public AtivacaoClienteService ativacaoClienteService(){
        return new AtivacaoClienteService(notificadorEmail());
    }

}
