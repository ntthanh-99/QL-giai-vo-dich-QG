/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.updateMatch;

import dao.EventDAO;
import javax.swing.JOptionPane;
import model.Event;
import model.Match;
import model.Played;

/**
 *
 * @author Tien Thanh
 */
public class UpdateEventFrm extends javax.swing.JFrame {

    private final Match match;
    private final Played played;

    /**
     * Creates new form UpdateEvent
     *
     * @param match
     * @param played
     * @param bool
     */
    public UpdateEventFrm(Match match, Played played, boolean bool) {
        initComponents();
        this.match = match;
        this.played = played;
        setLocationRelativeTo(null);
        setTitle("Update Event");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        jLabelNamePlayer.setText(played.getPlayer().getName());
        if (bool == true) {
            jLabelNameTeam.setText(match.getHomeTeam().getName());
        } else {
            jLabelNameTeam.setText(match.getVisitingTeam().getName());
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelNamePlayer = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelNameTeam = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldTime = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldDes = new javax.swing.JTextField();
        UpdateEvent = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/championship.jpg"))); // NOI18N

        jLabel2.setText("Player:");

        jLabel3.setText("Team:");

        jLabel5.setText("Type:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Goal", "YellowCard", "RedCard", "Substitution", "Fault" }));

        jLabel6.setText("Time:");

        jLabel7.setText("Description:");

        UpdateEvent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/updatematch.png"))); // NOI18N
        UpdateEvent.setText("Update");
        UpdateEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateEventActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldDes))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelNameTeam, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                            .addComponent(jLabelNamePlayer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jTextFieldTime))))))
                .addGap(114, 114, 114))
            .addGroup(layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(UpdateEvent)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabelNamePlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabelNameTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldDes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(UpdateEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UpdateEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateEventActionPerformed
        // TODO add your handling code here:
        String type = jComboBox1.getItemAt(jComboBox1.getSelectedIndex());
        String time = jTextFieldTime.getText();
        String des = jTextFieldDes.getText();

        if (time.equals("")) {
            JOptionPane.showMessageDialog(this, "Textbox Time is Empty!!");
        } else {
            Event event = new Event();
            event.setMatch(match);
            event.setPlayed(played);
            event.setTime(time);
            event.setType(type);
            event.setDescription(des);

            EventDAO e = new EventDAO();
            if (e.UpdateEvent(event) == 1) {
                JOptionPane.showMessageDialog(this, "Update Complete !!!");
                this.dispose();
            } else {
                if (e.UpdateEvent(event) == 0) {
                    JOptionPane.showMessageDialog(this, "The Event Updated");
                } else {
                    JOptionPane.showMessageDialog(this, "Incorrect information!!");
                }
            }

        }

    }//GEN-LAST:event_UpdateEventActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateEventFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateEventFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateEventFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateEventFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //   new UpdateEventFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton UpdateEvent;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelNamePlayer;
    private javax.swing.JLabel jLabelNameTeam;
    private javax.swing.JTextField jTextFieldDes;
    private javax.swing.JTextField jTextFieldTime;
    // End of variables declaration//GEN-END:variables
}
