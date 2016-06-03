package br.com.spread.tarefa.dao;

import java.util.List;

/**
 * @author Leandro.Marcos 
 * Interface para garantir implementações básicas de
 *         CRUD. Idéia é utilizar para Injeção de dependência.
 * @param <T>
 */
public interface DAO<T> {

	void create(T entity);

	List<T> findAll();

	T findBy(String field, String query);

	List<T> findByField(String field, String query);
}