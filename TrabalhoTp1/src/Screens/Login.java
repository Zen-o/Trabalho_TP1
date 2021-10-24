/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Screens;

/**
 *
 * @author Bismarck
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblEmail = new javax.swing.JLabel();
        btnSenha = new javax.swing.JLabel();
        FrmtdTxtSenha = new javax.swing.JFormattedTextField();
        jFmdTxtEmail = new javax.swing.JFormattedTextField();
        btnEntrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        CmbBoxFuncPac = new javax.swing.JComboBox<>();
        Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setMinimumSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(null);

        lblEmail.setText("E-mail");
        getContentPane().add(lblEmail);
        lblEmail.setBounds(490, 300, 34, 14);

        btnSenha.setText("Senha");
        getContentPane().add(btnSenha);
        btnSenha.setBounds(490, 360, 34, 14);

        FrmtdTxtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FrmtdTxtSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(FrmtdTxtSenha);
        FrmtdTxtSenha.setBounds(485, 375, 310, 30);

        jFmdTxtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFmdTxtEmailActionPerformed(evt);
            }
        });
        getContentPane().add(jFmdTxtEmail);
        jFmdTxtEmail.setBounds(485, 315, 310, 30);

        btnEntrar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEntrar);
        btnEntrar.setBounds(540, 430, 200, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Login");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(600, 200, 70, 40);

        CmbBoxFuncPac.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Funcionario", "Paciente" }));
        getContentPane().add(CmbBoxFuncPac);
        CmbBoxFuncPac.setBounds(560, 260, 160, 30);

        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PicsAndBG/Login.png"))); // NOI18N
        getContentPane().add(Fundo);
        Fundo.setBounds(0, 0, 1280, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FrmtdTxtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FrmtdTxtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FrmtdTxtSenhaActionPerformed

    private void jFmdTxtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFmdTxtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFmdTxtEmailActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEntrarActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CmbBoxFuncPac;
    private javax.swing.JFormattedTextField FrmtdTxtSenha;
    private javax.swing.JLabel Fundo;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel btnSenha;
    private javax.swing.JFormattedTextField jFmdTxtEmail;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblEmail;
    // End of variables declaration//GEN-END:variables
}
