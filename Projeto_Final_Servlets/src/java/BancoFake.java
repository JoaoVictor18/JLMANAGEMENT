
import java.util.Vector;

//gambiarra
public class BancoFake {
    private static Vector<Usuario> usuarios;
    
    public static void insereNovoUser(Usuario novoUser){
        if(usuarios == null){
            usuarios = new Vector<>();
        }
        usuarios.add(novoUser);
    }
    
    public static Vector<Usuario> recuperaTodosUsers(){
        if(usuarios == null){
            usuarios = new Vector<>();
        }
        return usuarios;
    }
    
    public static Usuario recuperaUsuarioEmail(String email){
        for(int i = 0; i < usuarios.size(); i++){
            if(usuarios.get(i).getEmail().equals(email)){
                return usuarios.get(i);
            }
        }
        return null;
    }
}
