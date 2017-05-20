package br.com.metrocamp.emprestimo.domain;

public class Gerente extends Pessoa{


	public Gerente(){
		
		super();
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		super.nome = nome;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		super.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		super.cpf = cpf;
	} 
	
	
}
