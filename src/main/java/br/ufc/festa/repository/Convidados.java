package br.ufc.festa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.ufc.festa.model.Convidado;

public interface Convidados extends JpaRepository<Convidado, Long> {
}
