
package model;



public class Vendas {
   private String nomeMercadoria;
   private String mesVenda;
   private String anoVenda;
   private double valorVenda;
   private double quantidadeVendida;
   private int idVenda;

    public Vendas() {
    }

    public Vendas(String nomeMercadoria, String mesVenda, String anoVenda, double valorVenda, double quantidadeVendida) {
        this.nomeMercadoria = nomeMercadoria;
        this.mesVenda = mesVenda;
        this.anoVenda = anoVenda;
        this.valorVenda = valorVenda;
        this.quantidadeVendida = quantidadeVendida;
    }

    public Vendas(String nomeMercadoria, String mesVenda, String anoVenda, double valorVenda, double quantidadeVendida, int idVenda) {
        this.nomeMercadoria = nomeMercadoria;
        this.mesVenda = mesVenda;
        this.anoVenda = anoVenda;
        this.valorVenda = valorVenda;
        this.quantidadeVendida = quantidadeVendida;
        this.idVenda = idVenda;
    }

    public int getIdVenda() {
        return idVenda;
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

    public String getAnoVenda() {
        return anoVenda;
    }

    public double getValorVenda() {
        return valorVenda;
    }
   
}
