package com.alcme.backend.businessrule.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alcme.backend.businessrule.exception.ValidationException;
import com.alcme.backend.businessrule.message.ErrorMessage;
import com.alcme.backend.interfaceadapter.repository.ContatoRepository;

@Component
public class ContatoValidator {

    @Autowired
    ContatoRepository repository;

    public void validate(String nome, String email, String telefoneContato) {
        if (nome == null || nome.isEmpty()) {
            throw new ValidationException(ErrorMessage.NOME_INVALIDO);
        }
        
        if (email == null || email.isEmpty() || !email.matches("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}")) {
            throw new ValidationException(ErrorMessage.EMAIL_INVALIDO);
        }
        
        if (telefoneContato == null || telefoneContato.isEmpty()) {
            throw new ValidationException(ErrorMessage.TELEFONE_INVALIDO);
        }

            if (repository.existsByEmail(email)) {
            throw new ValidationException(ErrorMessage.CONTATO_USUARIO_CADASTRADO);
        }
    }
}