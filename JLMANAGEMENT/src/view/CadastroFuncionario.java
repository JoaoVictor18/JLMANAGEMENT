package view;

import controller.PessoaController;
import java.awt.Color;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import model.Administrador;
import model.Endereco;
import model.Pessoa;

public class CadastroFuncionario extends javax.swing.JPanel {

    private JScrollPane painelTrocas;

    public CadastroFuncionario() {
        initComponents();
    }

    public CadastroFuncionario(JScrollPane painelTrocas) {
        initComponents();
        this.painelTrocas = painelTrocas;
    }

    public boolean varreduraCampos() {
        if (nomeText.getText().isEmpty()) {
            nomeText.setBackground(Color.red);
            JOptionPane.showMessageDialog(this, "Verifique se preencheu todos os campos de cadastro!", "Preenchimento com erro!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (nascimentoText.getText().isEmpty()) {
            nascimentoText.setBackground(Color.red);
            JOptionPane.showMessageDialog(this, "Verifique se preencheu todos os campos de cadastro!", "Preenchimento com erro!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (cpfText.getText().isEmpty()) {
            cpfText.setBackground(Color.red);
            JOptionPane.showMessageDialog(this, "Verifique se preencheu todos os campos de cadastro!", "Preenchimento com erro!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (rgText.getText().isEmpty()) {
            rgText.setBackground(Color.red);
            JOptionPane.showMessageDialog(this, "Verifique se preencheu todos os campos de cadastro!", "Preenchimento com erro!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (pisText.getText().isEmpty()) {
            pisText.setBackground(Color.red);
            JOptionPane.showMessageDialog(this, "Verifique se preencheu todos os campos de cadastro!", "Preenchimento com erro!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (telefoneText.getText().isEmpty()) {
            telefoneText.setBackground(Color.red);
            JOptionPane.showMessageDialog(this, "Verifique se preencheu todos os campos de cadastro!", "Preenchimento com erro!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (ruaText.getText().isEmpty()) {
            ruaText.setBackground(Color.red);
            JOptionPane.showMessageDialog(this, "Verifique se preencheu todos os campos de cadastro!", "Preenchimento com erro!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (numEnderecoText.getText().isEmpty()) {
            numEnderecoText.setBackground(Color.red);
            JOptionPane.showMessageDialog(this, "Verifique se preencheu todos os campos de cadastro!", "Preenchimento com erro!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (bairroText.getText().isEmpty()) {
            bairroText.setBackground(Color.red);
            JOptionPane.showMessageDialog(this, "Verifique se preencheu todos os campos de cadastro!", "Preenchimento com erro!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (complementoText.getText().isEmpty()) {
            complementoText.setBackground(Color.red);
            JOptionPane.showMessageDialog(this, "Verifique se preencheu todos os campos de cadastro!", "Preenchimento com erro!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (referenciaText.getText().isEmpty()) {
            referenciaText.setBackground(Color.red);
            JOptionPane.showMessageDialog(this, "Verifique se preencheu todos os campos de cadastro!", "Preenchimento com erro!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (cepText.getText().isEmpty()) {
            cepText.setBackground(Color.red);
            JOptionPane.showMessageDialog(this, "Verifique se preencheu todos os campos de cadastro!", "Preenchimento com erro!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (cidadeText.getText().isEmpty()) {
            cidadeText.setBackground(Color.red);
            JOptionPane.showMessageDialog(this, "Verifique se preencheu todos os campos de cadastro!", "Preenchimento com erro!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (estadoText.getText().isEmpty()) {
            estadoText.setBackground(Color.red);
            JOptionPane.showMessageDialog(this, "Verifique se preencheu todos os campos de cadastro!", "Preenchimento com erro!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (emailText.getText().isEmpty()) {
            emailText.setBackground(Color.red);
            JOptionPane.showMessageDialog(this, "Verifique se preencheu todos os campos de cadastro!", "Preenchimento com erro!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (senhaText.getText().isEmpty()) {
            senhaText.setBackground(Color.red);
            JOptionPane.showMessageDialog(this, "Verifique se preencheu todos os campos de cadastro!", "Preenchimento com erro!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (respSegText.getText().isEmpty()) {
            respSegText.setBackground(Color.red);
            JOptionPane.showMessageDialog(this, "Verifique se preencheu todos os campos de cadastro!", "Preenchimento com erro!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    public void limpaCampos() {
        nomeText.setText("");
        nascimentoText.setText("");
        cpfText.setText("");
        rgText.setText("");
        pisText.setText("");
        telefoneText.setText("");
        ruaText.setText("");
        numEnderecoText.setText("");
        bairroText.setText("");
        complementoText.setText("");
        referenciaText.setText("");
        cepText.setText("");
        cidadeText.setText("");
        estadoText.setText("");
        emailText.setText("");
        senhaText.setText("");
        respSegText.setText("");
        checkAdmin.setEnabled(false);
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
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        nomeText = new javax.swing.JTextField();
        nascimentoText = new javax.swing.JTextField();
        cpfText = new javax.swing.JTextField();
        rgText = new javax.swing.JTextField();
        pisText = new javax.swing.JTextField();
        telefoneText = new javax.swing.JTextField();
        ruaText = new javax.swing.JTextField();
        emailText = new javax.swing.JTextField();
        respSegText = new javax.swing.JTextField();
        pergSegCombo = new javax.swing.JComboBox<>();
        sexoCombo = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        bairroText = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        complementoText = new javax.swing.JTextField();
        cepText = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        cidadeText = new javax.swing.JTextField();
        estadoText = new javax.swing.JTextField();
        cadastrarFunc = new javax.swing.JButton();
        cancelarFunc = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        senhaText = new javax.swing.JPasswordField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        numEnderecoText = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        referenciaText = new javax.swing.JTextField();
        checkAdmin = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CADASTRO DE FUNCIONÁRIOS");

        jLabel2.setText("Nome:");

        jLabel3.setText("Data de Nascimento:");

        jLabel4.setText("CPF:");

        jLabel5.setText("RG:");

        jLabel6.setText("Nº PIS:");

        jLabel7.setText("Telefone:");

        jLabel8.setText("Rua:");

        jLabel9.setText("Email:");

        jLabel10.setText("Pergunta de Segurança:");

        jLabel11.setText("Resposta de Segurança:");

        jLabel12.setText("Sexo:");

        rgText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rgTextActionPerformed(evt);
            }
        });

        pergSegCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Melhor amigo de infância", "Animal de estimação", "Comida preferida", "Cidade natal" }));
        pergSegCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pergSegComboActionPerformed(evt);
            }
        });

        sexoCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino", "Não declarar" }));

        jLabel13.setText("Bairro:");

        jLabel14.setText("Complemento:");

        jLabel15.setText("Cep:");

        jLabel16.setText("Cidade:");

        jLabel17.setText("Estado:");

        cadastrarFunc.setText("Cadastrar");
        cadastrarFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarFuncActionPerformed(evt);
            }
        });

        cancelarFunc.setText("Cancelar");

        jLabel18.setText("Senha:");

        senhaText.setText("jPasswordField1");

        jLabel19.setForeground(new java.awt.Color(153, 153, 153));
        jLabel19.setText("Sua senha pode possuir no máximo 15 caracteres.");

        jLabel20.setText("Nº:");

        jLabel21.setText("Referência:");

        checkAdmin.setText("Administrador");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(nascimentoText, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(nomeText, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(checkAdmin))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(cadastrarFunc)
                                .addGap(142, 142, 142)
                                .addComponent(cancelarFunc))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(cpfText, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(rgText, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(bairroText, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(18, 18, 18)
                                .addComponent(cepText, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addGap(18, 18, 18)
                                        .addComponent(complementoText, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(pisText, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(telefoneText, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(ruaText)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel20)
                                        .addGap(18, 18, 18)
                                        .addComponent(numEnderecoText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel21)
                                        .addGap(18, 18, 18)
                                        .addComponent(referenciaText, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(18, 18, 18)
                                .addComponent(cidadeText, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jLabel17)
                                .addGap(18, 18, 18)
                                .addComponent(estadoText, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(respSegText, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pergSegCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(sexoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(18, 18, 18)
                                .addComponent(senhaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel19)))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nomeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkAdmin))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nascimentoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cpfText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(rgText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(pisText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(telefoneText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(ruaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(numEnderecoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(bairroText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(complementoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(referenciaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(cepText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(cidadeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estadoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(senhaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(pergSegCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(respSegText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(sexoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrarFunc)
                    .addComponent(cancelarFunc))
                .addGap(127, 127, 127))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rgTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rgTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rgTextActionPerformed

    private void cadastrarFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarFuncActionPerformed
        boolean retornoVer = varreduraCampos();
        while (retornoVer == false) {
            retornoVer = varreduraCampos();
        }
        //cria pessoa
        Endereco novoEnd;
        String nasc = nascimentoText.getText();
        String[] datNasc = nasc.split("/");
        int dia = Integer.parseInt(datNasc[0]);
        int mes = Integer.parseInt(datNasc[1]);
        int ano = Integer.parseInt(datNasc[2]);
        Calendar novoCalendar = Calendar.getInstance();
        novoCalendar.set(Calendar.DAY_OF_MONTH, dia);
        novoCalendar.set(Calendar.MONTH, mes);
        novoCalendar.set(Calendar.YEAR, ano);
        Date dataNascimento = novoCalendar.getTime();
        Pessoa novaPessoa = new Pessoa(nomeText.getText(), cpfText.getText(), rgText.getText(), pisText.getText(),
                emailText.getText(), telefoneText.getText(), dataNascimento,
                novoEnd = new Endereco(ruaText.getText(), bairroText.getText(), estadoText.getText(), cidadeText.getText(), cepText.getText(),
                        complementoText.getText(), referenciaText.getText(), Integer.parseInt(numEnderecoText.getText())), senhaText.getText(), respSegText.getText());
        if (checkAdmin.isSelected()) {
            novaPessoa.setAdmin(true);
        }
        if (PessoaController.criaPessoa(novaPessoa)) {
            limpaCampos();
        } else {
            JOptionPane.showMessageDialog(null, "Este usuário já possui cadastro no banco de dados.", "Usuário já cadastrado!", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_cadastrarFuncActionPerformed

    private void pergSegComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pergSegComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pergSegComboActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bairroText;
    private javax.swing.JButton cadastrarFunc;
    private javax.swing.JButton cancelarFunc;
    private javax.swing.JTextField cepText;
    private javax.swing.JCheckBox checkAdmin;
    private javax.swing.JTextField cidadeText;
    private javax.swing.JTextField complementoText;
    private javax.swing.JTextField cpfText;
    private javax.swing.JTextField emailText;
    private javax.swing.JTextField estadoText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nascimentoText;
    private javax.swing.JTextField nomeText;
    private javax.swing.JTextField numEnderecoText;
    private javax.swing.JComboBox<String> pergSegCombo;
    private javax.swing.JTextField pisText;
    private javax.swing.JTextField referenciaText;
    private javax.swing.JTextField respSegText;
    private javax.swing.JTextField rgText;
    private javax.swing.JTextField ruaText;
    private javax.swing.JPasswordField senhaText;
    private javax.swing.JComboBox<String> sexoCombo;
    private javax.swing.JTextField telefoneText;
    // End of variables declaration//GEN-END:variables
}
