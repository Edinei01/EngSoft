package br.ifsp.controller;

import br.ifsp.model.Usuario;  // Importa a classe Usuario, que contém os dados do usuário.
import br.ifsp.view.TelaLogin;  // Importa a classe TelaLogin, que representa a tela de login.
import br.ifsp.view.TelaPrincipal;  // Importa a classe TelaPrincipal, que será exibida após o login bem-sucedido.

public class ControllerLogin {

    private TelaLogin telaLogin;  // A variável telaLogin é responsável por controlar a interface da tela de login.

    // Aqui você cria um objeto Usuario para representar o usuário válido.
    // Neste exemplo, o usuário e a senha são fixos para simplificação.
    private Usuario usuarioValido = new Usuario("usuario", "senha123");  // Cria um usuário com nome "usuario" e senha "senha123".

    // Construtor da classe ControllerLogin, que recebe uma instância de TelaLogin como parâmetro.
    public ControllerLogin(TelaLogin telaLogin) {
        this.telaLogin = telaLogin;  // Inicializa a variável telaLogin com a instância recebida.
    }

    // Método para validar o login do usuário
    public void validarLogin(String usuario, String senha) {
        // Verifica se o nome de usuário e a senha fornecidos pelo usuário correspondem aos dados armazenados em usuarioValido.
        if (usuarioValido.getNomeUsuario().equals(usuario) && usuarioValido.getSenha().equals(senha)) {
            // Se os dados de login estiverem corretos, exibe uma mensagem de sucesso.
            telaLogin.mostrarMensagem("Login bem-sucedido!");  // Chama o método mostrarMensagem da TelaLogin para mostrar uma mensagem de sucesso.
            telaLogin.dispose();  // Fecha a tela de login.

            // Cria e exibe a Tela Principal.
            TelaPrincipal telaPrincipal = new TelaPrincipal();  // Cria uma nova instância da TelaPrincipal.
            telaPrincipal.setVisible(true);  // Torna a TelaPrincipal visível, mostrando-a para o usuário.
        } else {
            // Se os dados de login estiverem incorretos, exibe uma mensagem de erro.
            telaLogin.mostrarMensagem("Usuário ou senha inválidos", "Erro");  // Chama o método mostrarMensagem da TelaLogin para mostrar uma mensagem de erro.
        }
    }
}
