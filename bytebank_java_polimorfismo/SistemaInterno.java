package bytebank_java_polimorfismo;
//clase 17
public class SistemaInterno {
	
	private String clave = "AluraCursosOnLine";
	
	//metodo "autentica" a un funcionario, entonces se le pasa de parametro a un gerente
	public boolean autentica(FuncionarioAutenticable gerente) {
		//atributo de tipo boolean de nombre "puedeIniciarSesion", que guarda al metodo iniciarSesion perteneciente de la clase Gerente. Y se manda a traer y se guarda en este atributo
		boolean puedeIniciarSesion = gerente.iniciarSesion(clave);//se manda a traer al metodo y se gurada en esta variable atributo
		if (puedeIniciarSesion) {//SI es (verdadero)
			System.out.println("Login exitoso");// imprime, si es VERDADERO
			return true;//retorna true (verdadero)
		} else { //si NO (Falso)
			System.out.println("Error en Login");//imprime, si es FALSO
			return false;//retorna false (falso)
		}
	}
		
}
