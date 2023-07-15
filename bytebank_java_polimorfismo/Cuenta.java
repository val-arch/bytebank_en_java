package bytebank_java_polimorfismo;
// clase 11
/*una clase puede tener campos y puede tambien referenciar 
 * objetos No Abstractos (como: private Cliente titular = new Cliente();)
 * puede tener elementos estaticos .
 * Puede tener constructores por defecto y constructores personalizados
 * puede tener metodos concretos / metodos reales / getters y setter
 * La clase NO PUEDE ser INSTANCIADA por SÍ sola , tiene que ser INSTANCIADA con una implementación real /
 * una clase que extienda de esta clase Abstracta llamada Cuenta, es decir una clase hija de Cuenta.
 * la Clase abstracta, permite que las clases hijas accedan a sus atributos(siempre y cuando los atributos esten declarados como PROTECTED dentro de la clase abstracta, si se declaran PRIVATE no se podran acceder)
 * la clase abstracta puede tener metodos abstractos, solamente que no se puede implementar(es decir, no deben de tener cuerpo)
 * solo pueden existir metodos abstractos en clases abstractas. no pueden existir metodos abstractas en clases no abstractas
 * nota: las clases hijas normales que provienen de la clase abstracta(madre) ES OBLIGATORIO que implementen los metodos abstractos de la clase abstracta (madre) de la que extienden
 * */
public abstract class Cuenta {
	
	protected double saldo;//atributo
    private int agencia;//atributo
    private int numero;//atributo
    //instanciamos un Cliente y lo inicialisamos como un cliente vacio. Se hizo para que el cliente nunca inicie con null. (composición de objetos, un objeto dentro de otro, y es inicializado automaticamente)
    private Cliente titular = new Cliente();//atributo . Se referencia objetos no abstractos
    
    private static int total;//(es un elemento estatico)La variable "static" no será de la INSTANCIA solo será de la CLASE
    
       
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
    //Se convierte en metodo abstracto - antes no lo era
    public abstract void depositar(double valor);
    
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
