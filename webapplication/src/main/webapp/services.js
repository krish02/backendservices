
var batchRetriveService = function(){
	var batchList=[];
	
		var getBatchMessage =function(){
			return batchList;
		};
		var addBatchMessage =function(batch){
			batchList=batch;
		};
		var getInstructions =function(){
			return batchList.instructions;
		};
		return {
			getBatchMessage:getBatchMessage,
			addBatchMessage:addBatchMessage,
			getInstructions:getInstructions
	};
};