package br.com.metrocamp.emprestimo.domain;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

public class DescontoDuplicatas extends Contrato{

	public DescontoDuplicatas(Cliente cliente, Gerente gerente, SituacaoContrato situacao, Calendar dataFim,
			BigDecimal valor, List<Parcela> parcelas) {
		super(cliente, gerente, dataFim, valor, parcelas);
	
	}

	@Override
	public double calculaMulta(Parcela parcela) {
		
		return parcela.getValor() * 0.05;
	}

		

}
