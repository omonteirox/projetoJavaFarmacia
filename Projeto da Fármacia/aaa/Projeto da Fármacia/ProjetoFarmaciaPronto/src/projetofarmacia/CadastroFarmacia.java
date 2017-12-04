/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofarmacia;

import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gustavo
 */
public class CadastroFarmacia extends javax.swing.JFrame {
private Conexao mdbc;
private java.sql.Statement stmt;
    /**
     * Creates new form CadastroFarmacia
     */
 private ResultSet getResultFromProdutos() {
        ResultSet rs = null;
        try
        {
            rs = stmt.executeQuery("Select * from Fornecedor");
        }
        catch(SQLException e)
        {
        }

        return rs;
    }
    
    public CadastroFarmacia()throws SQLException {
        mdbc = new Conexao();
        mdbc.init();
        Connection conn = mdbc.getMyConnection();
        stmt = conn.createStatement();
        
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("ProjetoFarmacia?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        fornecedorQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT f FROM Fornecedor f");
        fornecedorList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : fornecedorQuery.getResultList();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTENDERECO = new javax.swing.JTextField();
        jTTELEFONE = new javax.swing.JTextField();
        jTCNPJ = new javax.swing.JTextField();
        jTEMAIL = new javax.swing.JTextField();
        JBREMOVER = new javax.swing.JButton();
        jBCADASTRAR = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLCADASTRO = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTNome = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTFarmacia = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Endereço :");

        jLabel2.setText("Telefone :");

        jLabel3.setText("Email :");

        jLabel4.setText("CNPJ :");

        jTENDERECO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTENDERECOActionPerformed(evt);
            }
        });

        JBREMOVER.setText("Remover");
        JBREMOVER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBREMOVERActionPerformed(evt);
            }
        });

        jBCADASTRAR.setText("Cadastrar");
        jBCADASTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCADASTRARActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Cadastro Farmácia");

        jLCADASTRO.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N

        jLabel6.setText("Nome :");

        jTNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNomeActionPerformed(evt);
            }
        });

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, fornecedorList, jTFarmacia);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${id}"));
        columnBinding.setColumnName("Id");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${endereco}"));
        columnBinding.setColumnName("Endereco");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${telefone}"));
        columnBinding.setColumnName("Telefone");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nome}"));
        columnBinding.setColumnName("Nome");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${email}"));
        columnBinding.setColumnName("Email");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cnpj}"));
        columnBinding.setColumnName("Cnpj");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();

        jScrollPane1.setViewportView(jTFarmacia);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jBCADASTRAR)
                        .addGap(41, 41, 41)
                        .addComponent(JBREMOVER)
                        .addGap(77, 77, 77)
                        .addComponent(jLCADASTRO, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTENDERECO, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTCNPJ))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTEMAIL))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTTELEFONE, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBCADASTRAR)
                            .addComponent(JBREMOVER)
                            .addComponent(jLCADASTRO, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTENDERECO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTTELEFONE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTEMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTENDERECOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTENDERECOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTENDERECOActionPerformed

    private void jBCADASTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCADASTRARActionPerformed
        String cnpj = jTCNPJ.getText();
        String email = jTEMAIL.getText();
        String nome = jTNome.getText();
        String telefone = jTTELEFONE.getText();
        String endereco = jTENDERECO.getText();
        
        
        

            String insertStr = "";

            try
            {
                insertStr = "insert into Fornecedor (CNPJ, Email, Nome, Telefone,  Endereco) values('"
                +cnpj+"','"
                +email+"','"
                +nome+"','"
                +telefone+"','"
                +endereco+"')";
                System.out.println(insertStr);
                int done = stmt.executeUpdate(insertStr);
                getContentPane().removeAll();
                initComponents();
                jLCADASTRO.setText("Um registro inserido!");
                jLCADASTRO.setForeground(Color.BLUE);
            }

            catch(Exception e)
            {
                jLCADASTRO.setText("Erro ao inserir registro!");
                jLCADASTRO.setForeground(Color.RED);
            }
                // TODO add your handling code here:
    }//GEN-LAST:event_jBCADASTRARActionPerformed

    private void JBREMOVERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBREMOVERActionPerformed
    Integer id = -1;
        try
        {
            id = (Integer)jTFarmacia.getValueAt(jTFarmacia.getSelectedRow(), 0);
        }
        catch(Exception e){}

        String insertStr = "";

        if(id != -1){
            try{
                insertStr = "delete from Fornecedor where id = '"+id+"'";
                stmt.executeUpdate(insertStr);
                getContentPane().removeAll();
                initComponents();
                jLCADASTRO.setText("Um registro foi apagado!");
                jLCADASTRO.setForeground(Color.BLUE);
            }
            catch(Exception e)
            {
                jLCADASTRO.setText("Erro ao apagar um registro!");
                jLCADASTRO.setForeground(Color.RED);
            }
        }
        else
        {
            jLCADASTRO.setText("Selecione um registro na Tabela!");
            jLCADASTRO.setForeground(Color.RED);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_JBREMOVERActionPerformed

    private void jTNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTNomeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroFarmacia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroFarmacia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroFarmacia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroFarmacia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new CadastroFarmacia().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(CadastroFarmacia.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBREMOVER;
    private javax.persistence.EntityManager entityManager;
    private java.util.List<projetofarmacia.Fornecedor> fornecedorList;
    private javax.persistence.Query fornecedorQuery;
    private javax.swing.JButton jBCADASTRAR;
    private javax.swing.JLabel jLCADASTRO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTCNPJ;
    private javax.swing.JTextField jTEMAIL;
    private javax.swing.JTextField jTENDERECO;
    private javax.swing.JTable jTFarmacia;
    private javax.swing.JTextField jTNome;
    private javax.swing.JTextField jTTELEFONE;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
