function validatePassword(form){ 
	senha = document.formcadastro.password.value
	confirmaSenha = document.formcadastro.confirmpassword.value
	if (senha != confirmaSenha){
		alert("Repita a senha corretamente");
		document.formulario.confirmpassword.focus();	
		return false;
	}
}