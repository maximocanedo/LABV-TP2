package frgp.utn.edu.ar.packageTest;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import frgp.utn.edu.ar.entidad.*;

import org.junit.jupiter.api.Test;

class EmailTest {

	@Test
	@DisplayName("Validar correos con al menos un número. ")
	public void testCorreo__AlMenosUnNumero__retornaTrue() {
		assertTrue(Email.validarCorreo("abcDEFG1"), "No valida correos con al menos un número");
	}
	
	@Test
	@DisplayName("Validar correos que no tengan números. ")
	public void testCorreo__AlMenosUnNumero__retornaFalse() {
		assertFalse(Email.validarCorreo("abcDEFGh"), "No valida correos sin números");
	}
	
	@Test
    @DisplayName("Validar que el correo tenga menos de 8 caracteres")
    public void testCorreoConMenosDeOchoCaracteres_retornaFalse() {
        assertTrue(Email.validarCorreo("abcDEF16871"), "No valida correos con menos de 8 caracteres");
    }

    @Test
    @DisplayName("Validar que el correo tenga mas de 8 caracteres")
    public void testCorreoConMasDeOchoCaracteres_retornaTrue() {
    	assertFalse(Email.validarCorreo("abcdef2256987105"), "No valida correos con más de 8 caracteres");
    }

    @Test
    @DisplayName("Validar que el correo tenga exactamente 8 caracteres")
    public void testCorreoConOchoCaracteres_retornaTrue() {
        assertTrue(Email.validarCorreo("abcDEFG12345697"), "No valida correos con exactamente 8 caracteres");
    }

	

}
