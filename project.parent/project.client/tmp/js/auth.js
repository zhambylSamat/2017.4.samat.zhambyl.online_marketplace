$(document).on('submit','#signIn',(function(e) {
	$thisParent = $(this);
	e.preventDefault();
	$.ajax({
    	url: $url+"/auth/check",
		type: "GET",
		data:  $thisParent.serialize(),
		contentType: false,
	    cache: false,
		processData:false,
		success: function(dataS){
	    	console.log(dataS);
	    	data = $.parseJSON(dataS);
	    	console.log(data);
	    	if(data.username==null && data.role==null){
	    		$thisParent.prev().text("Authentification failure");
	    	}
	    	else{
	    		setSession(md5('user'),data.username);
	    		setSession(md5('role'),data.role);
	    		$("#body").html("<h3>Loading...</h3>");
	    		// $('#body').load('crud.html');
	    		$.get("crud.html", function(data) {
					$("#body").html(data);
				});
	    	}
	    },
	  	error: function(dataS) 
    	{
    		console.log("ERROR");
    	} 	        
   	});
}));