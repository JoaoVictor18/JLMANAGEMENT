
public class Resposta {
    private int codigo;
    private Object conteudo;

    public Resposta(int codigo, Object conteudo) {
        this.codigo = codigo;
        this.conteudo = conteudo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Object getConteudo() {
        return conteudo;
    }

    public void setConteudo(Object conteudo) {
        this.conteudo = conteudo;
    }
}
