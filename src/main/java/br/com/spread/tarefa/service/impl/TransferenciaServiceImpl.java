package br.com.spread.tarefa.service.impl;

import java.util.List;

import br.com.spread.tarefa.dao.DAO;
import br.com.spread.tarefa.dao.impl.TransferenciaDAOImpl;
import br.com.spread.tarefa.entity.Transferencia;
import br.com.spread.tarefa.service.TransferenciaService;

/**
 * @author Leandro.Marcos Implementação da classe de serviço
 */
public class TransferenciaServiceImpl implements TransferenciaService {

	DAO<Transferencia> dao = new TransferenciaDAOImpl();

	public void create(Transferencia entity) {
		dao.create(entity);
	}

	public List<Transferencia> findAll() {
		return dao.findAll();
	}

	public Transferencia findBy(String field, String query) {
		return dao.findBy(field, query);
	}

	public List<Transferencia> findByField(String field, String query) {
		return dao.findByField(field, query);
	}
}
