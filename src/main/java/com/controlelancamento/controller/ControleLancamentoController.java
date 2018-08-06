package com.controlelancamento.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.controlelancamento.domain.ControleLancamento;
import com.controlelancamento.service.ControleLancamentoService;

@RestController
@RequestMapping("/lancamentocontacorrente")
public class ControleLancamentoController {

    private ControleLancamentoService controleLancamentoService;

    public ControleLancamentoController(ControleLancamentoService controleLancamentoService) {
        this.controleLancamentoService = controleLancamentoService;
    }

    @GetMapping("/list")
    public Iterable<ControleLancamento> list() {
        return controleLancamentoService.list();
    }

}
