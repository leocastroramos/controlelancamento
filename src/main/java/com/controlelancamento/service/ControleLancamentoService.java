package com.controlelancamento.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.controlelancamento.domain.ControleLancamento;
import com.controlelancamento.repository.ControleLancamentoRepository;

@Service
public class ControleLancamentoService {

    private ControleLancamentoRepository controleLancamentoRepository;

    public ControleLancamentoService(ControleLancamentoRepository controleLancamentoRepository) {
        this.controleLancamentoRepository = controleLancamentoRepository;
    }

    public Iterable<ControleLancamento> list() {
        return controleLancamentoRepository.findAll();
    }
    
    public Iterable<ControleLancamento> save(List<ControleLancamento> controleLancamento) {
        return controleLancamentoRepository.save(controleLancamento);
    }

}
