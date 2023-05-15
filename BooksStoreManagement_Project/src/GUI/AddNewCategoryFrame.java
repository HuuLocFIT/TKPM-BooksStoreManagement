/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import BUS.CategoryBUS;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.WARNING_MESSAGE;

/**
 *
 * @author bachl
 */
public class AddNewCategoryFrame extends javax.swing.JFrame {

    /**
     * Creates new form AddNewCategoryFrame
     */
    public AddNewCategoryFrame() {
        initComponents();
        initContentAddNewCategoryFrame();
    }
    
    private void initContentAddNewCategoryFrame() {
        this.setLocationRelativeTo(null);
        String idCategory = this.createIDCategory();
        textFieldID.setText(idCategory);
        textFieldID.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelID = new javax.swing.JLabel();
        labelName = new javax.swing.JLabel();
        labelDescription = new javax.swing.JLabel();
        textFieldID = new javax.swing.JTextField();
        textFieldName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        textFieldDescription = new javax.swing.JTextArea();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add new category");
        setBounds(new java.awt.Rectangle(200, 200, 200, 200));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        labelID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelID.setText("ID");

        labelName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelName.setText("Name");
        labelName.setAlignmentX(20.0F);

        labelDescription.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelDescription.setText("Description");
        labelDescription.setAlignmentX(20.0F);

        textFieldID.setFont(new java.awt.Font("Arial", 0, 19)); // NOI18N
        textFieldID.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0, 0, 0)));
        textFieldID.setPreferredSize(new java.awt.Dimension(96, 30));

        textFieldName.setFont(new java.awt.Font("Arial", 0, 19)); // NOI18N
        textFieldName.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0, 0, 0)));
        textFieldName.setMinimumSize(new java.awt.Dimension(96, 27));
        textFieldName.setPreferredSize(new java.awt.Dimension(96, 30));
        textFieldName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textFieldNameKeyTyped(evt);
            }
        });

        textFieldDescription.setColumns(20);
        textFieldDescription.setFont(new java.awt.Font("Arial", 0, 19)); // NOI18N
        textFieldDescription.setRows(5);
        textFieldDescription.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0, 0, 0)));
        textFieldDescription.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textFieldDescriptionKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(textFieldDescription);

        btnSave.setBackground(Color.blue);
        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSave.setForeground(Color.white);
        btnSave.setText("Save");
        btnSave.setPreferredSize(new java.awt.Dimension(110, 35));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnCancel.setBackground(Color.red);
        btnCancel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCancel.setForeground(Color.white);
        btnCancel.setText("Cancel");
        btnCancel.setPreferredSize(new java.awt.Dimension(110, 35));
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnRefresh.setBackground(new Color(51, 255, 153));
        btnRefresh.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRefresh.setForeground(Color.white);
        btnRefresh.setText("Refresh");
        btnRefresh.setPreferredSize(new java.awt.Dimension(110, 35));
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelID, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE))))
                .addGap(0, 49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelID)
                    .addComponent(textFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelName))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelDescription)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private String createIDCategory() {
        CategoryBUS business = new CategoryBUS();
        String maxID = business.getMaxIDCategory();

        String codePart = "";
        String numberPart = "";
        String idCategory = null;

        for(int i = 0; i < maxID.length(); i++) {
            char ch = maxID.charAt(i);
            if(Character.isDigit(ch)) {
                numberPart += ch;
            }
            else {
                codePart += ch;
            }
        }

        for(int i = 0; i < numberPart.length(); i++) {
            if(numberPart.charAt(0) == '0') {
                numberPart.substring(i + 1, numberPart.length() - 1);
                break;
            }
            else
                break;
        }

        int numberID = Integer.parseInt(numberPart) + 1;
        if(numberID < 10) {
            numberPart = "0" + numberID;
        }
        else {
            numberPart = Integer.toString(numberID);
        }
        
        idCategory = codePart + numberPart;
        return idCategory;
    }
    
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String fieldID = textFieldID.getText();
        String fieldName = textFieldName.getText();
        String fieldDescription = textFieldDescription.getText();
        String[] dataCategory = {fieldID, fieldName, fieldDescription};
        
        if(fieldID.equals("") || fieldName.equals("") || fieldDescription.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Please enter full properties!", "Warning message", WARNING_MESSAGE);
        }
        if(fieldName.equals("")) {
            textFieldName.setBorder(new LineBorder(Color.RED, 1));
        }
        if(fieldDescription.equals("")) {
            textFieldDescription.setBorder(new LineBorder(Color.RED, 1));
        }
        else {       
            int choice = JOptionPane.showConfirmDialog(rootPane, "You surely want to save?", "Message", JOptionPane.YES_NO_CANCEL_OPTION);
            if(choice == JOptionPane.YES_OPTION) {
                CategoryBUS business = new CategoryBUS();
                boolean category = business.addNewCategory(dataCategory);
                if(category) {
                    JOptionPane.showMessageDialog(rootPane, "Add new category successfully!");
                    String newIdCategory = this.createIDCategory();
                    textFieldID.setText(newIdCategory);
                }
                else
                    JOptionPane.showMessageDialog(rootPane, "Error add new category. Please try it later!", "Error message", ERROR_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void textFieldNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldNameKeyTyped
        // TODO add your handling code here:
        textFieldName.setBorder(new LineBorder(Color.BLACK, 1));
    }//GEN-LAST:event_textFieldNameKeyTyped

    private void textFieldDescriptionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldDescriptionKeyTyped
        // TODO add your handling code here:
        textFieldDescription.setBorder(new LineBorder(Color.BLACK, 1));
    }//GEN-LAST:event_textFieldDescriptionKeyTyped

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        textFieldName.setText("");
        textFieldDescription.setText("");
    }//GEN-LAST:event_btnRefreshActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSave;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelDescription;
    private javax.swing.JLabel labelID;
    private javax.swing.JLabel labelName;
    private javax.swing.JTextArea textFieldDescription;
    private javax.swing.JTextField textFieldID;
    private javax.swing.JTextField textFieldName;
    // End of variables declaration//GEN-END:variables
}
