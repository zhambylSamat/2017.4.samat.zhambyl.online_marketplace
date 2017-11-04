$(document).on('submit','#signUp',function(e){
	$this = $(this);
	e.preventDefault();
	$.ajax({
    	url: $url+"/registration/userRegister",
		type: "GET",
		data:  $this.serialize(),
		contentType: false,
	    cache: false,
		processData:false,
		beforeSend:function(){
			$('#lll').css('display','block');
		},
		success: function(dataS){
			$('#lll').hide();
	    	console.log(dataS);
	    	data = $.parseJSON(dataS);
	    	console.log(data);
	    	$res = data.split("^");
	    	$html_txt = '';
	    	if($res[0]=='S'){
	    		$("#registration-alert").addClass('success');
	    		$html_txt += "<h3 class='text-success'>"+$res[1]+"</h3>";
	    	}
	    	else if($res[0]=="W"){
	    		$("#registration-alert").addClass('warning');
	    		$html_txt += "<h3 class='text-warning'>"+$res[1]+"</h3>";
	    	}
	    	else if($res[0]=="E"){
	    		$("#registration-alert").addClass('danger');
	    		$html_txt += "<h3 class='text-danger'>"+$res[1]+"</h3>";
	    	}
	    	$("#registration-alert").show().html($html_txt);
	    },
	  	error: function(dataS) 
    	{
    		$html_txt = '';
    		$('#lll').hide();
    		$("#registration-alert").addClass('danger');
	    	$html_txt += "<h3>ERRRRROOOOORRRR!</h3>";
	    	$("#registration-alert").show().html($html_txt);
    		console.log("ERROR");
    		console.log(dataS);
    	} 	        
   	});
});