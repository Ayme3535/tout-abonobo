<?php
require_once(__DIR__ . "/dataconect.php"); ?>

 
<html style="background-color: #D7BDE2;">
  <?php require_once(__DIR__ . "/header.php"); ?>
    
    <body style="font-family :Georgia, serif;">
        <h2 style ="text-align: center; padding-bottom : 50px"> Formulaire d'inscrition</h2>
        
        <form action="submit.php" method="POST" style=" padding-left : 50px; display: flex; gap : 30px; flex-direction : column ">
        
          <div>
            <label for="nom">Nom :</label>
            <input name="nom">
          </div>
          <div>
            <label for="email">Email :</label>
            <input type="email" name="email">
          </div>
          <div>
            <label for="password">Mot de passe :</label>
            <input name="password">
          </div>
          <div>
            <button type="submit">S'inscrire</button>
          </div>  

        </form>

    </body>

    <?php require_once(__DIR__ . "/footer.php"); ?>
</html>