package br.ifsp.view;

// Importação das bibliotecas necessárias para a criação da interface gráfica
import javax.swing.*;
import java.awt.*;
import br.ifsp.controller.ControllerLogin;

public class TelaLogin extends JFrame {

    private ControllerLogin controllerLogin;  // Declaração do controlador de login

    // Construtor da classe TelaLogin, que configura a interface gráfica
    public TelaLogin() {
        // Configurações da janela
        setTitle("Tela de Login");  // Define o título da janela
        setSize(400, 350);  // Define o tamanho da janela
        setLocationRelativeTo(null);  // Centraliza a janela na tela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Define que o aplicativo deve fechar ao fechar a janela
        setResizable(false);  // Impede o redimensionamento da janela

        // Criação da instância do controlador de login
        controllerLogin = new ControllerLogin(this); 

        // Criação de um painel que vai armazenar os componentes da interface gráfica
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());  // Layout com restrições para a colocação dos componentes
        GridBagConstraints constraints = new GridBagConstraints();  // Define as restrições do layout
        constraints.insets = new Insets(10, 10, 10, 10);  // Adiciona margem entre os componentes

        // Definindo as cores para o fundo e texto
        Color azulEscuro = new Color(0, 51, 102);  // Cor de fundo escura
        Color branco = new Color(255, 255, 255);  // Cor de texto branca

        panel.setBackground(azulEscuro);  // Define a cor de fundo do painel
        getContentPane().setBackground(azulEscuro);  // Define a cor de fundo da janela

        // Criação do rótulo para o título "Login"
        JLabel titleLabel = new JLabel("Login");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));  // Define a fonte e o tamanho
        titleLabel.setForeground(branco);  // Define a cor do texto como branco
        constraints.gridx = 0;  // Define a posição do componente na coluna 0
        constraints.gridy = 0;  // Define a posição do componente na linha 0
        constraints.gridwidth = 2;  // O título ocupa 2 colunas
        constraints.anchor = GridBagConstraints.CENTER;  // Alinha o título ao centro
        panel.add(titleLabel, constraints);  // Adiciona o rótulo ao painel

        // Criação do rótulo "Usuário:"
        JLabel usuarioLabel = new JLabel("Usuário:");
        usuarioLabel.setFont(new Font("Arial", Font.PLAIN, 16));  // Define a fonte
        usuarioLabel.setForeground(branco);  // Cor do texto
        constraints.gridx = 0;  // Define a posição do componente na coluna 0
        constraints.gridy = 1;  // Define a posição do componente na linha 1
        constraints.gridwidth = 1;  // Ocupa apenas uma coluna
        constraints.anchor = GridBagConstraints.WEST;  // Alinha à esquerda
        panel.add(usuarioLabel, constraints);  // Adiciona o rótulo ao painel

        // Criação do campo de texto para o usuário
        JTextField usuarioField = new JTextField(20);  // Campo de texto com 20 colunas
        usuarioField.setFont(new Font("Arial", Font.PLAIN, 16));  // Define a fonte
        usuarioField.setBackground(azulEscuro);  // Cor de fundo do campo
        usuarioField.setForeground(Color.WHITE);  // Cor do texto
        usuarioField.setCaretColor(Color.WHITE);  // Cor do cursor
        constraints.gridx = 1;  // Define a posição na coluna 1
        constraints.gridy = 1;  // Posição na linha 1
        constraints.gridwidth = 1;  // Ocupa uma coluna
        constraints.fill = GridBagConstraints.HORIZONTAL;  // Preenche horizontalmente
        panel.add(usuarioField, constraints);  // Adiciona o campo ao painel

        // Criação do rótulo "Senha:"
        JLabel senhaLabel = new JLabel("Senha:");
        senhaLabel.setFont(new Font("Arial", Font.PLAIN, 16));  // Define a fonte
        senhaLabel.setForeground(branco);  // Cor do texto
        constraints.gridx = 0;  // Posição na coluna 0
        constraints.gridy = 2;  // Posição na linha 2
        constraints.gridwidth = 1;  // Ocupa uma coluna
        constraints.anchor = GridBagConstraints.WEST;  // Alinha à esquerda
        panel.add(senhaLabel, constraints);  // Adiciona o rótulo ao painel

        // Criação do campo de senha
        JPasswordField senhaField = new JPasswordField(20);  // Campo para senha com 20 colunas
        senhaField.setFont(new Font("Arial", Font.PLAIN, 16));  // Define a fonte
        senhaField.setBackground(azulEscuro);  // Cor de fundo do campo
        senhaField.setForeground(Color.WHITE);  // Cor do texto
        senhaField.setCaretColor(Color.WHITE);  // Cor do cursor
        constraints.gridx = 1;  // Posição na coluna 1
        constraints.gridy = 2;  // Posição na linha 2
        constraints.gridwidth = 1;  // Ocupa uma coluna
        constraints.fill = GridBagConstraints.HORIZONTAL;  // Preenche horizontalmente
        panel.add(senhaField, constraints);  // Adiciona o campo ao painel

        // Criação do botão "Entrar"
        JButton loginButton = new JButton("Entrar");
        loginButton.setFont(new Font("Arial", Font.BOLD, 16));  // Define a fonte
        loginButton.setBackground(azulEscuro);  // Cor de fundo do botão
        loginButton.setForeground(Color.WHITE);  // Cor do texto
        loginButton.setBorder(BorderFactory.createLineBorder(new Color(0, 123, 255), 2));  // Borda do botão
        loginButton.setFocusPainted(false);  // Remove o foco ao clicar no botão
        loginButton.setPreferredSize(new Dimension(150, 40));  // Define o tamanho do botão

        constraints.gridx = 0;  // Posição na coluna 0
        constraints.gridy = 3;  // Posição na linha 3
        constraints.gridwidth = 2;  // O botão ocupa 2 colunas
        constraints.fill = GridBagConstraints.HORIZONTAL;  // Preenche horizontalmente
        panel.add(loginButton, constraints);  // Adiciona o botão ao painel

        // Ação ao clicar no botão de login
        loginButton.addActionListener(e -> {
            // Obtém o texto inserido pelo usuário e a senha
            String usuario = usuarioField.getText();
            String senha = new String(senhaField.getPassword());  // Converte a senha em string

            // Chama o controlador para validar o login com os dados fornecidos
            controllerLogin.validarLogin(usuario, senha);
        });

        // Adiciona o painel à janela
        add(panel);
        setVisible(true);  // Exibe a janela
    }

    // Método para mostrar mensagens simples para o usuário
    public void mostrarMensagem(String mensagem) {
        JOptionPane.showMessageDialog(this, mensagem);  // Exibe a mensagem em um pop-up
    }

    // Método para mostrar mensagens de erro ou sucesso com título
    public void mostrarMensagem(String mensagem, String titulo) {
        JOptionPane.showMessageDialog(this, mensagem, titulo, JOptionPane.ERROR_MESSAGE);  // Exibe a mensagem de erro
    }

    // Método principal para executar a aplicação
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TelaLogin());  // Inicia a tela de login na thread de interface gráfica
    }
}
