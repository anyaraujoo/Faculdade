package br.com.metrocamp.emprestimo.domain;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

public class Contrato {
	
	private Cliente cliente;
	private Gerente gerente;
	private SituacaoContrato situacao;
	private Calendar dataInicio;
	private Calendar dataFim;
	private BigDecimal valor; 
	private List <Parcela> parcelas;
	
	public Cliente getCliente() {
		return cliente;
	
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Gerente getGerente() {
		return gerente;
	}
	public void setGerente(Gerente gerente) {
		this.gerente = gerente;
	}
	public SituacaoContrato getSituacao() {
		return situacao;
	}
	public void setSituacao(SituacaoContrato situacao) {
		this.situacao = situacao;
	}
	public Calendar getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Calendar dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Calendar getDataFim() {
		return dataFim;
	}
	public void setDataFim(Calendar dataFim) {
		this.dataFim = dataFim;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public List<Parcela> getParcelas() {
		return parcelas;
	}
	public void setParcelas(List<Parcela> parcelas) {
		this.parcelas = parcelas;
	} 
	
}
	