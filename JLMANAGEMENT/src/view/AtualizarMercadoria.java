package view;

import controller.ProdutoController;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.JScrollPane;
import model.Produto;

public class AtualizarMercadoria extends javax.swing.JPanel {

    private JScrollPane painelTrocas;
    private DefaultListModel listaMerc;

    public AtualizarMercadoria(JScrollPane painelTrocas) {
        initComponents();
        this.painelTrocas = painelTrocas;
        this.listaMerc = new DefaultListModel();
        this.listaMercadorias.setModel(listaMerc);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        buscaMercText = new javax.swing.JTextField();
        buscaMerc = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        quantComprada = new javax.swing.JTextField();
        dataCompra = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaMercadorias = new javax.swing.JList();
        checkCompra = new javax.swing.JCheckBox();
        checkVenda = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        qntVendidaText = new javax.swing.JTextField();
        mesVendaText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        anoVendaText = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        valorVendaText = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Atualização de Mercadoria");

        jLabel2.setText("Nome da Mercadoria:");

        buscaMercText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaMercTextActionPerformed(evt);
            }
        });
        buscaMercText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscaMercTextKeyReleased(evt);
            }
        });

        buscaMerc.setText("Buscar");
        buscaMerc.setEnabled(false);
        buscaMerc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaMercActionPerformed(evt);
            }
        });

        jLabel3.setText("Quantidade Comprada:");

        jLabel4.setText("Data da Compra:");

        quantComprada.setEnabled(false);

        dataCompra.setEnabled(false);

        listaMercadorias.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jScrollPane1.setViewportView(listaMercadorias);

        checkCompra.setText("Compra");
        checkCompra.setEnabled(false);

        checkVenda.setText("Venda");
        checkVenda.setEnabled(false);

        jLabel5.setText("Quantidade Vendida:");

        jLabel6.setText("Mês da Venda:");

        qntVendidaText.setEnabled(false);

        mesVendaText.setEnabled(false);

        jLabel7.setText("Ano da Venda:");

        anoVendaText.setEnabled(false);

        jLabel8.setText("Valor da Venda:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(buscaMercText, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(44, 44, 44)
                        .addComponent(buscaMerc))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(quantComprada, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(checkCompra)
                            .addComponent(checkVenda)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(18, 18, 18)
                                    .addComponent(valorVendaText))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(18, 18, 18)
                                    .addComponent(anoVendaText))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(18, 18, 18)
                                    .addComponent(mesVendaText))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(qntVendidaText))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(dataCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(47, 47, 47)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(buscaMercText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscaMerc))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(checkCompra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(quantComprada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(dataCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addComponent(checkVenda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(qntVendidaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(mesVendaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(anoVendaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(valorVendaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(172, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void atualizaMerc(Produto prodModificar) {
        if (checkCompra.isSelected()) {
            this.quantComprada.setEnabled(true);
            this.dataCompra.setEnabled(true);
            prodModificar.setDataCompra(criaData(this.dataCompra.getText()));
            prodModificar.setQntEstoque(prodModificar.getQntEstoque() + prodModificar.getQntCompra());
            ProdutoController.atualizaMercCompra(prodModificar);
            this.quantComprada.setText("");
            this.dataCompra.setText("");
            this.buscaMercText.setText("");
            this.quantComprada.setEnabled(false);
            this.dataCompra.setEnabled(false);
            this.buscaMerc.setEnabled(false);
        }
        if (checkVenda.isSelected()) {
            this.qntVendidaText.setEnabled(true);
            this.mesVendaText.setEnabled(true);
            this.anoVendaText.setEnabled(true);
            this.valorVendaText.setEnabled(true);
            prodModificar.setQntEstoque(prodModificar.getQntCompra() - Double.parseDouble(qntVendidaText.getText()));
            String[] mes = new String[4];
            mes[0] = this.qntVendidaText.getText();
            mes[1] = this.mesVendaText.getText();
            mes[2] = this.anoVendaText.getText();
            mes[3] = this.valorVendaText.getText();
            ProdutoController.atualizaMercVenda(prodModificar, mes);
            this.qntVendidaText.setText("");
            this.mesVendaText.setText("");
            this.anoVendaText.setText("");
            this.valorVendaText.setText("");
            this.buscaMercText.setText("");
            this.qntVendidaText.setEnabled(false);
            this.mesVendaText.setEnabled(false);
            this.anoVendaText.setEnabled(false);
            this.valorVendaText.setEnabled(false);
            this.buscaMercText.setEnabled(false);
        }
    }

    public Date criaData(String data) {
        String[] datas = data.split("/");
        int dia = Integer.parseInt(datas[0]);
        int mes = Integer.parseInt(datas[1]);
        int ano = Integer.parseInt(datas[2]);
        Calendar novoCalendar = Calendar.getInstance();
        novoCalendar.set(Calendar.DAY_OF_MONTH, dia);
        novoCalendar.set(Calendar.MONTH, mes);
        novoCalendar.set(Calendar.YEAR, ano);
        Date dataCompra = novoCalendar.getTime();
        return dataCompra;
    }

    public void procuraMercadoria(Vector<Produto> listaProdutos, String nomeMercadoria) {
        for (int i = 0; i < listaProdutos.size(); i++) {
            if (listaProdutos.get(i).getNome().equals(nomeMercadoria)) {
                atualizaMerc(listaProdutos.get(i));
            }
        }
    }

    private void preencheLista(Vector<Produto> listaProdutos) {
        for (int i = 0; i < listaProdutos.size(); i++) {
            this.listaMerc.addElement(listaProdutos.get(i).getNome());
        }
    }
    private void buscaMercActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaMercActionPerformed
        Vector<Produto> listaProdutos = ProdutoController.buscaProduto(this.buscaMercText.getText());
        preencheLista(listaProdutos);
        String mercadoriaModificar = (String) listaMercadorias.getSelectedValue();
        if (mercadoriaModificar != null) {
            procuraMercadoria(listaProdutos, mercadoriaModificar);
        }
    }//GEN-LAST:event_buscaMercActionPerformed

    private void buscaMercTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaMercTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscaMercTextActionPerformed

    private void buscaMercTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscaMercTextKeyReleased
        this.checkCompra.setEnabled(true);
        this.checkVenda.setEnabled(true);
    }//GEN-LAST:event_buscaMercTextKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField anoVendaText;
    private javax.swing.JButton buscaMerc;
    private javax.swing.JTextField buscaMercText;
    private javax.swing.JCheckBox checkCompra;
    private javax.swing.JCheckBox checkVenda;
    private javax.swing.JTextField dataCompra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList listaMercadorias;
    private javax.swing.JTextField mesVendaText;
    private javax.swing.JTextField qntVendidaText;
    private javax.swing.JTextField quantComprada;
    private javax.swing.JTextField valorVendaText;
    // End of variables declaration//GEN-END:variables
}
