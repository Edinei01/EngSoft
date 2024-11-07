package br.ifsp.view;

import javax.swing.*;
import java.awt.*;
import br.ifsp.controller.ControllerLogin;

public class TelaLogin extends JFrame {

    private ControllerLogin controllerLogin;

    public TelaLogin() {
        // Configurações da janela
        setTitle("Tela de Login");
        setSize(400, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        controllerLogin = new ControllerLogin(this); // Criando instância do ControllerLogin

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(10, 10, 10, 10);
        
        Color azulEscuro = new Color(0, 51, 102);
        Color branco = new Color(255, 255, 255);

        panel.setBackground(azulEscuro);
        getContentPane().setBackground(azulEscuro);

        JLabel titleLabel = new JLabel("Login");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setForeground(branco);
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        panel.add(titleLabel, constraints);

        JLabel usuarioLabel = new JLabel("Usuário:");
        usuarioLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        usuarioLabel.setForeground(branco);
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.anchor = GridBagConstraints.WEST;
        panel.add(usuarioLabel, constraints);

        JTextField usuarioField = new JTextField(20);
        usuarioField.setFont(new Font("Arial", Font.PLAIN, 16));
        usuarioField.setBackground(azulEscuro);
        usuarioField.setForeground(Color.WHITE);
        usuarioField.setCaretColor(Color.WHITE);
        constraints.gridx = 1;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        panel.add(usuarioField, constraints);

        JLabel senhaLabel = new JLabel("Senha:");
        senhaLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        senhaLabel.setForeground(branco);
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.anchor = GridBagConstraints.WEST;
        panel.add(senhaLabel, constraints);

        JPasswordField senhaField = new JPasswordField(20);
        senhaField.setFont(new Font("Arial", Font.PLAIN, 16));
        senhaField.setBackground(azulEscuro);
        senhaField.setForeground(Color.WHITE);
        senhaField.setCaretColor(Color.WHITE);
        constraints.gridx = 1;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        panel.add(senhaField, constraints);

        JButton loginButton = new JButton("Entrar");
        loginButton.setFont(new Font("Arial", Font.BOLD, 16));
        loginButton.setBackground(azulEscuro);
        loginButton.setForeground(Color.WHITE);
        loginButton.setBorder(BorderFactory.createLineBorder(new Color(0, 123, 255), 2));
        loginButton.setFocusPainted(false);
        loginButton.setPreferredSize(new Dimension(150, 40));

        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.gridwidth = 2;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        panel.add(loginButton, constraints);

        loginButton.addActionListener(e -> {
            // Obtém o texto do usuário e a senha
            String usuario = usuarioField.getText();
            String senha = new String(senhaField.getPassword());

            // Chama o controller para validar o login
            controllerLogin.validarLogin(usuario, senha);
        });

        add(panel);
        setVisible(true);
    }

    // Método para mostrar mensagens de erro ou sucesso
    public void mostrarMensagem(String mensagem) {
        JOptionPane.showMessageDialog(this, mensagem);
    }

    public void mostrarMensagem(String mensagem, String titulo) {
        JOptionPane.showMessageDialog(this, mensagem, titulo, JOptionPane.ERROR_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TelaLogin());
    }
}
