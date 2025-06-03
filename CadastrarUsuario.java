import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class CadastrarUsuario  extends JFrame{
    /*public static void main(String[] args)*/ /**
     * 
     */
    public static void telaCadastro() {
        
    
        JFrame window4 = new JFrame("Adm.page");
        window4.setBounds(600,120,800,600);
        window4.getContentPane().setBackground(Color.black);
        window4.setLayout(null);
        //Fecha a janela
        window4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Não permite colocar tela cheia
        window4.setResizable(false);
        // definindo o layout da tela 
        window4.setLayout(null);

        // Painel
        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.orange); // cor do retângulo
        panel3.setBounds(0, 0, 250, 800); // posição e tamanho
        

        //tema
        JLabel texto3 = new JLabel("Cadastro de Funcionario");
        texto3.setBounds(380,50,300,40);
        texto3.setFont(new Font("Serif", Font.BOLD, 25));
        texto3.setForeground(Color.white);
        
        //texto nome funcionario
        JLabel funcionariotext = new JLabel("Nome do Funcionario :");
        funcionariotext.setBounds(270,130,300,20);
        funcionariotext.setFont(new Font("Serif", Font.BOLD, 17));
        funcionariotext.setForeground(Color.white);

        //texto RA
        JLabel ratext2 = new JLabel("RA :");
        ratext2.setBounds(540,130,300,24);
        ratext2.setFont(new Font("Serif", Font.BOLD, 17));
        ratext2.setForeground(Color.white);

        //texto nome de usuario
        JLabel usuariotext = new JLabel("Usuário :");
        usuariotext.setBounds(270,220,300,20);
        usuariotext.setFont(new Font("Serif", Font.BOLD, 17));
        usuariotext.setForeground(Color.white);

        // visto senha
        JLabel senhatext = new JLabel("Senha :");
        senhatext.setBounds(540,220,300,24);
        senhatext.setFont(new Font("Serif", Font.BOLD, 17));
        senhatext.setForeground(Color.white);
        

        //menu texto :
        JLabel menu2 = new JLabel("Menu");
        menu2.setBounds(90,50,300,40);
        menu2.setFont(new Font("Serif", Font.BOLD, 25));
        menu2.setForeground(Color.white);
        



        //campo de digitação
        
        JTextField campo_funcionario = new JTextField();
        campo_funcionario.setBounds(300,170,150,25);

        JTextField campo_ra = new JTextField();
        campo_ra.setBounds(580,170,150,25);

        JTextField campo_usuario = new JTextField();
        campo_usuario.setBounds(300,260,150,25);

        JTextField campo_senha2 = new JTextField();
        campo_senha2.setBounds(580,260,150,25);



        //botão registrar Funcionario
        JButton registrarf = new JButton("Cadastrar");
        registrarf.setBounds(410,350,200,30);
        registrarf.setBackground(Color.orange);
        registrarf.setFont(new Font("Serif", Font.BOLD, 20));
        registrarf.setForeground(Color.white);

        //Menu:


        //registrar Produto
        JButton cadastro = new JButton("Produto");
        cadastro.setBounds(50,160,150,30);
        cadastro.setBackground(Color.white);
        cadastro.setFont(new Font("Serif", Font.BOLD, 20));
        cadastro.setForeground(Color.black);


        //Cadastrar usuario
        JButton cadastrof = new JButton("Funcionario");
        cadastrof.setBounds(50,220,150,30);
        cadastrof.setBackground(Color.white);
        cadastrof.setFont(new Font("Serif", Font.BOLD, 20));
        cadastrof.setForeground(Color.black);
        
        
        JButton sair = new JButton("Sair");
        sair.setBounds(50,280,150,30);
        sair.setBackground(Color.white);
        sair.setFont(new Font("Serif", Font.BOLD, 20));
        sair.setForeground(Color.black);

        sair.addActionListener( e -> {
            
           Login.main(null);
            
        });

       
       



        // Adicionar conteudo

        window4.add(campo_ra);
        window4.add(sair);
        window4.add(cadastrof);
        window4.add(cadastro);
        window4.add(menu2);
        window4.add(registrarf);
        window4.add(senhatext);
        window4.add(campo_usuario);
        window4.add(usuariotext);
        window4.add(campo_senha2);
        window4.add(campo_funcionario);
        window4.add(funcionariotext);
        window4.add(campo_funcionario);
        window4.add(texto3);
        window4.add(ratext2);
        window4.add(panel3);

        
        window4.setVisible(true);
        

    }
 
    



}
