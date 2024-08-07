<?php require_once(__DIR__ . "/dataconect.php");
if (session_status() === PHP_SESSION_NONE) {
  session_start();
}
if (isset($_SESSION['user']['email'])){
    $recuperation_data = $mysqlClient->prepare("SELECT user_id FROM users WHERE email = :email");
    $recuperation_data->bindParam(':email', $_SESSION['user']['email'], PDO::PARAM_STR);
    $recuperation_data->execute();
    $commentaire_user_id = $recuperation_data->fetch(PDO::FETCH_ASSOC)['user_id'];
    
    $postdata = $_POST;
    
    $contenu_commentaire = $_POST['commentaire'] ?? "";
    $article_ID = $_POST['articleId'];
    $date_commentaire = date('Y-m-d');
    
    if (!empty($postdata['commentaire'])
        && trim($postdata['commentaire']) !== ''){
    
          $data = $mysqlClient->prepare("INSERT INTO commentaires (id_commentaire , user_id,article_id, contenu_commentaire, date_commentaire) VALUES (NULL, :user_id, :article_id, :contenu_commentaire, :date_commentaire)");
          $data->bindParam(':user_id', $commentaire_user_id);
          $data->bindParam(':article_id', $article_ID);
          $data->bindParam(':contenu_commentaire', $contenu_commentaire);
          $data->bindParam(':date_commentaire', $date_commentaire);
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