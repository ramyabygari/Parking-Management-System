/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ppp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import java.awt.HeadlessException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import java.time.Clock;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import ppp.SQLCONNECTION_NEW;
import ppp.user;
import java.text.DecimalFormat;
import java.awt.HeadlessException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import java.time.Clock;
/**
 *
 * @author Ramya B
 */
public class NewAdmin extends javax.swing.JFrame {

    /**
     * Creates new form NewAdmin
     */
  
String address,port,user,pass;
    /**
     * Creates new form CreateAdmin
     */
    public NewAdmin(String a,String b,String c,String d) {
        run();
        setResizable(false);
        address = a;
        port = b;
        user = c;
        pass = d;
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

        jPanel1 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        usertxt = new javax.swing.JTextField();
        passtxt = new javax.swing.JPasswordField();
        cnfpasstxt = new javax.swing.JPasswordField();
        nametxt = new javax.swing.JTextField();
        addrtxt = new javax.swing.JTextField();
        phntxt = new javax.swing.JTextField();
        ranktxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(108, 122, 137));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jRadioButton1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jRadioButton1.setText("MALE");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 290, -1, -1));

        jRadioButton2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jRadioButton2.setText("FEMALE");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, -1, -1));
        jPanel1.add(usertxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 80, 270, -1));

        passtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passtxtActionPerformed(evt);
            }
        });
        jPanel1.add(passtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 109, 270, -1));
        jPanel1.add(cnfpasstxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(449, 140, 270, -1));
        jPanel1.add(nametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(449, 170, 270, -1));
        jPanel1.add(addrtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(449, 200, 270, -1));
        jPanel1.add(phntxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 230, 270, -1));

        ranktxt.setText("Admin");
        jPanel1.add(ranktxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(515, 260, -1, -1));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 337, -1, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(452, 320, 260, -1));

        jPanel2.setBackground(new java.awt.Color(149, 165, 166));
        jPanel2.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true)));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("SUBMIT");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(33, 33, 33))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 350, -1, -1));

        jPanel3.setBackground(new java.awt.Color(149, 165, 166));
        jPanel3.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true)));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("GO BACK");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel10)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, -1, -1));

        jPanel9.setBackground(new java.awt.Color(0, 0, 0));

        jLabel11.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("CREATE");

        jLabel12.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("ANOTHER");

        jLabel15.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("ADMIN !");

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ppp/Icons/Accounting_32px.png"))); // NOI18N
        jLabel16.setText("jLabel7");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addComponent(jLabel11)
                .addGap(27, 27, 27)
                .addComponent(jLabel12)
                .addGap(28, 28, 28)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 294, Short.MAX_VALUE)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(144, 144, 144))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 60));

        jLabel13.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel13.setText("NAME");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 95, 30));

        jLabel32.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel32.setText("PASSWORD");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 106, -1, -1));

        jLabel21.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel21.setText("CONFIRM(pswd)");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 173, -1));

        jLabel22.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel22.setText("USERNAME");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 77, -1, -1));

        jLabel26.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel26.setText("ADDRESS");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, -1, -1));

        jLabel27.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel27.setText("PHONE");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, -1, -1));

        jLabel24.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel24.setText("RANK");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 68, -1));

        jLabel23.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel23.setText("GENDER");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, -1, -1));

        jLabel25.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel25.setText("VEHICLE NO.");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, -1, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ppp/Icons/Business Building_96px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 170, 350));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 750, 410));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed

        gender="Male";
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        gender="Female";
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void passtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passtxtActionPerformed

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
     this.setVisible(false);
                    new Permission_Admin(address,port,user,pass).setVisible(true);    // TODO add your handling code here:
    }//GEN-LAST:event_jPanel3MouseClicked

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        try {
            java.util.Date date = new java.util.Date();
      long t = date.getTime();
      java.sql.Timestamp sqlTimestamp = new java.sql.Timestamp(t);
                
                Connection theConn;
                String SQL;
                SQLCONNECTION_NEW  MyCon = new SQLCONNECTION_NEW(address,port,user,pass);
                theConn = MyCon.getConnection("Software_Parking_Project");
                Statement stmt = theConn.createStatement();    
                SQL = "select count(*) from Customers";
                ResultSet rs = stmt.executeQuery(SQL);rs.next();
                //RegularDBinfo_table.setModel(DbUtils.resultSetToTableModel(rs));
                int j=rs.getInt(1);
                System.out.println(j);
                SQL = "select * from Customers where id="+j;
                 rs=stmt.executeQuery(SQL);
                while(rs.next()){
                System.out.println(rs.getString(2));
                x1=rs.getString(2);
                 x5=rs.getString(3);
              
               
                
                }
                int cust=Integer.parseInt(x1);
                int reg=Integer.parseInt(x5);
                if(reg<cust){
        String c_user,c_pass,c_compass,c_name,c_gen,c_phone,c_address,c_rank,c_monthly,c_daily,c_mtax,c_dtax,c_vehi;

        c_user = usertxt.getText();
        c_pass =passtxt.getText();
        c_compass = cnfpasstxt.getText();
        c_name = nametxt.getText();
        c_gen = gender;
        c_vehi=jTextField1.getText();
        c_phone= phntxt.getText();
        c_address = addrtxt.getText();
        c_rank = ranktxt.getText();
       
        
        
        
        
        
        
        
        
        
        Date d = new Date(System.currentTimeMillis());

        //String timeStamp = new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime());

        if("".equals(c_user)){
            JOptionPane.showMessageDialog(null, "Please enter Username");
        }else if("".equals(c_pass)){
            JOptionPane.showMessageDialog(null, "Please enter Password");
        }else if("".equals(c_compass)){
            JOptionPane.showMessageDialog(null, "Please enter Comfirm Password");
        }else if("".equals(c_name)){
            JOptionPane.showMessageDialog(null, "Please enter your Full Name");
        }
        else if(c_gen == null){
            JOptionPane.showMessageDialog(null, "Please select your Gender");
        }else if("".equals(c_phone)){
            JOptionPane.showMessageDialog(null, "Please enter your Phone Number");
        }else if("".equals(c_address)){
            JOptionPane.showMessageDialog(null, "Please enter the Address");
        }else if(!c_pass.equals(c_compass)){
            JOptionPane.showMessageDialog(null, "Password do not match");
        }
        else if("".equals(c_vehi)){
            JOptionPane.showMessageDialog(null, "Please enter Vehicle NO.");}
        else{

                
                SQL = "insert into Regular (user,password,name,gender,phone,address,rank,Vehicle,Time) values "
                + "('" + c_user + "','" + c_pass + "','"+ c_name +"','" + c_gen + "','"+ c_phone +"','" + c_address +"','" + c_rank +"','" + c_vehi +"','" + sqlTimestamp + "')";
                stmt.executeUpdate(SQL);
                reg=reg+1;int guest=cust-reg;
            SQL = "INSERT INTO Customers(Total_Customers,Regular_Customers,Guest_Customers) VALUES ('"+cust+"','"+reg+"','"+guest+"')";  
                stmt.executeUpdate(SQL); 
                JOptionPane.showMessageDialog(null, "Regular Customers updated");
        this.setVisible(false);
                    new Permission_Admin(address,port,user,pass).setVisible(true);
                /*else{
            new loginforadd(address,port,user,pass,c_user,c_pass,c_compass,c_name,c_age,c_gen,c_phone,c_address,c_rank).setVisible(true);
        }*/
        }}else
                {JOptionPane.showMessageDialog(null, "ALL THE SLOTS ARE FILLED ,REGULAR CUSTOMERS CANNOT BE TAKEN IN! SORRY");    
            this.setVisible(false);
                    new Permission_Admin(address,port,user,pass).setVisible(true);
                }}catch (SQLException ex) {
      JOptionPane.showMessageDialog(null, ex);
    } // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2MouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed
private void run(){
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }}
    /**
     * @param args the command line arguments
     */
    /*public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
/*        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       /* java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewAdmin().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addrtxt;
    private javax.swing.JPasswordField cnfpasstxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField nametxt;
    private javax.swing.JPasswordField passtxt;
    private javax.swing.JTextField phntxt;
    private javax.swing.JTextField ranktxt;
    private javax.swing.JTextField usertxt;
    // End of variables declaration//GEN-END:variables
String gender,x1,x5;}