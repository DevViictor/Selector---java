import java.util.ArrayList; //biblioteca pra usar lista


public class UsuarioDB {
    //lista de usuarios
    private static ArrayList<Usuario> usuarios = new ArrayList<>(); 

    //adicioa um novo usuario
    public static void adicionarUsuario(Usuario usuario){
        usuarios.add(usuario); //adiciona na lista 
  
    }
    //colcoa todos os usuarios cadastrados
    public static ArrayList<Usuario> listaUsuarios() {
    return usuarios; //retorna a lista

    }

    //verifica se a senha e login estão corretos
    public static boolean checarUsuario(String login, String senha) {
        
        // : = para cada elemento em ou em 
        for (Usuario x : usuarios) { //para cada objeto u do tipo Usuario dentro da lista usuarios, faça tal coisa
            if (x.getlogin().equals(login) && x.getsenha().equals(senha)) {
                return true;
           }
        }
        return false;


    }


        
}