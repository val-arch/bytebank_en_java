package bytebank_java_polimorfismo;
//sobre-Escritura de metodos es un concepto importante de HERENCIA
//Clase número 4 - comienza la HERENCIA. Palabra Reservada "extends"
//se aplica lo mismo que en la clase Administrador. Gerente extiende de Funcionario e implementa de Autenticable y tambien implementa sus metodos
public class Gerente extends Funcionario implements Autenticable {
		
	// Sobreescritura de metodo (Proviene de la clase Funcionario)
	public double getBonificacion() {//double
		System.out.println("Ejecutando desde GERENTE");
		//modificamos debido a que el metodo se convirtio en abstract
		return 2000;
	}

	@Override
	public void setClave(String clave) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean iniciarSesion(String clave) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
