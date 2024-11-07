package br.ifsp.controller;

import br.ifsp.view.TelaLogin;
import br.ifsp.view.TelaPrincipal;

public class ControllerLogin {

    private TelaLogin telaLogin;  // Declaração da variável telaLogin para armazenar a instância da TelaLogin

    // Construtor da classe ControllerLogin que recebe a instância da TelaLogin
    public ControllerLogin(TelaLogin telaLogin) {
        this.telaLogin = telaLogin;  // Inicializa a variável telaLogin com a instância passada
    }

    // Método para validar o login
    public void validarLogin(String usuario, String senha) {
        // Validação simples de login (usuário e senha fixos)
        // Verifica se o usuário é "usuario" e a senha é "senha123"
        if ("usuario".equals(usuario) && "senha123".equals(senha)) {
            telaLogin.mostrarMensagem("Login bem-sucedido!");  // Exibe uma mensagem de sucesso para o usuário
            telaLogin.dispose();  // Fecha a tela de login

            // Cria uma nova instância da TelaPrincipal e a torna visível
            TelaPrincipal telaPrincipal = new TelaPrincipal();
            telaPrincipal.setVisible(true);  // Exibe a tela principal após o login bem-sucedido
        } else {
            // Se o login for inválido, exibe uma mensagem de erro
            telaLogin.mostrarMensagem("Usuário ou senha inválidos", "Erro");
        }
    }
}
