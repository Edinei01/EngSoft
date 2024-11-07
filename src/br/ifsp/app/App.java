package br.ifsp.app;

import br.ifsp.view.TelaLogin;
import br.ifsp.controller.ControllerLogin;

public class App {
    public static void main(String[] args) {
        TelaLogin telaLogin = new TelaLogin();
        ControllerLogin controllerLogin = new ControllerLogin(telaLogin);
        telaLogin.setVisible(true);
    }
}
