
package Servlets;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Resposta {
    private int cod;
    private Object resultado;

    public Resposta(int cod, Object resultado) {
        this.cod = cod;
        this.resultado = resultado;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public Object getResultado() {
        return resultado;
    }

    public void setResultado(Object resultado) {
        this.resultado = resultado;
    }
    
    public String toJSON(){
        ObjectMapper mascara = new ObjectMapper();
        try {
            String resultado = mascara.writeValueAsString(this);
            return resultado;
        } catch (JsonProcessingException ex) {
            return "{ \"cod\":500,\"resultado\":\"erro no JSON\" }";
        }
    }
}
