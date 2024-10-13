/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gym.management;
import java.sql.*;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author anand
 */
public class addmember extends javax.swing.JFrame {

    public addmember() {
       initComponents();
       try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gym","root","Admin");
            String q="select max(id) from member";
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(q);
            while(rs.next()){
                int id=rs.getInt(1);
                lblid.setText(String.valueOf(id+1));
            }
        }
        catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }

    public addmember(int id){
        initComponents();
        lblid.setText(String.valueOf(id));
        btnsave.setText("Update");
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gym","root","Admin");
            String sql="select * from member where id=?";
            PreparedStatement st=con.prepareStatement(sql);
            st.setInt(1,id);
            ResultSet rs=st.executeQuery();
            String n,m,t,e,ad,g,p,adr,u,pa;
            int i,a;
            while(rs.next()){
                i=rs.getInt(1);
                n=rs.getString(2);
                a=rs.getInt(3);
                m=rs.getString(4);
                t=rs.getString(5);
                e=rs.getString(6);
                ad=rs.getString(7);
                g=rs.getString(8);
                p=rs.getString(9);
                adr=rs.getString(10);
          
                txtname.setText(n);
                txtage.setText(String.valueOf(a));
                txtmob.setText(m);
                txtaddress.setText(adr);
                txtemail.setText(e);
                txtadhar.setText(ad);
                ddltime.setSelectedItem(t);
                ddlgender.setSelectedItem(g);
                ddlpayment.setSelectedItem(p);
            }
        }
        catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtage = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtmob = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtadhar = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ddlgender = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        ddltime = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        ddlpayment = new javax.swing.JComboBox<>();
        lblid = new javax.swing.JLabel();
        close = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        txtaddress = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(51, 51, 51)));

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon Gym Jframe/new member.png"))); // NOI18N
        jLabel1.setText("NEW MEMBER");

        jLabel2.setText("ID");

        jLabel3.setText("Enter Name");

        txtname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setText("Enter Age");

        txtage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setText("Enter Mobile No. ");

        txtmob.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setText("Enter Email");

        txtemail.setText("@gmail.com");
        txtemail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setText("Enter Adhar Card No.");

        txtadhar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setText("Select Gender");

        ddlgender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));

        jLabel9.setText("Select Timing");

        ddltime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Morning", "Evening" }));

        jLabel10.setText("Select Payment Method");

        ddlpayment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Monthly", "6 Month", "yearly" }));

        lblid.setBackground(new java.awt.Color(255, 0, 102));
        lblid.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblid.setForeground(new java.awt.Color(255, 0, 0));
        lblid.setText("ID");

        close.setBackground(new java.awt.Color(102, 102, 255));
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon Gym Jframe/close.png"))); // NOI18N
        close.setBorder(null);
        close.setFocusable(false);
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        btnsave.setBackground(new java.awt.Color(212, 111, 80));
        btnsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon Gym Jframe/save.png"))); // NOI18N
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        btnreset.setBackground(new java.awt.Color(0, 255, 255));
        btnreset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon Gym Jframe/reset.png"))); // NOI18N
        btnreset.setText("Reset");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });

        jLabel11.setText("Enter Adress");

        txtaddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
            .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel1Layout.createSequentialGroup()
                .add(266, 266, 266)
                .add(btnsave, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 112, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(36, 36, 36)
                .add(btnreset, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 112, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(234, 234, 234)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 272, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 252, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(170, 170, 170))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(92, 92, 92)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(txtname, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 205, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 88, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 89, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(txtage, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 205, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 120, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(txtmob, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 205, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 104, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(ddltime, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 205, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 34, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(18, 18, 18)
                                .add(lblid, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                    .add(jLabel7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 141, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(txtadhar)
                                    .add(jLabel8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 121, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(ddlgender, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .add(jLabel10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 133, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(ddlpayment, 0, 200, Short.MAX_VALUE))
                                .add(jLabel6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 108, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(txtemail)
                            .add(jLabel11, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 91, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(txtaddress))))
                .add(55, 55, 55)
                .add(close))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jLabel1))
                    .add(close, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 21, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(11, 11, 11)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel2)
                            .add(lblid, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 14, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(18, 18, 18)
                        .add(jLabel11)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(txtaddress, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel3)
                    .add(jLabel6))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(txtname, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(txtemail, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel4)
                    .add(jLabel7))
                .add(9, 9, 9)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(txtage, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(txtadhar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel5)
                    .add(jLabel8))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(txtmob, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(ddlgender, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel9)
                    .add(jLabel10))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(ddltime, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(ddlpayment, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(45, 45, 45)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(btnsave)
                    .add(btnreset))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        dispose();
    }//GEN-LAST:event_closeActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        int id=Integer.parseInt(lblid.getText());
        String name=txtname.getText();
        String phone=txtmob.getText();
        String a=txtage.getText();
        String time=ddltime.getSelectedItem().toString();
        String email=txtemail.getText();
        String adhar=txtadhar.getText();
        String gender=ddlgender.getSelectedItem().toString();
        String payment=ddlpayment.getSelectedItem().toString();
        String address=txtaddress.getText();
        String btn=btnsave.getText();
        
        if(name.isEmpty()){
            JOptionPane.showMessageDialog(this,"Please Enter name");
            txtname.setBackground(new Color(246, 53, 40));
            return;
        }
        if(!a.matches("\\d+")||a.isEmpty()){
            JOptionPane.showMessageDialog(this,"Please Enter Valid age");
            txtage.setBackground(new Color(246, 53, 40));
            return;
        }
        int age=Integer.parseInt(a);
        if(phone.matches("^[0-9]*$")==false || phone.length()!=10){
            JOptionPane.showMessageDialog(this,"Please check Phone Number");
            txtmob.setBackground(new Color(246, 53, 40));
            return;
        }
        
        if(address.isEmpty()){
            JOptionPane.showMessageDialog(this,"Please Enter Address");
            txtaddress.setBackground(new Color(246, 53, 40));
            return;
        }
        if(email.matches("[a-zA-Z0-9\\-\\.]+@[a-z]+\\.[a-z]{2,3}")==false){
            JOptionPane.showMessageDialog(this,"Please check email");
            txtemail.setBackground(new Color(246, 53, 40));
            return;
        }
        if(adhar.matches("^[0-9]*$")==false || adhar.length()!=12){
            JOptionPane.showMessageDialog(this,"Please check Adhar Card Number");
            txtadhar.setBackground(new Color(246, 53, 40));
            return;
        }
        
        if(btn.equals("Update")){
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gym","root","Admin");
                String q="update member set name=?,age=?,phone=?,gender=?,time=?,email=?,adhar=?,payment=?,address=? where id=?";
                PreparedStatement ps=con.prepareStatement(q);
                ps.setString(1,name);
                ps.setInt(2,age);
                ps.setString(3,phone);
                ps.setString(4,gender);
                ps.setString(5,time);
                ps.setString(6,email);
                ps.setString(7,adhar);
                ps.setString(8,payment);
                ps.setString(9,address);
                ps.setInt(10,id);
                int b=ps.executeUpdate();
                if(b>0){
                    JOptionPane.showMessageDialog(this,"Data Updated Successfully");
                    new viewmember().setVisible(true);
                    dispose();
                    return;
                }
            }
            catch(Exception e){
                System.out.println("Error: "+e.getMessage());
            }
        }
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gym","root","Admin");
            String q="insert into member(name,age,phone,gender,time,email,adhar,payment,address) values(?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps=con.prepareStatement(q);
            ps.setString(1,name);
            ps.setInt(2,age);
            ps.setString(3,phone);
            ps.setString(4,gender);
            ps.setString(5,time);
            ps.setString(6,email);
            ps.setString(7,adhar);
            ps.setString(8,payment);
            ps.setString(9,address);
            int b=ps.executeUpdate();
            if(b>0){
                JOptionPane.showMessageDialog(this,"Data Saved Successfully");
                new addmember().setVisible(true);
                dispose();
            }
        }
        catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        txtname.setText("");
        txtmob.setText("");
        txtage.setText("");
        txtaddress.setText("");
        txtemail.setText("");
        txtadhar.setText("");
    }//GEN-LAST:event_btnresetActionPerformed

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
            java.util.logging.Logger.getLogger(addmember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addmember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addmember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addmember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addmember().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnreset;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton close;
    private javax.swing.JComboBox<String> ddlgender;
    private javax.swing.JComboBox<String> ddlpayment;
    private javax.swing.JComboBox<String> ddltime;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblid;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtadhar;
    private javax.swing.JTextField txtage;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtmob;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables

}
