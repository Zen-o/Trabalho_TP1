/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Screens;

import javax.swing.JOptionPane;

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
        //this.setExtendedState(MAXIMIZED_BOTH);
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
        jFmdTxtEmail = new javax.swing.JFormattedTextField();
        btnEntrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        fldSenha = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/icons/icon_window.png")).getImage());
        setMinimumSize(new java.awt.Dimension(500, 500));
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(null);

        lblEmail.setText("E-mail");
        getContentPane().add(lblEmail);
        lblEmail.setBounds(60, 140, 34, 14);

        btnSenha.setText("Senha");
        getContentPane().add(btnSenha);
        btnSenha.setBounds(60, 200, 34, 14);

        jFmdTxtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFmdTxtEmailActionPerformed(evt);
            }
        });
        getContentPane().add(jFmdTxtEmail);
        jFmdTxtEmail.setBounds(60, 160, 310, 30);

        btnEntrar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEntrar);
        btnEntrar.setBounds(120, 280, 200, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Login");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 30, 70, 40);
        getContentPane().add(fldSenha);
        fldSenha.setBounds(60, 220, 310, 30);

        jLabel2.setForeground(new java.awt.Color(0, 51, 255));
        jLabel2.setText("Ainda não tem uma conta? Cadastre-se");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(120, 330, 200, 14);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jFmdTxtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFmdTxtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFmdTxtEmailActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        // Verificando os Logins
        if(jFmdTxtEmail.getText().equals("user_med") && fldSenha.getText().equals("12345Med")){
            //Verificando login medico
            new Medico().setVisible(true);
            this.setVisible(false);
        }
        if(jFmdTxtEmail.getText().equals("user_tri") && fldSenha.getText().equals("12345Tri")){
            //Verificando login triagem
            new Triagem().setVisible(true);
            this.setVisible(false);
        }
        if(jFmdTxtEmail.getText().equals("user_lab") && fldSenha.getText().equals("12345Lab")){
            //Verificando login laboratorio
            new Laboratorio().setVisible(true);
            this.setVisible(false);
        }
        
        if((jFmdTxtEmail.getText().equals("user_med") == false &&  fldSenha.getText().equals("12345Med") == false)
           && (jFmdTxtEmail.getText().equals("user_tri") == false &&  fldSenha.getText().equals("12345Tri") == false) 
           && (jFmdTxtEmail.getText().equals("user_lab") == false &&  fldSenha.getText().equals("12345lab") == false)){
            JOptionPane.showMessageDialog(null, "Dados inválidos");
            
        }
        
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        new Cadastro().setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

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
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel btnSenha;
    private javax.swing.JPasswordField fldSenha;
    private javax.swing.JFormattedTextField jFmdTxtEmail;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblEmail;
    // End of variables declaration//GEN-END:variables
}
