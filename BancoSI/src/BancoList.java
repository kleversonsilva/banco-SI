import java.util.ArrayList;
//3Atributos

public class BancoList {
	private String nome;
	private String cnpj;
	private ArrayList<Conta> contas;
	
	public BancoList(String nome, String cnpj, ArrayList<Conta> contas) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.contas = contas;
	}
	
	//PARA abrir uma conta
	public void abrirConta(String cpfTitular,String numConta, String numAgencia, double saldoInicial) { //Inicio da qestao 4
		Conta contaNova= new Conta(cpfTitular, numConta, numAgencia, saldoInicial);//Abre a conta e passa os dados para a mesma		
		this.contas.add(contaNova);
		}
	
	//varre as contas q procuro e retorno o saldo 
	public double consultarSaldoDeConta(String numConta, String numAgencia) {
		double saldo = 0;
		for (Conta c: this.contas) { //Pra cada conta C, da lista...d contas...
			if(c.getNumeroConta().equals(numConta) &&
				c.getNumeroAgencia().equals(numAgencia)) {
				saldo = c.getSaldo();
		}
	}
		
	return saldo;
	
	}

//Criei= questao 01. Para retornar contas crio um arrayList de contas
public ArrayList<Conta> pesquisarContasComSaldoNegativos(){
	
	ArrayList<Conta> contasNegativas= new ArrayList();
	for (Conta c: this.contas) {//pra cada conta C da lista
		if (c.getSaldo()<0) {
		contasNegativas.add(c);//coloca a conta negativa na lista a retornar. para retornar as conta
	}						 // eu criei o (ArrayList<Conta> contasNegativas= new ArrayList();)

	
	}
	
	return contasNegativas;
	
	}
}
