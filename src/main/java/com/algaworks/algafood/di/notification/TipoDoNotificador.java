package com.algaworks.algafood.di.notification;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME) //A anotação vai ser lida em tempo de excução
@Qualifier
public @interface TipoDoNotificador {

    NivelUrgencia value(); //Valor padrão



}
