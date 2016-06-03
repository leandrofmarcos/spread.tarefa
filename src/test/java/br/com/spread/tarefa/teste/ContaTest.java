package br.com.spread.tarefa.teste;

import java.util.List;

import org.junit.Test;

import br.com.spread.tarefa.entity.Conta;
import br.com.spread.tarefa.service.ContaService;
import br.com.spread.tarefa.service.impl.ContaServiceImpl;
import junit.framework.Assert;

public class ContaTest {

	ContaService contaService;

	public ContaTest() {
		contaService = new ContaServiceImpl();
	}

	@Test
	public void criaContaTipoA() {
		Conta entity = new Conta();
		entity.setConta("1234-1");
		entity.setNome("ContaA");

		contaService.create(entity);

		List<Conta> conta = contaService.findByField("conta", "1234-1");

		Assert.assertEquals(1, conta.size());

	}

	@Test
	public void criaContaTipoB() {
		Conta entity = new Conta();
		entity.setConta("1234-2");
		entity.setNome("ContaB");

		contaService.create(entity);

		List<Conta> conta = contaService.findByField("conta", "1234-2");
		Assert.assertEquals(1, conta.size());
	}

	@Test
	public void criaContaTipoC() {
		Conta entity = new Conta();
		entity.setConta("1234-3");
		entity.setNome("ContaC");

		contaService.create(entity);

		List<Conta> conta = contaService.findByField("conta", "1234-3");
		Assert.assertEquals(1, conta.size());

	}

	@Test
	public void criaContaTipoD() {
		Conta entity = new Conta();
		entity.setConta("1234-4");
		entity.setNome("ContaD");

		contaService.create(entity);

		List<Conta> conta = contaService.findByField("conta", "1234-4");
		Assert.assertEquals(1, conta.size());

	}

}
