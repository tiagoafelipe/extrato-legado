package br.com.tf.desafio.helper.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public  class HelperDate {

	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	
	public static String parseLongToDateBr(Long time){
		
		Date data = new Date(time);
		
		return  dateFormat.format(data);
		
	}
	
	
}
