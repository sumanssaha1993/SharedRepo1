function validateName(){
	var a = document.form.name.value;
	var letters = /^[A-Za-z ]{0,}$/;
	if(a){
		if(!letters.test(a))
		{
			var x = document.getElementById("snackbar");
			x.innerHTML="Please Enter Only Characters";
		    x.className = "show";
		    setTimeout(function(){ x.className = x.className.replace("show", ""); }, 3000);
		document.form.name.value=localStorage.getItem('temp');
		document.form.name.focus();
		return false;
		}
		localStorage.setItem('temp',a);
	}
}

function validateEmail(){
	var x = document.form.email.value;
	var atposition=x.indexOf("@");  
	var dotposition=x.lastIndexOf(".");  
	if (atposition<1 || dotposition<atposition+2 || dotposition+2>=x.length){ 
		var y = document.getElementById("snackbar");
		y.innerHTML="Please enter a valid e-mail address";
	    y.className = "show";
	    setTimeout(function(){ y.className = y.className.replace("show", ""); }, 3000);
	    document.form.email.value="";
	  return false;
	  }  
	return true;
}

function validatePhone(){
	var ph=document.form.phone.value;
	if(eval(ph)>999999999 && eval(ph)<10000000000){
		return true;
	}else{
		var x = document.getElementById("snackbar");
		x.innerHTML="Please enter a valid phone number";
	    x.className = "show";
	    setTimeout(function(){ x.className = x.className.replace("show", ""); }, 3000);
	    document.form.phone.value="";
		return false;
	}
}

function validatePassword(){
	var a = document.form.password.value;
	var ck_password =  /^[A-Za-z0-9!@#$%^&*()_]{0,}$/;
	if(a.length<5)
	{
		var x = document.getElementById("snackbar");
		x.innerHTML="Minimum length of password should be five";
	    x.className = "show";
	    setTimeout(function(){ x.className = x.className.replace("show", ""); }, 3000);
	document.form.password.value="";
	return false; ;
	}
	if(a.length>10)
	{
		var x = document.getElementById("snackbar");
		x.innerHTML="Maximum length of password should be ten";
	    x.className = "show";
	    setTimeout(function(){ x.className = x.className.replace("show", ""); }, 3000);
	document.form.password.value="";
	return false; ;
	}
	if(a){
		if(!ck_password.test(a))
		{
			var x = document.getElementById("snackbar");
			x.innerHTML="Password should contain only lower case and upper case characters, numbers and special characters ";
		    x.className = "show";
		    setTimeout(function(){ x.className = x.className.replace("show", ""); }, 3000);
		    document.form.password.value="";
		return false;;
		}
		return true;
	}
}

function validateConfirmpassword(){
	var pass=document.form.password.value;
	var cpass=document.form.confpass.value;
	if(pass===cpass){
		return true;
	}else{
		var x = document.getElementById("snackbar");
		x.innerHTML="Password and confirm password doesn't match......Please check";
	    x.className = "show";
	    setTimeout(function(){ x.className = x.className.replace("show", ""); }, 3000);
	    document.form.password.value="";
	    document.form.confpass.value="";
		return false;
	}
}

function validateEntry(){
	var x = document.getElementById("snackbar");
	x.innerHTML = "This Email Id is already registered";
	x.className = "show";
	setTimeout(function() {
		x.className = x.className.replace("show", "");
	}, 3000);
}

function validateSubmit(){
	var nm = document.form.name.value;
	var em = document.form.email.value;
	var ph=document.form.phone.value;
	var pass = document.form.password.value;
	if(nm==""){
		var x = document.getElementById("snackbar");
		x.innerHTML="Please Enter Your Name";
	    x.className = "show";
	    setTimeout(function(){ x.className = x.className.replace("show", ""); }, 3000);
		document.form.name.focus();
		return false; ;
	}
	if(em==""){
		var x = document.getElementById("snackbar");
		x.innerHTML="Please Enter Your Email";
	    x.className = "show";
	    setTimeout(function(){ x.className = x.className.replace("show", ""); }, 3000);
		document.form.email.focus();
		return false; ;
	}
	if(ph==""){
		var x = document.getElementById("snackbar");
		x.innerHTML="Please Enter Your Phone number";
	    x.className = "show";
	    setTimeout(function(){ x.className = x.className.replace("show", ""); }, 3000);
		document.form.phone.focus();
		return false; ;
	}
	if(pass==""){
		var x = document.getElementById("snackbar");
		x.innerHTML="Please Enter Your Password";
	    x.className = "show";
	    setTimeout(function(){ x.className = x.className.replace("show", ""); }, 3000);
		document.form.password.focus();
		return false; ;
	}
	/*if(validateEmail()){
	}else{
		return false;
	}
	if(validatePhone()){
	}else{
		return false;
	}
	if(validatePassword()){
	}else{
		return false;
	}
	if(validateConfirmpassword()){
	}else{
		return false;
	}*/
}



