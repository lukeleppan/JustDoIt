package GUI;

import DATA.Task;

public class TaskTile extends javax.swing.JPanel {

    private Task task;

    public TaskTile(Task task) {
        initComponents();
        this.txtaTitle.setText(task.getTaskTitle());
        this.task = task;
    }

    private void openTask() {
        TaskView taskView = new TaskView(this.task);
        taskView.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlScrollWrapper = new javax.swing.JScrollPane();
        txtaTitle = new javax.swing.JTextArea();

        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

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
                .addContainerGap()
                .addComponent(pnlScrollWrapper, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlScrollWrapper, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        this.openTask();
    }//GEN-LAST:event_formMouseClicked

    private void txtaTitleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtaTitleMouseClicked
        this.openTask();
    }//GEN-LAST:event_txtaTitleMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane pnlScrollWrapper;
    private javax.swing.JTextArea txtaTitle;
    // End of variables declaration//GEN-END:variables
}
