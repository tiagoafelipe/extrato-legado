package br.com.tf.desafio.api.lancamentoconta;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.tf.desafio.api.lancamentoconta.builder.ExtratoLancamentoBuilder;
import br.com.tf.desafio.api.lancamentoconta.domain.ExtratoLancamento;


@RestController
public class ExtratoController {

	@Autowired
	private LancamentoContaService service;
	
	private final Logger logger = LoggerFactory.getLogger(ExtratoController.class);
	
	
    @GetMapping("/extrato")
	public @ResponseBody ResponseEntity<List<ExtratoLancamento>> listarExtratoLancamento() {
		
		try {
			
			List<ExtratoLancamento>  extrato = this.service.consultarExtratoLancamentoConta();
			
			return new ResponseEntity<List<ExtratoLancamento>>(extrato,HttpStatus.OK);
			
		} catch (Exception e) {
			
			logger.error(e.getMessage());
			
			//return new ResponseEntity<List<ExtratoLancamento>>(HttpStatus.INTERNAL_SERVER_ERROR );
			
			
			List<ExtratoLancamento>  extrato = new ArrayList<ExtratoLancamento>();
			extrato.add(new ExtratoLancamentoBuilder().nomeTipoOperacao(e.getMessage()).build());
			
			return new ResponseEntity<List<ExtratoLancamento>>(extrato,HttpStatus.OK);
		}
	}
	
	

}
