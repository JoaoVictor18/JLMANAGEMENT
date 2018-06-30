package view;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

public class ControleDeEstoque extends javax.swing.JPanel {

    private JScrollPane painelTrocas;

    public ControleDeEstoque() {
        initComponents();
    }

    public ControleDeEstoque(JScrollPane painelTrocas) {
        initComponents();
        this.painelTrocas = painelTrocas;
    }

    public void habilitaCampos() {
        precoText.setEnabled(true);
        fornecedorText.setEnabled(true);
    }

    public boolean verificaCampos() {
        if (nomeText.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Verifique se preencheu todos os campos de busca!", "Erro de busca!", JOptionPane.WARNING_MESSAGE);
            nomeText.setBackground(Color.RED);
            return false;
        }
        if (tipoMercText.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Verifique se preencheu todos os campos de busca!", "Erro de busca!", JOptionPane.WARNING_MESSAGE);
            tipoMercText.setBackground(Color.RED);
            return false;
        }
        if (checkFiltrosAdd.isSelected()) {
            if (precoText.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Verifique os campos das informações adicionais!", "Erro de preenchimento!", JOptionPane.WARNING_MESSAGE);
                precoText.setBackground(Color.RED);
                return false;
            }
            if (fornecedorText.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Verifique os campos das informações adicionais!", "Erro de preenchimento!", JOptionPane.WARNING_MESSAGE);
                fornecedorText.setBackground(Color.RED);
                return false;
            }
        }
        return true;
    }
    public void limpaCampos(){
        nomeText.setText("");
        tipoMercText.setText("");
        precoText.setText("");
        fornecedorText.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        checkFiltrosAdd = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nomeText = new javax.swing.JTextField();
        tipoMercText = new javax.swing.JTextField();
        precoText = new javax.swing.JTextField();
        fornecedorText = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Controle de Estoque");

        jLabel2.setText("Nome:");

        jLabel3.setText("TIpo da Mercadoria:");

        checkFiltrosAdd.setText("Filtros Adicionais");
        checkFiltrosAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkFiltrosAddActionPerformed(evt);
            }
        });

        jLabel4.setText("Preço:");

        jLabel5.setText("Fornecedor:");

        precoText.setEnabled(false);

        fornecedorText.setEnabled(false);

        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(156, 156, 156)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tipoMercText))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(nomeText, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(checkFiltrosAdd)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(fornecedorText))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(precoText, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(39, 39, 39))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(buscar)
                                .addGap(94, 94, 94)))
                        .addComponent(cancelar)))
                .addContainerGap(298, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nomeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(tipoMercText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(checkFiltrosAdd)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(precoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(fornecedorText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscar)
                    .addComponent(cancelar))
                .addContainerGap(418, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void checkFiltrosAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkFiltrosAddActionPerformed
        habilitaCampos();
    }//GEN-LAST:event_checkFiltrosAddActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        TelaPrincipal telaPricipal = new TelaPrincipal(this.painelTrocas);
        this.painelTrocas.setViewportView(telaPricipal);
    }//GEN-LAST:event_cancelarActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        //verificar como será feita a busca e a exibição
        
        .
    }//GEN-LAST:event_buscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar;
    private javax.swing.JButton cancelar;
    private javax.swing.JCheckBox checkFiltrosAdd;
    private javax.swing.JTextField fornecedorText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nomeText;
    private javax.swing.JTextField precoText;
    private javax.swing.JTextField tipoMercText;
    // End of variables declaration//GEN-END:variables
}
