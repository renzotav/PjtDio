package com.renzo.PjtDio.controller;

import com.renzo.PjtDio.model.Personagem;
import com.renzo.PjtDio.service.PersonagemService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/personagens")
public class PersonagemController {


    private final PersonagemService personagemService;

    public PersonagemController(PersonagemService personagemService){
        this.personagemService = personagemService;

    }

    @PostMapping
    public Personagem criar(
            @RequestParam String tipo,
            @RequestParam String nome) {

        return personagemService.criarPersonagem(tipo, nome);
    }

}
