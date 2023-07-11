package bytebank_java_polimorfismo;

//clase numero 5
public class TestFuncionario {
	public static void main(String[] args) {
		Funcionario diego = new Funcionario();
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
