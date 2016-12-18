package br.com.tf.desafio.api.lancamentoconta;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.tf.desafio.api.lancamentoconta.builder.ExtratoLancamentoBuilder;
import br.com.tf.desafio.api.lancamentoconta.domain.ExtratoLancamento;
import br.com.tf.desafio.helper.date.HelperDate;
import br.com.tf.desafio.lancamentocontalegado.LancamentoContaLegadoRepository;
import br.com.tf.desafio.lancamentocontalegado.domain.ControleLancamento;
import br.com.tf.desafio.lancamentocontalegado.domain.DomicilioBancario;
import br.com.tf.desafio.lancamentocontalegado.domain.LancamentoContaCorrente;
import br.com.tf.desafio.lancamentocontalegado.domain.LancamentoLegado;




@Repository
public class LancamentoContaService {

	
	@Autowired
	private LancamentoContaLegadoRepository legadoRepository;
	
	private List<ExtratoLancamento> extratoLancamentos = new LinkedList<>();
	
	public List<ExtratoLancamento> consultarExtratoLancamentoConta() throws Exception{
		
		extratoLancamentos = new LinkedList<>();
		
		LancamentoLegado lancamentoLegado = legadoRepository.findLancamentoContaLegado();
		
		return this.parserLegadoToExtrato(lancamentoLegado);
	}


	private List<ExtratoLancamento> parserLegadoToExtrato(LancamentoLegado lancamentoLegado) {
		
		List<ControleLancamento> lancamentos = lancamentoLegado.getListaControleLancamento();
		
		if (lancamentos != null && lancamentos.size() > 0){
			
			lancamentos.forEach(lancamento->{
				
				lancamento.getDateEfetivaLancamento();
				LancamentoContaCorrente contaCorrenteCliente = lancamento.getLancamentoContaCorrenteCliente();
				DomicilioBancario dadosBancarios = contaCorrenteCliente.getDadosDomicilioBancario();
				
				ExtratoLancamento extrato = new ExtratoLancamentoBuilder()
				.dataLancamento(lancamento.getDataLancamentoContaCorrenteCliente())
				.nomeTipoOperacao(contaCorrenteCliente.getNomeTipoOperacao())
				.numeroEvento(lancamento.getNumeroEvento())
				.situacao(contaCorrenteCliente.getNomeSituacaoRemessa())
				.dataConfirmacao(HelperDate.parseLongToDateBr(lancamento.getDateEfetivaLancamento()))
				.dadosBancarios(lancamento.getNomeBanco(), dadosBancarios.getNumeroContaCorrente() , dadosBancarios.getNumeroAgencia(), dadosBancarios.getCodigoBanco())
				.valorFinal(lancamento.getValorLancamentoRemessa())
				.build();
				
				extratoLancamentos.add(extrato);
			});
		}
		
		return extratoLancamentos;
		
		
	} 
}
