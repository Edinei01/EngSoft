package br.ifsp.view;

import javax.swing.*;
import java.awt.*;

public class TelaPrincipal extends JFrame {
    public TelaPrincipal() {
        // Configurações da tela principal
        setTitle("Tela Principal");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false); // Desabilita o redimensionamento da janela

        // Cor de fundo igual à tela de login
        Color azulEscuro = new Color(0, 51, 102);
        getContentPane().setBackground(azulEscuro);

        // Label "Bem-vindo"
        JLabel label = new JLabel("Bem-vindo à Tela Principal!");
        label.setFont(new Font("Arial", Font.BOLD, 20));  // Texto em negrito
        label.setForeground(Color.WHITE);  // Texto em branco
        add(label);

        // Centralizando o JLabel na tela
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.CENTER);
    }
}
