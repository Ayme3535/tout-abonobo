<?php require_once(__DIR__ . "/dataconect.php");
if (session_status() === PHP_SESSION_NONE) {
  session_start();
}
if (isset($_SESSION['user']['email'])){
  $recuperation_data = $mysqlClient->prepare("SELECT user_id FROM users WHERE email = :email");
  $recuperation_data->bindParam(':email', $_SESSION['user']['email'], PDO::PARAM_STR);
  $recuperation_data->execute();
  $article_user_id = $recuperation_data->fetch(PDO::FETCH_ASSOC)['user_id'];
  
  $postdata = $_POST;
  
  $titre_article = $_POST['titre'] ?? "";
  $contenu_article = $_POST['contenu'] ?? "";
  $categorie_article = $_POST['favoriteOnly'];
  $date_article = date('Y-m-d');
  
  if (!empty($postdata['titre'])
      && trim($postdata['titre']) !== ''
      && !empty($postdata['contenu'])
      && trim($postdata['contenu']) !== ''){
  
        $data = $mysqlClient->prepare("INSERT INTO articles (article_id, user_id, titre_article, contenu_article, date_article,categorie_articles) VALUES (NULL, :user_id, :titre_article, :contenu_article, :date_article,:categorie_articles)");
        $data->bindParam(':user_id', $article_user_id);
        $data->bindParam(':titre_article', $titre_article);
        $data->bindParam(':contenu_article', $contenu_article);
        $data->bindParam(':date_article', $date_article);
        $data->bindParam(':categorie_articles',$categorie_article);
        $data -> execute();
      }
    else{
      echo("ERREUR");
      return;
    }
}

function redirectToUrl($url) {
    header("Location: $url");
    exit();
}

redirectToUrl('article.php');
?>