
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JOptionPane; //mostra erro caso o login e senha estejam errados
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame{
    public static void main(String[] args) {

       
        // Configuração da Janela :

        //Cria a jenala :


        JFrame window = new JFrame("Selector.login");

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
        panel.setBounds(0, 0, 400, 800); // posição e tamanho

        //Conteudos a janela :

        //texto a tela : 

        JLabel texto1 = new JLabel("Bem vindo");
        texto1.setBounds(520,100,150,40);
        texto1.setFont(new Font("Serif", Font.BOLD, 25));
        texto1.setForeground(Color.white);




        JLabel user = new  JLabel ("Usuario");
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

        //botão para acessar as janelas
        login.addActionListener( e -> { //ação do botão de login
            String usuario = campousuario.getText(); //pega oq o usuario digitar
            String senha = new String(camposenha.getPassword()); //pega oq o usuario digitar na senha

            if (usuario.equals("admin") && senha.equals("1234")) {
                window.dispose(); // Fecha a tela de login
                Adm.telaADM();    // Abre a tela do administrador ERRO PQ TA NA MAIN
            }
            else if (usuario.equals("marcola") && senha.equals("1234")){
                window.dispose();
                Funcionario.telaExibirprodutos();
            }
        
            else {
                        JOptionPane.showMessageDialog(window, "Usuário ou senha inválidos!");
                      }
                


        });




        //Adicionando imagem :

        ImageIcon foto = new ImageIcon("logo.png");
        Image imagem = foto.getImage().getScaledInstance(350, 800, Image.SCALE_SMOOTH);

        JLabel labelimage = new JLabel(new ImageIcon(imagem));
        labelimage.setBounds(0, 0, 350, 400);

        //adicionar algo a janela
        window.add(labelimage);
        window.add(user);
        window.add(password);
        window.add(campousuario);
        window.add(camposenha);
        window.add(login);
        window.add(texto1);
        window.add(labelimage);
        window.add(panel);
        
        
       


        //Torna a janela visivel
        window.setVisible(true);
    

    }
}
    
    





