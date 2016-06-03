package br.com.spread.tarefa.teste;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import br.com.spread.tarefa.entity.Conta;
import br.com.spread.tarefa.entity.Transferencia;
import br.com.spread.tarefa.enums.TipoOperacao;
import br.com.spread.tarefa.service.ContaService;
import br.com.spread.tarefa.service.TransferenciaService;
import br.com.spread.tarefa.service.impl.ContaServiceImpl;
import br.com.spread.tarefa.service.impl.TransferenciaServiceImpl;
import junit.framework.Assert;

public class TransferenciaTest {

	ContaService contaService = new ContaServiceImpl();
	TransferenciaService transferenciaService = new TransferenciaServiceImpl();
	Conta contaA;
	Conta contaB;

	public TransferenciaTest() {
		contaService = new ContaServiceImpl();
		transferenciaService = new TransferenciaServiceImpl();
	}

	@Before
	public void criaContaTipoA() {

		Conta entity = new Conta();
		entity.setConta("1234-1");
		entity.setNome("ContaA");

		contaService.create(entity);

		contaA = contaService.findBy("conta", "1234-1");
	}

	@Before
	public void criaContaTipoB() {

		Conta entity = new Conta();
		entity.setConta("1234-2");
		entity.setNome("ContaB");

		contaService.create(entity);

		contaB = contaService.findBy("conta", "1234-2");
	}

	@Test
	public void criaTransferenciaParaContaA() {
		Transferencia entity = new Transferencia();

		entity.setAgendamento(new Date());
		entity.setContaDestino(contaA);
		entity.setContaOrigem(contaB);
		entity.setTaxa(10.0);
		entity.setTipo(TipoOperacao.A);
		entity.setValor(100.00);

		transferenciaService.create(entity);

		Transferencia transferencias = transferenciaService.findBy("contaOrigem", contaA.getContaID().toString());

		Assert.assertNotNull(transferencias);

	}
}
