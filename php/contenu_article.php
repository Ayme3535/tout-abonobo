<?php require_once(__DIR__ . "/dataconect.php");
if (session_status() === PHP_SESSION_NONE) {
    session_start();
}
?>
<html>
<!DOCTYPE html>
<html lang="fr">
  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Articles pour bebe</title>
    <style>
   .card {
      box-shadow: 0 4px 8px 0 rgba(0,0,0,0.2);
      transition: 0.3s;
      width: 40%;
  }

  .card:hover {
    box-shadow: 0 8px 16px 0 rgba(0,0,0,0.2);
  }

  .container {
    padding: 2px 16px;
  }
    </style>
  </head>
  <body>
  <div class="card">
      <div class="container">
        <h4><b> Catégorie 0 à 3 mois </b><button id="categorie3">Acceder</button></h4>
      </div>
    </div>
  <div class="card">
      <div class="container">
        <h4><b> Catégorie 3 à 6 mois </b><button id="categorie6">Acceder</button></h4>
      </div>
  </div>
  <div class="card">
      <div class="container">
        <h4><b> Catégorie 6 à 9 mois </b><button id="categorie9">Acceder</button></h4>
      </div>
    </div>
    <div class="card">
      <div class="container">
        <h4><b> Catégorie 9 à 12 mois </b><button id="categorie12">Acceder</button></h4>
      </div>
    </div>
    <div class="card">
      <div class="container">
        <h4><b> Catégorie 12 à 24 mois </b> <button id="categorie24">Acceder</button></h4>
      </div>
    </div>
    
    <script>
    document.getElementById('categorie3').addEventListener('click', function() {
        window.location.href = 'categorie3.php';
    });

    document.getElementById('categorie6').addEventListener('click', function() {
        window.location.href = 'categorie6.php';
    });

    document.getElementById('categorie9').addEventListener('click', function() {
        window.location.href = 'categorie9.php';
    });

    document.getElementById('categorie12').addEventListener('click', function() {
        window.location.href = 'categorie12.php';
    });

    document.getElementById('categorie24').addEventListener('click', function() {
        window.location.href = 'categorie24.php';
    });
    </script>
  </body>
</html>