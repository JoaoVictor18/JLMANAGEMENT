
package model;



public class Vendas {
   private String nomeMercadoria;
   private String mesVenda;
   private int anoVenda;
   private double valorVenda;

    public Vendas() {
    }

    public Vendas(String nomeMercadoria, String mesVenda, int anoVenda, double valorVenda) {
        this.nomeMercadoria = nomeMercadoria;
        this.mesVenda = mesVenda;
        this.anoVenda = anoVenda;
        this.valorVenda = valorVenda;
    }

    public String getNomeMercadoria() {
        return nomeMercadoria;
    }

    public String getMesVenda() {
        return mesVenda;
    }

    public int getAnoVenda() {
        return anoVenda;
    }

    public double getValorVenda() {
        return valorVenda;
    }
   
}
