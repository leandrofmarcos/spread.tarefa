package br.com.spread.tarefa.service;

import java.util.List;

import br.com.spread.tarefa.entity.Operacao;

/**
 * @author Leandro.Marcos
 * Interface para injeção nas classes clientes
 */
public interface OperacaoService {
	void create(Operacao entity);

	List<Operacao> findAll();

	List<Operacao> findBy(String field, String query);
}
