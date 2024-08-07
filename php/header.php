<nav style="font-family: Georgia, serif;">        
    <div style="display: flex; justify-content : center; gap : 50px;">
            <a href="index.php">Menu</a>
            <a href="article.php">Article</a>

            <?php if (!isset($_SESSION['user'])) :?>
              <a href="login.php">S'inscrire</a>
            <?php endif ;?>

            <?php if (!isset($_SESSION['user'])) :?>
              <a href="connection.php">Se connecter</a>
            <?php endif ;?>

            <?php if (isset($_SESSION['user'])) :?>
            <a href="deconnection.php">Se deconnecter</a>
            <?php endif ;?>
    </div>    
</nav>