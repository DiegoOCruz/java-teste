package al.infinet.edu.br.diegooliveiracruz.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import al.infinet.edu.br.diegooliveiracruz.model.domain.Filial;

public class FilialService {

	private static Map<String, Filial> filiais = new HashMap<String, Filial>();
	
	public void incluir(Filial filial) {
		
		filiais.put(filial.getNome(), filial); 
		//System.out.println("Incluão da filial " + filial + " feito com sucesso!" );
	}
	
	public void excluir(String nome) {
		
		filiais.remove(nome);
		//System.out.println("A filial " + nome + " foi excluída com sucesso!" );
	}
	
	public Collection<Filial> obterLista() {
		return filiais.values();
	}
	
	public Filial obter(String nome) {
		return filiais.get(nome);
	}
}	
