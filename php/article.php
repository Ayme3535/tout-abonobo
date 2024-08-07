<?php require_once(__DIR__ . "/dataconect.php");
if (session_status() === PHP_SESSION_NONE) {
  session_start();
}
?> 
<html>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Se connecter</title>
  </head>
  <?php require_once(__DIR__ . "/header.php"); ?>
  <body>
    <?php require_once(__DIR__ . "/connection.php"); ?>

    <?php if (isset($_SESSION['user'])) : ?>
      <?php require_once(__DIR__ . "/contenu_article.php"); ?>
      
        <button id="formulaire">Ajouter un article</button>
        <div id="espace-form"></div>
        <script>
          let boutton = document.getElementById('formulaire');
          let espace_formulaire = document.getElementById('espace-form');
          let rien = ``
          let formulaire = `
          <form action="verif_article.php" method="POST" style=" padding-left : 50px; display: flex; gap : 30px; flex-direction : column ">
        
          <div>
            <label for="titre">Titre :</label>
            <input name="titre">
          </div>
          <div>
            <label for="contenu">Contenu :</label>
            <textarea name="contenu"rows="4" cols="50"></textarea>
          </div>
          <div>
            <label for="favoriteOnly">Sélectionnez votre catégorie :</label>
            <select name="favoriteOnly" id="favoriteOnly">
              <option>Bebe de 0 à 3 mois</option>
              <option>Bebe de 3 à 6 mois</option>
              <option>Bebe de 6 à 9 mois</option>
              <option>Bebe de 9 à 12 mois</option>
              <option>Bebe de 12 à 24 mois</option>
            </select>
          </div>
          <div>
            <button type="submit">Ajouter</button>
          </div>  
          <div>
            <a href="#" id="annuler" style="text-decoration: none; color: inherit; cursor: pointer;">Annuler</a>
          </div> 
        </form>`
        boutton.addEventListener('click', function() {
          espace_formulaire.innerHTML = formulaire;
          boutton.style.visibility = "hidden";
           document.getElementById('annuler').addEventListener('click', function(event) {
             event.preventDefault();
             espace_formulaire.innerHTML = rien;
             boutton.style.visibility = "visible";
    });
  });
        </script>
    <?php endif; ?>
    
  </body>
  <?php require_once(__DIR__ . "/footer.php"); ?>
</html>
