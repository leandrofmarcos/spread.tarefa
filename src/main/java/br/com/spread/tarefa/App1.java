package br.com.spread.tarefa;

import java.util.Date;
import java.util.List;

import br.com.spread.tarefa.entity.Conta;
import br.com.spread.tarefa.entity.Transferencia;
import br.com.spread.tarefa.enums.TipoOperacao;
import br.com.spread.tarefa.service.ContaService;
import br.com.spread.tarefa.service.TransferenciaService;
import br.com.spread.tarefa.service.impl.ContaServiceImpl;
import br.com.spread.tarefa.service.impl.TransferenciaServiceImpl;

public class App1 {

	public static void main(String[] args) {

		criaTransferencia(criaContaOrigem());
	}

	private static List<Conta> criaContaOrigem() {
		ContaService service = new ContaServiceImpl();
		Conta origem = new Conta();
		Conta destino = new Conta();

		origem.setConta("1234-2");
		origem.setNome("Origem");

		destino.setConta("1234-2");
		destino.setNome("Origem");

		service.create(origem);
		service.create(destino);

		List<Conta> contas = service.findAll();

		return contas;
	}

	private static void criaTransferencia(List<Conta> conta) {
		TransferenciaService service = new TransferenciaServiceImpl();
		Transferencia entity = new Transferencia();

		entity.setAgendamento(new Date());
		entity.setContaDestino(conta.get(0));
		entity.setContaOrigem(conta.get(1));
		entity.setTaxa(10.0);
		entity.setTipo(TipoOperacao.A);
		entity.setValor(100.00);

		service.create(entity);

	}

}
