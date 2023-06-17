package com.alcme.backend.domain.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "contatos")
public class Contato {
    
    @Id
    private String id;

    @JsonProperty("name")
    private String nome;
    
    @JsonProperty("email")
    private String email;

    @JsonProperty("phone")
    private String telefone;
}