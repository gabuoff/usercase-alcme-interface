package com.alcme.backend.interfaceadapter.repository;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

@DataMongoTest
class ContatoRepositoryTest {

    @MockBean
    private ContatoRepository contatoRepository;


    @Test
    void existsByEmail_ExistingEmail_ReturnsTrue() {
        // Arrange
        String email = "test@example.com";
        when(contatoRepository.existsByEmail(email)).thenReturn(true);

        // Act
        boolean result = contatoRepository.existsByEmail(email);

        // Assert
        assertTrue(result);
    }

    @Test
    void existsByEmail_NonExistingEmail_ReturnsFalse() {
        // Arrange
        String email = "test@example.com";
        when(contatoRepository.existsByEmail(email)).thenReturn(false);

        // Act
        boolean result = contatoRepository.existsByEmail(email);

        // Assert
        assertFalse(result);
    }
}
