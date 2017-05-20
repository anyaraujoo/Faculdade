package br.com.metrocamp.emprestimo.domain;

import java.util.Calendar;

public class Parcela {

	private double valor;
	private Calendar dataPagamento;
	private double valorAtraso;
	
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
	

}
