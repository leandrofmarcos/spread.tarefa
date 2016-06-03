package br.com.spread.tarefa.service;

import java.util.List;

import br.com.spread.tarefa.entity.Transferencia;

/**
 * @author Leandro.Marcos
 * Interface para injeção nas classes clientes
 */
public interface TransferenciaService {

	void create(Transferencia entity);

	List<Transferencia> findAll();

	Transferencia findBy(String field, String query);

	List<Transferencia> findByField(String field, String query);

}
