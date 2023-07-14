package bytebank_java_polimorfismo;

//clase 16
//con "extends" solo puede extender el hijo de un solo padre(padre muchos hijo/hijo un solo padre)
//antes: public class Administrador extends Autenticable {
//ahora:public class Administrador implements Autenticable {
//se implementan los metodos de la interface

//al final se extiende a Funcionario y Autenticable ya estaba implementado
//AQUÍ ENTRA LA MAGIA, la clase Adminstrador "extiende" de la clase abstracta Funcionario e "implementa" de la interface Autenticable
//Aquí entra la importancia de que no se pueda extender de mas de una clase
public class Administrador extends Funcionario implements Autenticable {
	
	@Override
	public double getBonificacion() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setClave(String clave) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean iniciarSesion(String clave) {
		// TODO Auto-generated method stub
		return false;
	}

}
