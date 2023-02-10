package com.algaworks.algafood.di.notification;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("notificador.email")//Essa classe representa uma configuração de propriedades. Assim deve ser passado o prefixo das configs
public class NotificadorProperties {

    /**
     * Host do servidor de e-mail
     * **/
    private String hostServidor;

    /**
     * Porta do servidor de e-mail
     * Posso atribuir um valor aqui e ele será usado como padrão.
     * O aplication.properties pode ter um valor diferente em seu host, isso não gerará conflito
     * **/
    private Integer portaServidor;

    public String getHostServidor() {
        return hostServidor;
    }

    public void setHostServidor(String hostServidor) {
        this.hostServidor = hostServidor;
    }

    public Integer getPortaServidor() {
        return portaServidor;
    }

    public void setPortaServidor(Integer portaServidor) {
        this.portaServidor = portaServidor;
    }
}
