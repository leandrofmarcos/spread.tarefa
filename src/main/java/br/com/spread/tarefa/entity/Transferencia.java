package br.com.spread.tarefa.entity;

import java.util.Date;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import br.com.spread.tarefa.enums.TipoOperacao;

public class Transferencia {

	@Id
	private ObjectId transferenciaID;
	private Conta contaOrigem;
	private Conta contaDestino;
	private Double valor;
	private Double taxa;
	private Date agendamento;
	private TipoOperacao tipo;

	public Conta getContaOrigem() {
		return contaOrigem;
	}

	public void setContaOrigem(Conta contaOrigem) {
		this.contaOrigem = contaOrigem;
	}

	public Conta getContaDestino() {
		return contaDestino;
	}

	public void setContaDestino(Conta contaDestino) {
		this.contaDestino = contaDestino;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Double getTaxa() {
		return taxa;
	}

	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}

	public Date getAgendamento() {
		return agendamento;
	}

	public void setAgendamento(Date agendamento) {
		this.agendamento = agendamento;
	}

	public TipoOperacao getTipo() {
		return tipo;
	}

	public void setTipo(TipoOperacao tipo) {
		this.tipo = tipo;
	}

	public ObjectId getTransferenciaID() {
		return transferenciaID;
	}

	public void setTransferenciaID(ObjectId transferenciaID) {
		this.transferenciaID = transferenciaID;
	}

}
