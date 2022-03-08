/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package metro;
import java.awt.CardLayout;
import java.io.*;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import net.proteanit.sql.DbUtils;
public class MainProg extends javax.swing.JFrame {

    /**
     * Creates new form MainProg
     */
    public MainProg() {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        MetroMap = new javax.swing.JButton();
        MetroLines = new javax.swing.JButton();
        Book = new javax.swing.JButton();
        Subscriptions = new javax.swing.JButton();
        ContactUS = new javax.swing.JButton();
        ExitH = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setLayout(new java.awt.GridLayout(6, 1));

        MetroMap.setBackground(new java.awt.Color(230, 230, 230));
        MetroMap.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        MetroMap.setForeground(new java.awt.Color(20, 39, 155));
        MetroMap.setText("Metro Map");
        MetroMap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MetroMapActionPerformed(evt);
            }
        });
        jPanel4.add(MetroMap);

        MetroLines.setBackground(new java.awt.Color(230, 230, 230));
        MetroLines.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        MetroLines.setForeground(new java.awt.Color(20, 39, 155));
        MetroLines.setText("Metro Lines");
        MetroLines.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MetroLinesActionPerformed(evt);
            }
        });
        jPanel4.add(MetroLines);

        Book.setBackground(new java.awt.Color(230, 230, 230));
        Book.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        Book.setForeground(new java.awt.Color(20, 39, 155));
        Book.setText("Booking");
        Book.setToolTipText("");
        Book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookActionPerformed(evt);
            }
        });
        jPanel4.add(Book);

        Subscriptions.setBackground(new java.awt.Color(230, 230, 230));
        Subscriptions.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        Subscriptions.setForeground(new java.awt.Color(20, 39, 155));
        Subscriptions.setText("Subscriptions");
        Subscriptions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubscriptionsActionPerformed(evt);
            }
        });
        jPanel4.add(Subscriptions);

        ContactUS.setBackground(new java.awt.Color(230, 230, 230));
        ContactUS.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        ContactUS.setForeground(new java.awt.Color(20, 39, 155));
        ContactUS.setText("Contact Us");
        ContactUS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContactUSActionPerformed(evt);
            }
        });
        jPanel4.add(ContactUS);

        ExitH.setBackground(new java.awt.Color(230, 230, 230));
        ExitH.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        ExitH.setForeground(new java.awt.Color(20, 39, 155));
        ExitH.setText("Exit");
        ExitH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitHActionPerformed(evt);
            }
        });
        jPanel4.add(ExitH);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 384, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 425, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MetroMapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MetroMapActionPerformed
        MetroMapJF mm = new MetroMapJF();
        mm.setVisible(true);
        mm.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_MetroMapActionPerformed

    private void MetroLinesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MetroLinesActionPerformed
        MetroLinesJF ml = new MetroLinesJF();
        ml.setVisible(true);
        ml.setLocationRelativeTo(null);
        this.setVisible(false); 
       }//GEN-LAST:event_MetroLinesActionPerformed

    private void BookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookActionPerformed
        Booking b = new Booking();
        b.setVisible(true);
        b.setLocationRelativeTo(null);
        this.setVisible(false); 

    }//GEN-LAST:event_BookActionPerformed

    private void SubscriptionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubscriptionsActionPerformed
            Subscriptions s = new Subscriptions();
            s.setVisible(true);
            s.setLocationRelativeTo(null);
            this.setVisible(false);

    }//GEN-LAST:event_SubscriptionsActionPerformed

    private void ContactUSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContactUSActionPerformed
        ContactUs cu = new ContactUs();
        cu.setVisible(true);
        cu.setLocationRelativeTo(null);
        this.setVisible(false);
        
    }//GEN-LAST:event_ContactUSActionPerformed

    private void ExitHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitHActionPerformed
        if(JOptionPane.showConfirmDialog(this, "Do you want to exit ?", "Confirmation",
            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
    System.exit(0);
    }//GEN-LAST:event_ExitHActionPerformed

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
            java.util.logging.Logger.getLogger(MainProg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainProg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainProg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainProg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainProg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Book;
    private javax.swing.JButton ContactUS;
    private javax.swing.JButton ExitH;
    private javax.swing.JButton MetroLines;
    private javax.swing.JButton MetroMap;
    private javax.swing.JButton Subscriptions;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}