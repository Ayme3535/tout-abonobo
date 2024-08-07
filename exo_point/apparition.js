let span = document.getElementById("dz");
let max = 501
let min = 0
let canva = `<canvas></canvas>
        `
let arreter = false
let bouton_stop = document.getElementById("stop")

function afficherpoint(pro){
   boubis = document.getElementById("boubis");
   boubis.innerHTML = pro
}

bouton_stop.addEventListener("click",()=>{
    arreter = true
})

span.addEventListener("click",() =>{
    while (arreter !== true){
    }
})








let max2 = 701

function getRndInteger_height(min, max) {
    return Math.floor(Math.random() * (max - min) );
  }
function getRndInteger_width(min, max2) {
    return Math.floor(Math.random() * (max2 - min) );
  }