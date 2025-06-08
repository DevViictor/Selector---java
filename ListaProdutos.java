import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ListaProdutos extends JFrame {

    // Modelo global para armazenar transferências
    static DefaultListModel<String> listaTransferidos = new DefaultListModel<>();

    public static void telaLista() {
        JFrame window = new JFrame("Selector.Lista");
        window.setBounds(600, 120, 800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);
        window.setLayout(null);
        window.setResizable(false);

        // Painel lateral
        JPanel panel = new JPanel();
        panel.setBackground(Color.orange);
        panel.setBounds(0, 0, 250, 600);
        panel.setLayout(null);

        JLabel menu = new JLabel("Menu");
        menu.setBounds(90, 50, 300, 40);
        menu.setFont(new Font("Serif", Font.BOLD, 25));
        menu.setForeground(Color.white);
        panel.add(menu);

        // Botões na lateral
        JButton sair = new JButton("Sair");
        sair.setBounds(50, 340, 150, 30);
        sair.setBackground(Color.white);
        sair.setFont(new Font("Serif", Font.BOLD, 20));
        sair.setForeground(Color.black);
        sair.addActionListener(e -> {
            window.dispose();
            Login.main(null);
        });
        panel.add(sair);

        JButton acompanhar = new JButton("Transferência");
        acompanhar.setBounds(50, 280, 160, 30);
        acompanhar.setBackground(Color.white);
        acompanhar.setFont(new Font("Serif", Font.BOLD, 17));
        acompanhar.setForeground(Color.black);
        panel.add(acompanhar);

        JButton Estoque = new JButton("Registrar");
        Estoque.setBounds(50, 220, 150, 30);
        Estoque.setBackground(Color.white);
        Estoque.setFont(new Font("Serif", Font.BOLD, 18));
        Estoque.setForeground(Color.black);
        Estoque.addActionListener(e -> {
            window.dispose();
            Adm.telaADM();
        });
        

        // Título principal
        JLabel titulo = new JLabel("Lista de Produtos");
        titulo.setBounds(410, 30, 400, 30);
        titulo.setFont(new Font("Serif", Font.BOLD, 25));
        titulo.setForeground(Color.white);

        // Monta lista de produtos
        DefaultListModel<String> model = new DefaultListModel<>();
        for (Produto p : ProdutoDB.getProdutos()) {
            model.addElement(p.toString());
        }

        JList<String> lista = new JList<>(model);
        lista.setFont(new Font("Monospaced", Font.PLAIN, 14));
        lista.setBackground(Color.BLACK);
        lista.setForeground(Color.WHITE);
        lista.setSelectionBackground(Color.DARK_GRAY);
        lista.setSelectionForeground(Color.YELLOW);

        JScrollPane scroll = new JScrollPane(lista);
        scroll.setBounds(270, 100, 480, 280);

        // Botão remover
        JButton remover = new JButton("Remover Produto");
        remover.setBounds(270, 400, 220, 30);
        remover.setBackground(Color.orange);
        remover.setFont(new Font("Serif", Font.BOLD, 18));
        remover.setForeground(Color.white);
        remover.addActionListener(e -> {
            int index = lista.getSelectedIndex();
            if (index != -1) {
                ProdutoDB.removerProduto(index);
                model.remove(index);
                JOptionPane.showMessageDialog(window, "Produto removido com sucesso!");
            } else {
                JOptionPane.showMessageDialog(window, "Selecione um produto para remover.");
            }
        });

        
        // Quantidade para transferir
        JLabel qtdLabel = new JLabel("Qtd a transferir:");
        qtdLabel.setBounds(270, 450, 150, 30);
        qtdLabel.setForeground(Color.WHITE);
        qtdLabel.setFont(new Font("Serif", Font.BOLD, 16));

        JTextField campoQtd = new JTextField();
        campoQtd.setBounds(410, 450, 100, 30);

        // Destino para transferência
        JLabel destinoLabel = new JLabel("Destino:");
        destinoLabel.setBounds(270, 490, 100, 30);
        destinoLabel.setForeground(Color.WHITE);
        destinoLabel.setFont(new Font("Serif", Font.BOLD, 16));

        JTextField campoDestino = new JTextField();
        campoDestino.setBounds(400, 490, 270, 30);

        // Botão transferir
        JButton transferir = new JButton("Transferir");
        transferir.setBounds(520, 450, 150, 30);
        transferir.setBackground(Color.orange);
        transferir.setFont(new Font("Serif", Font.BOLD, 18));
        transferir.setForeground(Color.white);
        transferir.addActionListener(e -> {
            int index = lista.getSelectedIndex();
            if (index == -1) {
                JOptionPane.showMessageDialog(window, "Selecione um produto.");
                return;
            }
            try {
                int qtd = Integer.parseInt(campoQtd.getText());
                String destino = campoDestino.getText().trim();
                if (destino.isEmpty()) {
                    JOptionPane.showMessageDialog(window, "Informe o destino da transferência.");
                    return;
                }
                Produto selecionado = ProdutoDB.getProdutos().get(index);
                if (qtd <= 0 || qtd > selecionado.getQtd()) {
                    JOptionPane.showMessageDialog(window, "Quantidade inválida!");
                    return;
                }
                selecionado.setQtd(selecionado.getQtd() - qtd);
                model.set(index, selecionado.toString());
                listaTransferidos.addElement(selecionado.getNome() + " → " + qtd + " unid. → " + destino);
                JOptionPane.showMessageDialog(window, "Transferência realizada com sucesso!");
                campoQtd.setText("");
                campoDestino.setText("");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(window, "Digite uma quantidade válida.");
            }
        });

        // Ação do botão acompanhamento
        acompanhar.addActionListener(e -> {
            JFrame telaAcomp = new JFrame("Acompanhamento de Transferências");
            telaAcomp.setBounds(650, 150, 500, 400);
            telaAcomp.getContentPane().setBackground(Color.BLACK);
            telaAcomp.setLayout(null);

            JLabel t = new JLabel("Itens Transferidos:");
            t.setBounds(20, 20, 400, 30);
            t.setFont(new Font("Serif", Font.BOLD, 20));
            t.setForeground(Color.white);

            JList<String> listAcomp = new JList<>(listaTransferidos);
            listAcomp.setFont(new Font("Monospaced", Font.PLAIN, 14));
            listAcomp.setBackground(Color.DARK_GRAY);
            listAcomp.setForeground(Color.white);

            JScrollPane spAcomp = new JScrollPane(listAcomp);
            spAcomp.setBounds(20, 60, 440, 250);

            telaAcomp.add(t);
            telaAcomp.add(spAcomp);
            telaAcomp.setVisible(true);
        });

        // Adiciona todos os componentes à janela
        window.add(Estoque);
        window.add(panel);
        window.add(titulo);
        window.add(scroll);
        window.add(remover);
        window.add(qtdLabel);
        window.add(campoQtd);
        window.add(destinoLabel);
        window.add(campoDestino);
        window.add(transferir);

        window.setVisible(true);
    }
}
