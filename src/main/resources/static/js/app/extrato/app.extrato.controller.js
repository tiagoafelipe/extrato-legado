angular.module('appDesafioCielo.app.extrato.controller', [])

.controller('ExtratoController', function($scope, ExtratoService) {

  $scope.lancamentos = [];
  $scope.message = {}
	  
  $scope.pesquisarLancamentosExtrato = function (){
	  
	  $scope.message = {}
	  $scope.lancamentos = [];
	  
	  ExtratoService.listarLancamentoExtratoConta().then(function(response){
		  
		  $scope.lancamentos = response.data;
		  
	   }, function(error){      
		   console.log(error);
		   if (error.data) $scope.message.erro = error.data.error + " : " +  error.data.message;
		   if (!error.data) $scope.message.erro = "Erro ao conectar ao servidor."; 
		   $scope.message.isErro = true;
	   });  
  }
  
})

