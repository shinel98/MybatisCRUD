

let types = document.getElementsByClassName("type");

function chooseType(n){
	for(var i=0; i<types.length; i++){
		types[i].className = types[i].className.replace(" on", "");
	}	
	types[n-1].className += " on";	
}

