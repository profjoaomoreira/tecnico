<?php
$Local_Host = "localhost";
$User_Name = "root";
$Password = "";
$Db_Name = "dbteste";
$conexao = @mysql_connect($Local_host, $User_Name, $Password);
$db = @mysql_select_db($Db_Name);
?>