
package model;



public class Vendas {
   private String nomeMercadoria;
   private String mesVenda;
   private int anoVenda;
   private double valorVenda;
   private double quantidadeVendida;

    public Vendas() {
    }

    public Vendas(String nomeMercadoria, String mesVenda, int anoVenda, double valorVenda, double quantidadeVendida) {
        this.nomeMercadoria = nomeMercadoria;
        this.mesVenda = mesVenda;
        this.anoVenda = anoVenda;
        this.valorVenda = valorVenda;
        this.quantidadeVendida = quantidadeVendida;
    }

    public double getQuantidadeVendida() {
        return quantidadeVendida;
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
