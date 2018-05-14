package com.teste.corridas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teste.corridas.model.Corrida;

public interface Corridas extends JpaRepository<Corrida, Long> {

}
