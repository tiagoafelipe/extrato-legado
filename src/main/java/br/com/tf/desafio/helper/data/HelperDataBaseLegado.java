package br.com.tf.desafio.helper.data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.springframework.stereotype.Component;

import br.com.tf.desafio.lancamentocontalegado.domain.LancamentoLegado;

import com.google.gson.Gson;

@Component
public class HelperDataBaseLegado {

	public LancamentoLegado loadDataBaseLegado() throws Exception{
		try {
			
			String	jsonDataBase = this.loadJson();
			
			LancamentoLegado lancamentoLegado = new Gson().fromJson(jsonDataBase, LancamentoLegado.class);
	
			return lancamentoLegado;
		
		} catch (Exception e) {
			
			 throw new Exception("Falha ao carregar data base JSON.",  e);
		}	
	
	}

	private String loadJson() throws IOException {

		InputStream is = this.getClass().getClassLoader().getResourceAsStream("databaselegado/lancamento-conta-legado.json");
		
		BufferedReader bufferFile = new BufferedReader(new InputStreamReader(is));
		StringBuilder stringBuilder = new StringBuilder();
		String conteudo;

		while ((conteudo = bufferFile.readLine()) != null) {
			stringBuilder.append(conteudo);
		}
		
		bufferFile.close();
		
		return stringBuilder.toString();
	}
}
