package br.com.spread.tarefa.entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import br.com.spread.tarefa.enums.StatusOperacao;

public class Operacao {

	@Id
	private ObjectId operadcaoId;
	private Transferencia transferencia;
	private StatusOperacao status;

	public ObjectId getOperadcaoId() {
		return operadcaoId;
	}

	public void setOperadcaoId(ObjectId operadcaoId) {
		this.operadcaoId = operadcaoId;
	}

	public Transferencia getTransferencia() {
		return transferencia;
	}

	public void setTransferencia(Transferencia transferencia) {
		this.transferencia = transferencia;
	}

	public StatusOperacao getStatus() {
		return status;
	}

	public void setStatus(StatusOperacao status) {
		this.status = status;
	}

}
