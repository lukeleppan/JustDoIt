/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DATA.Subtask;

/**
 *
 * @author lukel
 */
public class SubtaskTile extends javax.swing.JPanel {

    private Subtask subtask;

    public SubtaskTile(Subtask subtask) {
        initComponents();
        this.subtask = subtask;
        txtaTitle.setText(subtask.getSubtaskTitle());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlScrollWrapper = new javax.swing.JScrollPane();
        txtaTitle = new javax.swing.JTextArea();
        jCheckBox1 = new javax.swing.JCheckBox();

        pnlScrollWrapper.setBorder(null);
        pnlScrollWrapper.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        pnlScrollWrapper.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        pnlScrollWrapper.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        txtaTitle.setEditable(false);
        txtaTitle.setBackground(new java.awt.Color(240, 240, 240));
        txtaTitle.setColumns(20);
        txtaTitle.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtaTitle.setLineWrap(true);
        txtaTitle.setRows(4);
        txtaTitle.setWrapStyleWord(true);
        txtaTitle.setAutoscrolls(false);
        txtaTitle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtaTitleMouseClicked(evt);
            }
        });
        pnlScrollWrapper.setViewportView(txtaTitle);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlScrollWrapper, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlScrollWrapper, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jCheckBox1)
                .addContainerGap(14, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtaTitleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtaTitleMouseClicked

    }//GEN-LAST:event_txtaTitleMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JScrollPane pnlScrollWrapper;
    private javax.swing.JTextArea txtaTitle;
    // End of variables declaration//GEN-END:variables
}
