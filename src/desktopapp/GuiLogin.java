/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desktopapp;

/**
 *
 * @author Dominik
 */
public class GuiLogin extends javax.swing.JFrame {

    /**
     * Creates new form Gui
     */
    public GuiLogin() {
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

        mainPanel = new javax.swing.JPanel();
        loginLbl = new javax.swing.JLabel();
        usernameLbl = new javax.swing.JLabel();
        passwordLbl = new javax.swing.JLabel();
        loginBtn = new javax.swing.JButton();
        registerBtn = new javax.swing.JButton();
        passwordTf = new javax.swing.JTextField();
        usernameTf = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(250, 300));
        setResizable(false);

        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginLbl.setFont(new java.awt.Font("Myriad Pro", 0, 24)); // NOI18N
        loginLbl.setText("LOGIN:");
        mainPanel.add(loginLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 31, -1, -1));

        usernameLbl.setText("Username:");
        mainPanel.add(usernameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 89, -1, -1));

        passwordLbl.setText("Password:");
        mainPanel.add(passwordLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 120, -1, -1));

        loginBtn.setText("Login");
        loginBtn.setPreferredSize(new java.awt.Dimension(80, 25));
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });
        mainPanel.add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 157, -1, -1));

        registerBtn.setText("Register");
        registerBtn.setPreferredSize(new java.awt.Dimension(80, 25));
        mainPanel.add(registerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 204, -1, -1));

        passwordTf.setPreferredSize(new java.awt.Dimension(100, 22));
        passwordTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTfActionPerformed(evt);
            }
        });
        mainPanel.add(passwordTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 117, -1, -1));

        usernameTf.setPreferredSize(new java.awt.Dimension(100, 22));
        usernameTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTfActionPerformed(evt);
            }
        });
        mainPanel.add(usernameTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 89, -1, -1));

        getContentPane().add(mainPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTfActionPerformed

    private void passwordTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTfActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        new GuiDatabase().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_loginBtnActionPerformed

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
            java.util.logging.Logger.getLogger(GuiLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton loginBtn;
    private javax.swing.JLabel loginLbl;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel passwordLbl;
    private javax.swing.JTextField passwordTf;
    private javax.swing.JButton registerBtn;
    private javax.swing.JLabel usernameLbl;
    private javax.swing.JTextField usernameTf;
    // End of variables declaration//GEN-END:variables
}
