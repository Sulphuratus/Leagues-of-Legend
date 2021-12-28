package br.edu.iftm.views;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class LeagueOfLegends {
    public static void main(String[] args) {
        
        JFrame janela = new JFrame("Tela");
        janela.setBounds(250, 120, 1280, 700);
        janela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //janela.setUndecorated(true);

        TelaLogin telalogin =  new TelaLogin();
        
        janela.add(telalogin);
        janela.setVisible(true);

        /*JFrame janela2 = new JFrame("Janela 2");
        janela2.setBounds(300, 300, 200, 200);
        janela2.setVisible(true);*/



    }
}
