package al.infinet.edu.br.diegooliveiracruz.model.domain;

import java.util.List;

import al.infinet.edu.br.diegooliveiracruz.Funcionario;

public class Filial {
	
	private String nome;
	private String cnpj;
	private List<Funcionario> funcinarios;
	private Endereco endereco;
		
	public Filial() {

	} 
	
	public Filial(String nome, String cnpj, Endereco endereco) {
		this();
		this.setNome(nome);
		this.setCnpj(cnpj);
		this.setEndereco(endereco);
	}
	
	
	@Override
	public String toString() {
		return "Filial [nome= " + nome + ", cnpj= " + cnpj + ", Endereço= " + endereco + "]";
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public List<Funcionario> getFuncinarios() {
		return funcinarios;
	}

	public void setFuncinarios(List<Funcionario> funcinarios) {
		this.funcinarios = funcinarios;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
