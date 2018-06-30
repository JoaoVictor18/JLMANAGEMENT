/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ProdutoController;
import java.awt.Color;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import model.Produto;

/**
 *
 * @author João Victor
 */
public class CadastroMercadorias extends javax.swing.JPanel {

    private JScrollPane painelTrocas;

    public CadastroMercadorias() {
        initComponents();
    }

    public CadastroMercadorias(JScrollPane painelTrocas) {
        initComponents();
        this.painelTrocas = painelTrocas;
    }

    //verifica se os compos de cadastro foram preenchidos de forma correta
    public boolean verificaCampos() {
        if (nomeText.getText().isEmpty()) {
            this.nomeText.setBackground(Color.RED);
            JOptionPane.showMessageDialog(this, "Verifique se preencheu todos os campos de cadastro!", "Preenchimento com erro!", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if (tipoMercText.getText().isEmpty()) {
            this.tipoMercText.setBackground(Color.RED);
            JOptionPane.showMessageDialog(this, "Verifique se preencheu todos os campos de cadastro!", "Preenchimento com erro!", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if (fornecedor.getText().isEmpty()) {
            this.fornecedor.setBackground(Color.RED);
            JOptionPane.showMessageDialog(this, "Verifique se preencheu todos os campos de cadastro!", "Preenchimento com erro!", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if (precoCustoText.getText().isEmpty()) {
            this.precoCustoText.setBackground(Color.RED);
            JOptionPane.showMessageDialog(this, "Verifique se preencheu todos os campos de cadastro!", "Preenchimento com erro!", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if (percentualImposto.getText().isEmpty()) {
            this.percentualImposto.setBackground(Color.RED);
            JOptionPane.showMessageDialog(this, "Verifique se preencheu todos os campos de cadastro!", "Preenchimento com erro!", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if (percentualFrete.getText().isEmpty()) {
            this.percentualFrete.setBackground(Color.RED);
            JOptionPane.showMessageDialog(this, "Verifique se preencheu todos os campos de cadastro!", "Preenchimento com erro!", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if (dataCompra.getText().isEmpty()) {
            this.dataCompra.setBackground(Color.RED);
            JOptionPane.showMessageDialog(this, "Verifique se preencheu todos os campos de cadastro!", "Preenchimento com erro!", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if (quantidadeComprada.getText().isEmpty()) {
            this.quantidadeComprada.setBackground(Color.RED);
            JOptionPane.showMessageDialog(this, "Verifique se preencheu todos os campos de cadastro!", "Preenchimento com erro!", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        if (checkInfoAdi.isSelected()) {
            if (informacoesAdicionais.getText().isEmpty()) {
                this.informacoesAdicionais.setBackground(Color.RED);
                JOptionPane.showMessageDialog(this, "Verifique se preencheu todos os campos de cadastro!", "Preenchimento com erro!", JOptionPane.WARNING_MESSAGE);
                return false;
            }
        }
        if (quantEstoque.getText().isEmpty()) {
            this.quantEstoque.setBackground(Color.RED);
            JOptionPane.showMessageDialog(this, "Verifique se preencheu todos os campos de cadastro!", "Preenchimento com erro!", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if (quantMinEstoque.getText().isEmpty()) {
            this.quantMinEstoque.setBackground(Color.RED);
            JOptionPane.showMessageDialog(this, "Verifique se preencheu todos os campos de cadastro!", "Preenchimento com erro!", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if (referenciaText.getText().isEmpty()) {
            this.referenciaText.setBackground(Color.RED);
            JOptionPane.showMessageDialog(this, "Verifique se preencheu todos os campos de cadastro!", "Preenchimento com erro!", JOptionPane.WARNING_MESSAGE);
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        checkInfoAdi = new javax.swing.JCheckBox();
        informacoesAdicionais = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        nomeText = new javax.swing.JTextField();
        tipoMercText = new javax.swing.JTextField();
        fornecedor = new javax.swing.JTextField();
        precoCustoText = new javax.swing.JTextField();
        percentualImposto = new javax.swing.JTextField();
        percentualFrete = new javax.swing.JTextField();
        dataCompra = new javax.swing.JTextField();
        quantidadeComprada = new javax.swing.JTextField();
        quantEstoque = new javax.swing.JTextField();
        quantMinEstoque = new javax.swing.JTextField();
        cadastrar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        referenciaText = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Cadastro de Mercadorias");

        jLabel2.setText("Nome:");

        jLabel3.setText("Tipo de Mercadoria:");

        jLabel4.setText("Fabricante/Fornecedor:");

        jLabel5.setText("Preço de custo:");

        jLabel6.setText("% Imposto:");

        jLabel7.setText("% Frete:");

        jLabel8.setText("Data da compra:");

        jLabel9.setText("Quantidade comprada:");

        checkInfoAdi.setText("Informações adicionais.");
        checkInfoAdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkInfoAdiActionPerformed(evt);
            }
        });

        informacoesAdicionais.setEnabled(false);

        jLabel10.setText("Quantidade em Estoque:");

        jLabel11.setText("Quantidade Min. Estoque:");

        cadastrar.setText("Cadastrar");
        cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarActionPerformed(evt);
            }
        });

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        jLabel12.setText("Referência Produto:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(294, 294, 294)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tipoMercText))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(nomeText, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(fornecedor))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(percentualFrete, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(quantidadeComprada, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(percentualImposto))
                                .addComponent(checkInfoAdi)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(dataCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(precoCustoText, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(informacoesAdicionais)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(quantEstoque))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(quantMinEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cadastrar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cancelar))
                                    .addComponent(referenciaText, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(283, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nomeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tipoMercText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(precoCustoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(percentualImposto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(percentualFrete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(dataCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(quantidadeComprada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkInfoAdi)
                .addGap(11, 11, 11)
                .addComponent(informacoesAdicionais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(quantEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(quantMinEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(referenciaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrar)
                    .addComponent(cancelar))
                .addContainerGap(188, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        //mudar para tela principal caso o usuário cancele o cadastro. verificar os parametros discutir
        TelaPrincipal telaPrincipal = new TelaPrincipal();
        this.painelTrocas.setViewportView(telaPrincipal);
    }//GEN-LAST:event_cancelarActionPerformed
    //limpa os campos se o produto existir no banco de dados
    public void limpaCampos() {
        nomeText.setText("");
        tipoMercText.setText("");
        fornecedor.setText("");
        precoCustoText.setText("");
        percentualImposto.setText("");
        percentualFrete.setText("");
        dataCompra.setText("");
        quantidadeComprada.setText("");
        informacoesAdicionais.setText("");
        quantEstoque.setText("");
        quantMinEstoque.setText("");
        referenciaText.setText("");
    }
    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed
        //verificar na execução
        boolean retorno = verificaCampos();
        if (!retorno) {
            JOptionPane.showMessageDialog(this, "Não foi possível efetuar o cadastro do produto!", "Erro de cadastro!", JOptionPane.WARNING_MESSAGE);
        } else {
            String dataCadastro = dataCompra.getText();
            String cadastro[] = dataCadastro.split("/");
            int dia = Integer.parseInt(cadastro[0]);
            int mes = Integer.parseInt(cadastro[1]);
            int ano = Integer.parseInt(cadastro[2]);
            Calendar novoCalendar = Calendar.getInstance();
            novoCalendar.set(Calendar.DAY_OF_MONTH, dia);
            novoCalendar.set(Calendar.MONTH, mes);
            novoCalendar.set(Calendar.YEAR, ano);
            Date dataCompra = novoCalendar.getTime();
            try {
                Produto novoProduto = new Produto(nomeText.getText(), tipoMercText.getText(), fornecedor.getText(), informacoesAdicionais.getText(),
                        Double.parseDouble(percentualImposto.getText()), Double.parseDouble(percentualFrete.getText()), Double.parseDouble(quantEstoque.getText()), Double.parseDouble(quantMinEstoque.getText()),
                        Double.parseDouble(precoCustoText.getText()), Integer.parseInt(quantidadeComprada.getText()), dataCompra, referenciaText.getText());
                if (ProdutoController.buscaProdutoExistente(novoProduto)) {
                    //metodo para inserir produto no banco
                    JOptionPane.showMessageDialog(this, "O produto já foi cadastrado!", "Erro de cadastro!", JOptionPane.WARNING_MESSAGE);
                    limpaCampos();
                } else {
                    JOptionPane.showMessageDialog(this, "Produdo cadastrado co sucesso!", "Cadastro de produto!", JOptionPane.INFORMATION_MESSAGE);
                    //criar outra tela
                    TelaPrincipal telaPrincipal = new TelaPrincipal();
                    this.painelTrocas.setViewportView(telaPrincipal);
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Os números reais devem ser informados com vírgula e não com pontos.", "Erro de preenchimento!", JOptionPane.ERROR_MESSAGE);
            }

        }


    }//GEN-LAST:event_cadastrarActionPerformed

    private void checkInfoAdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkInfoAdiActionPerformed
        if (checkInfoAdi.isSelected()) {
            informacoesAdicionais.setEnabled(true);
        } else {
            informacoesAdicionais.setEnabled(false);
        }
    }//GEN-LAST:event_checkInfoAdiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrar;
    private javax.swing.JButton cancelar;
    private javax.swing.JCheckBox checkInfoAdi;
    private javax.swing.JTextField dataCompra;
    private javax.swing.JTextField fornecedor;
    private javax.swing.JTextField informacoesAdicionais;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nomeText;
    private javax.swing.JTextField percentualFrete;
    private javax.swing.JTextField percentualImposto;
    private javax.swing.JTextField precoCustoText;
    private javax.swing.JTextField quantEstoque;
    private javax.swing.JTextField quantMinEstoque;
    private javax.swing.JTextField quantidadeComprada;
    private javax.swing.JTextField referenciaText;
    private javax.swing.JTextField tipoMercText;
    // End of variables declaration//GEN-END:variables
}
