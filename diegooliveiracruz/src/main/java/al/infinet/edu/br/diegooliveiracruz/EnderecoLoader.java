package al.infinet.edu.br.diegooliveiracruz;


import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.stereotype.Component;

import al.infinet.edu.br.diegooliveiracruz.model.domain.Endereco;


@Component
public class EnderecoLoader implements ApplicationRunner {
	
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		
		//Endereco e1 = new Endereco();

		
		Endereco e2 = new Endereco("16303290");
		e2.setLocalidade("Penápolis");
		
		//String cep, String logradouro, String bairro, String localidade, String uf
		Endereco e3 = new Endereco("16305516", "Rua 01", "Centro", "Penápolis", "SP");
		
		//System.out.println("[ENDEREÇO] - " + e1);
		//System.out.println("[ENDEREÇO] - " + e2);
		//System.out.println("[ENDEREÇO] - " + e3);
		
		 
		
		
	} 

}
