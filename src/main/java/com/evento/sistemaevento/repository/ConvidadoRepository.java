package com.evento.sistemaevento.repository;

import org.springframework.data.repository.CrudRepository;

import com.evento.sistemaevento.models.Convidado;
import com.evento.sistemaevento.models.Evento;

public interface ConvidadoRepository extends CrudRepository<Convidado, String>{
	Iterable<Convidado> findByEvento(Evento evento);
	Convidado findByRg(String rg);
}
