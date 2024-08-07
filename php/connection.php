<?php require_once(__DIR__ . "/dataconect.php"); 
if (session_status() === PHP_SESSION_NONE) {
    session_start();
}
$info = $_POST;

$recuperation_data = $mysqlClient->prepare('SELECT * FROM users');
$recuperation_data->execute();
$emails_data = $recuperation_data->fetchAll();


if (isset($info['email']) &&  isset($info['password'])) {
	if (!filter_var($info['email'], FILTER_VALIDATE_EMAIL)) {
    	$errorMessage = 'Il faut un email valide pour soumettre le formulaire.';
	} else {
    	foreach ($emails_data as $user) {
        	if (
            	$user['email'] === $info['email'] &&
            	$user['password'] === $info['password']
        	) {
            	$_SESSION['user'] = [
                	'nom' => $user['nom'],
					'email' => $user['email'],
            	];
        	}
    	}
      if (!isset($_SESSION['user'])) {
        $errorMessage = sprintf(
            'Les informations envoyées ne permettent pas de vous identifier : (%s/%s)',
            $info['email'],
            strip_tags($info['password'])
        );
    }
    }
}
?> 
<?php if (!isset($_SESSION['user'])) : ?>
	<?php require_once(__DIR__ . "/header.php"); ?>
	<form action="article.php" method="POST">

    	<?php if (isset($errorMessage)) : ?>
        	<div class="alert alert-danger" role="alert">
            	<?php echo $errorMessage; ?>
        	</div>
    	<?php endif; ?>
    	<div class="mb-3">
        	<label for="email" class="form-label">Email</label>
        	<input type="email" name="email" >

    	</div>
    	<div class="mb-3">
        	<label for="password" class="form-label">Mot de passe</label>
        	<input type="password" class="form-control" id="password" name="password">
    	</div>
    	<button type="submit" class="btn btn-primary">Envoyer</button>
	</form>

<?php else : ?>
	<?php require_once(__DIR__ . "/header.php"); ?>
	<div class="alert alert-success" role="alert">
    	Bonjour <?php echo $_SESSION['user']['nom']; ?> et bienvenue parmi nous !
	</div>
<?php endif; ?>