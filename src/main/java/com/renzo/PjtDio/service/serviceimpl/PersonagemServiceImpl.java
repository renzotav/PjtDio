package com.renzo.PjtDio.service.serviceimpl;

import com.renzo.PjtDio.factory.PersonagemFactory;
import com.renzo.PjtDio.model.Personagem;
import com.renzo.PjtDio.service.PersonagemService;
import org.springframework.stereotype.Service;

@Service
public class PersonagemServiceImpl implements PersonagemService {

    private final PersonagemFactory personagemFactory;

    public PersonagemServiceImpl(PersonagemFactory personagemFactory){
        this.personagemFactory = personagemFactory;
    }

    @Override
    public Personagem criarPersonagem(String tipo, String nome) {
        return personagemFactory.criar(tipo, nome);
    }
}
