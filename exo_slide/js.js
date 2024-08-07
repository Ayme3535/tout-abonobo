let carre = document.getElementById("myCanvas");
let largeur_marge = window.innerWidth - 25;
let hauteur = window.innerHeight - 200
let tl = anime.timeline({
    duration : 750
})


principe()


function principe(){
    for (let cinquante = 0; cinquante < hauteur; cinquante = cinquante + 200){
       
        tl.add({
            targets: 'canvas',
            translateX: largeur_marge,
            translateY: cinquante,
            duration : 2000,
        })
        tl.add({
            targets: 'canvas',
            translateY: cinquante + 100,
            duration:2000,
            backgroundColor: couleur2
        })
        let couleur3 = changeHex()
        tl.add({
            targets: 'canvas',
            translateX: 0,
            duration:2000,
            backgroundColor:couleur3
        })
        let couleur4 = changeHex()
        tl.add({
            targets: 'canvas',
            translateY: cinquante + 200,
            duration:2000,
            backgroundColor: couleur4  
        })       
    }
}


function changeHex() {
    let hex = '#';
    const hexValues = [0,1,2,3,4,5,6,7,8,9,'A','B','C','D','E','F'];
    for (let i = 0; i < 6; i++) {
      const index = Math.floor(Math.random() * hexValues.length);
      hex += hexValues[index];
    }
  
    document.querySelector('body').style.backgroundColor = hex;
  }

let z = document.getElementById("z");
let calcul = - window.innerHeight - 140
let dz = anime({
    targets: 'p',
    keyframes: [
      {translateY: -40},
      {translateX: largeur_marge},
      {translateY: window.innerHeight - 60},
      {translateX: 0},
      {translateY: 0}
    ],
    duration: 10000,
    easing: 'easeOutElastic(1, .8)',
    loop: true
  });