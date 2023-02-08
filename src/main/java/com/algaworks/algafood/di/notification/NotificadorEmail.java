package com.algaworks.algafood.di.notification;

import com.algaworks.algafood.di.modelo.Cliente;
import org.springframework.stereotype.Component;

//@Component //Para ser reconhecida como um componente Spring //Se não tivesse o AlgaConfig
public class NotificadorEmail implements Notificador{

    private boolean caixaAlta;
    private String hostServidorSmtp;

    public NotificadorEmail(String hostServidorSmtp){
        this.hostServidorSmtp = hostServidorSmtp;
        System.out.println("Notificadoremail");
    }


    @Override
    public void notificar(Cliente cliente, String mensagem){

        if(this.caixaAlta){
            mensagem = mensagem.toUpperCase();
        }

        System.out.printf("Notificando %s através do e-mail %s usando SMTP %s: %s\n",
                cliente.getNome(),cliente.getEmail(), this.hostServidorSmtp,mensagem);
    }

    public void setCaixaAlta(boolean caixaAlta) {
        this.caixaAlta = caixaAlta;
    }
}
