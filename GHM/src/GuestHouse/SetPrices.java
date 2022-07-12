/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GuestHouse;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.print.event.PrintJobEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.xml.crypto.KeySelector;
import sun.security.krb5.EncryptedData;

/**
 *
 * @author Abid Ali
 */
public class SetPrices extends javax.swing.JFrame {
ConnectDatabase con_obj=new ConnectDatabase();
   Connection con;
   Statement stmt = null;
   PreparedStatement pstmt = null;
   ResultSet res;
   DefaultTableModel d;
   
    /**
     * Creates new form SetPrices
     */
    public SetPrices() {
       con=con_obj.EstablishCon();
        initComponents();
        con_obj.EstablishCon();
    }
    
    public void Close(){
             WindowEvent WCE=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
             Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(WCE);
             
         }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        vrm = new javax.swing.JTextField();
        srm = new javax.swing.JTextField();
        dbd = new javax.swing.JTextField();
        sbd = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        athc = new javax.swing.JPasswordField();
        Save = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        homebtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel13.setText("Prices");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jLabel13)
                .addContainerGap(144, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "SET PRICES", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Rooms Category");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, -1, -1));

        jLabel3.setText("VIP Rooms            :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, -1));

        jLabel4.setText("Standard Rooms  :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 91, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText(" Bed Category");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, -1, -1));

        jLabel6.setText("Single Bed       :");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, -1, -1));

        jLabel7.setText("Double Bed     :");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, -1, -1));
        jPanel2.add(vrm, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 71, -1));
        jPanel2.add(srm, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 71, -1));
        jPanel2.add(dbd, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 75, -1));
        jPanel2.add(sbd, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 74, -1));

        jLabel8.setText("Authority Code        :");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 184, -1, -1));
        jPanel2.add(athc, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 181, 96, -1));

        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        jPanel2.add(Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 219, 77, -1));

        jButton1.setText("View Prices");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 219, -1, -1));

        homebtn.setText("Home");
        homebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homebtnActionPerformed(evt);
            }
        });
        jPanel2.add(homebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 253, 75, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 570, 290));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cross.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 30, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homebtnActionPerformed
        ControlPanel cp=new ControlPanel(true);
        cp.setLocationRelativeTo(null);
        cp.setVisible(true);
        close();
    }//GEN-LAST:event_homebtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String vip=null;
        String std=null;
        String sin=null;
        String dou=null;
        String view="select * from Price ";
        try {
            pstmt = con.prepareStatement(view);
            res = pstmt.executeQuery();
            while(res.next()) {
                vip=res.getString(1);
                std=res.getString(2);
                sin=res.getString(3);
                dou=res.getString(4);
            }
            vrm.setText(vip);
            srm.setText(std);
            sbd.setText(sin);
            dbd.setText(dou);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed

        String vr=vrm.getText();
        String sr=srm.getText();
        String sb=sbd.getText();
        String db=dbd.getText();
        boolean b=false;

        char[] pass = athc.getPassword();
        String final_pass = "";
        for (char x : pass) {
            final_pass += x;
        }
        String admin="admin123";
        String ch = (final_pass);
        if (final_pass.equals(admin)) {
            b=true;

        }else{
            b=false;

        }

        String upd="update Price set VIProom='"+vr+"', STDroom='"+sr+"', SingleBed='"+sb+"',DoubleBed='"+db+"' where ID='"+1+"' ";
        try{
            if(b==true){
                pstmt = con.prepareStatement(upd);
                int res=pstmt.executeUpdate();
                JOptionPane.showMessageDialog(this, "Prices Updated");
                ControlPanel cp=new ControlPanel(true);
                cp.setVisible(true);
                Close();
            }
            else{
                JOptionPane.showMessageDialog(this, "Invalid Authorized Code");
            }

        }catch(Exception e){
            System.out.println(e);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_SaveActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
ControlPanel cp=new ControlPanel(true);
                cp.setVisible(true);
                Close();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed
 public void close(){
        WindowEvent WCE=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(WCE);
        
    }
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
            java.util.logging.Logger.getLogger(SetPrices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SetPrices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SetPrices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SetPrices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SetPrices().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Save;
    private javax.swing.JPasswordField athc;
    private javax.swing.JTextField dbd;
    private javax.swing.JButton homebtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField sbd;
    private javax.swing.JTextField srm;
    private javax.swing.JTextField vrm;
    // End of variables declaration//GEN-END:variables
}
