public class Produto {

//atributos dos produtos
private String nome;
private int estoque;

//cria o obejto
public Produto(String nome, int estoque){
//define as variaves
    this.nome = nome; 
    this.estoque = estoque;

}
//metodos para pegar os atributos dos produtos
public String getNome() {
    return nome;

}

public int getEstoque() {
    return estoque;

}

//atualiza o estoque
public void setEstoque(int estoqueAtualizado) {
    this.estoque = estoqueAtualizado;
}

public String toString() {

    return nome + "(Estoque: " + estoque + ")"; 

}



}