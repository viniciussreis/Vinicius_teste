package com.teste.corridas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teste.corridas.model.Passageiro;

public interface Passageiros extends JpaRepository<Passageiro, Long> {

}
