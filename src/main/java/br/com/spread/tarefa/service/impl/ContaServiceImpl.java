package br.com.spread.tarefa.service.impl;

import java.util.List;

import br.com.spread.tarefa.dao.DAO;
import br.com.spread.tarefa.dao.impl.ContaDAOImpl;
import br.com.spread.tarefa.entity.Conta;
import br.com.spread.tarefa.service.ContaService;

/**
 * @author Leandro.Marcos
 * Implementação da classe de serviço
 */
public class ContaServiceImpl implements ContaService {

	DAO<Conta> dao = new ContaDAOImpl();

	public void create(Conta entity) {
		dao.create(entity);
	}

	public List<Conta> findAll() {
		return dao.findAll();
	}

	public Conta findBy(String field, String query) {
		return dao.findBy(field, query);
	}

	public List<Conta> findByField(String field, String query) {
		return dao.findByField(field, query);
	}

}
