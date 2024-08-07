<?php require_once(__DIR__ . "/dataconect.php");
if (session_status() === PHP_SESSION_NONE) {
    session_start();
}

$categorie = 'Bebe de 6 à 9 mois';
$recuperation_data = $mysqlClient->prepare('SELECT * FROM articles WHERE categorie_articles = :categorie');
$recuperation_data->bindParam(':categorie', $categorie );
$recuperation_data->execute();
$articles_data = $recuperation_data->fetchAll();

$auteur_article = $mysqlClient->prepare('SELECT u.user_id, u.nom FROM users u INNER JOIN articles a ON u.user_id = a.user_id');
$auteur_article->execute();
$auteurs_data = $auteur_article->fetchAll();

$auteurs_assoc = [];
foreach ($auteurs_data as $auteur) {
    $auteurs_assoc[$auteur['user_id']] = $auteur['nom'];
} 
$auteur_commentaire = $mysqlClient->prepare('SELECT u.user_id, u.nom FROM users u INNER JOIN commentaires c ON u.user_id = c.user_id');
$auteur_commentaire->execute();
$auteurs_commentaire_data = $auteur_commentaire->fetchAll();

$auteurs_comm = [];
foreach ($auteurs_commentaire_data as $auteur) {
    $auteurs_comm[$auteur['user_id']] = $auteur['nom'];
}

$commentaires_article = $mysqlClient->prepare('SELECT c.*, u.nom FROM commentaires c INNER JOIN users u ON c.user_id = u.user_id WHERE c.article_id = :article_id');

?>
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
      #comm {
        display: flex;
        flex-direction: column;
        gap: 20px;
      }
    </style>
  </head>
<?php require_once(__DIR__ . "/header.php"); ?>
<body>
<?php foreach($articles_data as $article) : ?>
    <div class="card">
      <div class="container">
        <h4><b> <?php echo $article['titre_article'] ; ?> </b></h4>
        <p>Ecrit le <?php echo $article['date_article']; ?> par <?php echo $auteurs_assoc[$article['user_id']]; ?></p>
      </div>
      <?php echo $article['contenu_article']; ?>
    </div>
    <div>
      <h5>Commentaires :</h5>
      <?php
      $commentaires_article->bindParam(':article_id', $article['article_id']);
      $commentaires_article->execute();
      $commentaires = $commentaires_article->fetchAll();
      ?>      
      <?php foreach ($commentaires as $commentaire) : ?>
        <div id="comm">
          <?php echo $commentaire['nom']; ?><br><?php echo $commentaire['date_commentaire']; ?><br>
          <?php echo $commentaire['contenu_commentaire']; ?>
        </div>
      <?php endforeach ; ?>
    </div>
    <div>
      <form action="verif_commentaire.php" method="POST">
        <input type="hidden" name="articleId" value="<?php echo($article['article_id']) ?>">
        <label for="commentaire">Rajouter un commentaire :</label>
        <textarea name="commentaire"></textarea>
        <button type="submit">Commenter</button>
      </form>
    </div>
  <?php endforeach ; ?>
</body>
</html>