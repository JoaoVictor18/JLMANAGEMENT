
import java.util.Vector;
import redis.clients.jedis.Jedis;



public class Usuario_Controler {
    public static int cadastro(String email, String nome, String senha, int idade){
       boolean existe = verificaEx(email);
       
       if(existe == true){
           return 301;
       }else{
           //chama  a DAO para realizar a persistencia dos dados
           Usuario novoUser = new Usuario(nome, email, idade,senha);
           BancoFake.insereNovoUser(novoUser);
           return 200;
       }
    }
    public static boolean verificaEx(String email){
        Vector<Usuario> temp = BancoFake.recuperaTodosUsers();
        
        for(int i = 0; i < temp.size();i++){
            if(temp.get(i).getEmail().equals(email)){
                return true;
            }
        }
        return false;
    }
    
    public static int login(String email, String senha){
        // chama a DAO para recuperar as informações do usuário
        Vector<Usuario> temp = BancoFake.recuperaTodosUsers();
        
        for(Usuario i : temp){
            if(i.getEmail().equals(email) && i.getSenha().equals(senha)){
                return 200;
            }
        }
        //caso o usuário não exista
        return 401;
    }

    public static void alteraSenha(String token, String novaSenha) {
        Jedis con = new Jedis("localhost", 6379);
        
        if(con.exists(token)){
            String email = con.get(token);
            
            Usuario temp = BancoFake.recuperaUsuarioEmail(email);
            temp.setSenha(novaSenha);
            
            con.del(token);
        }
    }

}

