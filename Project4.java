/*
 * Francis Bui
 * CMIS 242
 * Dr. Schmeelk
 * Project 3 - Real Estate Database
 * August 3, 2020
 * The purpose of this program design a real estate database. The program will store and edit real estate properties
 * as a Property object and implemented through a TreeMap. The Status enum will determine the status of the property
 * sale process state. Additionally the user can insert, delete, and find properties within the database. Should the
 * data being entered or retrieved is incomplete or invalid, the application will pop-up an exception message to the
 * user of the error. Likewise, a message will appear informing the user of successful queries.
 *
 */

import java.util.*;
import javax.swing.*;

public class Project4 extends javax.swing.JFrame {

    TreeMap<Integer,StateChangeable> propertyRecords = new TreeMap<>();

    /**
     * Creates new form Project4
     */
    public Project4() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        processButton = new javax.swing.JButton();
        changeStatusButton = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Real Estate Database");
        setName(""); // NOI18N
        setResizable(false);

        processButton.setText("Process");
        processButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processButtonActionPerformed(evt);
            }
        });

        changeStatusButton.setText("Change Status");
        changeStatusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeStatusButtonActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Insert", "Delete", "Find" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FOR_SALE", "UNDER_CONTRACT", "SOLD" }));

        jLabel1.setText("Transaction No:");

        jLabel2.setText("Address:");

        jLabel3.setText("Bedrooms:");

        jLabel4.setText("Square Footage");

        jLabel5.setText("Price:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(changeStatusButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(processButton, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jComboBox1, 0, 150, Short.MAX_VALUE)
                                                        .addComponent(jComboBox2, 0, 1, Short.MAX_VALUE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(9, 9, 9)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel5)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel4)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel1)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(jLabel2)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addGap(66, 66, 66)))
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1))
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(processButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(changeStatusButton))
                                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void processButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

        // Controls insert/delete/find operation based on which drop-down is selected and the value inputted in the text field
        try {

            if (jComboBox1.getSelectedItem() == "Insert") {

                if (propertyRecords.containsKey(Integer.parseInt(jTextField1.getText()))) {

                    JOptionPane.showMessageDialog(null, "The supplied Transaction Number is associated with another property in the database. Please try a different value.");

                } else {

                    StateChangeable tempProperty = new Property(jTextField2.getText(), Integer.parseInt(jTextField3.getText()), Integer.parseInt(jTextField4.getText()), Integer.parseInt(jTextField5.getText()), Status.FOR_SALE);
                    propertyRecords.put(Integer.parseInt(jTextField1.getText()), tempProperty);
                    JOptionPane.showMessageDialog(null, "Property has been sucessfully added \nTransaction No:   " + jTextField1.getText() + "\n\n" + tempProperty.toString());

                }

            } else if (jComboBox1.getSelectedItem() == "Delete") {

                if (propertyRecords.containsKey(Integer.parseInt(jTextField1.getText()))) {

                    propertyRecords.remove(Integer.parseInt(jTextField1.getText()));
                    JOptionPane.showMessageDialog(null, "Property with a Transaction Number:   " + jTextField1.getText() +  "\nhas been successfully removed");

                } else {
                    JOptionPane.showMessageDialog(null, "The supplied Transaction Number does not exist in the database");
                }

            } else if (jComboBox1.getSelectedItem() == "Find"){

                if (propertyRecords.containsKey(Integer.parseInt(jTextField1.getText()))) {
                    JOptionPane.showMessageDialog(null, "Property Status: \n\n" + propertyRecords.get(Integer.parseInt(jTextField1.getText())).toString());

                } else {
                    JOptionPane.showMessageDialog(null, "The supplied Transaction Number does not exist in the database");
                }

            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Please enter a value in their appropriate fields");
        }

    }

    private void changeStatusButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

        //Control the Status update based on the drop-down option
        try {

            if (jComboBox2.getSelectedItem() == "FOR_SALE" && propertyRecords.containsKey(Integer.parseInt(jTextField1.getText()))) {

                propertyRecords.get(Integer.parseInt(jTextField1.getText())).changeState(Status.FOR_SALE);
                JOptionPane.showMessageDialog(null, "Property with Transaction Number:   " + jTextField1.getText() + "\nhas been updated to FOR_SALE");

            } else if (jComboBox2.getSelectedItem() == "UNDER_CONTRACT" && propertyRecords.containsKey(Integer.parseInt(jTextField1.getText()))) {

                propertyRecords.get(Integer.parseInt(jTextField1.getText())).changeState(Status.UNDER_CONTRACT);
                JOptionPane.showMessageDialog(null, "Property with Transaction Number:   " + jTextField1.getText() + "\nhas been updated to UNDER_CONTRACT");

            } else if (jComboBox2.getSelectedItem() == "SOLD" && propertyRecords.containsKey(Integer.parseInt(jTextField1.getText()))){

                propertyRecords.get(Integer.parseInt(jTextField1.getText())).changeState(Status.SOLD);
                JOptionPane.showMessageDialog(null, "Property with Transaction Number:   " + jTextField1.getText() + "\nhas been updated to SOLD");

            } else {

                JOptionPane.showMessageDialog(null, "The supplied Transaction Number does not exist in the database");

            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "The supplied Transaction Number does not exist in the database");
        }


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
            java.util.logging.Logger.getLogger(Project4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Project4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Project4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Project4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>




        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Project4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton changeStatusButton;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private static javax.swing.JTextField jTextField1;
    private static javax.swing.JTextField jTextField2;
    private static javax.swing.JTextField jTextField3;
    private static javax.swing.JTextField jTextField4;
    private static javax.swing.JTextField jTextField5;
    private javax.swing.JButton processButton;
    // End of variables declaration
}
