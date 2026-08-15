package com.renzo.PjtDio.factory;

import com.renzo.PjtDio.model.Arqueiro;
import com.renzo.PjtDio.model.Guerreiro;
import com.renzo.PjtDio.model.Mago;
import com.renzo.PjtDio.model.Personagem;
import org.springframework.stereotype.Component;


@Component
public class PersonagemFactory {

    public Personagem criar(String tipo, String nome){

        if(tipo.equalsIgnoreCase("MAGO")){
            return new Mago(nome);
        }

        if(tipo.equalsIgnoreCase("GUERREIRO")){
            return new Guerreiro(nome);
        }

        if(tipo.equalsIgnoreCase("ARQUEIRO")){
            return new Arqueiro(nome);
        }

        throw new IllegalArgumentException("Tipo de personagem inválido");
    }

}
