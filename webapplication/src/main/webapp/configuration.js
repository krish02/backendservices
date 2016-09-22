
var angularmodule= angular.module('mydemo', ['ui.router']);


angularmodule.config( function($stateProvider,$urlRouterProvider,$locationProvider, $httpProvider) {
//	$urlRouterProvider.otherwise("/default");
	  $stateProvider
	  .state("messageview", {
		 url: "/messageview",
		 templateUrl : "messageview.htm",
		 controller: "MessageViewController",
	  })
	  .state("instructionview", {
		 url: "/instructionview",
		 templateUrl : "instructionview.htm",
		 controller: "InstrutionViewController",
	  })
	  .state("instructionedit", {
			 url: "/instructionedit",
			 templateUrl : "instructionedit.htm",
			 controller: "InstrutionEditController",
		  });
	/*  .state("message", {
		 url: "/message",
		 templateUrl : "message.htm",
		 controller: "MessageController",
	  });
	*/ 
	});
	  
angularmodule.controller(controllerArray);

angularmodule.service('batchRetriveService',batchRetriveService);