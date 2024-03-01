package al.infinet.edu.br.diegooliveiracruz;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

//import java.util.ArrayList;
import java.util.Collection;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import al.infinet.edu.br.diegooliveiracruz.model.domain.Endereco;
import al.infinet.edu.br.diegooliveiracruz.model.domain.Filial;
import al.infinet.edu.br.diegooliveiracruz.model.service.FilialService;

@SpringBootTest
public class FiliaServiceTest {
	
	private FilialService filialService;
	private Endereco end;
	
	@BeforeEach
	void setUp() {
		filialService = new FilialService();
		end = new Endereco("16305516", "Rua 01", "Centro", "Penápolis", "SP");
		
	}
	
	@Test
	void inclusao() { 
		Filial filial = new Filial("Penápolis", "00.000.000/0000-01", end);
		
		filialService.incluir(filial);
		
		assertEquals(filial, filialService.obter("Penápolis")); 
	}
	
	@Test
	void exclusao() {
		Filial filial = new Filial("Penápolis", "00.000.000/0000-01", end);
		filialService.incluir(filial);
		
		filialService.excluir("Penápolis");
		
		assertEquals(null, filialService.obter("Penápolis")); 
		
	}
	
	@Test
	void recuperacaoTotal() {
		
		Filial filial = new Filial("Filial-01", "00.000.000/0000-01", end);
		filialService.incluir(filial);
		
		
	    Collection<Filial> listaFiliais = filialService.obterLista();
	    assertTrue(listaFiliais.contains(filial));
		
		
	}  
	
}
