package frgp.utn.edu.ar.packageTest;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import frgp.utn.edu.ar.entidad.Email;

class EmailTest {

	@Test
	@DisplayName("Validar correos con al menos un número. ")
	public void testCorreo__AlMenosUnNumero__retornaTrue() {
		assertTrue(Email.validarCorreo("abcDEFG1"), "No valida correos con al menos un número");
	}
	
	@Test
	@DisplayName("Validar correos que no tengan numeros. ")
	public void testCorreo__AlMenosUnNumero__retornaFalse() {
		assertFalse(Email.validarCorreo("abcDEFGh"), "No valida correos sin números");
	}
	
	@Test
    @DisplayName("Validar que el correo tenga menos de 8 numeros")
    public void testCorreoConMenosDeOchoCaracteres_retornaTrue() {
        assertTrue(Email.validarCorreo("abcDEF16871"), "No valida correos con menos de 8 caracteres");
    }

    @Test
    @DisplayName("Validar que el correo tenga mas de 8 numeros")
    public void testCorreoConMasDeOchoCaracteres_retornaFalse() {
    	assertFalse(Email.validarCorreo("abcdef2256987105"), "No valida correos con más de 8 caracteres");
    }

    @Test
    @DisplayName("Validar que el correo tenga exactamente 8 numeros y ningun otro caracter")
    public void testCorreoConOchoNumerosSinLetras_retornaFalse() {
        assertFalse(Email.validarCorreo("87654321"), "No valida correos con exactamente 8 números sin letras");
    }
    
    @Test
    void correoSieteCaracteresCon_Mayuscula_Minuscula_Numero_CaraterAlfanumerico_retornaFalse() {
        assertFalse(Email.validarCorreo("Patr.12"), "No valida correos con 7 caracteres y todas las condiciones");
    }

    @Test
    void correoOchoCaracteresCon_Mayuscula_Minuscula_Numero_CaraterAlfanumerico_retornaTrue() {
        assertTrue(Email.validarCorreo("Patr12@."), "No valida correos con 8 caracteres y todas las condiciones");
    }

    @Test
    void correoMasDeOchoCaracteresCon_Mayuscula_Minuscula_Numero_CaraterAlfanumerico_retornaTrue() {
        assertTrue(Email.validarCorreo("Patricio123@gmail.com"), "No valida correos con mas de 8 caracteres y todas las condiciones");
    }


    @Test
    @DisplayName("Validar que el correo tenga exactamente 8 numeros")
    public void testCorreoConOchoCaracteres_retornaTrue() {
        assertTrue(Email.validarCorreo("abcDEFG12345697"), "No valida correos con exactamente 8 caracteres");
    }

    @Test
	@DisplayName("Validar que el correo contenga minimo una mayuscula.")
	public void testCorreo_MinimoUnaMayuscula_retornaTrue(){
		assertTrue(Email.validarCorreo("Abcdef55"), "No valida correos sin mayuscula");
	}
	
	@Test
	@DisplayName("Validar cuando el correo no contiene mayusculas")
	public void testCorreo_MinimoUnaMayuscula_retornaFalse(){
		assertFalse(Email.validarCorreo("abcdef55"), "No valida correos con mayuscula");
	}
	
	@Test
	@DisplayName("Validar que el correo que contenga mas de 3 mayusculas.")
	public void testCorreo_TresMayusculas_retornaTrue(){
		assertTrue(Email.validarCorreo("ABCDef55"), "No valida correos sin mayuscula");
	}
    
    @Test
	@DisplayName("Validar cuando el correo contiene todas mayusculas.")
	public void testCorreo_TodasMayusculas_retornaFalse(){
		assertFalse(Email.validarCorreo("ABCDEF55"), "No valida correos sin todas las letras mayusculas");
	}
	
    @Test
	@DisplayName("Validar que el correo contenga minimo una minúscula.")
	public void testCorreo_MinimoUnaMinuscula_retornaTrue(){
		assertTrue(Email.validarCorreo("ABcDEF123"), "No valida correos con una minúscula.");
	}
	
	@Test
	@DisplayName("Validar cuando el correo no contiene minúsculas.")
	public void testCorreo_MinimoUnaMinuscula_retornaFalse(){
		assertFalse(Email.validarCorreo("ABCDEF123"), "No valida correos sin minúsculas.");
	}
	
	@Test
	@DisplayName("Validar que el correo que contenga mas de tres minúsculas.")
	public void testCorreo_TresMinusculas_retornaTrue(){
		assertTrue(Email.validarCorreo("abcDEF123"), "No valida correos con tres minúsculas.");
	}
    
    @Test
	@DisplayName("Validar cuando el correo contiene todas letras minúsculas.")
	public void testCorreo_TodasMinusculas_retornaFalse(){
		assertFalse(Email.validarCorreo("abcdef123"), "No valida correos con todas minúsculas.");
	}
}
