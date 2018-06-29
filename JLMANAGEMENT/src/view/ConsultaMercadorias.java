package view;

import controller.ProdutoController;
import java.awt.Color;
import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import model.Produto;

public class ConsultaMercadorias extends javax.swing.JPanel {

    private JScrollPane painelTrocas;
    private Vector<Produto> listaProdutos;
    private DefaultListModel listaUser;

    public ConsultaMercadorias() {
        initComponents();
        this.listaProdutos = new Vector<>();
        this.listaUser = new DefaultListModel();
        this.listaMercadorias.setModel(listaUser);
    }

    public ConsultaMercadorias(JScrollPane painelTrocas) {
        initComponents();
        this.painelTrocas = painelTrocas;
        this.listaProdutos = new Vector<>();
        this.listaUser = new DefaultListModel();
        this.listaMercadorias.setModel(listaUser);
    }

    public boolean verificaCampos() {
        if (nomeMercText.getText().isEmpty()) {
            this.nomeMercText.setBackground(Color.RED);
            JOptionPane.showMessageDialog(this, "Verifique se preencheu todos os campos de busca!", "Preenchimento com erro!", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        if (filtrosAdicCombo.isSelected()) {
            if (tipoMercText.getText().isEmpty()) {
                this.tipoMercText.setBackground(Color.RED);
                JOptionPane.showMessageDialog(this, "Verifique se preencheu todos os campos das informações adicionais!", "Preencimento com erro!", JOptionPane.WARNING_MESSAGE);
                return false;
            }
            if (precoMercText.getText().isEmpty()) {
                this.precoMercText.setBackground(Color.RED);
                JOptionPane.showMessageDialog(this, "Verifique se preencheu todos os campos das informações adicionais!", "Preenchimento com erro!", JOptionPane.WARNING_MESSAGE);
                return false;
            }
            if (fornecedorMercText.getText().isEmpty()) {
                this.fornecedorMercText.setBackground(Color.RED);
                JOptionPane.showMessageDialog(this, "Verifique se preencheu todos os campos das informações adicionais!", "Preencimento com erro!", JOptionPane.WARNING_MESSAGE);
                return false;
            }
        }
        return true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nomeMercText = new javax.swing.JTextField();
        consultaMerc = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        filtrosAdicCombo = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tipoMercText = new javax.swing.JTextField();
        precoMercText = new javax.swing.JTextField();
        fornecedorMercText = new javax.swing.JTextField();
        exibir = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaMercadorias = new javax.swing.JList();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Consulta de Mercadorias");

        jLabel2.setText("Nome da Mercadoria:");

        consultaMerc.setText("Consultar");
        consultaMerc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaMercActionPerformed(evt);
            }
        });

        jLabel4.setText("Tipo da Mercadoria:");

        filtrosAdicCombo.setText("Filtros Adicionais");

        jLabel3.setText("Preço:");

        jLabel5.setText("Fornecedor:");

        tipoMercText.setEnabled(false);

        precoMercText.setEnabled(false);

        fornecedorMercText.setEnabled(false);

        exibir.setText("Exibir");
        exibir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exibirActionPerformed(evt);
            }
        });

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(listaMercadorias);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(nomeMercText, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(consultaMerc))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(precoMercText, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(fornecedorMercText, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(tipoMercText, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(filtrosAdicCombo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(54, 54, 54))
            .addGroup(layout.createSequentialGroup()
                .addGap(275, 275, 275)
                .addComponent(exibir)
                .addGap(116, 116, 116)
                .addComponent(cancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nomeMercText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(consultaMerc))
                        .addGap(85, 85, 85)
                        .addComponent(filtrosAdicCombo)
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tipoMercText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(precoMercText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(fornecedorMercText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelar)
                    .addComponent(exibir))
                .addGap(171, 171, 171))
        );
    }// </editor-fold>//GEN-END:initComponents
    public void preencheLista(Vector<Produto> produtos) {
        for (int i = 0; i < produtos.size(); i++) {
            listaUser.addElement(produtos.get(i));
        }
    }
    public String recebeNomeLista(){
        String nome ="";
        nome = (String) listaMercadorias.getSelectedValue();
        return nome;
    }
    private void exibirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exibirActionPerformed
        MercadoriaExibida mercadoriaEx = new MercadoriaExibida();
        String exibir = this.recebeNomeLista();
        
        //add informações no painel

    }//GEN-LAST:event_exibirActionPerformed

    private void consultaMercActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaMercActionPerformed
        //metodo para verificar se a mercadoria existe no banco
        boolean retorno = verificaCampos();
        if (!retorno) {
            JOptionPane.showMessageDialog(this, "Verifique o preenchimentos dos campos obrigatórios!", "Erro de busca!", JOptionPane.WARNING_MESSAGE);
        } else {
            //chamar metodo controller
            //informações adicionais ativo
            if (filtrosAdicCombo.isSelected()) {
                listaProdutos = ProdutoController.buscaProdutoInfAdd(nomeMercText.getText(), tipoMercText.getText(), Double.parseDouble(precoMercText.getText()), fornecedorMercText.getText());
                if (listaProdutos.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "A mercadora informada não possui cadastro!", "Erro de consulta", JOptionPane.WARNING_MESSAGE);
                } else {
                    //somente nome da mercadoria preenchido
                    this.preencheLista(listaProdutos);
                }
            } else {
                listaProdutos = ProdutoController.buscaProduto(nomeMercText.getText());
                if (listaProdutos.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "A mercadora informada não possui cadastro!", "Erro de consulta", JOptionPane.WARNING_MESSAGE);
                } else {
                    this.preencheLista(listaProdutos);
                    //chamar metodo que pega a mercadoria selecionada
                    
                }
            }
        }
    }//GEN-LAST:event_consultaMercActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        //retorna para tela principal ao cancelar
        TelaPrincipal telaPrincipal = new TelaPrincipal();
        this.painelTrocas.setViewportView(telaPrincipal);
    }//GEN-LAST:event_cancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar;
    private javax.swing.JButton consultaMerc;
    private javax.swing.JButton exibir;
    private javax.swing.JCheckBox filtrosAdicCombo;
    private javax.swing.JTextField fornecedorMercText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList listaMercadorias;
    private javax.swing.JTextField nomeMercText;
    private javax.swing.JTextField precoMercText;
    private javax.swing.JTextField tipoMercText;
    // End of variables declaration//GEN-END:variables
}
