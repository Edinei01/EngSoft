package br.ifsp.app;

import br.ifsp.view.TelaLogin;
import br.ifsp.controller.ControllerLogin;

public class App {
    // Método principal que inicializa a aplicação
    public static void main(String[] args) {
        // Cria uma instância da TelaLogin
        TelaLogin telaLogin = new TelaLogin();
        
        // Cria uma instância do ControllerLogin, passando a TelaLogin como argumento
        ControllerLogin controllerLogin = new ControllerLogin(telaLogin);
        
        // Torna a TelaLogin visível para o usuário
        telaLogin.setVisible(true);
    }
}
