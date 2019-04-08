
package contadormoedas;

import java.util.Scanner;


public class ContadorMoedas {

  
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int umReal, cinqCentavos, vincCinCentavos, dezCentavos, cincoCentavos;
        System.out.println("Informe em sequencia quantas moedas de: um real, cinquenta centavos, vinte e cinco centavos, dez centavos e cinco centavos");
        umReal = teclado.nextInt();
        cinqCentavos = teclado.nextInt();
        vincCinCentavos = teclado.nextInt();
        dezCentavos = teclado.nextInt();
        cincoCentavos = teclado.nextInt();
        
        double totalUmReal, totalCinqCentavos, totalVincCinCentavos, totalDezCentavos, totalCincoCentavos;
        totalUmReal = umReal * 1;
        totalCinqCentavos = cinqCentavos * 0.50;
        totalVincCinCentavos = vincCinCentavos * 0.25;
        totalDezCentavos = dezCentavos * 0.10;
        totalCincoCentavos = cincoCentavos * 0.05;
        double valorTotal = totalUmReal + totalCinqCentavos + totalVincCinCentavos + totalDezCentavos + totalCincoCentavos;
        System.out.println("Você tem: R$"+valorTotal);
        System.out.println("Um real: "+totalUmReal+"\nCinquenta centavos: "+totalCinqCentavos+
                "\nVinte e cinco centavos: "+totalVincCinCentavos+"\n Dez centavos: "+totalDezCentavos+
                "\nCinco centavos: "+totalCincoCentavos);
    }
    
}
