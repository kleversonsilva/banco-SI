
import java.util.ArrayList; 
public class TestaBanco {

	public static void main(String [] args) {
		BancoList meuBanco = new BancoList("Ayla's Bank","123/321",new ArrayList<Conta>());
		
		meuBanco.abrirConta("111.111.111-11", "222-2", "333-3", 100);
		System.out.println(meuBanco.consultarSaldoDeConta("222-2", "333-3")); 
		//meuBanco.abrirConta("222-345", "444", "2121-3", 25.00); //Abrir conta
		
		
	}

}
