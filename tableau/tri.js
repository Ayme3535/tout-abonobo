let formulaire = document.querySelector('form')
let liste = []
let compteur_per = 0
let fausseliste = []
let etat_liste = []
let compteur_e = 0
let compteur_e_per = 0
let lafinale = 0
let un = 1
let etape_permutation_par_e = []
let ligne = `<br><br>`
let uneligne = `<br>`

function tri_inser_c(liste) {
    let lens = liste.length 
    for (let i = 1; i < lens; i = i + 1){
        let j = i - 1 
      while (parseFloat(liste[i]) < parseFloat(liste [j])){
        let temp = liste[j]
        liste[j] = liste[i]
        liste[i] = temp
        i = i - 1
        j = j - 1
        compteur_per = compteur_per + 1
        etat_liste += liste + ligne
        if (i === 0) {
            break 
        }
      }
    }     
    return liste
}
function tri_inser_d(liste) {
    let lens = liste.length 
    for (let i = 1; i < lens; i = i + 1){
        let j = i - 1 
      while (parseFloat(liste[i]) > parseFloat(liste [j])){
        let temp = liste[j]
        liste[j] = liste[i]
        liste[i] = temp
        i = i - 1
        j = j - 1
        compteur_per = compteur_per + 1
        etat_liste += liste + ligne
        if (i === 0) {
            break 
        }
              
      }
        
    }     
    return liste
}
function tri_sel_c(liste) {
    let lens = liste.length - 1
    for (let i= 0; i < lens; i = i + 1){
        lafinale = 0
        for (let j = i; j < lens; j = j + 1) {
          if (parseFloat(liste[i]) > parseFloat(liste[j + 1])){
            let temp = liste[i]
            liste[i] = liste[j + 1]
            liste[j + 1] = temp
            compteur_per = compteur_per + 1
            lafinale = lafinale + 1
          }      
        }
        etape_permutation_par_e += lafinale + uneligne
        etat_liste += liste + ligne
        compteur_e = compteur_e + 1
    }    
    return liste 
}
function tri_sel_d(liste) {
    let lens = liste.length - 1
    for (let i= 0; i < lens; i = i + 1){
        lafinale = 0
        for (let j = i; j < lens; j = j + 1) {
          if (parseFloat(liste[i]) < parseFloat(liste[j + 1])){
            let temp = liste[i]
            liste[i] = liste[j + 1]
            liste[j + 1] = temp
            compteur_per = compteur_per + 1
            lafinale = lafinale + 1
            
          }
        }
        etape_permutation_par_e += lafinale + uneligne
        etat_liste += liste + ligne
        compteur_e = compteur_e + 1
    }      
    return liste 
}
function afficher(propo){
    let affichage = document.getElementById('liste_tri')
    affichage.innerText = propo
}
function afficher_per(propo_boucle){
    let affichage_boucle = document.getElementById('nbr_per')
    affichage_boucle.innerText = propo_boucle
}
function afficheretape(prop_etape){
    let etape = document.getElementById("nbr_etape")
    etape.innerText = prop_etape
}
let div_res = `<div id="fade2">
                 - Voici la liste triée : "<span id="liste_tri"></span>".<br><br>
                 Le nombre d'étape s'élève à <span id="nbr_etape"></span>.<br><br> 
                 Le nombre de permutation s'élève à <span id="nbr_per"></span>.<br><br>
                 Le nombre de permutation par étape :<br><span id="nbr_et_per"></span>
              </div>     
              <button id="bdetail">Détails</button>
              <div id="detail"></detail>
             ` 
function affichage_resultat(prop_resultat){
    let resultat = document.getElementById("resultat")
    resultat.innerHTML = prop_resultat
}
function etatliste(prop_liste){
    let etaat = document.getElementById("detail")
    etaat.innerHTML = prop_liste
}
function etapeper(prop_e_per){
    let belamdi = document.getElementById("nbr_et_per")
    belamdi.innerHTML = prop_e_per
}

