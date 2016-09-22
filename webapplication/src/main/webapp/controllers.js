var controllerArray =[];

controllerArray.MasterController = function ($scope,$location, $rootScope){
	$scope.helloTo={};
	$scope.helloTo.title="krish sucess";
	$scope.screenNames = ["instructionview","messageview"];
	 $rootScope.screeName={};
	
	$scope.redirect= function(){
	$scope.helloTo.title="krish sucess moving with Main";
	};
/*	$scope.redirect = function(){
		$scope.helloTo.title = "world krish view";
		//$location.path("instructionview");
	};
*/	$scope.changedValue = function(item){
		
		$location.path(item);
	};
	
};

controllerArray.InstrutionEditController =function($scope,$location,$http){
	
	$scope.updatePost = function(){
		alert("click");
	};
};

controllerArray.MessageViewController =function ($rootScope, $scope, $location, $http, batchRetriveService){
	$scope.validation={};
	$scope.validation.String="krish sucess in instruction";
	$scope.rechange = function(){
		$scope.hellTo.title =" krish change in reclick";
	};
	
	$scope.callMessage = function(){
		$http({
			url:"http://localhost:8080/webapplication/services/sample/list",
			Method: 'GET',
		}).then(function successCallBack(response){
			$scope.messages = response.data;
		});
		
	};
	$scope.redirectToInstructionView = function(message){
		batchRetriveService.addBatchMessage(message);
		$rootScope.screenName="instructionview";
		$location.path("instructionview");
	};
	
}; 

controllerArray.InstrutionViewController = function ($scope,$location,$http, batchRetriveService){
		$scope.helloTo={};
		$scope.helloTo.title="krish sucess in message";
		$scope.batchMessage = batchRetriveService.getBatchMessage();
		//$scope.model = {};
		$scope.instructions = batchRetriveService.getInstructions();
		$scope.selected = [];
		$scope.selectAllItems = false;
		
		
		$scope.selectAll =function (){
			var copySelection = $scope.selectAllItems;
			for (var i = 0; i < $scope.instructions.length; i++) {
				$scope.instructions[i].isChecked=copySelection;
			}
		};
		
		$scope.validateSelection = function(){
			 $scope.selected = [];
	          $scope.selectAllItems = true;
	          for (var i = 0; i < $scope.instructions.length; i++) {
	        	     if ($scope.instructions[i].isChecked) {
		            	 if($scope.selected.indexOf($scope.instructions[i].instructionId) == -1) {
		            		 delete $scope.instructions[i].isChecked;
		 		            	$scope.selected.push($scope.instructions[i]);
		            	 }
		             } 
		             else {
		            	 $scope.selectAllItems = false;
		             }
		         }
		};
		$scope.updatePost = function(){
			
			$scope.validateSelection();
			$scope.selectAllItems = false;
			$location.path("instructionedit");

//			update();
		};
		
		var update = function(){
			$http({
					 method: 'POST',
					 url: 'http://localhost:8080/webapplication/services/sample/updateinstruction',
					 headers: {
					   'Content-Type': 'application/json'
					 },
					 data: $scope.selected
					}).then(function successCallBack(response){
						$scope.scucessmessage = response;
					});
		};
		
	/*		$scope.postToService = function (){
			$scope.selectedInstructions;
			$http({
				url:"http://localhost:8080/webapplication/services/sample/postInstructions",
				Method: 'GET',
			}).then(function successCallBack(response){
				$scope.messages = response.data.messages;
			});
		};*/
};
