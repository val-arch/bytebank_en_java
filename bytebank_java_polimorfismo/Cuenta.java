package bytebank_java_polimorfismo;
// clase 11
public class Cuenta {
	private double saldo;//atributo
    private int agencia;//atributo
    private int numero;//atributo
    private Cliente titular = new Cliente();//atributo
    
    private static int total;//La variable "static" no será de la INSTANCIA solo será de la CLASE
    
       
    //Nota: al crear este constructor y personalizarlo
    //con el atributo agencia, tendremos que
    //eliminar el metodo setter de agencia, para que solo
    //me pueda manipular desde aquí
    public Cuenta(int agencia, int numero) {
    	this.agencia=agencia;
    	this.numero=numero;
    	System.out.println("Estoy creando una cuenta " + numero);
    	Cuenta.total ++;
    	/*
    	if(agencia <= 0) {
    		System.out.println("No se permite 0");
    		this.agencia = 1;
    	}else {
			this.agencia = agencia;
		}
    	total++;
    	System.out.println("Se van creando:" + total + " cuenta(s)");*/
    }
    
    //No retorna valor: "public void"
    public void depositar(double valor){
    	this.saldo += valor;
    }
    
    //Retorna valor: "public boolean/int/String/char"
    public boolean retirar(double valor) {
    	if(this.saldo >= valor) {
    		this.saldo -= valor;
    		return true;
		}
    	return false;//se elimina else
    }
    public boolean transferir(double valor, Cuenta cuenta) {
    	if(this.saldo >= valor) {
    		this.retirar(valor);
    		cuenta.depositar(valor);
    		return true;
    	} 
    	return false;
    }
    public double getSaldo(){
    	return this.saldo;
    }
    
    /*public void setAgencia(int agencia) {
    	if(agencia > 0) {
    		this.agencia = agencia;
    	} else {
    		System.out.println("No estan permitidos valores negativos");
    	}
		
	}*/
    public int getAgencia() {
		return this.agencia;
	}
    public void setTitular(Cliente titular) {
		this.titular = titular;
	}
    public Cliente getTitular() {
		return this.titular;
	}
    public int getNumero() {
		return this.numero;
	}
    public void setNumero(int numero) {
		this.numero = numero;
	}
}
