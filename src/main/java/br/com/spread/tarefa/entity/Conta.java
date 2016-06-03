package br.com.spread.tarefa.entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Conta {

	@Id
	private ObjectId contaID;
	private String conta;
	private String nome;

	public ObjectId getContaID() {
		return contaID;
	}

	public void setContaID(ObjectId contaID) {
		this.contaID = contaID;
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
