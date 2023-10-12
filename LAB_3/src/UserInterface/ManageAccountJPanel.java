/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface;

import Business.Account;
import Business.AccountDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author deepakviswanadh
 */
public class ManageAccountJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageAccountJPanel
     */
    public JPanel UserProcessContainer;
    public AccountDirectory accountDirectory;
    
    ManageAccountJPanel(JPanel UserProcessContainer, AccountDirectory accountDirectory) {
    initComponents();
    this.UserProcessContainer=UserProcessContainer;
    this.accountDirectory= accountDirectory;
    updateTable();
    }
    
    public void updateTable(){
        DefaultTableModel model = (DefaultTableModel)tblAccounts.getModel();
        model.setRowCount(0);
        for(Account acc : accountDirectory.getAccountList()){
            Object[] data = new Object[4];
            data[0]=acc;
            data[1]=acc.getAccountNumber();
            data[2]=acc.getRoutingNumber();
            data[3]=acc.getBalance();
            model.addRow(data);
        }
          JOptionPane.showMessageDialog(null,"Accounts fetched successfully");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblAccounts = new javax.swing.JTable();
        btnSearchAcc = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnViewDetails = new javax.swing.JButton();
        txtSearchAcc = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        tblAccounts.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tblAccounts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bank Name", "Account Number", "Routing Number", "Balance"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblAccounts);
        if (tblAccounts.getColumnModel().getColumnCount() > 0) {
            tblAccounts.getColumnModel().getColumn(0).setResizable(false);
            tblAccounts.getColumnModel().getColumn(1).setResizable(false);
            tblAccounts.getColumnModel().getColumn(2).setResizable(false);
            tblAccounts.getColumnModel().getColumn(3).setResizable(false);
        }

        btnSearchAcc.setBackground(new java.awt.Color(204, 255, 204));
        btnSearchAcc.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        btnSearchAcc.setText("Search Account by Number");
        btnSearchAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchAccActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBack.setText("<back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnViewDetails.setBackground(new java.awt.Color(204, 255, 204));
        btnViewDetails.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        btnViewDetails.setText("View Details");
        btnViewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetailsActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(204, 255, 204));
        btnDelete.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnViewDetails)
                            .addComponent(btnSearchAcc)
                            .addComponent(btnDelete))
                        .addGap(54, 54, 54)
                        .addComponent(txtSearchAcc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnDelete, btnSearchAcc, btnViewDetails, txtSearchAcc});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btnBack)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearchAcc)
                    .addComponent(txtSearchAcc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnViewDetails)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete)
                .addContainerGap(205, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnSearchAcc, txtSearchAcc});

    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchAccActionPerformed
        // TODO add your handling code here:
        Account result = accountDirectory.searchAccount(txtSearchAcc.getText());
        if(result==null){
           JOptionPane.showMessageDialog(null,"Incorrect Account Number","Information",JOptionPane.INFORMATION_MESSAGE);
           return;
        }
        else{
             ViewAccountJPanel viewAccountJPanel= new ViewAccountJPanel(UserProcessContainer,result);
               UserProcessContainer.add("ViewAccountJPanel",viewAccountJPanel);
                CardLayout layout = (CardLayout)UserProcessContainer.getLayout();
            layout.next(UserProcessContainer);
        }
    }//GEN-LAST:event_btnSearchAccActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        UserProcessContainer.remove(this);
        CardLayout layout = (CardLayout)UserProcessContainer.getLayout();
        layout.previous(UserProcessContainer);
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int index= tblAccounts.getSelectedRow();
        if(index<0){
            JOptionPane.showMessageDialog(null,"Error: please select a row to delete","Warning",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        else {
            int dialogButton = JOptionPane.YES_NO_CANCEL_OPTION;
            int dialogResult= JOptionPane.showConfirmDialog(null, "Would you like to delete","Warning",dialogButton);
            if(dialogResult==JOptionPane.YES_OPTION){
                Account account = (Account)tblAccounts.getValueAt(index, 0);
                accountDirectory.deleteAccount(account);
                updateTable();
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnViewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetailsActionPerformed
        // TODO add your handling code here:
       int index= tblAccounts.getSelectedRow();
        if(index<0){
            JOptionPane.showMessageDialog(null,"Error: please select a row to view","Warning",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        else{
             Account account = (Account)tblAccounts.getValueAt(index, 0);
             ViewAccountJPanel viewAccountJPanel= new ViewAccountJPanel(UserProcessContainer,account);
               UserProcessContainer.add("ViewAccountJPanel",viewAccountJPanel);
                CardLayout layout = (CardLayout)UserProcessContainer.getLayout();
            layout.next(UserProcessContainer);
        }
    }//GEN-LAST:event_btnViewDetailsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearchAcc;
    private javax.swing.JButton btnViewDetails;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAccounts;
    private javax.swing.JTextField txtSearchAcc;
    // End of variables declaration//GEN-END:variables
}
