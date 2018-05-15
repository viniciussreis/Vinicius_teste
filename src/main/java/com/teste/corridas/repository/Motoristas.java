package com.teste.corridas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.teste.corridas.model.Motorista;

public interface Motoristas extends JpaRepository<Motorista, Long> {
	@Query("Select m from Motorista m where m.status = 'Ativo' ")
	public List<Motorista> buscarAtivo();
}
