package bytebank_java_polimorfismo;
//clase 13
public class CuentaCorriente extends Cuenta {

	public CuentaCorriente(int agencia, int numero) {
		super(agencia, numero);
		// TODO Auto-generated constructor stub
	}
	
	//sobreescritura de metodos
	@Override
	public boolean retirar(double valor) {
		double comision = 0.2;
		// TODO Auto-generated method stub
		return super.retirar(valor + comision);
	}

	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		
	}
	
}
