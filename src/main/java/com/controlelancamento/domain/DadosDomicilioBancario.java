package com.controlelancamento.domain;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Embeddable
public class DadosDomicilioBancario {
	
	private Integer codigoBanco;
	private Integer numeroAgencia;
	private Integer numeroContaCorrente;

	public DadosDomicilioBancario() {}
}
