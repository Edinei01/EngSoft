package br.ifsp.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class TelaLogin extends JFrame {

    public TelaLogin() {
        // Configurações da janela
        setTitle("Tela de Login");
        setSize(400, 350);  // Tamanho da janela
        setLocationRelativeTo(null);  // Centraliza a janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);  // Impede o redimensionamento

        // Criar o painel com layout de GridBagLayout (flexível)
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(10, 10, 10, 10); // Espaçamento entre componentes

        // Definindo as cores do Tawín (supondo um esquema de azul escuro e branco)
        Color azulEscuro = new Color(0, 51, 102);  // Azul escuro
        Color branco = new Color(255, 255, 255);   // Branco para os textos

        // Definindo o fundo da tela
        panel.setBackground(azulEscuro);
        getContentPane().setBackground(azulEscuro);

        // Label "Login" (Título)
        JLabel titleLabel = new JLabel("Login");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));  // Título com fonte maior e negrito
        titleLabel.setForeground(branco);  // Cor do título em branco
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 2;  // Título ocupa duas colunas
        panel.add(titleLabel, constraints);

        // Label "Usuário"
        JLabel usuarioLabel = new JLabel("Usuário:");
        usuarioLabel.setFont(new Font("Arial", Font.PLAIN, 16));  // Fonte maior para o label
        usuarioLabel.setForeground(branco);  // Cor do label em branco
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 1; // Limita o espaço ao label
        panel.add(usuarioLabel, constraints);

        // Campo de texto para o usuário
        JTextField usuarioField = new JTextField(20);
        usuarioField.setFont(new Font("Arial", Font.PLAIN, 16));  // Fonte para o campo de texto
        usuarioField.setBackground(azulEscuro); // Fundo do campo igual ao fundo da janela
        usuarioField.setForeground(Color.WHITE);  // Texto em branco
        usuarioField.setCaretColor(Color.WHITE);  // Cor do cursor em branco
        constraints.gridx = 1;
        constraints.gridy = 1;  // Campo de usuário na mesma linha do label
        constraints.gridwidth = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL; // Preencher horizontalmente
        panel.add(usuarioField, constraints);

        // Efeito de mudar a cor quando o campo estiver focado (clicado)
        usuarioField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                usuarioField.setBackground(new Color(51, 102, 153)); // Cor mais clara ao clicar
            }

            @Override
            public void focusLost(FocusEvent e) {
                usuarioField.setBackground(azulEscuro); // Cor original ao sair do foco
            }
        });

        // Label "Senha"
        JLabel senhaLabel = new JLabel("Senha:");
        senhaLabel.setFont(new Font("Arial", Font.PLAIN, 16));  // Fonte maior para o label
        senhaLabel.setForeground(branco);  // Cor do label em branco
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 1; // Limita o espaço ao label
        panel.add(senhaLabel, constraints);

        // Campo de senha
        JPasswordField senhaField = new JPasswordField(20);
        senhaField.setFont(new Font("Arial", Font.PLAIN, 16));  // Fonte para o campo de senha
        senhaField.setBackground(azulEscuro);  // Fundo do campo igual ao fundo da janela
        senhaField.setForeground(Color.WHITE);  // Texto em branco
        senhaField.setCaretColor(Color.WHITE);  // Cor do cursor em branco
        constraints.gridx = 1;
        constraints.gridy = 2;  // Campo de senha na mesma linha do label
        constraints.gridwidth = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL; // Preencher horizontalmente
        panel.add(senhaField, constraints);

        // Efeito de mudar a cor quando o campo estiver focado (clicado)
        senhaField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                senhaField.setBackground(new Color(51, 102, 153)); // Cor mais clara ao clicar
            }

            @Override
            public void focusLost(FocusEvent e) {
                senhaField.setBackground(azulEscuro); // Cor original ao sair do foco
            }
        });

        // Botão de login personalizado
        JButton loginButton = new JButton("Entrar");
        loginButton.setFont(new Font("Arial", Font.BOLD, 16));  // Fonte maior e negrito
        loginButton.setBackground(azulEscuro);  // Cor de fundo azul escuro
        loginButton.setForeground(Color.WHITE);  // Cor do texto branca
        loginButton.setBorder(BorderFactory.createLineBorder(new Color(0, 123, 255), 2));  // Borda azul clara
        loginButton.setFocusPainted(false);  // Retira o foco quando clica
        loginButton.setPreferredSize(new Dimension(150, 40));  // Diminuindo a largura do botão

        // Centralizar o botão (ajustar as restrições)
        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.gridwidth = 2;  // O botão ocupa duas colunas
        constraints.fill = GridBagConstraints.HORIZONTAL; // Preencher horizontalmente
        panel.add(loginButton, constraints);

        // Adicionar o painel na janela
        add(panel);

        // Exibir a janela
        setVisible(true);
    }

    public static void main(String[] args) {
        // Criar e exibir a tela de login
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TelaLogin();
            }
        });
    }
}
