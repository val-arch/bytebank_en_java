package bytebank_java_polimorfismo;
//sobre-Escritura de metodos es un concepto importante de HERENCIA
//Clase número 4 - comienza la HERENCIA. Palabra Reservada "extends"
public class Gerente extends Funcionario {
	
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
	
	// Sobreescritura de metodo (Proviene de la clase Funcionario)
	public double getBonificacion() {//double
		System.out.println("Ejecutando desde GERENTE");
		//modificamos debido a que el metodo se convirtio en abstract
		return super.getSalario() +	this.getSalario() * 0.5;
	}
	
}
