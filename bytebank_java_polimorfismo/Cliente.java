package bytebank_java_polimorfismo;
//clase 12
//una clase no puede extender de algo que no es una clase(como la interfaz Autenticable). 
//No puede extender de Autenticable, pero si la puede "implementar" Autenticable
//antes: public class Cliente extends Autenticable {//nuestra clase Cliente se vuelve autenticable extendiendo de la clase Autenticable
//ahora: public class Cliente implements Autenticable {
//y al implementar la interface Autenticable, estamos obligados a implementar los metodos(setClave e iniciarSesion se sobreescriben con anotación @Override)

//nota: la clase cliente, ya no tiene nada que ver con la clase Funcionario
public class Cliente implements Autenticable {//nuestra clase Cliente se vuelve autenticable extendiendo de la clase Autenticable
	private String nombre;
	private String documento;
	private String telefono;
	
	private AutenticacionUtil util;
	
	//eliminamos atributo clave por que nadie lo esta usando(desacoplamos completamente la lógica de autenticación e inicio de sesión de mis objetos de negocio): private String clave;//atributo para settear la contraseña
	
	//Constructor de cliente
	public Cliente() {
		//inicializando por defecto AutenticacionUtil en cada clase Util
		this.util = new AutenticacionUtil();// composición de objetos
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

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	@Override
	public boolean iniciarSesion(String clave) {
		return this.util.iniciarSesion(clave);//nueva implementacion a partir de clase AutenticacionUtil. El código que habia aquí ya pasa a la clase util
	}
		/*Opcion 1 válida para implementar el método iniciarSesion: return this.clave == clave;
		 * 
		 * Opcion 2 válida para implementar el método iniciarSesion:
		 * if (this.clave == clave) { 
			return true;
		}
		return false;
	}*/
	
	@Override
	public void setClave(String clave) {
		this.setClave(clave);// implementamos el método
	}	
	
	
}
