/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author K00223375
 */
public class MainFrame extends javax.swing.JFrame {

    public LinkedStack studentStack;
    public Student student;
    public Student student2;

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();

        int[] a = {78, 89, 90, 12, 78, 98};
        
        student = new Student(17123, "Al", "Stew", 18, a);
        student2 = new Student(12345, "Bob", "Bush", 22, a);
        studentStack = new LinkedStack();
        studentStack.push(student);
        studentStack.push(student2);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        emptyButton = new javax.swing.JButton();
        pushButton = new javax.swing.JButton();
        popButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        clearStackButton = new javax.swing.JButton();
        printButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea = new javax.swing.JTextArea();
        showTopButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        emptyButton.setText("Empty?");
        emptyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emptyButtonActionPerformed(evt);
            }
        });

        pushButton.setText("Push");
        pushButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pushButtonActionPerformed(evt);
            }
        });

        popButton.setText("Pop");
        popButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popButtonActionPerformed(evt);
            }
        });

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        clearStackButton.setText("Clear");
        clearStackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearStackButtonActionPerformed(evt);
            }
        });

        printButton.setText("Print");
        printButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printButtonActionPerformed(evt);
            }
        });

        jTextArea.setColumns(20);
        jTextArea.setRows(5);
        jScrollPane1.setViewportView(jTextArea);

        showTopButton.setText("Show Top");
        showTopButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showTopButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(emptyButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pushButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(popButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearStackButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(printButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(showTopButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emptyButton)
                    .addComponent(pushButton)
                    .addComponent(popButton)
                    .addComponent(searchButton)
                    .addComponent(clearStackButton)
                    .addComponent(printButton)
                    .addComponent(showTopButton))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emptyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emptyButtonActionPerformed
        // TODO add your handling code here:
        if (studentStack.size() == 0) {
            jTextArea.append("True \n");
            jTextArea.append("------------------ \n");

        } else {
            jTextArea.append("Flase! Size of the stack is " + studentStack.size() + "\n");
            jTextArea.append("------------------ \n");
        }

    }//GEN-LAST:event_emptyButtonActionPerformed

    private void pushButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pushButtonActionPerformed
        // TODO add your handling code here:
        int[] examRes = new int[6];

        String input = JOptionPane.showInputDialog("Input Student ID: ");
        int idNum = Integer.parseInt(input);

        input = JOptionPane.showInputDialog("Input First Name: ");
        String fName = input;

        input = JOptionPane.showInputDialog("Input Last Name: ");
        String lName = input.toUpperCase();

        input = JOptionPane.showInputDialog("Input Age: ");
        int age = Integer.parseInt(input);

        for (int i = 0; i < 6; i++) {
            input = JOptionPane.showInputDialog("Input Exam Result for Class " + (i + 1) + " : ");
            examRes[i] = Integer.parseInt(input);
        }

        student = new Student(idNum, fName, lName, age, examRes);
        studentStack.push(student);
        jTextArea.append("New Student Details have been added to the Top of the Stack! \n");
        jTextArea.append("------------------ \n");

    }//GEN-LAST:event_pushButtonActionPerformed

    private void showTopButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showTopButtonActionPerformed
        // TODO add your handling code here:
        if (studentStack.size() <= 0) {
            jTextArea.append("Stack is empty! \n");
            jTextArea.append("------------------ \n");
        } else {

            jTextArea.append(studentStack.top());
            jTextArea.append("------------------ \n");
        }

    }//GEN-LAST:event_showTopButtonActionPerformed

    private void clearStackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearStackButtonActionPerformed
        // TODO add your handling code here:
        studentStack.setSize();
        jTextArea.append("Stack has been cleared! \n");
        jTextArea.append("------------------ \n");
    }//GEN-LAST:event_clearStackButtonActionPerformed

    private void popButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popButtonActionPerformed
        // TODO add your handling code here:
        if (studentStack.size() <= 0) {
            jTextArea.append("Stack is empty! No POP has occurred! \n");
            jTextArea.append("------------------ \n");
        } else {
            studentStack.pop();
            jTextArea.append("POP has occurred! \n");
            jTextArea.append("------------------ \n");
        }

    }//GEN-LAST:event_popButtonActionPerformed

    private void printButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printButtonActionPerformed
        // TODO add your handling code here:
        String output="";
        if (studentStack.size() <= 0) {
            jTextArea.append("Stack is empty! No Student Details to Print! \n");
            jTextArea.append("------------------ \n");
        } else {
           
            jTextArea.append(studentStack.printStack());
            jTextArea.append("------------------ \n");

        }
    }//GEN-LAST:event_printButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        if (studentStack.size() == 0) {
            jTextArea.append("Stack is empty! \n");
            jTextArea.append("------------------ \n");

        } else {
            String input = JOptionPane.showInputDialog("Search for student by Lastname: ");
            String lName = input.toUpperCase();
            if(studentStack.searchStack(lName)==true)
            {
                jTextArea.append(lName+ " is in the Stack! \n");
                jTextArea.append("------------------ \n");
            }
            else
            {
                jTextArea.append(lName + " Not found in the Stack! \n");
                jTextArea.append("------------------ \n");
            }
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearStackButton;
    private javax.swing.JButton emptyButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea;
    private javax.swing.JButton popButton;
    private javax.swing.JButton printButton;
    private javax.swing.JButton pushButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JButton showTopButton;
    // End of variables declaration//GEN-END:variables
}
