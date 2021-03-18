
public class Conta {
	private String cpfTitular;
	private String numeroConta;
	private String numeroAgencia;
	private double saldo;
	//
	public Conta(String cpf, String numC, String numeroAgencia, double saldo) { //esse é o construtor q recebe:cpf,numConta...
		//agora inicializando Atributos
		this.cpfTitular=cpf; //this.cpfTitular=cpf RECEBE cpf
		this.numeroConta=numC;
		this.numeroAgencia=numeroAgencia;
		this.saldo=saldo;
	}
	public Conta() {  //Se a pessoa nao Passar nada.
		this("Sem CPF ", " ", " ", 0.0);//Aki chama os construtores Acima
	}
	
	//QUETAO 03
	public String toString() {  //Retorna conta e cpf>>> Qestao3
		return "Conta de Numero: "+this.numeroConta+". do Ciente de CPF: "+ this.cpfTitular;
	}
	
	public double getSaldo() {  //RETORNA O SALDO
		return this.saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo=saldo;
	}
	
	public String getNumeroConta() {  
		return this.numeroConta;
	}
	public void setNumeroConta(String NumeroConta) {
		this.numeroConta=NumeroConta;
	}
	
	public String getNumeroAgencia() {
		return this.numeroAgencia;
	}
	public void setNumeroAgencia(String NumeroAgencia) {
		this.numeroAgencia= NumeroAgencia;
	}
	
	//QESTAO 02			//[metodo] [parametro] 
	public double creditar(double valor) {  //Creditar um valor>>>Qestao 2
		this.saldo=this.saldo+valor;
		return this.saldo;  //Retorna quanto ficou na conta
	}
	
	public double debitar(double valor) {
		this.saldo=this.saldo-valor;
		return this.saldo;
	}

}
