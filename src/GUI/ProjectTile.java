/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import GUI.MainForm;
import DATA.Project;
import MANAGER.ProjectManager;
import MANAGER.UserManager;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author lukeleppan
 */
public class ProjectTile extends javax.swing.JPanel {

  private Project project;

  public ProjectTile(Project project) {

    initComponents();

    this.project = project;

    ProjectDescriptionTile.setBorder(null);
    ProjectDescriptionTile.setBackground(null);
    Color backColor = new Color(UIManager.getColor("RootPane.background").getRGB());
    ProjectDescriptionTile.setBackground(backColor);
    ProjectTitleTile.setText(project.getProjectTitle());
    ProjectDescriptionTile.setText(project.getProjectDescription());
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    CardLayout = new javax.swing.JPanel();
    View = new javax.swing.JPanel();
    ProjectTitleTile = new javax.swing.JLabel();
    ProjectDescriptionTile = new javax.swing.JTextArea();
    OpenBTN = new javax.swing.JButton();
    EditBTNView = new javax.swing.JButton();
    DeleteBTN = new javax.swing.JButton();
    EDIT = new javax.swing.JPanel();
    jTextField1 = new javax.swing.JTextField();
    jScrollPane1 = new javax.swing.JScrollPane();
    jTextArea1 = new javax.swing.JTextArea();
    SaveBTNEdit = new javax.swing.JButton();

    setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

    CardLayout.setLayout(new java.awt.CardLayout());

    ProjectTitleTile.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N

    ProjectDescriptionTile.setEditable(false);
    ProjectDescriptionTile.setColumns(20);
    ProjectDescriptionTile.setLineWrap(true);
    ProjectDescriptionTile.setRows(5);
    ProjectDescriptionTile.setFocusable(false);
    ProjectDescriptionTile.setPreferredSize(new java.awt.Dimension(100, 60));

    OpenBTN.setText("Open");
    OpenBTN.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        OpenBTNActionPerformed(evt);
      }
    });

    EditBTNView.setText("Edit");

    DeleteBTN.setText("Delete");
    DeleteBTN.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        DeleteBTNActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout ViewLayout = new javax.swing.GroupLayout(View);
    View.setLayout(ViewLayout);
    ViewLayout.setHorizontalGroup(
      ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(ViewLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(ProjectDescriptionTile, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(ProjectTitleTile, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(34, Short.MAX_VALUE))
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ViewLayout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(DeleteBTN)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(EditBTNView)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(OpenBTN)
        .addGap(16, 16, 16))
    );
    ViewLayout.setVerticalGroup(
      ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ViewLayout.createSequentialGroup()
        .addGap(21, 21, 21)
        .addComponent(ProjectTitleTile, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(ProjectDescriptionTile, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(OpenBTN)
          .addComponent(EditBTNView)
          .addComponent(DeleteBTN))
        .addContainerGap(23, Short.MAX_VALUE))
    );

    CardLayout.add(View, "card2");

    jTextArea1.setColumns(20);
    jTextArea1.setRows(5);
    jScrollPane1.setViewportView(jTextArea1);

    SaveBTNEdit.setText("Save");
    SaveBTNEdit.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        SaveBTNEditActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout EDITLayout = new javax.swing.GroupLayout(EDIT);
    EDIT.setLayout(EDITLayout);
    EDITLayout.setHorizontalGroup(
      EDITLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(EDITLayout.createSequentialGroup()
        .addGap(23, 23, 23)
        .addGroup(EDITLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jTextField1)
          .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE))
        .addContainerGap(56, Short.MAX_VALUE))
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EDITLayout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(SaveBTNEdit)
        .addGap(21, 21, 21))
    );
    EDITLayout.setVerticalGroup(
      EDITLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(EDITLayout.createSequentialGroup()
        .addGap(17, 17, 17)
        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(SaveBTNEdit)
        .addContainerGap(10, Short.MAX_VALUE))
    );

    CardLayout.add(EDIT, "card3");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(CardLayout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(CardLayout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    );
  }// </editor-fold>//GEN-END:initComponents

  private void OpenBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenBTNActionPerformed

  }//GEN-LAST:event_OpenBTNActionPerformed

  private void DeleteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBTNActionPerformed
    ProjectManager projectManager = new ProjectManager();
    projectManager.DeleteProject(project);

    CardLayout cardLayout = (CardLayout) MainForm.CardPV.getLayout();
    cardLayout.show(MainForm.CardPV, "ProjectViewPV");

    JOptionPane.showMessageDialog(MainForm.CardPV, "Project Deleted");
  }//GEN-LAST:event_DeleteBTNActionPerformed

  private void SaveBTNEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBTNEditActionPerformed

  }//GEN-LAST:event_SaveBTNEditActionPerformed

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JPanel CardLayout;
  private javax.swing.JButton DeleteBTN;
  private javax.swing.JPanel EDIT;
  private javax.swing.JButton EditBTNView;
  private javax.swing.JButton OpenBTN;
  private javax.swing.JTextArea ProjectDescriptionTile;
  private javax.swing.JLabel ProjectTitleTile;
  private javax.swing.JButton SaveBTNEdit;
  private javax.swing.JPanel View;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTextArea jTextArea1;
  private javax.swing.JTextField jTextField1;
  // End of variables declaration//GEN-END:variables
}
