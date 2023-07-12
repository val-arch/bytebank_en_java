package bytebank_java_polimorfismo;

//Clase número 3
public abstract class Funcionario {//se le acaba de dar una nueva funcionalidad a Funcionario debido a que es clase abstracta y ya no se puede instanciar directamente
	//clases abstractas No se pueden ser instanciadas. Para crear una instancia, primero debemos crear una clase hija no abstracta.
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
	
	// Este metodo se convierte en abstracto, antes no lo era.
	//Como es abstracto, aquí no se implementa ni se puede. Se implementara en las clases hijas(Clases: Contador,Gerente)
	public abstract double getBonificacion();

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	/*
	 * Nota: en la clase abstracta podemos definir metodos abstractos, 
	 * los cuales solo se crean pero no se implementan, dentro de la misma clase abstracta*/

}
