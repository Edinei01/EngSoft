package br.ifsp.controller;

import br.ifsp.view.TelaLogin;
import br.ifsp.view.TelaPrincipal;

public class ControllerLogin {

    private TelaLogin telaLogin;

    public ControllerLogin(TelaLogin telaLogin) {
        this.telaLogin = telaLogin;
    }

    // Método para validar o login
    public void validarLogin(String usuario, String senha) {
        // Validação simples de login (usuário e senha fixos)
        if ("usuario".equals(usuario) && "senha123".equals(senha)) {
            telaLogin.mostrarMensagem("Login bem-sucedido!");
            telaLogin.dispose(); // Fecha a tela de login

            // Cria e exibe a Tela Principal
            TelaPrincipal telaPrincipal = new TelaPrincipal();
            telaPrincipal.setVisible(true);
        } else {
            telaLogin.mostrarMensagem("Usuário ou senha inválidos", "Erro");
        }
    }
}
