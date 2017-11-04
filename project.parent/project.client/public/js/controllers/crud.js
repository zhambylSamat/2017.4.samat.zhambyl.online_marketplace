function getProducts(){
	$.ajax({
        url: $url+"/shop/list",
        success:function(dataString){
        	$data = $.parseJSON(dataString);
        	$element = '';
        	$element += "<center>";
		    $.each($data.productInfoList, function (index, data) {
		    	$element += "<span>";
        		$element += "<b class='text-success h3'>Category: </b>"+data.category+"<br>";
        		$element += "<b class='text-success h3'>Product Name: </b>"+data.productName+"<br>";
        		$element += "<b class='text-success h3'>Price: </b>"+data.price+"<br>";
        		$element += "<b class='text-success h3'>Phone: </b>"+data.phone+"<br>";
        		$element += "<b class='text-success h3'>Description: </b>"+data.description+"<br>";
        		$element += "</span><hr>";
		    });
        	$element += "</center>";
        	$('#list').append($element);

        }
	});
};