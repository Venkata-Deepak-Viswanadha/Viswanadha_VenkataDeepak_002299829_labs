/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface;

import Business.VitalSignHistory;
import Business.VitalSigns;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author deepakviswanadh
 */
public class ViewVitalsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewVitalsJPanel
     */
     VitalSignHistory vitalSignHistory;
    public ViewVitalsJPanel( VitalSignHistory vitalSignHistory) {
        this.vitalSignHistory=vitalSignHistory;
        initComponents();
        displayTable();
    }
    
    private void displayTable(){
        DefaultTableModel model = (DefaultTableModel)tblVitals.getModel();
        model.setRowCount(0);
        for(VitalSigns vh: vitalSignHistory.getVitalSignHistory()){
            Object[]data = new Object[4];
            data[0]= vh;
            data[1]=vh.getTemperature();
            data[2]=vh.getPulse();
            data[3]=vh.getBloodPressure();
            model.addRow(data); 
        }
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
        tblVitals = new javax.swing.JTable();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        lblDate = new javax.swing.JLabel();
        txtTemperature = new javax.swing.JTextField();
        lblBP = new javax.swing.JLabel();
        lblTemperature = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        txtBP = new javax.swing.JTextField();
        txtPulse = new javax.swing.JTextField();
        lblPulse = new javax.swing.JLabel();
        lblVitalsTitle1 = new javax.swing.JLabel();
        btnView = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setLayout(null);

        tblVitals.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Date", "Temperature", "Pulse", "Blood Pressure"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblVitals);

        add(jScrollPane1);
        jScrollPane1.setBounds(42, 72, 577, 204);

        jLayeredPane3.setBackground(new java.awt.Color(255, 255, 255));
        jLayeredPane3.setOpaque(true);

        lblDate.setBackground(new java.awt.Color(204, 204, 255));
        lblDate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDate.setText("Date:");
        lblDate.setOpaque(true);

        txtTemperature.setBackground(new java.awt.Color(255, 255, 204));
        txtTemperature.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTemperatureActionPerformed(evt);
            }
        });

        lblBP.setBackground(new java.awt.Color(204, 204, 255));
        lblBP.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblBP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBP.setText("Blood Pressure:");
        lblBP.setOpaque(true);

        lblTemperature.setBackground(new java.awt.Color(204, 204, 255));
        lblTemperature.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTemperature.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTemperature.setText("Temperature:");
        lblTemperature.setOpaque(true);

        txtDate.setBackground(new java.awt.Color(255, 255, 204));

        txtBP.setBackground(new java.awt.Color(255, 255, 204));

        txtPulse.setBackground(new java.awt.Color(255, 255, 204));

        lblPulse.setBackground(new java.awt.Color(204, 204, 255));
        lblPulse.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPulse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPulse.setText("Pulse:");
        lblPulse.setOpaque(true);

        jLayeredPane3.setLayer(lblDate, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(txtTemperature, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(lblBP, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(lblTemperature, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(txtDate, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(txtBP, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(txtPulse, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(lblPulse, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane3Layout = new javax.swing.GroupLayout(jLayeredPane3);
        jLayeredPane3.setLayout(jLayeredPane3Layout);
        jLayeredPane3Layout.setHorizontalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPulse)
                    .addComponent(lblBP)
                    .addComponent(lblTemperature)
                    .addComponent(lblDate))
                .addGap(26, 26, 26)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTemperature)
                    .addComponent(txtPulse, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBP)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        jLayeredPane3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblBP, lblDate, lblPulse, lblTemperature, txtBP, txtDate, txtPulse, txtTemperature});

        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBP)
                    .addComponent(txtBP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTemperature))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPulse)
                    .addComponent(txtPulse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDate))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jLayeredPane3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblBP, lblDate, lblPulse, lblTemperature, txtBP, txtDate, txtPulse, txtTemperature});

        add(jLayeredPane3);
        jLayeredPane3.setBounds(80, 320, 478, 206);

        lblVitalsTitle1.setBackground(new java.awt.Color(204, 255, 204));
        lblVitalsTitle1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblVitalsTitle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVitalsTitle1.setText("View Vitals");
        lblVitalsTitle1.setOpaque(true);
        add(lblVitalsTitle1);
        lblVitalsTitle1.setBounds(42, 29, 577, 25);

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        add(btnView);
        btnView.setBounds(448, 288, 72, 22);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete);
        btnDelete.setBounds(532, 288, 72, 22);
    }// </editor-fold>//GEN-END:initComponents

    private void txtTemperatureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTemperatureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTemperatureActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int index=tblVitals.getSelectedRow();
        if(index<0){
               JOptionPane.showMessageDialog(this, "No row selected.");
               return;
        }
       DefaultTableModel model = (DefaultTableModel)tblVitals.getModel();
       VitalSigns  vh= (VitalSigns)model.getValueAt(index, 0);
        txtBP.setText(String.valueOf(vh.getBloodPressure()));
        txtPulse.setText(String.valueOf(vh.getPulse()));
        txtTemperature.setText(String.valueOf(vh.getTemperature()));
        txtDate.setText(vh.getDate());
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
               
        int index=tblVitals.getSelectedRow();
        if(index<0){
               JOptionPane.showMessageDialog(this, "No row selected.");
               return;
        }
       DefaultTableModel model = (DefaultTableModel)tblVitals.getModel();
       VitalSigns  vh= (VitalSigns)model.getValueAt(index, 0);
       vitalSignHistory.delete(vh);
       JOptionPane.showMessageDialog(this, "Vital Sign deleted.");
       displayTable();
        txtBP.setText("");
        txtPulse.setText("");
        txtTemperature.setText("");
        txtDate.setText("");
        
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnView;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBP;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblPulse;
    private javax.swing.JLabel lblTemperature;
    private javax.swing.JLabel lblVitalsTitle1;
    private javax.swing.JTable tblVitals;
    private javax.swing.JTextField txtBP;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtPulse;
    private javax.swing.JTextField txtTemperature;
    // End of variables declaration//GEN-END:variables
}