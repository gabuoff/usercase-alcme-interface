package com.alcme.backend.businessrule.message;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ErrorMessageTest {

    @Test
    public void testNomeInvalidoErrorMessage() {
         String nome = ErrorMessage.NOME_INVALIDO;
        assertEquals("O nome é inválido.", nome);
    }

    @Test
    public void testEmailInvalidoErrorMessage() {
        assertEquals("O email é inválido.", ErrorMessage.EMAIL_INVALIDO);
    }

    @Test
    public void testTelefoneInvalidoErrorMessage() {
        assertEquals("O telefone é inválido.", ErrorMessage.TELEFONE_INVALIDO);
    }

    @Test
    public void testContatoUsuarioCadastradoErrorMessage() {
        assertEquals("Contato do usuário já cadastrado.", ErrorMessage.CONTATO_USUARIO_CADASTRADO);
    }
}
