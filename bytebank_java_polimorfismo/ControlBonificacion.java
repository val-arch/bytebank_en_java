package bytebank_java_polimorfismo;
//clase numero 8
//sumaremos todas las bonificaciones que le vayamos dando como parametro
public class ControlBonificacion {
	private double suma;
	
	public double registrarSalario(Funcionario funcionario) {
		this.suma = funcionario.getBonificacion() + this.suma;// con "this.suma" se ira sumando la de todos los funcionarios
		System.out.println("Calculo actual: " + this.suma);//para ver en pantalla el resultado actual de este calculo
		return this.suma;
	}
	
	public double registrarSalario(Gerente gerente) {
		this.suma = gerente.getBonificacion() + this.suma;//"+ this.suma" suma la  bonificacion mas la suma actual
		//es decir, dependiendo del numero de objetos que se instancien, se ira sumando, con la suma que se encuentre actualmente
		System.out.println("Calculo actual: " + this.suma);//para ver en pantalla el resultado actual de este calculo
		return this.suma;
	}
}
