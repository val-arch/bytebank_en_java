package bytebank_java_polimorfismo;

//clase numero 5
public class TestFuncionario {
	public static void main(String[] args) {
		Funcionario diego = new Contador();//"Funcionario" Al ser clase abstracta no puede ser instanciada como tal,
		//al ser abstracta es una representación conceptual pero no puede ser representacion fisica del objeto.
		//Si quieres una instancia, tienes que darme una representacion fisica o real del objeto. entonces podemos elegir Contador o Gerente en lugar de "Funcionario"
		diego.setNombre("Diego");
		diego.setDocumento("444556665");
		diego.setSalario(2000);
		diego.setTipo(0);
		
		System.out.println(diego.getNombre());
		System.out.println(diego.getDocumento());
		System.out.println(diego.getSalario());
		System.out.println(diego.getBonificacion());
	}
}
