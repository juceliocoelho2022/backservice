package com.service.backservice.controller;

import com.service.backservice.entity.Servico;
import com.service.backservice.service.ServicoService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/servico")
public class ServicoController {

    @Autowired
    private ServicoService servicoService;

    @GetMapping("/")
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

    @PostMapping("/")
    public Servico inserir(@RequestBody  Servico servico) {
        return servicoService.inserir(servico);
    }
    @PutMapping("/")
    public Servico alterar(@RequestBody  Servico servico) {
        return servicoService.alterar(servico);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathParam("id") Long id){
        servicoService.excluir(id);
        return ResponseEntity.ok().build();
    }

}