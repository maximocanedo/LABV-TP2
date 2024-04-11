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
	@DisplayName("Validar que el correo que contenga una mayuscula.")
	public void testCorreo_MinimoUnaMayuscula_retornaTrue(){
		assertTrue(Email.validarCorreo("Abcdef55"), "No valida correos sin una mayuscula");
	}
	
	@Test
	@DisplayName("Validar cuando el correo no contiene mayusculas")
	public void testCorreo_MinimoUnaMayuscula_retornaFalse(){
		assertFalse(Email.validarCorreo("abcdef55"), "No valida correos con una mayuscula");
	}

}
