package com.controlelancamento.domain;

import javax.persistence.Embedded;

public class LancamentoContaCorrenteCliente {
	
	private Integer numeroRemessaBanco;
	private String nomeSituacaoRemessa;
	private String nomeTipoOperacao;
	
	@Embedded
    private DadosDomicilioBancario dadosDomicilioBancario;
	
	public LancamentoContaCorrenteCliente() {}

}
