package bytebank_java_polimorfismo;
//clase 18
public class FuncionarioAutenticable {
	//ahora todo funcionario autenticable , va a tener una clave y va a poder iniciar serión
	
	private String clave;

	public void setClave(String clave) {
		this.clave = clave;
	}
	
	public boolean iniciarSesion(String clave) {
		return clave == "AluraCursosOnLine";
	}
}
