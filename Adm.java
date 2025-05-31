import java.awt.Color;

import javax.swing.JFrame;

import javax.swing.JPanel;

public class Adm {
    public static void main(String[] args) {
        JFrame window3 = new JFrame("Selector");

        window3.setBounds(600,120,800,600);

        window3.getContentPane().setBackground(Color.black);


        //Fecha a janela
        window3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
        //Não permite colocar tela cheia
        window3.setResizable(false);
        
        // definindo o layout da tela 
        window3.setLayout(null);
        

        // retângulo

        JPanel panel = new JPanel();
        panel.setBackground(Color.orange); // cor do retângulo
        panel.setBounds(0, 0, 350, 800); // posição e tamanho


        window3.add(panel);

        window3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window3.setLayout(null);
        window3.setVisible(true);
        

    }
    
}
