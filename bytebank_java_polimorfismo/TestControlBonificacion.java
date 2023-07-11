package bytebank_java_polimorfismo;
//clase numero 9
public class TestControlBonificacion {
	public static void main(String[] args) {
		Funcionario diego = new Contador();//"Funcionario" Al ser clase abstracta no puede ser instanciada como tal,
		//al ser abstracta es una representación conceptual pero no puede ser representacion fisica del objeto.
		//Si quieres una instancia, tienes que darme una representacion fisica o real del objeto. entonces podemos elegir Contador o Gerente en lugar de "Funcionario"
		diego.setSalario(2000);
		/*Funcionario diego2 = new Funcionario();
		diego2.setSalario(3000);*/
		
		Gerente jimena = new Gerente();
		jimena.setSalario(10000);
		/*Gerente jimena2 = new Gerente();
		jimena2.setSalario(5000);*/
		
		Contador alexiz = new Contador();
		alexiz.setSalario(5000);
				
		ControlBonificacion controlBonificacion = new ControlBonificacion();
		controlBonificacion.registrarSalario(diego);
		//controlBonificacion.registrarSalario(jimena2);
		//controlBonificacion.registrarSalario(diego2);
		controlBonificacion.registrarSalario(jimena);
		controlBonificacion.registrarSalario(alexiz);
		
	}
}
