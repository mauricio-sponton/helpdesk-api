package com.br.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.helpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
