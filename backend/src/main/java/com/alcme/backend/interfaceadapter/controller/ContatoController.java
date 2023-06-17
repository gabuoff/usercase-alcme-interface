package com.alcme.backend.interfaceadapter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.alcme.backend.businessrule.usecase.ContatoService;
import com.alcme.backend.domain.model.Contato;

@RestController
@RequestMapping("/contatos")
public class ContatoController {

    @Autowired
    ContatoService contatoService;

    @PostMapping("/criar")
    @ResponseStatus(HttpStatus.CREATED)
    public Contato criarContato(@RequestBody Contato contato) {
        return contatoService.salvarContato(contato);
    }

    @GetMapping("/buscar-todos")
    @ResponseStatus(HttpStatus.OK)
    public Iterable<Contato> buscarTodos() {
        return contatoService.buscarTodos();
    }
}