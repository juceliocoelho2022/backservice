package com.service.backservice.controller;

import com.service.backservice.entity.Servico;
import com.service.backservice.service.ServicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/servico")
public class ServicoController {

    @Autowired
    private ServicoService servicoService;

    public List<Servico> buscatTodos() {
        return servicoService.buscarTodos();
    }

    @GetMapping("/pagamentoPendente")
    public List<Servico> buscarServicoPagamentosPendente() {
        return servicoService.buscarServicoPagamentosPendente();
    }

    @GetMapping("/cancelados")
    public List<Servico> buscarServicvoCancelados() {
        return servicoService.buscarServicvoCancelados();
    }

    public Servico inserir(Servico servico) {
        return servicoService.inserir(servico);
    }
}