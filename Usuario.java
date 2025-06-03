//classe do usuaruio

public class Usuario {

//atribytos do usuario
private String nome;
private String login;
private String senha; 




//criar um usuaruoi
public Usuario(String nome, String login, String senha){
    //define as variavis
    this.nome = nome;
    this.login = login;
    this.senha = senha; 

}
//metodos para pegar os atributos do usuario
public String getnome(){
    return nome;
   //retorna o nome do usuario

}

public String getlogin() {
    return login;
    //retorna o login do usuario
}



public String getsenha() {
    return senha;    
    //retorna o senha do usuario

}

public String toString() {
    return nome + "(" + login + ")"; //mostra nome e login

}


}