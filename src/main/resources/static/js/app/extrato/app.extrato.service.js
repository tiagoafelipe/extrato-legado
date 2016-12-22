angular
	.module('appDesafioCielo.app.extrato.service', [])
	.service("ExtratoService", ["config" , "$http" , function ExtratoService(config , $http) {

		this.listarLancamentoExtratoConta = function(){
    
			var endpointExtrato = config.apiUrl + "/extrato"
		
			var promise = $http.get( endpointExtrato );
		
			return promise;
		}
 }]);