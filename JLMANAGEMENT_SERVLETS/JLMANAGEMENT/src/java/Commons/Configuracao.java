
package Commons;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Configuracao {
    public static void configResponseRequest(HttpServletRequest request, HttpServletResponse response){
        response.setContentType("application/json");
        
        response.addHeader("Access-Control-Allow-Origin", "*");
        response.addHeader("Access-Control-Allow-Methods", "POST,GET,PUT");
        response.addHeader("Access-Control-Allow-Headers", "Content-Type,Accept,X-Requested-With");
    }
}
