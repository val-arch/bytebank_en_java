package bytebank_java_polimorfismo;
//clase numero 9
public class TestControlBonificacion {
	public static void main(String[] args) {
		Funcionario diego = new Funcionario();
		diego.setSalario(2000);
		diego.setNombre("Diego");
		Funcionario diego2 = new Funcionario();
		diego2.setSalario(3000);
		
		Gerente jimena = new Gerente();
		jimena.setSalario(10000);
		Gerente jimena2 = new Gerente();
		jimena2.setSalario(5000);
		
		ControlBonificacion controlBonificacion = new ControlBonificacion();
		controlBonificacion.registrarSalario(diego);
		controlBonificacion.registrarSalario(jimena2);
		controlBonificacion.registrarSalario(diego2);
		controlBonificacion.registrarSalario(jimena);
		
	}
}
