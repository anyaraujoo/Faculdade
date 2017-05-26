package br.com.metrocamp.emprestimo.domain;

import java.util.Calendar;

public class Parcela {

	private double valor;
	private Calendar dataPagamento;
	private double valorAtraso;
	private StatusParcela status;
	private Calendar dataVencimento;  
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Calendar getDataPagamento() {
		return dataPagamento;
	}
	public void setDataPagamento(Calendar dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	public double getValorAtraso() {
		return valorAtraso;
	}
	public void setValorAtraso(double valorAtraso) {
		this.valorAtraso = valorAtraso;
	}
	
	public Calendar getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(Calendar dataVencimento) {
			this.dataVencimento = dataVencimento;
	}
	
	public StatusParcela getStatusParcela(){
		return this.status;
	}
	
	public void pagar(Calendar dataPagamento){
		this.dataPagamento = dataPagamento;
		
		
		this.status = StatusParcela.PAGO;
		if (dataPagamento.compareTo(dataVencimento) > 0){
			this.status = StatusParcela.PGP_ATRASO;
			
		}
		
				
		
	}
}


