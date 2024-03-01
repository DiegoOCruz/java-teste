package al.infinet.edu.br.diegooliveiracruz;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import al.infinet.edu.br.diegooliveiracruz.clients.IEnderecoClient;
import al.infinet.edu.br.diegooliveiracruz.model.domain.Endereco;
import al.infinet.edu.br.diegooliveiracruz.model.domain.Filial;
import al.infinet.edu.br.diegooliveiracruz.model.service.FilialService;


@Component
public class FilialLoader implements ApplicationRunner {
	
	//@Autowired
	//private IEnderecoClient enderecoClient;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {

		Endereco endFilial01 = new Endereco("16305516", "Rua 01", "Centro", "Penápolis", "SP");
		
		FilialService filialService = new FilialService();
		
		//Endereco endFilial02 = enderecoClient.obterPorCep("16305516");
		
		filialService.incluir(new Filial("Filial-01", "00.000.000.0000-01", endFilial01));
		
		//filialService.incluir(new Filial("Filial-02", "00.000.000.0000-02", endFilial02));
		
		System.out.println(filialService.obterLista());

	}  

}
