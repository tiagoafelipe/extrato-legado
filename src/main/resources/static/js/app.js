angular
	.module('appDesafioCielo', [
	        'appDesafioCielo.app.extrato.controller',
            'appDesafioCielo.app.extrato.service'])
   	 .constant("config", {
	  		appName: "App Desafio Cielo",
	  		appVersion: "1.0",
	  		apiUrl: "https://desafio-cielo-extrato.herokuapp.com"
  });
