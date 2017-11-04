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