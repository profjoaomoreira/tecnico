<!DOCTYPE HTML>
<!--
	Solid State by HTML5 UP
	html5up.net | @ajlkn
	Free for personal and commercial use under the CCA 3.0 license (html5up.net/license)
-->
<html>
	<head>
	    <title>Cadastre-se</title>
    	<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		<!--[if lte IE 8]><script src="assets/js/ie/html5shiv.js"></script><![endif]-->
		<link rel="stylesheet" href="assets/css/main.css" />

		<!--[if lte IE 9]><link rel="stylesheet" href="assets/css/ie9.css" /><![endif]-->
		<!--[if lte IE 8]><link rel="stylesheet" href="assets/css/ie8.css" /><![endif]-->
	</head>
    <body>
					   <section id="footer">
						<div class="inner">
							<h2 class="major">Cadastre-se aqui</h2>
							<p>Cadastre-se</p>
							<form method="POST" id="formcadastro" name="formcadastro"  action="config/verifica.php" >
									
								<div class="field">
								     <label for="nome">Nome</label>
									 <input type="text" name="nome" id="nome" placeholder="Digite seu Nome" required/>
								</div>
								<div class="field">
									<label for="usuario">Usuario</label>
									<input type="text" name="usuario" id="usuario" placeholder="Digite Seu Nome de Usuario" required/>
								</div>
								<div class="field">
									<label for="email">Email</label>
									<input type="email" name="email" id="email" placeholder="Digite seu email" required/>
								</div>
								<div class="field">
									<label for="senha">Senha</label>
									<input type="password" name="senha" id="senha" placeholder="Digite Sua Senha" required/>
								</div>
								<div class="field">
								    <label for="confirm_senha">Confirme Sua senha</label>
									<input type="password" name="confirm_senha" id="confirm_senha" placeholder="Confirme Sua Senha" required/>
								</br>
								<ul class="actions">
									<li><input type="submit" value="Criar Conta"/></li>
								</ul>
							</form>
							Já tem uma conta? <a href="login.php">Clique aqui!</a>

							<!-- Copyright -->
							<ul class="copyright">
								<li>&copy; WEB Solutions Ltda. All rights reserved.</li>
							</ul>
						</div>
					</section>
			</div>
					
    </body>			
</html>
