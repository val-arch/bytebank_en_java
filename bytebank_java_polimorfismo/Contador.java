package bytebank_java_polimorfismo;
//Clase número 10
public class Contador extends Funcionario {
	@Override
	public double getBonificacion() {
		System.out.println("Ejecutando desde Contador");
		return 200;
	}
}
