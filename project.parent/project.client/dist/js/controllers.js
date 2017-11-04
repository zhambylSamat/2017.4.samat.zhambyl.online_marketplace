$(document).on('submit','#signIn',function(e) {
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
	 		if(data.username==null && data.role==null && data.msg!=null){
	 			$thisParent.prev().removeClass('text-danger');
	 			$thisParent.prev().addClass('text-warning');
	 			$thisParent.prev().text(data.msg);
	 		}
	    	else if(data.username==null && data.role==null && data.msg==null){
	    		$thisParent.prev().removeClass('text-warning');
	    		$thisParent.prev().addClass('text-danger');
	    		$thisParent.prev().text("Authentification failure");
	    	}
	    	else{
	    		setSession(md5('user'),data.username);
	    		setSession(md5('role'),data.role);
	    		$("#body").html("<h3>Loading...</h3>");
	    		$('#body').load('crud.html');
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
});
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
$url = "http://localhost:1316/education/api";
function getSession(key){
        $.ajax({
        url: $url+"/session/get?key="+key,
        success:function(dataString){
                $data = $.parseJSON(dataString);
                return $data!=null ? $data.sessionValue : null;
        }
        });
}

function setSession(key, value){
        $.ajax({
        url: $url+"/session/set?key="+key+"&value="+value,
        success:function(dataString){
                $data = $.parseJSON(dataString);
                console.log($data);
        }
        }); 
}
function md5(value){
        return $.md5(value);
}

$(document).ready(function(){
        if(getSession(md5("user")) == null){
                $("#body").html("<h3>Loading...</h3>");
                // $("#body").load('auth.html');
                $.get("auth.html", function(data) {
                        $("#body").html(data);
                });
        }
});
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