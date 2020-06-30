package br.com.paulo.swing.viewers;

import br.com.paulo.swing.controllers.ClienteController;
import br.com.paulo.swing.exceptions.StandardException;
import br.com.paulo.swing.models.Cliente;
import br.com.paulo.swing.utils.OperacoesCrud;
import java.util.List;
import java.util.logging.Logger; 
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;


public class ClienteView extends javax.swing.JFrame {

    public Integer operacao;
    private ClienteController clienteController;
    private final Logger logger = Logger.getLogger(ClienteView.class.getName());
    
    public ClienteView() {
        initComponents();
        updateTable();
        pnBotoesAcao.setVisible(false);
        limparCampos();
    }
    
    public ClienteView(ClienteController clienteController) {
        this.clienteController = clienteController;
        initComponents();
        updateTable();
        pnBotoesAcao.setVisible(false);
        limparCampos();
    }

   
    @SuppressWarnings("unchecked")
    private void initComponents() {//GEN-BEGIN:initComponents

        pnAcoes = new javax.swing.JPanel();
        btnNovoCliente = new javax.swing.JButton();
        btnEditarCliente = new javax.swing.JButton();
        btnExcluirCliente = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        pnDados = new javax.swing.JPanel();
        lblDtNascimento = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblCPF = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        txtCPF = new javax.swing.JTextField();
        pSexo = new javax.swing.JPanel();
        rBtnMasculino = new javax.swing.JRadioButton();
        rBtnFemilino = new javax.swing.JRadioButton();
        pnBotoesAcao = new javax.swing.JPanel();
        btnSalvar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblErro = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        dtcNascimento = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbClientes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnAcoes.setBorder(javax.swing.BorderFactory.createTitledBorder("Ações"));

        btnNovoCliente.setText("Novo");
        btnNovoCliente.setName("btnNovoCliente"); // NOI18N
        btnNovoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoClienteActionPerformed(evt);
            }
        });

        btnEditarCliente.setText("Editar");
        btnEditarCliente.setName("btnEditarCliente"); // NOI18N
        btnEditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarClienteActionPerformed(evt);
            }
        });

        btnExcluirCliente.setText("Excluir");
        btnExcluirCliente.setName("btnExcluirCliente"); // NOI18N
        btnExcluirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirClienteActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.setName("btnSair"); // NOI18N
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnAcoesLayout = new javax.swing.GroupLayout(pnAcoes);
        pnAcoes.setLayout(pnAcoesLayout);
        pnAcoesLayout.setHorizontalGroup(
            pnAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnAcoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNovoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluirCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnAcoesLayout.setVerticalGroup(
            pnAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnAcoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovoCliente)
                    .addComponent(btnEditarCliente)
                    .addComponent(btnExcluirCliente)
                    .addComponent(btnSair))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnDados.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblDtNascimento.setText("Dt. Nasciimento:");
        lblDtNascimento.setName("lblDtNascimento"); // NOI18N

        lblTelefone.setText("Telefone:");
        lblTelefone.setName("lblTelefone"); // NOI18N

        lblNome.setText("Nome: ");
        lblNome.setName("txtNome"); // NOI18N

        txtNome.setEditable(false);
        txtNome.setName("txtNome"); // NOI18N

        lblCPF.setText("CPF:");
        lblCPF.setName("lblCPF"); // NOI18N

        lblSexo.setText("Sexo:");
        lblSexo.setName("lblSexo"); // NOI18N

        txtCPF.setEditable(false);
        txtCPF.setName("txtCPF"); // NOI18N

        rBtnMasculino.setSelected(true);
        rBtnMasculino.setText("M");
        rBtnMasculino.setEnabled(false);
        rBtnMasculino.setFocusCycleRoot(true);
        rBtnMasculino.setName("rBtnMasculino"); // NOI18N
        rBtnMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBtnMasculinoActionPerformed(evt);
            }
        });

        rBtnFemilino.setText("F");
        rBtnFemilino.setEnabled(false);
        rBtnFemilino.setName("rBtnFemilino"); // NOI18N
        rBtnFemilino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBtnFemilinoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pSexoLayout = new javax.swing.GroupLayout(pSexo);
        pSexo.setLayout(pSexoLayout);
        pSexoLayout.setHorizontalGroup(
            pSexoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSexoLayout.createSequentialGroup()
                .addComponent(rBtnMasculino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rBtnFemilino)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pSexoLayout.setVerticalGroup(
            pSexoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSexoLayout.createSequentialGroup()
                .addGroup(pSexoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rBtnMasculino)
                    .addComponent(rBtnFemilino))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnBotoesAcao.setName("pnBotoesAcao"); // NOI18N

        btnSalvar.setText("Salvar");
        btnSalvar.setName("btnSalvar"); // NOI18N
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnAtualizar.setActionCommand("Atualizar");
        btnAtualizar.setLabel("Atualizar");
        btnAtualizar.setName("btnAtualizar"); // NOI18N
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.setName("btnCancelar"); // NOI18N
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnBotoesAcaoLayout = new javax.swing.GroupLayout(pnBotoesAcao);
        pnBotoesAcao.setLayout(pnBotoesAcaoLayout);
        pnBotoesAcaoLayout.setHorizontalGroup(
            pnBotoesAcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBotoesAcaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnBotoesAcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnBotoesAcaoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCancelar))
                    .addComponent(btnSalvar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAtualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnBotoesAcaoLayout.setVerticalGroup(
            pnBotoesAcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBotoesAcaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAtualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar))
        );

        lblErro.setForeground(new java.awt.Color(204, 0, 0));
        lblErro.setText("Preencha todos os campos");

        txtTelefone.setEditable(false);
        txtTelefone.setName("txtTelefone"); // NOI18N
        txtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneActionPerformed(evt);
            }
        });

        dtcNascimento.setEnabled(false);

        javax.swing.GroupLayout pnDadosLayout = new javax.swing.GroupLayout(pnDados);
        pnDados.setLayout(pnDadosLayout);
        pnDadosLayout.setHorizontalGroup(
            pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnDadosLayout.createSequentialGroup()
                        .addComponent(lblErro)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnDadosLayout.createSequentialGroup()
                        .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNome)
                            .addComponent(lblSexo)
                            .addComponent(lblDtNascimento)
                            .addComponent(lblCPF)
                            .addComponent(lblTelefone))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnDadosLayout.createSequentialGroup()
                                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(pnDadosLayout.createSequentialGroup()
                                .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dtcNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addComponent(pnBotoesAcao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        pnDadosLayout.setVerticalGroup(
            pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnDadosLayout.createSequentialGroup()
                        .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNome)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCPF)
                            .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSexo)
                            .addComponent(pSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDtNascimento)
                            .addComponent(dtcNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTelefone)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(pnBotoesAcao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblErro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nome", "CPF", "Sexo", "Dt. Nascimento", "Telefone"
            }
        ));
        tbClientes.setName("tbClientes"); // NOI18N
        tbClientes.setShowGrid(true);
        jScrollPane1.setViewportView(tbClientes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnAcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 736, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnAcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(pnDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(304, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(245, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        pack();
    }//GEN-END:initComponents

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        gravarAtualizarDados();
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnNovoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoClienteActionPerformed
        operacao = OperacoesCrud.NOVO.getOperacao();
        btnEditarCliente.setEnabled(false);
        btnAtualizar.setVisible(false);
        btnExcluirCliente.setEnabled(false);
        pnBotoesAcao.setVisible(true);
        rBtnFemilino.setEnabled(true);
        rBtnMasculino.setEnabled(true);
        abrirCampos();
    }//GEN-LAST:event_btnNovoClienteActionPerformed

    private void btnEditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarClienteActionPerformed
        operacao = OperacoesCrud.EDITAR.getOperacao();
    }//GEN-LAST:event_btnEditarClienteActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
       gravarAtualizarDados();
       updateTable();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirClienteActionPerformed

    private void rBtnFemilinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBtnFemilinoActionPerformed
        rBtnMasculino.setSelected(false);
    }//GEN-LAST:event_rBtnFemilinoActionPerformed

    private void rBtnMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBtnMasculinoActionPerformed
        rBtnFemilino.setSelected(false);
    }//GEN-LAST:event_rBtnMasculinoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        btnEditarCliente.setEnabled(true);
        btnAtualizar.setVisible(true);
        btnExcluirCliente.setEnabled(true);
        fecharCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        fecharCampos();
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void txtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditarCliente;
    private javax.swing.JButton btnExcluirCliente;
    private javax.swing.JButton btnNovoCliente;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private com.toedter.calendar.JDateChooser dtcNascimento;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblDtNascimento;
    private javax.swing.JLabel lblErro;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JPanel pSexo;
    private javax.swing.JPanel pnAcoes;
    private javax.swing.JPanel pnBotoesAcao;
    private javax.swing.JPanel pnDados;
    private javax.swing.JRadioButton rBtnFemilino;
    private javax.swing.JRadioButton rBtnMasculino;
    private javax.swing.JTable tbClientes;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables

    
    private Cliente instanciarCliente(){
        Cliente cliente = new Cliente();
        cliente.setNome(txtNome.getText());
        cliente.setCpf(txtCPF.getText());
        cliente.setSexo(rBtnMasculino.isSelected() ? 'M' : 'F');
        cliente.setNascimento(new java.sql.Date(dtcNascimento.getDate().getTime()));
        cliente.setTelefone(txtTelefone.getText());
        return cliente;
    }
    
    private boolean validarCampos(){
        boolean valido = true;
        if(txtNome.getText().trim().equals("")){
            lblErro.setText("Preencha o nome");
            valido = false;
        }
        if(txtCPF.getText().trim().equals("")){
            lblErro.setText("Preencha o CPF");
            valido = false;
        }
        if(txtTelefone.getText().trim().equals("")){
            lblErro.setText("Preencha o Telefoe");
            valido = false;
        }
        if(dtcNascimento.getDate() == null){
            lblErro.setText("Preencha uma data de nascimento");
            valido = false;
        }
        if(!rBtnMasculino.isSelected() && !rBtnFemilino.isSelected()){
           lblErro.setText("Escolha um sexo");
           valido = false;
        }
        return valido;
    }
    
    private void gravarAtualizarDados() {
        try {
            if(operacao.equals(OperacoesCrud.NOVO.getOperacao())){
                if(validarCampos()){
                    clienteController.insert(instanciarCliente());
                    fecharCampos();
                    JOptionPane.showMessageDialog(null, "Registro inserido com sucesso!", "Successo", JOptionPane.INFORMATION_MESSAGE);
                } else
                    lblErro.setVisible(true);
           
            } else if(operacao.equals(OperacoesCrud.EDITAR.getOperacao()))
                logger.info("Operacao de ediitar");
            else 
                logger.info("Outras operacaoes");
         } catch(StandardException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Erro ao insetir dados", JOptionPane.ERROR_MESSAGE);
         }
        
    }
    
    private void fecharCampos(){
        txtNome.setEditable(false);
        txtCPF.setEditable(false);
        txtTelefone.setEditable(false);
        dtcNascimento.setEnabled(false);
        rBtnFemilino.setEnabled(false);
        rBtnMasculino.setEnabled(false);
        pnBotoesAcao.setVisible(false);
        limparCampos();
    }
    
    private void abrirCampos(){
        txtNome.setEditable(true);
        txtCPF.setEditable(true);
        txtTelefone.setEditable(true);
        dtcNascimento.setEnabled(true);
        lblErro.setVisible(false);
    }
    
    private void updateTable() {
        List<Cliente> clientes = clienteController.findAll();
        DefaultTableModel model = (DefaultTableModel)tbClientes.getModel();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
  
        int rowCount = model.getRowCount();
        
        for(int i = rowCount - 1; i >= 0; i--)
            model.removeRow(i);
        
        for(Cliente c: clientes)
            model.addRow(
                    new Object[]{
                        c.getCodigo(),
                        c.getNome(),
                        c.getCpf(),
                        c.getSexo().toString(),
                        sdf.format(c.getNascimento()),
                        c.getTelefone()
                    }
            );
    }
    
    private void limparCampos(){
        txtNome.setText("");
        txtTelefone.setText("");
        txtCPF.setText("");
        dtcNascimento.setDate(null);
        rBtnFemilino.setSelected(false);
        rBtnMasculino.setSelected(true);
        lblErro.setVisible(false);
    }
}
