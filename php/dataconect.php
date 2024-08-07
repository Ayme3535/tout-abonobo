<?php
try
{
	$mysqlClient = new PDO('mysql:host=localhost;dbname=site_bebe;charset=utf8', 'root', '');
}
catch (Exception $e)
{
    die('Erreur : ' . $e->getMessage());
}
?>