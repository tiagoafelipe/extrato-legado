package br.com.tf.desafio.lancamentocontalegado.domain;

import java.util.List;

public class LancamentoContaCorrente {

	
	private Long numeroRemessaBanco;
	private List<AnaliticoLancamentoFinanceiroCliente> dadosAnaliticoLancamentoFinanceiroCliente;
	private String nomeSituacaoRemessa;
	private DomicilioBancario dadosDomicilioBancario;
	private String nomeTipoOperacao;
	 
	public Long getNumeroRemessaBanco() {
		return numeroRemessaBanco;
	}
	public void setNumeroRemessaBanco(Long numeroRemessaBanco) {
		this.numeroRemessaBanco = numeroRemessaBanco;
	}
	public List<AnaliticoLancamentoFinanceiroCliente> getDadosAnaliticoLancamentoFinanceiroCliente() {
		return dadosAnaliticoLancamentoFinanceiroCliente;
	}
	public void setDadosAnaliticoLancamentoFinanceiroCliente(
			List<AnaliticoLancamentoFinanceiroCliente> dadosAnaliticoLancamentoFinanceiroCliente) {
		this.dadosAnaliticoLancamentoFinanceiroCliente = dadosAnaliticoLancamentoFinanceiroCliente;
	}
	public String getNomeSituacaoRemessa() {
		return nomeSituacaoRemessa;
	}
	public void setNomeSituacaoRemessa(String nomeSituacaoRemessa) {
		this.nomeSituacaoRemessa = nomeSituacaoRemessa;
	}
	public DomicilioBancario getDadosDomicilioBancario() {
		return dadosDomicilioBancario;
	}
	public void setDadosDomicilioBancario(DomicilioBancario dadosDomicilioBancario) {
		this.dadosDomicilioBancario = dadosDomicilioBancario;
	}
	public String getNomeTipoOperacao() {
		return nomeTipoOperacao;
	}
	public void setNomeTipoOperacao(String nomeTipoOperacao) {
		this.nomeTipoOperacao = nomeTipoOperacao;
	}
	 
}
