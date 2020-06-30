/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.user;

import model.Championship;
import model.User;
import view.updateMatch.RoundFrm;

/**
 *
 * @author Tien Thanh
 */
public class ManagerHomeFrm extends javax.swing.JFrame{
    private final User user;

    /**
     * Creates new form ManagerHomeFrm
     * @param user
     * @param champion
     */
    public ManagerHomeFrm(User user,Championship champion) {
        initComponents();
        this.user=user;
        setLocationRelativeTo(null);
        setTitle("ManagerHome");
        jLabelNameChampion.setText(champion.getName());
        jLabel.setText("Login in as: "+user.getName());
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel = new javax.swing.JLabel();
        jLabelChampionshipLogo = new javax.swing.JLabel();
        jLabelNameChampion = new javax.swing.JLabel();
        teamManager = new javax.swing.JButton();
        SheduleMatch = new javax.swing.JButton();
        registerPlayer = new javax.swing.JButton();
        updateMatch = new javax.swing.JButton();
        Charts = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelChampionshipLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/championship.jpg"))); // NOI18N

        teamManager.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/manager.png"))); // NOI18N
        teamManager.setText("Team Manager ");

        SheduleMatch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/schedulematch.png"))); // NOI18N
        SheduleMatch.setText("Schedule Matches");

        registerPlayer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/register.png"))); // NOI18N
        registerPlayer.setText("Register players");

        updateMatch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/updatematch.png"))); // NOI18N
        updateMatch.setText("Update Matches");
        updateMatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateMatchActionPerformed(evt);
            }
        });

        Charts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/charts.png"))); // NOI18N
        Charts.setText("Chart");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(Charts)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(registerPlayer)
                                    .addComponent(teamManager))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SheduleMatch)
                                    .addComponent(updateMatch)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelNameChampion, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelChampionshipLogo))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelChampionshipLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelNameChampion, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teamManager)
                    .addComponent(updateMatch))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerPlayer)
                    .addComponent(SheduleMatch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Charts)
                        .addGap(19, 19, 19))
                    .addComponent(jLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateMatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateMatchActionPerformed
        // TODO add your handling code here:
        RoundFrm r=new RoundFrm(user);
        r.setVisible(true);
    }//GEN-LAST:event_updateMatchActionPerformed

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
            java.util.logging.Logger.getLogger(ManagerHomeFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerHomeFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerHomeFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerHomeFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ManagerHomeFrm(new User(1,"manager","12345","Nguyen tien thanh","manager"),
                new Championship(1,"giai bong da vo dich quoc gia 2019",14)).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Charts;
    private javax.swing.JButton SheduleMatch;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabelChampionshipLogo;
    private javax.swing.JLabel jLabelNameChampion;
    private javax.swing.JButton registerPlayer;
    private javax.swing.JButton teamManager;
    private javax.swing.JButton updateMatch;
    // End of variables declaration//GEN-END:variables

}
