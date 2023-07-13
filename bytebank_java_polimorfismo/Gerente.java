package bytebank_java_polimorfismo;
//sobre-Escritura de metodos es un concepto importante de HERENCIA
//Clase número 4 - comienza la HERENCIA. Palabra Reservada "extends"
public class Gerente extends FuncionarioAutenticable {
		
	// Sobreescritura de metodo (Proviene de la clase Funcionario)
	public double getBonificacion() {//double
		System.out.println("Ejecutando desde GERENTE");
		//modificamos debido a que el metodo se convirtio en abstract
		return 2000;
	}
	
}
