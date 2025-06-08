public class Produto {

//atributos dos produtos
private String nome;
private double valor;
private int estoque;
private Integer qtd;
private String teste;


//cria o obejto
public  void setNome(String nome){
//define as variaves
    this.nome = nome; 
}


public void setQtd (Integer qtd){
    this.qtd = qtd;
}
public void setValor(double valor){
    this.valor = valor;
}

public void setEstoque(int estoque){
        this.estoque = estoque;
    }

//metodos para pegar os atributos dos produtos
public String getNome() {
    return nome;

}



public double getValor() {
    return valor;

}
public Integer getQtd(){
    return qtd;
}
public int getEstoque() {
        return estoque;
    }

 public String toString() {
    return "Codigo do produto: " + "  |[" + estoque + "]"  + " |Nome do Produto:  " + nome + "     |Quantidade do produto:   " + qtd + "   |Valor: R$ " + valor;

}

}