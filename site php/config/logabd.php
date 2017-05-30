<?php 
include "bd.php"; //inclui arquivo para conexao
$salt = 'Cf1f11ePArKlBJomM0F6aJ'; //declara encriptação 
$custo = '12';
//pega informações do formulario
$login = $_POST['usuario']; 
$entrar = $_POST['entrar'];
$senha = $_POST['senha'];
//encripta a senha
$hash = crypt($senha, '$2a$' . $custo . '$' . $salt . '$');

    if (isset($entrar)) { //se $entrar for utilizado, consulta no banco

        $verifica = @mysql_query("SELECT * FROM usuarios WHERE usuario = '$login' AND senha = '$hash'") or die("erro ao selecionar"); //consulta o banco para verificar se $usuario e $hash são iguais aos armazenados
        if (mysql_num_rows($verifica) <= 0) { //se não houver / estiver incorreto, apresenta mensagem e redireciona para login.php
            echo "<script language='javascript' type='text/javascript'>alert('Login e/ou senha incorretos');window.location.href='../login.php';</script>";
            @mysql_close();
            die();

        } else { // caso tenha, inicia sessão e redireciona para página privada
            session_start();
            $_SESSION['usuario'] = $login;
            $_SESSION['senha'] = $hash;
            $_SESSION['id'] = session_id();
            header("location: ../site.php");


        }
    }

?>