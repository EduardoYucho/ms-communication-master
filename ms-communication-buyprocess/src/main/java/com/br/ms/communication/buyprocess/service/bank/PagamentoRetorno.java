package com.br.ms.communication.buyprocess.service.bank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PagamentoRetorno {

	public PagamentoRetorno(String mensagem2, boolean b) {

	}

	private String mensagem;
	private boolean pagamentoOK;

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public boolean isPagamentoOK() {
		return pagamentoOK;
	}

	public void setPagamentoOK(boolean pagamentoOK) {
		this.pagamentoOK = pagamentoOK;
	}

}
