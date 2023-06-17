package com.alcme.backend.domain.model;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ContatoTest {

    @Test
    void gettersAndSetters_ValidValues_ReturnsExpectedValues() {
        // Arrange
        String id = "1";
        String nome = "John Doe";
        String email = "john.doe@example.com";
        String telefone = "1234567890";

        Contato contato = new Contato();
        contato.setId(id);
        contato.setNome(nome);
        contato.setEmail(email);
        contato.setTelefone(telefone);

        // Act
        String retrievedId = contato.getId();
        String retrievedNome = contato.getNome();
        String retrievedEmail = contato.getEmail();
        String retrievedTelefone = contato.getTelefone();

        // Assert
        assertEquals(id, retrievedId);
        assertEquals(nome, retrievedNome);
        assertEquals(email, retrievedEmail);
        assertEquals(telefone, retrievedTelefone);
    }
}
