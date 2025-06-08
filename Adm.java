import java.awt.Color;
import java.awt.Font;
 import java.util.ArrayList; //biblioteca pra usar lista
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Adm  extends JFrame{
   
public  static void telaADM() {
    
        //configurações da janela
        JFrame window3 = new JFrame("Selector.Adm");
        window3.setBounds(600,120,800,600);
        window3.getContentPane().setBackground(Color.black);
        window3.setLayout(null);


        //Fecha a janela
        window3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
        //Não permite colocar tela cheia
        window3.setResizable(false);
        
        // definindo o layout da tela 
        window3.setLayout(null);


        // Painel

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.orange); // cor do retângulo
        panel2.setBounds(0, 0, 250, 800); // posição e tamanho
        

        //tema
        JLabel texto2 = new JLabel("Registro de Produtos");
        texto2.setBounds(380,50,300,40);
        texto2.setFont(new Font("Serif", Font.BOLD, 25));
        texto2.setForeground(Color.white);
        
        // texto nome produto
        JLabel produtotext = new JLabel("Nome do Produto :");
        produtotext.setBounds(270,130,300,20);
        produtotext.setFont(new Font("Serif", Font.BOLD, 17));
        produtotext.setForeground(Color.white);

        //texto codigo
        JLabel numtext = new JLabel("Código do Produto:");
        numtext.setBounds(540,130,300,24);
        numtext.setFont(new Font("Serif", Font.BOLD, 17));
        numtext.setForeground(Color.white);

        //texto tipo
        JLabel tipotext = new JLabel("Quantidade do Produto:");
        tipotext.setBounds(270,220,300,20);
        tipotext.setFont(new Font("Serif", Font.BOLD, 17));
        tipotext.setForeground(Color.white);

        // visto texto

        JLabel valortext = new JLabel("Valor :");
        valortext.setBounds(540,220,300,24);
        valortext.setFont(new Font("Serif", Font.BOLD, 17));
        valortext.setForeground(Color.white);
        

        //menu texto :

        JLabel menu = new JLabel("Menu");
        menu.setBounds(90,50,300,40);
        menu.setFont(new Font("Serif", Font.BOLD, 25));
        menu.setForeground(Color.white);
        



        //campo de digitação
        
        JTextField campo_produto = new JTextField();
        campo_produto.setBounds(300,170,150,25);

        JTextField num_produto = new JTextField();
        num_produto.setBounds(580,170,150,25);

        JTextField qtd_produto = new JTextField();
        qtd_produto.setBounds(300,260,150,25);
        JTextField campo_valor = new JTextField();
        campo_valor.setBounds(580,260,150,25);



        //botão registrar produto e sua ação
        JButton registrar = new JButton("Registrar");
        registrar.setBounds(410,350,200,30);
        registrar.setBackground(Color.orange);
        registrar.setFont(new Font("Serif", Font.BOLD, 20));
        registrar.setForeground(Color.white);
        
        registrar.addActionListener(e ->{
           String nome = campo_produto.getText();
           String valorStr = campo_valor.getText();
           String estoqueStr = num_produto.getText();
           String qtdStr = qtd_produto.getText();

            if (nome.isEmpty() || valorStr.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
                return;}
        try { //trata o codigo em caso de erro
            double valor = Double.parseDouble(valorStr);
            int estoque = Integer.parseInt(estoqueStr);
            int qtd = Integer.parseInt(qtdStr);

            Produto p1 = new Produto();

            p1.setNome(nome);
            p1.setValor(valor);
            p1.setEstoque(estoque);
            p1.setQtd(qtd);

            ProdutoDB.adicionarProduto(p1);

            JOptionPane.showMessageDialog(null, "Produto regitrado!");
        } catch (NumberFormatException ex) { //exibe a mensagem de erro


            JOptionPane.showMessageDialog(null, "Valor ou estoque invalido!");

        }
        campo_produto.setText("");
        campo_valor.setText("");
        num_produto.setText("");
        qtd_produto.setText("");
        
    });

        JButton Estoque = new JButton("Estoque");
        Estoque.setBounds(50, 220, 150, 30);
        Estoque.setBackground(Color.white);
        Estoque.setFont(new Font("Serif", Font.BOLD, 18));
        Estoque.setForeground(Color.black);
        Estoque.addActionListener(e -> {
            window3.dispose();
            ListaProdutos.telaLista();
        });
        


        //botão de sair mais sua acão
        JButton sair = new JButton("Sair");
        sair.setBounds(50,280,150,30);
        sair.setBackground(Color.white);
        sair.setFont(new Font("Serif", Font.BOLD, 20));
        sair.setForeground(Color.black);

        sair.addActionListener( e -> {
         window3.dispose();
         Login.main(null);
           
            
        });

    


        // Adicionar conteudo  na janela
       
        window3.add(Estoque);
        window3.add(sair);
        window3.add(menu);
        window3.add(registrar);
        window3.add(valortext);
        window3.add(campo_valor);
        window3.add(tipotext);
        window3.add(qtd_produto);
        window3.add(num_produto);
        window3.add(numtext);
        window3.add(produtotext);
        window3.add(campo_produto);
        window3.add(texto2);
        window3.add(panel2);
        

        
        window3.setVisible(true);
        
    }
}