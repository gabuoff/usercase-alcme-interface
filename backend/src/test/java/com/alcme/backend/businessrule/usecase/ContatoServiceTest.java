package com.alcme.backend.businessrule.usecase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.alcme.backend.businessrule.exception.ValidationException;
import com.alcme.backend.businessrule.validator.ContatoValidator;
import com.alcme.backend.domain.model.Contato;
import com.alcme.backend.interfaceadapter.repository.ContatoRepository;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

public class ContatoServiceTest {

    @Mock
    private ContatoRepository repository;

    @Mock
    private ContatoValidator validator;

    @InjectMocks
    private ContatoService contatoService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testSalvarContato_ValidContato_CallsValidatorAndRepositorySave() {
        Contato contato = new Contato();
        contato.setNome("John Doe");
        contato.setEmail("john.doe@example.com");
        contato.setTelefone("123456789");

        contatoService.salvarContato(contato);

        verify(validator).validate("John Doe", "john.doe@example.com", "123456789");
        verify(repository).save(contato);
    }

    @Test
    public void testSalvarContato_InvalidContato_ThrowsValidationException() {
        Contato contato = new Contato();
        contato.setNome(null);
        contato.setEmail("invalid.email");
        contato.setTelefone("");

        doThrow(ValidationException.class).when(validator).validate(null, "invalid.email", "");

        assertThrows(ValidationException.class, () -> contatoService.salvarContato(contato));
        verify(repository, never()).save(contato);
    }

    @Test
    public void testBuscarTodos_CallsRepositoryFindAll() {
        contatoService.buscarTodos();

        verify(repository).findAll();
    }
}
