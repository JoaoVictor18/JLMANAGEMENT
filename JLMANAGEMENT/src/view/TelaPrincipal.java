/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JScrollPane;
import model.Pessoa;

/**
 *
 * @author LEANDRO
 */
public class TelaPrincipal extends javax.swing.JPanel {

    private JScrollPane painelTrocas;
    private Pessoa novoUser;

    public TelaPrincipal() {
        initComponents();
    }

    public TelaPrincipal(Pessoa novoUser, JScrollPane painelTrocas) {
        initComponents();
        this.novoUser = novoUser;
        this.painelTrocas = painelTrocas;
        if (novoUser.isAdmin()) {
            //habilita todas as funções do administrador
            this.atualizaMercadoria.setEnabled(true);
            this.balanco.setEnabled(true);
            this.cadastroFuncionario.setEnabled(true);
            this.cadastroMercadoria.setEnabled(true);
            this.consultaMercadoria.setEnabled(true);
            this.controleEstoque.setEnabled(true);
            this.epocaMaiorVenda.setEnabled(true);
            this.relatorioVendas.setEnabled(true);
            this.solicitacaoCompra.setEnabled(true);
            this.sac.setEnabled(true);
            this.sair.setEnabled(true);

        } else {
            this.atualizaMercadoria.setEnabled(false);
            this.balanco.setEnabled(false);
            this.cadastroFuncionario.setEnabled(false);
            this.cadastroMercadoria.setEnabled(false);
            this.consultaMercadoria.setEnabled(true);
            this.controleEstoque.setEnabled(false);
            this.epocaMaiorVenda.setEnabled(false);
            this.relatorioVendas.setEnabled(false);
            this.solicitacaoCompra.setEnabled(false);
            this.sac.setEnabled(false);
            this.sair.setEnabled(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        sair = new javax.swing.JButton();
        consultaMercadoria = new javax.swing.JButton();
        cadastroFuncionario = new javax.swing.JButton();
        cadastroMercadoria = new javax.swing.JButton();
        atualizaMercadoria = new javax.swing.JButton();
        controleEstoque = new javax.swing.JButton();
        relatorioVendas = new javax.swing.JButton();
        balanco = new javax.swing.JButton();
        solicitacaoCompra = new javax.swing.JButton();
        epocaMaiorVenda = new javax.swing.JButton();
        sac = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Desenvolvido por: J&L MANAGEMENT CORP.");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Tela Principal");

        sair.setText("Sair");

        consultaMercadoria.setBackground(new java.awt.Color(51, 153, 255));
        consultaMercadoria.setText("Consulta Mercadoria");

        cadastroFuncionario.setBackground(new java.awt.Color(51, 153, 255));
        cadastroFuncionario.setText("Cadastrar Funcionário");
        cadastroFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroFuncionarioActionPerformed(evt);
            }
        });

        cadastroMercadoria.setBackground(new java.awt.Color(51, 153, 255));
        cadastroMercadoria.setText("Cadastrar Mercadorias");
        cadastroMercadoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroMercadoriaActionPerformed(evt);
            }
        });

        atualizaMercadoria.setBackground(new java.awt.Color(51, 153, 255));
        atualizaMercadoria.setText("Atualizar Mercadorias");
        atualizaMercadoria.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        atualizaMercadoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizaMercadoriaActionPerformed(evt);
            }
        });

        controleEstoque.setBackground(new java.awt.Color(51, 153, 255));
        controleEstoque.setText("Controle de Estoque");

        relatorioVendas.setBackground(new java.awt.Color(51, 153, 255));
        relatorioVendas.setText("Relatório de Vendas");

        balanco.setBackground(new java.awt.Color(51, 153, 255));
        balanco.setText("Balanço");

        solicitacaoCompra.setBackground(new java.awt.Color(51, 153, 255));
        solicitacaoCompra.setText("Solicitação de Compra");

        epocaMaiorVenda.setBackground(new java.awt.Color(51, 153, 255));
        epocaMaiorVenda.setText("Época de Maior Venda");

        sac.setBackground(new java.awt.Color(51, 153, 255));
        sac.setText("SAC");

        jLabel3.setText("Segurança e Controle do seu Estoque!!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(334, 334, 334)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sair)
                .addGap(67, 67, 67))
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cadastroMercadoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cadastroFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(balanco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(atualizaMercadoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(consultaMercadoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(controleEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(epocaMaiorVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(relatorioVendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(solicitacaoCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(576, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(sair))
                .addGap(22, 22, 22)
                .addComponent(atualizaMercadoria)
                .addGap(0, 0, 0)
                .addComponent(balanco)
                .addGap(0, 0, 0)
                .addComponent(cadastroFuncionario)
                .addGap(0, 0, 0)
                .addComponent(cadastroMercadoria)
                .addGap(0, 0, 0)
                .addComponent(consultaMercadoria)
                .addGap(0, 0, 0)
                .addComponent(controleEstoque)
                .addGap(0, 0, 0)
                .addComponent(epocaMaiorVenda)
                .addGap(0, 0, 0)
                .addComponent(relatorioVendas)
                .addGap(0, 0, 0)
                .addComponent(solicitacaoCompra)
                .addGap(0, 0, 0)
                .addComponent(sac)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 237, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents

    /*
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
    }//GEN-LAST:event_jButton2ActionPerformed
=======*/
    private void cadastroFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroFuncionarioActionPerformed
        CadastroFuncionario novoFunc = new CadastroFuncionario(this.painelTrocas);
    }//GEN-LAST:event_cadastroFuncionarioActionPerformed

    private void cadastroMercadoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroMercadoriaActionPerformed
       CadastroMercadorias novaMerc = new CadastroMercadorias(this.painelTrocas);
    }//GEN-LAST:event_cadastroMercadoriaActionPerformed

    private void atualizaMercadoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizaMercadoriaActionPerformed
        AtualizarMercadoria atualizaMerc = new AtualizarMercadoria(this.painelTrocas);
    }//GEN-LAST:event_atualizaMercadoriaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atualizaMercadoria;
    private javax.swing.JButton balanco;
    private javax.swing.JButton cadastroFuncionario;
    private javax.swing.JButton cadastroMercadoria;
    private javax.swing.JButton consultaMercadoria;
    private javax.swing.JButton controleEstoque;
    private javax.swing.JButton epocaMaiorVenda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton relatorioVendas;
    private javax.swing.JButton sac;
    private javax.swing.JButton sair;
    private javax.swing.JButton solicitacaoCompra;
    // End of variables declaration//GEN-END:variables
}
