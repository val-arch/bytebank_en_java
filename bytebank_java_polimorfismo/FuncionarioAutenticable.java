package bytebank_java_polimorfismo;
//clase 18
public class FuncionarioAutenticable extends Funcionario {
	//ahora todo funcionario autenticable , va a tener una clave y va a poder iniciar serión
	
	private String clave;

	public void setClave(String clave) {
		this.clave = clave;
	}
	
	public boolean iniciarSesion(String clave) {
		return clave == "AluraCursosOnLine";
	}

	@Override
	public double getBonificacion() {
		// TODO Auto-generated method stub
		return 0;
	}
}
