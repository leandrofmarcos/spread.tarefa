package br.com.spread.tarefa.service;

import java.util.List;

import br.com.spread.tarefa.entity.Conta;

/**
 * @author Leandro.Marcos
 * Interface para injeção nas classes clientes
 */
public interface ContaService {

	void create(Conta entity);

	List<Conta> findAll();

	Conta findBy(String field, String query);

	List<Conta> findByField(String field, String query);
}
