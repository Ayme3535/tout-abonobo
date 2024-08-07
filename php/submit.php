<?php require_once(__DIR__ . "/dataconect.php");
session_start();
$inscription = $_POST;

$recuperation_data = $mysqlClient->prepare('SELECT * FROM users WHERE email= :email ');
$recuperation_data->bindParam(':email',$inscription['email']);
$recuperation_data->execute();
$emails_data = $recuperation_data->fetchAll();

if (
    !isset($inscription['email'])
    || !filter_var($inscription['email'], FILTER_VALIDATE_EMAIL)
    || empty($inscription['nom'])
    || trim($inscription['nom']) === ''
    || empty($inscription['password'])
    || trim($inscription['password']) === ''
) {
    echo('Il faut un email et un nom valides pour soumettre le formulaire.');
    return;
}

  if ($emails_data){
    echo('Cet adresse est déja associé à un compte');
    return;
  }
  else{
    $nom = $_POST["nom"];
    $email = $_POST["email"];
    $password = $_POST["password"];

    $data = $mysqlClient->prepare("INSERT INTO users (user_id, nom, email, password) VALUES (NULL,:nom,:email,:password)");
    $data->bindParam(':nom', $nom);
    $data->bindParam(':email', $email);
    $data->bindParam(':password', $password);

    $data->execute();
 
    $_SESSION['user'] = [
      'nom' => $inscription['nom'],
      'email' => $inscription['email'],
    ];
  };

?>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Connection reussie</title>
  </head>
  <?php require_once(__DIR__ . "/header.php"); ?>
  <body style="font-family :Georgia, serif;">
    
    <h2 style="text-align : center;">Vous êtes inscrit !</h2><br><br>
    <h4>Voici vos informations :</h4>

    <p class="card-text"><b>Email</b> : <?php echo $_POST['email']; ?></p>
    <p class="card-text"><b>Nom</b> : <?php echo htmlspecialchars($_POST['nom']); ?></p>  
    <p class="card-text"><b>Password</b> : <?php echo htmlspecialchars($_POST['password']); ?></p>   
  

  </body>
  <?php require_once(__DIR__ . "/footer.php"); ?>
</html>