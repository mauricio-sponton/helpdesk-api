package com.br.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer>{

}
