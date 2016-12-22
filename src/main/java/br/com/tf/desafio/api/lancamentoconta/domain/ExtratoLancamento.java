package br.com.tf.desafio.api.lancamentoconta.domain;

import java.math.BigDecimal;

public class ExtratoLancamento {

	
	private String dataLancamento;
	
	private String nomeTipoOperacao;
	
	private Long numeroEvento;
	
	private String situacao; 
	
	private String dataConfirmacao;
	
	private DadosBancario dadosBancario;
	
	private BigDecimal valorFinal;

	

	public String getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(String dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public String getNomeTipoOperacao() {
		return nomeTipoOperacao;
	}

	public void setNomeTipoOperacao(String nomeTipoOperacao) {
		this.nomeTipoOperacao = nomeTipoOperacao;
	}

	public Long getNumeroEvento() {
		return numeroEvento;
	}

	public void setNumeroEvento(Long numeroEvento) {
		this.numeroEvento = numeroEvento;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public String getDataConfirmacao() {
		return dataConfirmacao;
	}

	public void setDataConfirmacao(String dataConfirmacao) {
		this.dataConfirmacao = dataConfirmacao;
	}

	public DadosBancario getDadosBancario() {
		return dadosBancario;
	}

	public void setDadosBancario(DadosBancario dadosBancario) {
		this.dadosBancario = dadosBancario;
	}

	public BigDecimal getValorFinal() {
		return valorFinal;
	}

	public void setValorFinal(BigDecimal valorFinal) {
		this.valorFinal = valorFinal;
	}
	
	public ExtratoLancamento() {
		
	}
	
	
}


