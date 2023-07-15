package bytebank_java_polimorfismo;
//clase 18
//quien marca si soy elegible o no para entrar-salir: interface Autenticable
//se elimina la palabra reserva "abstract" (por buenas practicas) del nombre de la interface Autenticable, deido a que todas las "interfaces" por default son abstractas y ya viene implicito
//antes estaba así: public abstract interface Autenticable extends Funcionario { // ahora queda así: public abstract interface Autenticable extends Funcionario {
//nota: una interfaz no puede extender de una clase, solo de otra interfaz
public interface Autenticable {
	//ahora todo (FuncionarioAutenticable)funcionario autenticable , va a tener una clave y va a poder iniciar serión
	
	//la interface no puede tener atributos privados, debido a que sus métodos son abstractos de manera implicita y no tienen cuerpo.
	//y como los metodos no tienen cuerpo, no hay manera de acceder a ellos desde otra clase.
	//entonces eliminamos el atributo //private String clave;
	

	//todos los métodos de una interfaz son abstractos
	public void setClave(String clave);
	
	public boolean iniciarSesion(String clave);

}
