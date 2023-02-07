package com.algaworks.algafood.di.notification;

import com.algaworks.algafood.di.modelo.Cliente;

public interface Notificador {
    void notificar(Cliente cliente, String menssagem);
}
