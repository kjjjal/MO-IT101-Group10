
package com.motorph.motorph1;

import javax.swing.JOptionPane;
import java.sql.*;
import java.text.DecimalFormat;


public class employeelogin extends javax.swing.JFrame {

    /**
     * Creates new form employeelogin
     */
    public employeelogin() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lastNameField = new javax.swing.JTextField();
        employeeNumberField = new javax.swing.JTextField();
        loginButton = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrator\\Documents\\NetBeansProjects\\MotorPH1\\src\\main\\java\\img\\logo2.png")); // NOI18N

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 51, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("EMPLOYEE");

        jButton1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 102, 102));
        jButton1.setText("BACK TO MAIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(194, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(189, 189, 189))
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(227, 227, 227)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("LOGIN AS EMPLOYEE");

        lastNameField.setBackground(new java.awt.Color(0, 51, 102));
        lastNameField.setForeground(new java.awt.Color(255, 255, 255));
        lastNameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        employeeNumberField.setBackground(new java.awt.Color(0, 51, 102));
        employeeNumberField.setForeground(new java.awt.Color(255, 255, 255));
        employeeNumberField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        employeeNumberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeNumberFieldActionPerformed(evt);
            }
        });

        loginButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        loginButton.setForeground(new java.awt.Color(0, 102, 153));
        loginButton.setText("LOGIN");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        passwordField.setBackground(new java.awt.Color(0, 51, 102));
        passwordField.setForeground(new java.awt.Color(255, 255, 255));
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("FULL NAME");

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("PASSWORD");

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("EMPLOYEE NUMBER");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(employeeNumberField, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                            .addComponent(lastNameField)
                            .addComponent(loginButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(passwordField)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(employeeNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
       //Checks if there is username 
       if(lastNameField.getText().equals("")){
           JOptionPane.showMessageDialog(null, "Please Fill out username");
       }
       //Checks if there is password
       else if(passwordField.getText().equals("")){
           JOptionPane.showMessageDialog(null, "Please Fill out password");
       }
       //Checks if there is employee number
       else if(employeeNumberField.getText().equals("")){
           JOptionPane.showMessageDialog(null, "Please Fill out Employee Number");
       }
       //If all input is correct
       else{
           
           Connection connection = null;
           //Start connection to database to retrieve employee data
           try {
               Class.forName("org.postgresql.Driver");
               connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/employeetable","postgres","root");
               
               //Declare variables for login details to compare from database
               String accountName = lastNameField.getText();
               String passworD = passwordField.getText();
               String accountNumber = employeeNumberField.getText();            
              
               //Query for database depending on user input account name
               String sql = "SELECT  accountnumber, password, lastname"
                       + ", firstname, birthdate, address, phonenumber, position"
                       + ", supervisor, basepay, riceallow, phoneallow, clothingallow"
                       + ", hourlyrate, sssnumber, pagibignumber, philhealthnumber"
                       + ",tinnumber FROM login WHERE accountname =?";
               try (PreparedStatement statement = connection.prepareStatement(sql)){
                   statement.setString(1, accountName);
                   try (ResultSet resultSet = statement.executeQuery()){
                       if (resultSet.next()){
                           //decalaring variables for data from database depending on logged on user
                            String accountNumber1 = resultSet.getString("accountnumber");
                            String passworD1 = resultSet.getString("password");
                            String lastName = resultSet.getString("lastname");
                            String firstName = resultSet.getString("firstname");
                            String birthDate = resultSet.getString("lastname");
                            String address = resultSet.getString("address");
                            String phoneNumber = resultSet.getString("phonenumber");
                            String position = resultSet.getString("position");
                            String supervisor = resultSet.getString("supervisor");
                            Double basePay = resultSet.getDouble("basepay");
                            Double riceAllow = resultSet.getDouble("riceallow");
                            Double phoneAllow = resultSet.getDouble("phoneAllow");
                            Double clothingAllow = resultSet.getDouble("clothingallow");
                            Double hourlyRate = resultSet.getDouble("hourlyRate");
                            String sssNumber = resultSet.getString("sssnumber");
                            String pagibigNumber = resultSet.getString("pagibignumber");
                            String philhealthNumber = resultSet.getString("philhealthnumber");
                            String tinNumber = resultSet.getString("tinnumber");
                            
                            DecimalFormat decimalformat = new DecimalFormat("##,###.##");
                            String formattedBasePay = decimalformat.format(basePay);
                            String formattedRiceAllow = decimalformat.format(riceAllow);
                            String formattedPhoneAllow = decimalformat.format(phoneAllow);
                            String formattedClothingAllow = decimalformat.format(clothingAllow);
                            String formattedHourlyRate = decimalformat.format(hourlyRate);
                            
                            if (passworD1.equals(passworD) && accountNumber1.equals(accountNumber)){
                                JOptionPane.showMessageDialog(null, "Login Success");
                                // Setting up labels on MotorPH window to make sure it corresponds to logged in user
                                MotorPH mph = new MotorPH(); 
                                mph.test.setText(passworD);
                                mph.employeeNameLabel.setText(accountName);
                                mph.positionLabel.setText(position);
                                mph.profileName.setText(accountName);
                                mph.profileLastName.setText(lastName);
                                mph.profileFirstName.setText(firstName);
                                mph.profileBirthDate.setText(birthDate);
                                mph.profileAddress.setText(address);
                                mph.profilePhoneNumber.setText(phoneNumber);
                                mph.profileBasePay.setText(formattedBasePay);
                                mph.profileHourlyRate.setText(formattedHourlyRate);
                                mph.profileRiceAllow.setText(formattedRiceAllow);
                                mph.profilePhoneAllow.setText(formattedPhoneAllow);
                                mph.profileClothingAllow.setText(formattedClothingAllow);
                                mph.profileSssNumber.setText(sssNumber);
                                mph.profilePagibigNumber.setText(pagibigNumber);
                                mph.profilePhilhealthNumber.setText(philhealthNumber);
                                mph.profileTinNumber.setText(tinNumber);
                                mph.profilePosition.setText(position);
                                mph.profileAccountNumber.setText(accountNumber);
                                mph.payrollBasePay.setText(formattedBasePay);
                                mph.payrollTotalGross.setText(formattedBasePay);
                                mph.payrollRiceAllow.setText(formattedRiceAllow);
                                mph.payrollPhoneAllow.setText(formattedPhoneAllow);
                                mph.payrollClothingAllow.setText(formattedClothingAllow);
                                
                                //sss Contribution Computation                            
                                sssComputation sssC = new sssComputation(basePay);
                                mph.payrollSSS.setText(sssC.formattedSssContribution);
                                // Done sss Contribution Computation
                                
                                //Philhealth Contribution Computation
                                
                                philhealthComputation phC = new philhealthComputation(basePay);
                                mph.payrollPhilhealth.setText(phC.formattedPhilhealthContribution);
                                //Done philhealth Contribution Computation
                                
                                //Pagibig Computation
                                pagibigComputation piC = new pagibigComputation(basePay);
                                String formattedPagibigContribution = decimalformat.format(piC.pagibigContribution);
                                mph.payrollPagibig.setText(formattedPagibigContribution);
                                //Done pagibig Contribution Computation
                                
                                Double totalContribution = sssC.sssContribution + piC.pagibigContribution + phC.philhealthContribution;
                                
                                //Withholding tax computation                                
                                taxComputation taxC = new taxComputation(basePay, totalContribution);
                                String formattedTax = decimalformat.format(taxC.tax);
                                mph.payrollTax.setText(formattedTax);
                                // End Tax computation
                              
                                //Compute total deduction
                                Double totalDeduction = totalContribution + taxC.tax;
                                String formattedTotalDeduction = decimalformat.format(totalDeduction);
                                mph.payrollTotalDeduction.setText(formattedTotalDeduction);
                                
                                //Compute Total net earnings
                                Double totalNet = basePay - totalContribution - taxC.tax;
                                String formattedTotalNet = decimalformat.format(totalNet);
                                mph.payrollTotalNet.setText(formattedTotalNet);
                                
                                // Compute Total week earnings
                                Double totalWeekEarning = hourlyRate * 42;
                                String formattedTotalWeekEarning = decimalformat.format(totalWeekEarning);
                                mph.payrollTWeekEarnings.setText(formattedTotalWeekEarning);
                                
                               
                                mph.show();// display MotorPH
        
                                 dispose(); //close chooseuser
                            } else {
                                System.out.println("Invalid password and employee number");
                            }
                       }    else {
                           System.out.println("Invalid account name");
                       } 
                   }
               };
               
           }catch (Exception e) {
               e.printStackTrace();
           }
           
           
           
           
           
       };
        
    }//GEN-LAST:event_loginButtonActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void employeeNumberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeNumberFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_employeeNumberFieldActionPerformed

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
            java.util.logging.Logger.getLogger(employeelogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(employeelogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(employeelogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(employeelogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new employeelogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField employeeNumberField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passwordField;
    // End of variables declaration//GEN-END:variables
}
