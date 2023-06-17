package com.alcme.backend.businessrule.validator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.alcme.backend.businessrule.exception.ValidationException;
import com.alcme.backend.interfaceadapter.repository.ContatoRepository;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

public class ContatoValidatorTest {

    @Mock
    private ContatoRepository repository;

    @InjectMocks
    private ContatoValidator validator;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testValidate_WithValidData_ShouldNotThrowException() {
        // Arrange
        String nome = "John Doe";
        String email = "john.doe@example.com";
        String telefoneContato = "123456789";

        // Act & Assert
        assertDoesNotThrow(() -> validator.validate(nome, email, telefoneContato));
    }

    @Test
    public void testValidate_WithInvalidName_ShouldThrowValidationException() {
        // Arrange
        String nome = "";
        String email = "john.doe@example.com";
        String telefoneContato = "123456789";

        // Act & Assert
        assertThrows(ValidationException.class, () -> validator.validate(nome, email, telefoneContato));
    }

    @Test
    public void testValidate_WithInvalidEmail_ShouldThrowValidationException() {
        // Arrange
        String nome = "John Doe";
        String email = "invalid_email";
        String telefoneContato = "123456789";

        // Act & Assert
        assertThrows(ValidationException.class, () -> validator.validate(nome, email, telefoneContato));
    }

    @Test
    public void testValidate_WithExistingEmail_ShouldThrowValidationException() {
        // Arrange
        String nome = "John Doe";
        String email = "john.doe@example.com";
        String telefoneContato = "123456789";

        // Mock the behavior of the repository
        when(repository.existsByEmail(email)).thenReturn(true);

        // Act & Assert
        assertThrows(ValidationException.class, () -> validator.validate(nome, email, telefoneContato));
    }

    @Test
public void testValidate_WithInvalidTelefoneContato_ShouldThrowValidationException() {
    // Arrange
    String nome = "John Doe";
    String email = "john.doe@example.com";
    String telefoneContato = "";

    // Act & Assert
    assertThrows(ValidationException.class, () -> validator.validate(nome, email, telefoneContato));
}


    @Test
public void testValidate_WithInvalidNomeNull_ShouldThrowValidationException() {
    // Arrange
    String nome = null;
    String email = "john.doe@example.com";
    String telefoneContato = "";

    // Act & Assert
    assertThrows(ValidationException.class, () -> validator.validate(nome, email, telefoneContato));
}

   @Test
public void testValidate_WithInvalidTelefoneContatoNull_ShouldThrowValidationException() {
    // Arrange
    String nome = "John Doe";
    String email = "john.doe@example.com";
    String telefoneContato = null;

    // Act & Assert
    assertThrows(ValidationException.class, () -> validator.validate(nome, email, telefoneContato));
}

  @Test
    public void testValidate_WithExistingEmailNull_ShouldThrowValidationException() {
        // Arrange
        String nome = "John Doe";
        String email = null;
        String telefoneContato = "123456789";

        // Act & Assert
        assertThrows(ValidationException.class, () -> validator.validate(nome, email, telefoneContato));
    }

}
