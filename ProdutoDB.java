import java.util.ArrayList; //biblioteca pra usar lista

public class ProdutoDB {
    //cria a lista dos protudos
    private static ArrayList<Produto> produtos = new ArrayList<>();
   
    //adicioa um novo produto
    public static void adicionarProduto(Produto p1){
        produtos.add(p1); //adiciona na lista 
  
    }


    //colcoa todos os produtos adicionados
    public static ArrayList<Produto> getProdutos() {
        return produtos; //retorna a lista
    
    }

    public static void removerProduto(int index) {
    if (index >= 0 && index < produtos.size()) {
        produtos.remove(index); //remove da lista
    }
}

}