package com.service.backservice.repository;

import com.service.backservice.entity.Servico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ServicoRepository extends JpaRepository<Servico, Long> {

    @Query("select s from Servico s where s.valorPago is null and s.valorPago =0")
    List<Servico> buscarServicosPagamentoPendente();

    @Query("select s from Servico s where s.status = 'cancelado'")
    List<Servico> buscarServicosCancelados();
}
