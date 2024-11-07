package br.ifsp.view;

import javax.swing.*;
import java.awt.*;

public class TelaPrincipal extends JFrame {

    // Construtor da classe TelaPrincipal, que define as configurações da tela
    public TelaPrincipal() {
        // Configurações da tela principal
        setTitle("Tela Principal");  // Define o título da janela
        setSize(400, 300);  // Define o tamanho da janela (largura: 400px, altura: 300px)
        setLocationRelativeTo(null);  // Centraliza a janela na tela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Fecha a aplicação quando a janela for fechada
        setResizable(false);  // Desabilita o redimensionamento da janela

        // Cor de fundo igual à tela de login
        Color azulEscuro = new Color(0, 51, 102);  // Define uma cor azul escuro
        getContentPane().setBackground(azulEscuro);  // Aplica a cor de fundo azul escuro à tela principal

        // Label "Bem-vindo"
        JLabel label = new JLabel("Bem-vindo à Tela Principal!");  // Cria um label com a mensagem "Bem-vindo"
        label.setFont(new Font("Arial", Font.BOLD, 20));  // Define a fonte como Arial, negrito e tamanho 20
        label.setForeground(Color.WHITE);  // Define a cor do texto como branco
        add(label);  // Adiciona o label à tela

        // Centralizando o JLabel na tela
        label.setHorizontalAlignment(SwingConstants.CENTER);  // Centraliza o texto horizontalmente
        label.setVerticalAlignment(SwingConstants.CENTER);  // Centraliza o texto verticalmente
    }
}
