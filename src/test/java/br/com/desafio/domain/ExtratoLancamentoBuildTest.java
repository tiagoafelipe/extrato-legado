package br.com.desafio.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.tf.desafio.api.lancamentoconta.builder.ExtratoLancamentoBuilder;
import br.com.tf.desafio.api.lancamentoconta.domain.ExtratoLancamento;

public class ExtratoLancamentoBuildTest {

    @Test
    public void testBuilderExtratoLancamento() {
    	ExtratoLancamento extrato = new ExtratoLancamentoBuilder()
		.dataLancamento("22/12/2016").build();
		
        assertEquals("22/12/2016", extrato.getDataLancamento());
    }
    
    @Test
    public void testBuilderExtratoLancamentoNull() {
    	ExtratoLancamento extrato = new ExtratoLancamentoBuilder()
		.dataConfirmacao("22/12/2016").build();
		
        assertEquals(null, extrato.getDataLancamento());
        
        
    }

    
}