formulaire.addEventListener("submit",(event) => {
    event.preventDefault();
    
    let baliseCouleur = document.querySelectorAll('input[name="choix"]')
    let insertion_c = document.getElementById('insertion_c')
    let insertion = document.getElementById('insertion')
    let selection_c = document.getElementById('selection_c')
    let selection = document.getElementById('selection')
     
    for (let i = 0; i < 4 ; i++) {
        if (baliseCouleur[i].checked) {
            let couleurId = baliseCouleur[i].id;

            if (couleurId === insertion_c.id) {
                affichage_resultat(div_res)
                tri_inser_c(liste);
                afficher(liste);
                afficheretape(compteur_per);
                afficher_per(compteur_per);
                etapeper(un)

                break;
            }
            if (couleurId === insertion.id) {
                affichage_resultat(div_res)
                tri_inser_d(liste);
                afficher(liste);
                afficheretape(compteur_per);
                afficher_per(compteur_per);
                etapeper(un)
                break;
            }
            if (couleurId === selection_c.id) {
                affichage_resultat(div_res)
                tri_sel_c(liste);
                afficher(liste);
                afficheretape(compteur_e);
                afficher_per(compteur_per);
                etapeper(etape_permutation_par_e)
                
                break;
            }
            if (couleurId === selection.id) {
                affichage_resultat(div_res)
                tri_sel_d(liste);
                afficher(liste);
                afficheretape(compteur_e);
                afficher_per(compteur_per);
                etapeper(etape_permutation_par_e)
                break;
            }
        }
    }
    let detail = document.getElementById("bdetail")
    detail.addEventListener("click",()=>{
    etatliste(etat_liste)
    })
})
let texte = "Votre nombre : "
let affichage_nombre = `
    <div class="recup">
    <label for="nombre">${texte}</label><input id="numero" type="number" name="nombre"><br>
    </div>
    `;

let texte_choix = "- Veuillez séléctionner le type d'algortihme que vous souhaitez utiliser ainsi que l'ordre de tri : "
let texte_i_c = "Tri par insertion dans l'ordre croissant."
let texte_i_d = "Tri par insertion dans l'ordre décroissant"
let texte_s_c = "Tri par sélection dans l'ordre croissant."
let texte_s_d = "Tri par sélection dans l'ordre décroissant."
let choix_tri = ` <p id="fade"> ${texte_choix}<br><br>
                        <input type="radio" name="choix" value="insertion_c" id="insertion_c"><label for="insertion_c">${texte_i_c}</label><br>
                        <input type="radio" name="choix" value="insertion" id="insertion"><label for="insertion">${texte_i_d}.</label><br>
                        <input type="radio" name="choix" value="selection_c" id="selection_c"><label for="selection_c">${texte_s_c}</label><br>
                        <input type="radio" name="choix" value="selection" id="selection"><label for="selection">${texte_s_d}</label>
                  </p>
                  <div class="bouton">
                        <button>Soumettre</button>
                  </div> 
                `


let algerie = `<button id="ok">OK</button>
            `
function algeriedz(propo_dz){
    dz = document.getElementById("dz")
    dz.innerHTML = propo_dz
}
let zone= document.getElementById('button')
zone.addEventListener("click",() =>{
    let mul = document.getElementById('numero').value
    for (let w = 0; w < parseFloat(mul); w = w + 1)
        afficher_nbr(affichage_nombre)
        afficher_choix(vide)
        algeriedz(algerie)
    let ok = document.getElementById('ok')
    ok.addEventListener("click",()=>{
        let valeur = document.querySelectorAll('.recup input');
        liste = [];
           valeur.forEach((input) =>{
           liste.push(input.value)
           })
        afficher_choix(choix_tri)
        })
})
let vide = `<div></div>
           `
function afficher_choix(propo_choix){
    let affichage_choix = document.getElementById('remplace2')
    affichage_choix.innerHTML = propo_choix
}
function afficher_nbr(propo_nbr){
    let affichage_nbr = document.getElementById('remplace1')
    affichage_nbr.innerHTML += propo_nbr
}
