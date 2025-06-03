import java.util.ArrayList; //biblioteca pra usar lista

public class ProdutoDB {
    //cria a lista dos protudos
    private static ArrayList<Produto> produtos = new ArrayList<>();

    //adicioa um novo produto
    public static void adicionarProduto(Produto produto){
        produtos.add(produto); //adiciona na lista 
  
    }


    //colcoa todos os produtos adicionados
    public static ArrayList<Produto> listaProdutos() {
        return produtos; //retorna a lista
    
    }

    public static Produto buscarProduto(String nome) {
        // : = para cada elemento em ou em 
        for (Produto x : produtos) { //para cada objeto u do tipo Usuario dentro da lista usuarios, faça tal coisa
            if (x.getNome().equalsIgnoreCase(nome)) {
                return x;

            }
        }

        return null;


    }

    //reduzir o estoque
    public static boolean reduzirEStoque(String nome, int quantidade) {
        Produto produto = buscarProduto(nome); //busca o produto
        if (produto != null && produto.getEstoque() >= quantidade) {
            produto.setEstoque(produto.getEstoque() - quantidade); //atualiza o estoque
            return true;

        }
        return false; //produto não se encontra ou o estoqu esta cheio

    }

}