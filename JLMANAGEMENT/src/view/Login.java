/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.PessoaController;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import model.Pessoa;

/**
 *
 * @author LEANDRO
 */
public class Login extends javax.swing.JPanel {
    
    private JScrollPane painelTrocas;
    
    public Login() {
        initComponents();
    }
    
    public Login(JScrollPane painelTrocas) {
        initComponents();
        this.painelTrocas = painelTrocas;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cpfText = new javax.swing.JTextField();
        entrar = new javax.swing.JButton();
        senhaText = new javax.swing.JPasswordField();
        cadastrar = new javax.swing.JButton();
        recuperaSenha = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Login");

        jLabel2.setText("CPF:");

        jLabel3.setText("Senha:");

        entrar.setText("Entrar");
        entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarActionPerformed(evt);
            }
        });

        cadastrar.setText("Cadastrar");
        cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarActionPerformed(evt);
            }
        });

        recuperaSenha.setText("Recuperar Senha");
        recuperaSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recuperaSenhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(335, 335, 335)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(senhaText))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(cpfText, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(entrar)
                                .addGap(48, 48, 48)
                                .addComponent(cadastrar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(recuperaSenha)))
                .addContainerGap(335, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cpfText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(senhaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entrar)
                    .addComponent(cadastrar))
                .addGap(18, 18, 18)
                .addComponent(recuperaSenha)
                .addContainerGap(493, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarActionPerformed
        if (!cpfText.getText().isEmpty() && senhaText.getText().isEmpty()) {
            String login = cpfText.getText();
            String senha = senhaText.getText();
            //verificando se possui o usuário no banco de dados e se as informações de login estão corretas
            Pessoa novoUser = PessoaController.verificaUsuario(login, senha);
            if (novoUser != null) {
                TelaPrincipal telaPrincipal = new TelaPrincipal(novoUser, this.painelTrocas);
            }
        } else {
            JOptionPane.showMessageDialog(null, "O usuário informado não está cadastrado no sistema.", "Usuário sem cadastro!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_entrarActionPerformed

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed
        CadastroFuncionario painelCadastro = new CadastroFuncionario(this.painelTrocas);
        this.painelTrocas.setViewportView(painelCadastro);
    }//GEN-LAST:event_cadastrarActionPerformed

    private void recuperaSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recuperaSenhaActionPerformed
        RecuperaSenha telaRecupera = new RecuperaSenha(this.painelTrocas);
        this.painelTrocas.setViewportView(telaRecupera);
    }//GEN-LAST:event_recuperaSenhaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrar;
    private javax.swing.JTextField cpfText;
    private javax.swing.JButton entrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton recuperaSenha;
    private javax.swing.JPasswordField senhaText;
    // End of variables declaration//GEN-END:variables
}
