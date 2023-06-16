package com.alcme.backend.businessrule.usecase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alcme.backend.businessrule.validator.ContatoValidator;
import com.alcme.backend.domain.model.Contato;
import com.alcme.backend.interfaceadapter.repository.ContatoRepository;

@Service
public class ContatoService {

    @Autowired
    ContatoRepository repository;

    @Autowired
    ContatoValidator validator;

    public Contato salvarContato(Contato contato) {
        validator.validate(contato.getNome(), contato.getEmail(), contato.getTelefone());
        return repository.save(contato);
    }
}