<?php
if (!isset($_SESSION)){ //caso não tenha sessão, inicia uma
	session_start();
} 

if (!isset($_SESSION['id'])) { //caso não tenha um id registrado, destrói a sessão e redireciona para login.php
    session_destroy();
    header("Location: login.php");
	exit;
}
 ?>