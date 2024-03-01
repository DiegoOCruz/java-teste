package al.infinet.edu.br.diegooliveiracruz;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import al.infinet.edu.br.diegooliveiracruz.model.domain.Endereco;
import al.infinet.edu.br.diegooliveiracruz.model.domain.Filial;
import al.infinet.edu.br.diegooliveiracruz.model.service.FilialService;

@Component
public class FilialLoader implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {


		Endereco e3 = new Endereco("16305516", "Rua 01", "Centro", "Penápolis", "SP");
		FilialService filialService = new FilialService();
		
		filialService.incluir(new Filial("Filial-01", "00.000.000.0000-00", e3));
		
		

	}

}
