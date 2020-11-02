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

    ProjectTitleTile = new javax.swing.JLabel();
    ProjectDescriptionTile = new javax.swing.JTextArea();
    OpenBTN = new javax.swing.JButton();
    EditBTN = new javax.swing.JButton();
    DeleteBTN = new javax.swing.JButton();

    setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

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

    EditBTN.setText("Edit");

    DeleteBTN.setText("Delete");
    DeleteBTN.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        DeleteBTNActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(DeleteBTN)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(EditBTN)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(OpenBTN)
        .addContainerGap())
      .addGroup(layout.createSequentialGroup()
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(ProjectTitleTile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(ProjectDescriptionTile, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE))
        .addContainerGap(22, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(14, 14, 14)
        .addComponent(ProjectTitleTile, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(ProjectDescriptionTile, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(OpenBTN)
          .addComponent(EditBTN)
          .addComponent(DeleteBTN))
        .addContainerGap())
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

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton DeleteBTN;
  private javax.swing.JButton EditBTN;
  private javax.swing.JButton OpenBTN;
  private javax.swing.JTextArea ProjectDescriptionTile;
  private javax.swing.JLabel ProjectTitleTile;
  // End of variables declaration//GEN-END:variables
}
