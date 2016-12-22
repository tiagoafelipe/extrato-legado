angular
	.module('appDesafioCielo', [
	        'appDesafioCielo.app.extrato.controller',
            'appDesafioCielo.app.extrato.service'])
   	 .constant("config", {
	  		appName: "App Desafio Cielo",
	  		appVersion: "1.0",
	  		apiUrl: "https://desafio-cielo-extrato.herokuapp.com"
  });
angular.config(['$httpProvider', function ($httpProvider) {
  //Reset headers to avoid OPTIONS request (aka preflight)
  $httpProvider.defaults.headers.common = {};
  $httpProvider.defaults.headers.post = {};
  $httpProvider.defaults.headers.put = {};
  $httpProvider.defaults.headers.patch = {};
}]);
