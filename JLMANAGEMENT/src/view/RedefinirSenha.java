package view;

import controller.PessoaController;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import model.Pessoa;

public class RedefinirSenha extends javax.swing.JPanel {
    
    private JScrollPane painelTrocas;
    private Pessoa usuario;
    
    public RedefinirSenha() {
        initComponents();
    }
    
    public RedefinirSenha(JScrollPane painelTrocas, Pessoa usuario) {
        initComponents();
        this.painelTrocas = painelTrocas;
        this.usuario = usuario;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        novaSenhaText = new javax.swing.JTextField();
        confirmarSenhaText = new javax.swing.JTextField();
        confirmarRedefina = new javax.swing.JButton();
        cancelarRedefir = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Redefinir Senha");

        jLabel2.setText("Nova Senha:");

        jLabel3.setText("Confirmar Senha:");

        confirmarRedefina.setText("Confirmar");
        confirmarRedefina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarRedefinaActionPerformed(evt);
            }
        });

        cancelarRedefir.setText("Cancelar");
        cancelarRedefir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarRedefirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(confirmarSenhaText, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(novaSenhaText, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(confirmarRedefina)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelarRedefir)))
                .addContainerGap(322, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(novaSenhaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(confirmarSenhaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmarRedefina)
                    .addComponent(cancelarRedefir))
                .addContainerGap(475, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public boolean verificaCampos() {
        if (novaSenhaText.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Verifique os campos preenchidos!", "Erro de preenchimento!", JOptionPane.WARNING_MESSAGE);
            novaSenhaText.setBackground(Color.RED);
            return false;
        }
        if (confirmarSenhaText.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Verifique os campos preenchidos!", "Erro de preenchimento!", JOptionPane.WARNING_MESSAGE);
            confirmarSenhaText.setBackground(Color.RED);
            return false;
        }
        return true;
    }

    public boolean confirmaSenha() {
        if (novaSenhaText.getText().equals(confirmarSenhaText.getText())) {
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao confirmar senha, favor digitar novamante!", "Erro de verificação!", JOptionPane.WARNING_MESSAGE);
            novaSenhaText.setText("");
            confirmarSenhaText.setText("");
            return false;
        }
    }
    private void cancelarRedefirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarRedefirActionPerformed
        RecuperaSenha telaRecupera = new RecuperaSenha(this.painelTrocas);
        this.painelTrocas.setViewportView(telaRecupera);
    }//GEN-LAST:event_cancelarRedefirActionPerformed

    private void confirmarRedefinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarRedefinaActionPerformed
        if (!verificaCampos()) {
            JOptionPane.showMessageDialog(this, "Verifique os campos preenchidos!", "Erro ao inserir a nova senha!", JOptionPane.WARNING_MESSAGE);
        } else {
            if (!confirmaSenha()) {
                JOptionPane.showMessageDialog(this, "Erro ao confirmar a nova senha, preencha novamente!", "Erro de verificação!", JOptionPane.WARNING_MESSAGE);
            } else {
                PessoaController.insereNovaSenha(usuario, novaSenhaText.getText());
                JOptionPane.showMessageDialog(this, "Senha alterada com sucesso!", "Alteração de senha!", JOptionPane.INFORMATION_MESSAGE);
                Login telaLogin = new Login(this.painelTrocas);
                this.painelTrocas.setViewportView(telaLogin);
            }
            
        }
    }//GEN-LAST:event_confirmarRedefinaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarRedefir;
    private javax.swing.JButton confirmarRedefina;
    private javax.swing.JTextField confirmarSenhaText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField novaSenhaText;
    // End of variables declaration//GEN-END:variables
}
