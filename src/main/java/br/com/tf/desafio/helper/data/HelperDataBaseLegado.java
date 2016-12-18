package br.com.tf.desafio.helper.data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
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

		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource("databaselegado/lancamento-conta-legado.json").getFile());
		
		BufferedReader bufferFile = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF8"));
		StringBuilder stringBuilder = new StringBuilder();
		String conteudo;

		while ((conteudo = bufferFile.readLine()) != null) {
			stringBuilder.append(conteudo);
		}
		
		bufferFile.close();
		
		return stringBuilder.toString();
	}
}
