package br.com.tf.desafio.lancamentocontalegado;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.tf.desafio.helper.data.HelperDataBaseLegado;
import br.com.tf.desafio.lancamentocontalegado.domain.LancamentoLegado;

@Repository
public class LancamentoContaLegadoRepository {

	@Autowired
	private HelperDataBaseLegado helperDataBase;
	
	
	public LancamentoLegado findLancamentoContaLegado() throws Exception{
		
		LancamentoLegado lancamentoLegado = this.helperDataBase.loadDataBaseLegado();
		
		return lancamentoLegado;
	}
	
}
