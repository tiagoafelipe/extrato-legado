package br.com.tf.desafio.api.lancamentoconta.builder;

import java.math.BigDecimal;

import br.com.tf.desafio.api.lancamentoconta.domain.DadosBancario;
import br.com.tf.desafio.api.lancamentoconta.domain.ExtratoLancamento;

public  class ExtratoLancamentoBuilder {
	private String dataLancamento;
	private String nomeTipoOperacao;
	private Long numeroEvento;
	private String situacao; 
	private String dataConfirmacao;
	private DadosBancario dadosBancarios;
	private BigDecimal valorFinal;
	
	public ExtratoLancamentoBuilder(){}
	
	 public ExtratoLancamentoBuilder dataLancamento(String dataLancamento)
     {
         this.dataLancamento = dataLancamento;
         return this;
     }
	 public ExtratoLancamentoBuilder nomeTipoOperacao(String nomeTipoOperacao)
     {
         this.nomeTipoOperacao = nomeTipoOperacao;
         return this;
     }
	 public ExtratoLancamentoBuilder numeroEvento(Long numeroEvento)
     {
         this.numeroEvento =  numeroEvento;
         return this;
     }
	 public ExtratoLancamentoBuilder situacao(String situacao)
     {
         this.situacao = situacao;
         return this;
     }
	 public ExtratoLancamentoBuilder dataConfirmacao(String dataConfirmacao)
     {
         this.dataConfirmacao = dataConfirmacao;
         return this;
     }
	 public ExtratoLancamentoBuilder dadosBancarios(String nomeBanco, String contaCorrente, Long agencia,Long codigoBanco)
     {
         this.dadosBancarios = new DadosBancario(nomeBanco, contaCorrente, agencia, codigoBanco) ;
         return this;
     }
	 public ExtratoLancamentoBuilder valorFinal(BigDecimal valorFinal)
     {
         this.valorFinal = valorFinal;
         return this;
     }
	 
	 
	 public String getDataLancamento() {
		return dataLancamento;
	}

	public String getNomeTipoOperacao() {
		return nomeTipoOperacao;
	}

	public Long getNumeroEvento() {
		return numeroEvento;
	}

	public String getSituacao() {
		return situacao;
	}

	public String getDataConfirmacao() {
		return dataConfirmacao;
	}

	public DadosBancario getDadosBancarios() {
		return dadosBancarios;
	}

	public BigDecimal getValorFinal() {
		return valorFinal;
	}

	public ExtratoLancamento build()
     {
         return new ExtratoLancamento(this);
     }
}
