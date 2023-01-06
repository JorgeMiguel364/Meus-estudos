// porcentagem
function percentOf()
{
    	var percent;
    
	percent = document.getElementById("percent1-input").value / document.getElementById("percent2-input").value;
    	percent = percent * 100;
    
    	divElement.innerText = "Sua porcentagem corresponde a: " +percent.toFixed(2)+ "%";
}

// metade do numero
function halfNumber()
{
    	var div;
    
    	div = document.getElementById("half-input").value / 2;
    
    	divElement.innerText = "Seu valor dividido por 2 é: " +div;
}

// quadrado
function squareNumber()
{
    	var potc;
    
    	potc = Math.pow(document.getElementById("square-input").value, 2);
    
    	divElement.innerText = "Seu quadrado é: " +potc;
}

// area do círculo
function areaOfCircle()
{
    var area;
    
    area = Math.PI * (Math.pow(document.getElementById("area-input").value, 2));
    
    divElement.innerText = "Sua área correspondente é: " +area.toFixed(2);
}