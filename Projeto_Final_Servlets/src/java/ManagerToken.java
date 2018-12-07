
import java.util.Random;
import org.apache.shiro.crypto.hash.Md5Hash;
import redis.clients.jedis.Jedis;


public class ManagerToken {
    
    public static String geraToken(String email){
        Random r = new Random();
        int valor = r.nextInt();
        
        Md5Hash mascara = new Md5Hash(valor+"");
        String token = mascara.toHex();
        //cria conexão
        Jedis con = new Jedis("localhost",6379);
        while(con.exists(token)){
            valor = r.nextInt();
            mascara = new Md5Hash(valor+"");
            token = mascara.toHex();
        }
        con.set(token, email);
        con.expire(token, 180);
        return token;
    }
}
