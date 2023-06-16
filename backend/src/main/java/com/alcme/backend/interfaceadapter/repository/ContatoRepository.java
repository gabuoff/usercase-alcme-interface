package com.alcme.backend.interfaceadapter.repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.alcme.backend.domain.model.Contato;

public interface ContatoRepository extends MongoRepository<Contato, String> {
     boolean existsByEmail(String email);
}
