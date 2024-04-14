package frgp.utn.edu.ar.entidad;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {

	private String correo;
	
	public Email(String correo)
	{
	   this.correo = correo;
	}

	public static boolean validarCorreo(String correo) {
        String regex = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[a-z])(?=.*[a-zA-Z0-9]).{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(correo);
        return matcher.matches();
    }
	
	@Override
	public String toString() {
		return "Email [correo=" + correo + "]";
	}
}

