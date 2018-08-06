/**
 * 
 */
package com.controlelancamento.domain;

import java.math.BigDecimal;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Embeddable
public class TotalControleLancamento {
	
	private Integer quantidadeLancamentos;
	private Integer quantidadeRemessas;
	private BigDecimal valorLancamentos;
	private Integer totalElements;
	private Integer tamanhoPagina;
	private Integer indice;
	
	public TotalControleLancamento(){
		
	}

}
