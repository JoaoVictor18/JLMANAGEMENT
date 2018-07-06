package view;

import controller.ProdutoController;
import java.util.Vector;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import view.menusPopUp.RelatorioVendasPopUP;

public class RelatorioDeVendas extends javax.swing.JPanel {

    private JScrollPane painelTrocas;

    public RelatorioDeVendas(JScrollPane painelTrocas) {
        initComponents();
        this.painelTrocas = painelTrocas;
        habilitaGera();
    }

    public void habilitaGera() {
        boolean result = false;
        if (this.anoText.getText().isEmpty()) {
            result = false;
        } else {
            result = true;
        }
        if (this.mesText.getText().isEmpty()) {
            result = false;
        } else {
            result = true;
        }
        this.gerarRelatorio.setEnabled(result);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        mesText = new javax.swing.JTextField();
        gerarRelatorio = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        anoText = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Relatório de Vendas");

        jLabel2.setText("Mês :");

        gerarRelatorio.setText("Gerar");
        gerarRelatorio.setEnabled(false);
        gerarRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerarRelatorioActionPerformed(evt);
            }
        });

        cancelar.setText("Cancelar");

        jLabel4.setText("Ano:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(325, 325, 325)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(gerarRelatorio)
                        .addGap(88, 88, 88)
                        .addComponent(cancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(anoText))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mesText, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(295, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(mesText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(anoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gerarRelatorio)
                            .addComponent(cancelar))))
                .addContainerGap(550, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    private void gerarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerarRelatorioActionPerformed
        Vector<String> info = new Vector<>();
        info.add(this.mesText.getText());
        info.add(this.anoText.getText());
        double totalVendido = ProdutoController.relatorioVendas(info);
        if (totalVendido == 0) {
            JOptionPane.showMessageDialog(this, "Este mês não possui vendas registradas!", "Não há vendas!", JOptionPane.INFORMATION_MESSAGE);
        } else {
            info.add(totalVendido + "");
            RelatorioVendasPopUP novoJDialog = new RelatorioVendasPopUP(info);
            JDialog cxDialog = new JDialog();
            cxDialog.add(novoJDialog);
            cxDialog.setSize(405, 310);
            cxDialog.setLocationRelativeTo(this.getParent());
            cxDialog.setVisible(true);
            this.getParent().setVisible(false);
        }
    }//GEN-LAST:event_gerarRelatorioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField anoText;
    private javax.swing.JButton cancelar;
    private javax.swing.JButton gerarRelatorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField mesText;
    // End of variables declaration//GEN-END:variables
}
