package com.alcme.backend.interfaceadapter.controller;
import com.alcme.backend.businessrule.usecase.ContatoService;
import com.alcme.backend.domain.model.Contato;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.web.server.ResponseStatusException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

class ContatoControllerTest {

    @Mock
    private ContatoService contatoService;

    @InjectMocks
    private ContatoController contatoController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void criarContato_ValidContato_ReturnsCreatedContato() {
        // Arrange
        Contato contato = new Contato();
        when(contatoService.salvarContato(contato)).thenReturn(contato);

        // Act
        Contato result = contatoController.criarContato(contato);

        // Assert
        assertEquals(contato, result);
        verify(contatoService, times(1)).salvarContato(contato);
    }
    
    @Test
    void buscarTodos_ReturnsListOfContatos() {
        // Arrange
        Iterable<Contato> contatos = mock(Iterable.class);
        when(contatoService.buscarTodos()).thenReturn(contatos);

        // Act
        Iterable<Contato> result = contatoController.buscarTodos();

        // Assert
        assertEquals(contatos, result);
        verify(contatoService, times(1)).buscarTodos();
    }
}
