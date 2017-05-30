<?php
$nome = $_POST["nome"];
$login = $_POST["usuario"];
$senha = $_POST["senha"];
$confirm_senha = $_POST["confirm_senha"];
$erro = 0;
   
    if (empty($nome)) { // verifica se $nome está vazio
	    $erro = 1;
	    echo "<script>alert('Digite seu nome!');</script>"; 
	} else if (strlen($login)<=3 ==TRUE){ //verifica se $login tem mais de 3 caracteres
	    $erro=1;
	    echo "<script>alert('Seu usuário deve conter mais de 3 dígitos!');</script>"; 
	} else if (strlen($senha)<6 ==TRUE){  //verifica se $senha tem mais de 6 caracteres
	    $erro=1;
	    echo "<script>alert('Sua senha deve conter no mínimo 6 dígios!');</script>"; 
    } else if($senha != $confirm_senha) { //valida $senha e $confirm_senha
        $erro=1;
	    echo "<script>alert('Suas senhas não batem!');</script>"; 
	}
    
	if($erro==0){ //se não houver erro, inclui o arquivo cadastra.php
	    include "cadastra.php";
    
	} else { // caso tenha erro, volta para a página index.php
	    echo "<script>location.href='../index.php';</script>";
	}
?>
