package br.com.tf.desafio.api.lancamentoconta.domain;

public class DadosBancario {

	private String nomeBanco;
	
	private String contaCorrente;
	
	private Long agencia;
	
	private Long codigoBanco;
	
	
	
	public DadosBancario(){}
	
	public DadosBancario(String nomeBanco, String contaCorrente, Long agencia,
			Long codigoBanco) {
		super();
		this.nomeBanco = nomeBanco;
		this.contaCorrente = contaCorrente;
		this.agencia = agencia;
		this.codigoBanco = codigoBanco;
	}

	public String getNomeBanco() {
		return nomeBanco;
	}

	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}

	public String getContaCorrente() {
		return contaCorrente;
	}

	public void setContaCorrente(String contaCorrente) {
		this.contaCorrente = contaCorrente;
	}

	public Long getAgencia() {
		return agencia;
	}

	public void setAgencia(Long agencia) {
		this.agencia = agencia;
	}

	public Long getCodigoBanco() {
		return codigoBanco;
	}

	public void setCodigoBanco(Long codigoBanco) {
		this.codigoBanco = codigoBanco;
	}
	
}
