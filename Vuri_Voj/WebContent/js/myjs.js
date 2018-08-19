/*$(document).ready(function(){
	$('.mybox').click(function(e){
    if(e.currentTarget.className == 'mybox f')
		alert('Don\'t it...!');
    else if (e.currentTarget.className == 'mybox a') {
      alert('I love it...');
    }
    else {
      alert('Hello World...!')
    }
    console.log(e.currentTarget.className);
	})
});*/
$(document).ready(function(){
	$("#desert").hide();
	$("#bengali").hide();
	$("#non").hide();
	$("#chinese").hide();
	$("#veg").hide();
	$("#south").hide();
	$('.mybox').mouseover(function(e){
	    if(e.currentTarget.className == 'mybox a')
	    	$("#bengali").show();
	    else if (e.currentTarget.className == 'mybox b') {
	    	$("#south").show();
	    }
	    else if (e.currentTarget.className == 'mybox c') {
	    	$("#non").show();
	      }
	    else if (e.currentTarget.className == 'mybox d') {
	    	$("#chinese").show();
	      }
	    else if (e.currentTarget.className == 'mybox e') {
	    	$("#veg").show();
	      }
	    else if (e.currentTarget.className == 'mybox f') {
	    	$("#desert").show();
	      }
	});
	$('.mybox').mouseout(function(e){
	    if(e.currentTarget.className == 'mybox a')
	    	$("#bengali").hide();
	    else if (e.currentTarget.className == 'mybox b') {
	    	$("#south").hide();
	    }
	    else if (e.currentTarget.className == 'mybox c') {
	    	$("#non").hide();
	      }
	    else if (e.currentTarget.className == 'mybox d') {
	    	$("#chinese").hide();
	      }
	    else if (e.currentTarget.className == 'mybox e') {
	    	$("#veg").hide();
	      }
	    else if (e.currentTarget.className == 'mybox f') {
	    	$("#desert").hide();
	      }
	})
});

