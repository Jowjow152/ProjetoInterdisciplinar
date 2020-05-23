package br.usjt.hellospringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.hellospringboot.model.Estacao;

public interface EstacaoRepository extends JpaRepository<Estacao,Long> {

}
