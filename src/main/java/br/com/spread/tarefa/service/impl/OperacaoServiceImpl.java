package br.com.spread.tarefa.service.impl;

import java.util.Date;
import java.util.List;

import br.com.spread.tarefa.dao.DAO;
import br.com.spread.tarefa.dao.impl.OperacaoDAOImpl;
import br.com.spread.tarefa.entity.Operacao;
import br.com.spread.tarefa.enums.StatusOperacao;
import br.com.spread.tarefa.enums.TipoOperacao;
import br.com.spread.tarefa.service.OperacaoService;

/**
 * @author Leandro.Marcos
 * Implementação da classe de serviço
 */
public class OperacaoServiceImpl implements OperacaoService {

	DAO<Operacao> dao = new OperacaoDAOImpl();

	public void create(Operacao entity) {
		entity.setStatus(StatusOperacao.PROCESSAR);
		dao.create(entity);
	}

	public List<Operacao> findAll() {
		return dao.findAll();
	}

	public List<Operacao> findBy(String field, String query) {
		return dao.findByField(field, query);
	}

	public void executaOperacao() {
		List<Operacao> lst = dao.findByField("status", StatusOperacao.PROCESSAR.toString());

		for (Operacao opr : lst) {
			// Simplifiquei a lógica para não precisar criar um sistema de task
			// com Quartz por exemplo
			if (opr.getTransferencia().getAgendamento().before(new Date())) {
				realizaOperacao(opr);
			}
		}
	}

	private void realizaOperacao(Operacao operacao) {

		TipoOperacao tipoOperacao = operacao.getTransferencia().getTipo();

		switch (tipoOperacao) {
		case A:
			aplicaTaxa(2.0, 3.0);
			break;

		default:
			break;
		}
	}

	//Implementar a lógica pra aplicar as taxas
	private void aplicaTaxa(Double taxa, Double valorTransf) {

	}

}
