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
	

}
