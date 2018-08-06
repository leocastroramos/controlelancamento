package com.controlelancamento.domain;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class ControleLancamento {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Long id;
    
    private Date dataEfetivaLancamento;
    private Date dataLancamentoContaCorrenteCliente;
    private Integer numeroEvento;
    private String descricaoGrupoPagamento;
    private Integer codigoIdentificadorUnico;
    private String nomeBanco;
    private Integer quantidadeLancamentoRemessa;
    private Long numeroRaizCNPJ;
    private Long numeroSufixoCNPJ;
    private BigDecimal valorLancamentoRemessa;
    private Date dateLancamentoContaCorrenteCliente;
    private Date dateEfetivaLancamento;

    @Embedded
    private TotalControleLancamento totalControleLancamento;
    @Embedded
    private LancamentoContaCorrenteCliente lancamentoContaCorrenteCliente;

    public ControleLancamento() {}
}
