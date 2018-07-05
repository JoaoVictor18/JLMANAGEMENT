package view;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

public class RecuperaSenha extends javax.swing.JPanel {

    private JScrollPane painelTrocas;

    public RecuperaSenha() {
        initComponents();
    }

    public RecuperaSenha(JScrollPane painelTrocas) {
        initComponents();
        this.painelTrocas = painelTrocas;
    }

    public boolean verificaCampos() {
        if (usuarioText.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Verifique se todos os campos foram preenchidos!", "Erro de preenchimento!", JOptionPane.WARNING_MESSAGE);
            usuarioText.setBackground(Color.RED);
            return false;
        }
        if (respostaSegurancaText.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Verifique se todos os campos foram preenchidos!", "Erro de preenchimento!", JOptionPane.WARNING_MESSAGE);
            respostaSegurancaText.setBackground(Color.RED);
            return false;
        }
        return true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        usuarioText = new javax.swing.JTextField();
        perguntaSeguranca = new javax.swing.JComboBox<>();
        respostaSegurancaText = new javax.swing.JTextField();
        confirmar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Recupera Senha");

        jLabel2.setText("Usuário:");

        jLabel3.setText("Pergunta de Segurança:");

        jLabel4.setText("Resposta de Segurança:");

        perguntaSeguranca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Melhor amigo de infância", "Animal de estimação", "Comida preferida", "Cidade Natal" }));
        perguntaSeguranca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perguntaSegurancaActionPerformed(evt);
            }
        });

        confirmar.setText("Confirmar");
        confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(331, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(320, 320, 320))
            .addGroup(layout.createSequentialGroup()
                .addGap(237, 237, 237)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(confirmar))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(respostaSegurancaText, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(perguntaSeguranca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(cancelar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(usuarioText, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(132, 132, 132)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(usuarioText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(perguntaSeguranca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(respostaSegurancaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmar)
                    .addComponent(cancelar))
                .addContainerGap(456, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void perguntaSegurancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perguntaSegurancaActionPerformed

    }//GEN-LAST:event_perguntaSegurancaActionPerformed

    private void confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarActionPerformed
        //chamar metodo de verificação
        if(!verificaCampos()){
            JOptionPane.showMessageDialog(this, "Verifique as informações preenchidas!", "Erro de verificação!", JOptionPane.WARNING_MESSAGE);
        }else{
            .
        }

        RedefinirSenha telaRedefinir = new RedefinirSenha(this.painelTrocas);
        this.painelTrocas.setViewportView(telaRedefinir);
    }//GEN-LAST:event_confirmarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        Login telaLogin = new Login(this.painelTrocas);
        this.painelTrocas.setViewportView(telaLogin);
    }//GEN-LAST:event_cancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar;
    private javax.swing.JButton confirmar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JComboBox<String> perguntaSeguranca;
    private javax.swing.JTextField respostaSegurancaText;
    private javax.swing.JTextField usuarioText;
    // End of variables declaration//GEN-END:variables
}
