import javax.swing.*;
import java.awt.*;

public class Funcionario extends JFrame {

    public static void telaExibirprodutos() {
        JFrame frame = new JFrame("Lista de Produtos");
        frame.setBounds(600,120,800,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Converte lista para array
        DefaultListModel<String> model = new DefaultListModel<>();
        for (Produto p : ProdutoDB.getProdutos()) {
            model.addElement(p.toString());
        }

        JList<String> lista = new JList<>(model);
        JScrollPane scroll = new JScrollPane(lista);

        lista.setBackground(Color.BLACK);
        lista.setForeground(Color.WHITE);

        frame.add(scroll, BorderLayout.CENTER);

        JButton sair = new JButton("Sair");
        sair.setPreferredSize(new Dimension(100, 40));
        sair.setBackground(Color.white);
        sair.setFont(new Font("Serif", Font.BOLD, 20));
        sair.setForeground(Color.black);

        sair.addActionListener(e -> {
            frame.dispose();
            Login.main(null);
        });

        JButton removerItem = new JButton("Remover");
        removerItem.setPreferredSize(new Dimension(130, 40));
        removerItem.setBackground(Color.white);
        removerItem.setFont(new Font("Serif", Font.BOLD, 20));
        sair.setForeground(Color.black);

        removerItem.addActionListener(e -> {
                int index = lista.getSelectedIndex(); //pega o item selecionado

                if (index != -1) {
                        ProdutoDB.removerProduto(index);
                        model.remove(index);
                        JOptionPane.showMessageDialog(frame, "Produto removido com sucesso");

                }else {
                        JOptionPane.showMessageDialog(frame, "Selecione um produto pra ser removido");
                }




        });



        // Coloca o botão na parte inferior
        JPanel panelBotoes = new JPanel();
        panelBotoes.add(removerItem);
        panelBotoes.add(sair);

        frame.add(panelBotoes, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}
