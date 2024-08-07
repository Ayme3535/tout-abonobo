<?php
session_start(); 

session_destroy();

function redirectToUrl($url) {
    header("Location: $url");
    exit();
}

redirectToUrl('index.php');
?>
