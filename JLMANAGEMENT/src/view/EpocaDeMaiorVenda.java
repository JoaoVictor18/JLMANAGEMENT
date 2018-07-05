package view;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

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

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Época de Maior Venda");

        jLabel2.setText("Nome da Mercadoria:");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nomeMercadoriaText, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(efetuaBusca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addComponent(encerrarBusca))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addGap(290, 290, 290))
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
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(efetuaBusca)
                    .addComponent(encerrarBusca))
                .addContainerGap(582, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void encerrarBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encerrarBuscaActionPerformed
        TelaPrincipal telaPrincipal = new TelaPrincipal(this.painelTrocas);
        this.painelTrocas.setViewportView(telaPrincipal);
    }//GEN-LAST:event_encerrarBuscaActionPerformed

    private void efetuaBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_efetuaBuscaActionPerformed
        if(!verificaCampos()){
            JOptionPane.showMessageDialog(this, "Impossível efetuar busca!", "Verifique os campos obrigatórios!", JOptionPane.WARNING_MESSAGE);
        }else{
            //implementar
            .
        }
    }//GEN-LAST:event_efetuaBuscaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton efetuaBusca;
    private javax.swing.JButton encerrarBusca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField nomeMercadoriaText;
    // End of variables declaration//GEN-END:variables
}
