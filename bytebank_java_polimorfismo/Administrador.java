package bytebank_java_polimorfismo;
//clase 16
public class Administrador extends Funcionario {
	
	private String clave;

	/*public String getClave() {
		return clave;
	}*/

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
