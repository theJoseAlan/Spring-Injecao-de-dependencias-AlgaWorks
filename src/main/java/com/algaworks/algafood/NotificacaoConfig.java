package com.algaworks.algafood;

import com.algaworks.algafood.di.notification.NotificadorEmail;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NotificacaoConfig {

    @Bean //Indica que o método instancia, configura e inicializa um objeto
    public NotificadorEmail notificadorEmail(){
        NotificadorEmail notificador = new NotificadorEmail("smtp.algamail.com.br");
        notificador.setCaixaAlta(true);

        return notificador;
    }

}
