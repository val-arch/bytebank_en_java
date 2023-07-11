package bytebank_java_polimorfismo;
//clase numero 6
public class TestGerente {
	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		//Funcionario gerente = new Funcionario();
		gerente.setNombre("Lucas");
		gerente.setDocumento("45454545");
		//gerente.setSalario(5000);
		gerente.setSalario(6000);
		gerente.setClave("AluraCursosOnLine");
		gerente.setTipo(1);
		
		System.out.println("El nombre: " +gerente.getNombre());
		System.out.println("El documento: " +gerente.getDocumento());
		System.out.println("El salario: " +gerente.getSalario());
		System.out.println("La bonificación: " +gerente.getBonificacion());
		System.out.println(gerente.iniciarSesion("AluraCursosOnLine"));
	}
}
