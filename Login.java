
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login{
    public static void main(String[] args) {

        // Configuração da Janela :

        //Cria a jenala :


        JFrame window = new JFrame("Selector");

        window.setBounds(600,120,800,600);

        window.getContentPane().setBackground(Color.black);


        //Fecha a janela
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
        //Não permite colocar tela cheia
        window.setResizable(false);
        
        // definindo o layout da tela 
        window.setLayout(null);
        

        // retângulo

        JPanel panel = new JPanel();
        panel.setBackground(Color.orange); // cor do retângulo
        panel.setBounds(0, 0, 350, 800); // posição e tamanho

        
        //Conteudos a janela :

        //texto a tela : 

        JLabel texto1 = new JLabel("Bem vindo");
        texto1.setBounds(500,100,150,40);
        texto1.setFont(new Font("Serif", Font.BOLD, 25));
        texto1.setForeground(Color.white);




        JLabel user = new  JLabel ("Usario");
        user.setBounds(450,200,150,40);
        user.setFont(new Font("Serif", Font.BOLD, 15));
        user.setForeground(Color.white);


        JLabel password = new JLabel ("Senha");
        password.setBounds(450,300,150,30);
        password.setFont(new Font("Serif", Font.BOLD, 15));
        password.setForeground(Color.white);


        //campo de digitação 

        JTextField campousuario = new JTextField();
        campousuario.setBounds(450,230,250,20);

        JPasswordField camposenha = new JPasswordField();
        camposenha.setBounds(450,330,250,20);

        //botão 

        JButton login = new JButton("Login");
        login.setBounds(530,400,100,30);
        login.setBackground(Color.orange);
        login.setFont(new Font("Serif", Font.BOLD, 20));
        login.setForeground(Color.white);

        //Adicionando imagem :



        //adicionar algo a janela
        window.add(user);
        window.add(password);
        window.add(campousuario);
        window.add(camposenha);
        window.add(login);
        window.add(texto1);
        window.add(panel);
       

         //Torna a janela visivel
         window.setVisible(true);

        
        
    

    }
}
    
    





