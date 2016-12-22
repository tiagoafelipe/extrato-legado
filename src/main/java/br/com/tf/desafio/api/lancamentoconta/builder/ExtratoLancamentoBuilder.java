package br.com.tf.desafio.api.lancamentoconta.builder;

import java.math.BigDecimal;

import br.com.tf.desafio.api.lancamentoconta.domain.DadosBancario;
import br.com.tf.desafio.api.lancamentoconta.domain.ExtratoLancamento;

public  class ExtratoLancamentoBuilder {
	
	private ExtratoLancamento extratoLancamento = new ExtratoLancamento();
	
	public ExtratoLancamentoBuilder(){}
	
	 public ExtratoLancamentoBuilder dataLancamento(String dataLancamento)
     {
         this.extratoLancamento.setDataLancamento(dataLancamento);
         return this;
     }
	 public ExtratoLancamentoBuilder nomeTipoOperacao(String nomeTipoOperacao)
     {
		 this.extratoLancamento.setNomeTipoOperacao(nomeTipoOperacao);
         return this;
     }
	 public ExtratoLancamentoBuilder numeroEvento(Long numeroEvento)
     {
         this.extratoLancamento.setNumeroEvento(numeroEvento);
         return this;
     }
	 public ExtratoLancamentoBuilder situacao(String situacao)
     {
         this.extratoLancamento.setSituacao(situacao);
         return this;
     }
	 public ExtratoLancamentoBuilder dataConfirmacao(String dataConfirmacao)
     {
         this.extratoLancamento.setDataConfirmacao(dataConfirmacao);
         return this;
     }
	 public ExtratoLancamentoBuilder dadosBancarios(String nomeBanco, String contaCorrente, Long agencia , Long codigoBanco)
     {
		 DadosBancario dadosBancario = new DadosBancario(nomeBanco, contaCorrente, agencia, codigoBanco);
         this.extratoLancamento.setDadosBancario(dadosBancario);
         return this;
     }
	 public ExtratoLancamentoBuilder valorFinal(BigDecimal valorFinal)
     {
         this.extratoLancamento.setValorFinal(valorFinal);
         return this;
     }
	 
	 public ExtratoLancamento build()
     {
         return this.extratoLancamento;
     }
}
