package bytebank_java_polimorfismo;
//clase 20
//toda la lógica de autenticación, esta en esta clase.
public class AutenticacionUtil {
	
	private String clave;
	
	public boolean iniciarSesion(String clave) {
		return this.clave == clave;
	}
	
	public void setClave(String clave) {
		this.clave = clave;
	}
}
