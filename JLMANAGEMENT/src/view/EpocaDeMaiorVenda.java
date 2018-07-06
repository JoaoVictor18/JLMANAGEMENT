package view;

import controller.VendasController;
import java.awt.Color;
import java.util.Hashtable;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import model.Vendas;

public class EpocaDeMaiorVenda extends javax.swing.JPanel {

    private JScrollPane painelTrocas;

    public EpocaDeMaiorVenda() {
        initComponents();
    }

    public EpocaDeMaiorVenda(JScrollPane painelTrocas) {
        initComponents();
        this.painelTrocas = painelTrocas;
    }

    public boolean verificaCampos() {
        if (nomeMercadoriaText.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Verifique se os campos foram preenchidos corretamente!",
                    "Erro de preenchimento!", JOptionPane.WARNING_MESSAGE);
            nomeMercadoriaText.setBackground(Color.RED);
            return false;
        }
        if (anoText.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Verifique se os campos foram preenchidos corretamente!",
                    "Erro de preenchimento!", JOptionPane.WARNING_MESSAGE);
            anoText.setBackground(Color.RED);
            return false;
        }
        return true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nomeMercadoriaText = new javax.swing.JTextField();
        efetuaBusca = new javax.swing.JButton();
        encerrarBusca = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        anoText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        maiorVendaText = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        qntText = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Época de Maior Venda");

        jLabel2.setText("Nome da Mercadoria:");

        nomeMercadoriaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeMercadoriaTextActionPerformed(evt);
            }
        });

        efetuaBusca.setText("Efetuar Busca");
        efetuaBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                efetuaBuscaActionPerformed(evt);
            }
        });

        encerrarBusca.setText("Encerrar Busca");
        encerrarBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encerrarBuscaActionPerformed(evt);
            }
        });

        jLabel3.setText("Ano:");

        jLabel4.setText("Época com maior venda:");

        jLabel5.setText("Quantidade vendida:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(211, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(efetuaBusca)
                        .addGap(95, 95, 95)
                        .addComponent(encerrarBusca))
                    .addComponent(jLabel1))
                .addGap(290, 290, 290))
            .addGroup(layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(qntText, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(maiorVendaText, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(anoText))
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nomeMercadoriaText, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nomeMercadoriaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(anoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(maiorVendaText, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(qntText, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(efetuaBusca)
                    .addComponent(encerrarBusca))
                .addContainerGap(420, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void encerrarBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encerrarBuscaActionPerformed
        TelaPrincipal telaPrincipal = new TelaPrincipal(this.painelTrocas);
        this.painelTrocas.setViewportView(telaPrincipal);
    }//GEN-LAST:event_encerrarBuscaActionPerformed

    private void efetuaBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_efetuaBuscaActionPerformed
        if (!verificaCampos()) {
            JOptionPane.showMessageDialog(this, "Impossível efetuar busca!", "Verifique os campos obrigatórios!", JOptionPane.WARNING_MESSAGE);
        } else {
            //implementar
            Vector<Vendas> retornoVendas = VendasController.epocaMaiorVenda(nomeMercadoriaText.getText(), anoText.getText());
            Hashtable<String, Integer> tabelaContagem = new Hashtable<>();
            for (int i = 0; i < retornoVendas.size(); i++) {
                String mes = retornoVendas.get(i).getMesVenda();
                tabelaContagem.put(mes, tabelaContagem.containsKey(mes) ? tabelaContagem.get(mes) + 1 : 1);
            }
            int maior = 0;
            String maiorMes = "";
            for (String chave : tabelaContagem.keySet()) {
                if (maior < tabelaContagem.get(chave)) {
                    maior = tabelaContagem.get(chave);
                    maiorMes = chave;
                }
            }
            this.qntText.setText(maior + "");
            this.maiorVendaText.setText(maiorMes);
        }
    }//GEN-LAST:event_efetuaBuscaActionPerformed

    private void nomeMercadoriaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeMercadoriaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeMercadoriaTextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField anoText;
    private javax.swing.JButton efetuaBusca;
    private javax.swing.JButton encerrarBusca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel maiorVendaText;
    private javax.swing.JTextField nomeMercadoriaText;
    private javax.swing.JLabel qntText;
    // End of variables declaration//GEN-END:variables
}
