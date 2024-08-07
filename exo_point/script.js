let span = document.getElementById("span");
let bouton_stop = document.getElementById("stop");
let body = document.querySelector("body");
let arreter = false;

let slider = document.getElementById("myRange");
let output = document.getElementById("demo");
output.innerHTML = slider.value; 
slider.oninput = function() {
  output.innerHTML = this.value;
}

span.addEventListener("click",(event) =>{
    event.preventDefault()
    arreter = false
    if (document.getElementById("width").value !== ""){
        console.log()
        if (document.getElementById("height").value !== ""){
            afficherpoint();            
        }
         
    }  

})
bouton_stop.addEventListener("click",()=>{
    arreter = true
})


function afficherpoint(){
  let nouveauDiv = document.createElement("div");
  let nouveauDiv2 = document.createElement("div");
  
  let hauteur = document.getElementById("height").value;
  let largeur = document.getElementById("width").value;

  function getRndInteger_height() {
    return Math.floor(Math.random() * window.innerHeight - parseInt(hauteur) - 1) ;
  }
  function getRndInteger_width() {
    return Math.floor(Math.random() * window.innerWidth - parseInt(largeur) - 1)
  }

  nouveauDiv.innerHTML = `<canvas id="myCanvas" width="${parseInt(largeur)}" height="${parseInt(hauteur)}" style="border:1px solid #000000;">
    </canvas> `;
  nouveauDiv2.innerHTML = `<canvas id="myCanvas2" width="${parseInt(largeur)}" height="${parseInt(hauteur)}" style="border:1px solid  #F5F5DC;">
    </canvas>`

  body.appendChild(nouveauDiv);

    
  nouveauDiv.style.position = "absolute";
  nouveauDiv.style.left = getRndInteger_width() + "px";
  nouveauDiv.style.top = getRndInteger_height()  + "px";
  nouveauDiv.style.right = getRndInteger_width() + "px";
  nouveauDiv.style.bottom = getRndInteger_height()  + "px";

  nouveauDiv2.style.position = "absolute";
  nouveauDiv2.style.left = getRndInteger_width() + "px";
  nouveauDiv2.style.top = getRndInteger_height()  + "px";

  let seconde = output.innerHTML * 1000
  if (arreter !== true){
    setTimeout(afficherpoint,seconde)
  }
}

let canva = document.getElementById("myCanvas35");
canva.style.width = client.innerWidth;
canva.style.height = client.innerHeight;



