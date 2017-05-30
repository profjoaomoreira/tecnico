<?php 
include "bd.php"; //inclui arquivo para conexao
$salt = 'Cf1f11ePArKlBJomM0F6aJ'; //declara encriptação 
$custo = '12';
//pega informações do formulario
$nome = $_POST['nome']; 
$login = $_POST['usuario']; 
$senha = $_POST['senha'];
$email = $_POST['email'];
//encripta a senha
$hash = crypt($senha, '$2a$' . $custo . '$' . $salt . '$');

   if (isset($login)) {  //se tiver um login, consulta banco
	    $verifica = mysql_query("SELECT * FROM usuarios WHERE usuario = '$login' OR email = '$email'") or die("erro ao selecionar");
        if (mysql_num_rows($verifica)>0){ //se houver algum, não cadastra
            echo"<script language='javascript' type='text/javascript'>alert('Este usuário/email já existe');window.location.href='../index.php';</script>";
            die();
  
   } else {
        $query = "INSERT INTO usuarios (nome,usuario,senha,email) VALUES ('$nome','$login','$hash','$email')"; //se não houver nenhum login igual no banco, insere na tabela "usuarios"
        $insert = mysql_query($query,$conexao); 
        
        if($insert){ //se obteve sucesso na função $insert, mostra mensagem de conclusão e redireciona para login.php
            echo"<script language='javascript' type='text/javascript'>alert('Usuário cadastrado com sucesso!');window.location.href='../login.php'</script>";
        } else { // caso não tenha sucesso, da mensagem de erro
               echo"<script language='javascript' type='text/javascript'>alert('Não foi possível conectar o banco de dados, contate o administrador!');window.location.href='../index.php'</script>";
        }
   }
}
@mysql_close();
?>