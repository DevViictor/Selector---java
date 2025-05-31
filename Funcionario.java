//import java.awt.Color;

import java.awt.*;
import javax.swing.*;

public class Funcionario extends JFrame {
        
       /*public static void main(String[] args)*/ public static void funcionario() {
        
        JFrame window2 = new JFrame("home");

        window2.setBounds(600,120,800,600);

        window2.getContentPane().setBackground(Color.BLACK);


        //Fecha a janela
        window2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
        //Não permite colocar tela cheia
        window2.setResizable(false);
        
        // definindo o layout da tela 
        window2.setLayout(null);


        window2.setVisible(true);
        } 
}
