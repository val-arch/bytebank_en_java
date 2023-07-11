package bytebank_java_polimorfismo;

//Clase número 3
public abstract class Funcionario {//se le acaba de dar una nueva funcionalidad a Funcionario debido a que es clase abstracta y ya no se puede instanciar directamente
	
	private String nombre;
	private String documento;
	private double salario;
	private int tipo;

	public Funcionario() {

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	// este metodo se sobreescribe en la clase Gerente
	public double getBonificacion() {
		System.out.println("Ejecutando desde clase madre FUNCIONARIO");
			return this.salario * 0.05;
			//si se modifica el porcentaje aquí, no afecta en las demas clases
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	

}
