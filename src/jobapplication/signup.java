package jobapplication;


import javax.swing.JOptionPane;
import java.sql.*;  
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ubaid
 */
public class signup extends javax.swing.JFrame {

    /**
     * Creates new form signup
     */
    public signup() {
        initComponents();
        setLocationRelativeTo(null);
        
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        user_name = new javax.swing.JTextField();
        applicantname = new javax.swing.JTextField();
        applicant_email = new javax.swing.JTextField();
        contact_no = new javax.swing.JTextField();
        cnic_no = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        confirm_password = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        applicant_address = new javax.swing.JTextArea();
        sign_up_button = new javax.swing.JButton();
        return_to_login = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));
        setPreferredSize(new java.awt.Dimension(800, 630));
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(800, 800));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("Sign Up");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(399, 10, 80, 33);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("User Name");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(120, 60, 100, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("Email");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(120, 150, 100, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("Name");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(120, 100, 100, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("CNIC No.");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(120, 250, 100, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText("Contact No.");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(120, 200, 100, 32);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setText("Password");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(120, 300, 100, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(java.awt.Color.white);
        jLabel8.setText("Address");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(120, 400, 70, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setForeground(java.awt.Color.white);
        jLabel9.setText("Confirm Password");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(120, 350, 100, 30);

        user_name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        user_name.setToolTipText("");
        user_name.setSelectionColor(java.awt.Color.gray);
        jPanel1.add(user_name);
        user_name.setBounds(230, 60, 280, 30);

        applicantname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        applicantname.setSelectionColor(java.awt.Color.gray);
        jPanel1.add(applicantname);
        applicantname.setBounds(230, 110, 280, 30);

        applicant_email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        applicant_email.setSelectionColor(java.awt.Color.gray);
        jPanel1.add(applicant_email);
        applicant_email.setBounds(230, 160, 280, 30);

        contact_no.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        contact_no.setSelectionColor(java.awt.Color.gray);
        jPanel1.add(contact_no);
        contact_no.setBounds(230, 210, 280, 30);

        cnic_no.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cnic_no.setSelectionColor(java.awt.Color.gray);
        jPanel1.add(cnic_no);
        cnic_no.setBounds(230, 260, 280, 30);

        password.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        password.setSelectionColor(java.awt.Color.gray);
        jPanel1.add(password);
        password.setBounds(230, 300, 280, 30);

        confirm_password.setSelectionColor(java.awt.Color.gray);
        jPanel1.add(confirm_password);
        confirm_password.setBounds(230, 350, 280, 30);

        applicant_address.setColumns(20);
        applicant_address.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        applicant_address.setRows(5);
        applicant_address.setSelectionColor(java.awt.Color.gray);
        jScrollPane1.setViewportView(applicant_address);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(230, 400, 410, 126);

        sign_up_button.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sign_up_button.setText("Sign Up");
        sign_up_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sign_up_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(sign_up_button);
        sign_up_button.setBounds(230, 540, 130, 36);

        return_to_login.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        return_to_login.setText("Go Back");
        return_to_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                return_to_loginActionPerformed(evt);
            }
        });
        jPanel1.add(return_to_login);
        return_to_login.setBounds(400, 540, 130, 36);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(java.awt.Color.white);
        jLabel10.setText("Or");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(370, 550, 22, 17);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jobapplication/login.jpg"))); // NOI18N
        jLabel11.setText("jLabel11");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(-40, -70, 840, 850);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 778, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sign_up_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sign_up_buttonActionPerformed
        // TODO add your handling code here:
        String us_name = user_name.getText();
        String name = applicantname.getText();
        String email = applicant_email.getText();
        String contact_num = contact_no.getText();
        String cnic = cnic_no.getText();
        String address = applicant_address.getText();
        String pass = password.getText();
        String c_pass = confirm_password.getText();
       
        if (us_name.isEmpty()){
            
            JOptionPane.showMessageDialog(null, "UserName Required", "Invalid Username", HEIGHT);
             
        }
        else if (name.isEmpty()){
            
            JOptionPane.showMessageDialog(null, "Applicant Name Required", "Invalid Applicant Name", HEIGHT);
        }
        else if (email.isEmpty()){
            
            JOptionPane.showMessageDialog(null, "Email Required", "Invalid Email", HEIGHT);
        }
        else if (contact_num.isEmpty()){
            
            JOptionPane.showMessageDialog(null, "Contact Number Required", "Invalid Contact Number", HEIGHT);
        }
        else if (cnic.isEmpty()){
            
            JOptionPane.showMessageDialog(null, "CNIC Required", "Invalid CNIC", HEIGHT);
        }
        else if (address.isEmpty()){
            
            JOptionPane.showMessageDialog(null, "Address Required", "Invalid Address", HEIGHT);
        }
        else if (pass.isEmpty()){
            
            JOptionPane.showMessageDialog(null, "Password Required", "Invalid Password", HEIGHT);
        }else if (c_pass.isEmpty()){
            
            JOptionPane.showMessageDialog(null, "Confirm Password Required", "Invalid Confirm Password", HEIGHT);
        }
        else if (!c_pass.equals(pass)){
            JOptionPane.showMessageDialog(null, "Password Not Match", "Invalid Confirm Password", HEIGHT);
        }
        else if (convert_string(contact_num) == false){
            JOptionPane.showMessageDialog(null, "Contact Number must be of numbers","Invalid Contact Number",HEIGHT);
        }
        else if(contact_num.length() >11 || contact_num.length() <11){
            JOptionPane.showMessageDialog(null, "Contact Number must be of 11 digit", "Invalid Contact Number", HEIGHT);
        }
        else{
            try{    
                Connection con=DriverManager.getConnection(  
                    "jdbc:mysql://localhost:3306/applicant_database","root","root@123");  
                
                Statement stmt=con.createStatement();
                ResultSet rs = stmt.executeQuery("Select user_name from user WHERE user_name = '"+us_name+"'" );  
                rs.next();
                if (rs.getRow()>0){
                    System.out.print("Number of rows"+rs.getRow());
                     JOptionPane.showMessageDialog(null, "User Name Already Taken","Invalid Username",HEIGHT);        
                }
                else{
                stmt.executeUpdate("INSERT INTO user " + 
                  "VALUES (null,'"+us_name+"', '"+name+"', '"+cnic+"', '"+email+"','"+contact_num+"','"+address+"','"+pass+"')");  
                  JOptionPane.showMessageDialog(null, "Successfully SIgnUp"); 
                    user_name.setText("");
                    applicantname.setText("");
                    applicant_email.setText("");
                    cnic_no.setText("");
                    contact_no.setText("");
                    applicant_address.setText("");
                    password.setText("");
                    confirm_password.setText("");
                }
                rs.close();
                stmt.close();
                con.close();  
               }catch(Exception e){ 
                   System.out.println(e);
               }
            
        }
    }//GEN-LAST:event_sign_up_buttonActionPerformed
    
   public boolean convert_string(String cnum) {
    try{
        int cn = Integer.parseInt(cnum);
    }catch(NumberFormatException ex){
        System.out.println(ex);
       return true;
    }
    return false;
   }
    private void return_to_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_return_to_loginActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        SignIn si = new SignIn();
        si.setVisible(true);
    }//GEN-LAST:event_return_to_loginActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signup().setVisible(true);
            }
        });
    }
    public void connect_to_database(Object obj){
      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea applicant_address;
    private javax.swing.JTextField applicant_email;
    private javax.swing.JTextField applicantname;
    private javax.swing.JTextField cnic_no;
    private javax.swing.JPasswordField confirm_password;
    private javax.swing.JTextField contact_no;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton return_to_login;
    private javax.swing.JButton sign_up_button;
    private javax.swing.JTextField user_name;
    // End of variables declaration//GEN-END:variables
}
