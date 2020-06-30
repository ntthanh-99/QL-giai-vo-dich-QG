/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.updateMatch;

import dao.MatchDAO;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Match;
import model.Played;
import model.Player;

/**
 *
 * @author Tien Thanh
 */
public class UpdateMatchFrm extends javax.swing.JFrame {
    //private final Schedule schedule;
    private final ArrayList<Played> listHomeTeam;
    private final ArrayList<Played> listVisitingTeam;
    private final Match match;

    /**
     * Creates new form UpdateMatchView
     * @param match
     */
    public UpdateMatchFrm(Match match) {
        initComponents();
        this.match=match;
        setLocationRelativeTo(null);
        setTitle("UpdateMatch");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        //set name homTeam and visitingTeam
        jLabelReferee.setText(match.getReferee().getName());
        jLabelStadium.setText(match.getStadium().getName());
        jLabelHomeTeam.setText(match.getHomeTeam().getName());
        jLabelVisitingTeam.setText(match.getVisitingTeam().getName());
        //Set Img homeTeam and visitingTeam
        String nameImgHomeTeam=match.getHomeTeam().getName() + ".png";
        String urlImgHomeTeam="D:\\Java\\QL giai vo dich QG\\src\\img\\team\\"+ nameImgHomeTeam;
        jLabelHomeTeam.setIcon(new ImageIcon(urlImgHomeTeam));
        String nameImgVisitTeam=match.getVisitingTeam().getName() + ".png";
        String urlImgVisitTeam="D:\\Java\\QL giai vo dich QG\\src\\img\\team\\"+ nameImgVisitTeam;
        jLabelVisitingTeam.setIcon(new ImageIcon(urlImgVisitTeam));
        // set Time 
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        jTextFieldTime.setText(sdf.format(match.getTime()));
        //get List:: load database to ArrayList
        MatchDAO m=new MatchDAO();
        listHomeTeam=m.getList(match.getHomeTeam(),match);
        listVisitingTeam=m.getList(match.getVisitingTeam(),match);
        
        
        //load ArrayList to table
        String[] columnNames={"Player"};
        String[][] value = new String[listHomeTeam.size()][1];
	for(int i=0; i<listHomeTeam.size(); i++){
            value[i][0] = listHomeTeam.get(i).getPlayer().getName() +"";
				
	}
	DefaultTableModel tblHomeTeam = new DefaultTableModel(value, columnNames){
			    @Override
			    public boolean isCellEditable(int row, int column) {
			       //unable to edit cells
			       return false;
			    }
			};
        jTableHomeTeam.setModel(tblHomeTeam);
        
        
        String[][] value2 = new String[listVisitingTeam.size()][1];
	for(int i=0; i<listVisitingTeam.size(); i++){
            value2[i][0] = listVisitingTeam.get(i).getPlayer().getName()+"";
				
	}
	DefaultTableModel tblVisitingTeam = new DefaultTableModel(value2, columnNames){
			    @Override
			    public boolean isCellEditable(int row, int column) {
			       //unable to edit cells
			       return false;
			    }
			};
        jTableVisitingTeam.setModel(tblVisitingTeam);
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
        jLabelHomeTeam = new javax.swing.JLabel();
        jLabelVisitingTeam = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableHomeTeam = new javax.swing.JTable();
        jTextFieldHomeTeam = new javax.swing.JTextField();
        jTextFieldVisitingTeam = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableVisitingTeam = new javax.swing.JTable();
        jTextFieldSpectator = new javax.swing.JTextField();
        UpdateEvent = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabelStadium = new javax.swing.JLabel();
        Done = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabelReferee = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldTime = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/championship.jpg"))); // NOI18N

        jLabelVisitingTeam.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel3.setText("Spectator:");

        jTableHomeTeam.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Player"
            }
        ));
        jScrollPane1.setViewportView(jTableHomeTeam);

        jTableVisitingTeam.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Player"
            }
        ));
        jScrollPane2.setViewportView(jTableVisitingTeam);

        UpdateEvent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/updatematch.png"))); // NOI18N
        UpdateEvent.setText("Update Events");
        UpdateEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateEventActionPerformed(evt);
            }
        });

        jLabel4.setText("Stadium:");

        Done.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/done.png"))); // NOI18N
        Done.setText("Done");
        Done.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoneActionPerformed(evt);
            }
        });

        jLabel6.setText("Referee:");

        jLabel2.setText("Time:");

        jLabel5.setText("-");

        jLabel7.setText("Score");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(299, 299, 299)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldTime, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelStadium, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldSpectator, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(UpdateEvent)
                        .addGap(18, 18, 18)
                        .addComponent(Done)
                        .addGap(66, 66, 66))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelHomeTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldHomeTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel5))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldVisitingTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabelVisitingTeam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelReferee, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(47, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelVisitingTeam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldHomeTeam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldVisitingTeam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addComponent(jLabelHomeTeam, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelReferee, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabelStadium, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldSpectator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(UpdateEvent)
                        .addComponent(Done)))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UpdateEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateEventActionPerformed
        // TODO add your handling code here:
        int select1=jTableHomeTeam.getSelectedRow();
        int select2=jTableVisitingTeam.getSelectedRow();
        boolean bool=true;
        if(select1!=-1&&select2==-1)
            new UpdateEventFrm(match,listHomeTeam.get(select1),bool).setVisible(true);
        else if (select2!=1&&select1==-1){
            bool=false;
            new UpdateEventFrm(match,listVisitingTeam.get(select2),bool).setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(this, "You selected two Player!!!");
        }
//        jTableHomeTeam.addMouseListener(new MouseAdapter() {
//        @Override
//        public void mouseClicked(MouseEvent e) {
//	int column = jTableHomeTeam.getColumnModel().getColumnIndexAtX(e.getX()); // get the coloum of the button
//	int row = e.getY() / jTableHomeTeam.getRowHeight(); // get the row of the button
//
//	// *Checking the row or column is valid or not
//	if (row < jTableHomeTeam.getRowCount() && row >= 0 && column < jTableHomeTeam.getColumnCount() && column >= 0) {
//	new UpdateEventFrm(match,listHomeTeam.get(row),true).setVisible(true);
//	}
//	}
//	});
    }//GEN-LAST:event_UpdateEventActionPerformed

    private void DoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoneActionPerformed
        // TODO add your handling code here:
        String goal1=jTextFieldHomeTeam.getText();
        String goal2=jTextFieldVisitingTeam.getText();
        String score=goal1+"-"+goal2;
        String time=jTextFieldTime.getText();
        String spectator = jTextFieldSpectator.getText();
        
        if(goal1.equals("")||goal2.equals("")||spectator.equals(""))
        {
            JOptionPane.showMessageDialog(this, "One more is Empty!!");
        }
        else{
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            match.setScore(score);
            try {
                match.setTime(sdf.parse(time));
                System.out.println(match.getTime());
            } catch (ParseException ex) {
                ex.printStackTrace();
            }
            match.setNumberOfSpectator(Integer.parseInt(spectator));
            
            MatchDAO m=new MatchDAO();
            if(m.updateMatch(match))
            {
                JOptionPane.showMessageDialog(this, "Update Complete!!");
                this.dispose();
            }
            else{
                JOptionPane.showMessageDialog(this, "Incorrect information!!");
            }
        }
    }//GEN-LAST:event_DoneActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateMatchFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateMatchFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateMatchFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateMatchFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
              // new UpdateMatchFrm(new Team()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Done;
    private javax.swing.JButton UpdateEvent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelHomeTeam;
    private javax.swing.JLabel jLabelReferee;
    private javax.swing.JLabel jLabelStadium;
    private javax.swing.JLabel jLabelVisitingTeam;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableHomeTeam;
    private javax.swing.JTable jTableVisitingTeam;
    private javax.swing.JTextField jTextFieldHomeTeam;
    private javax.swing.JTextField jTextFieldSpectator;
    private javax.swing.JTextField jTextFieldTime;
    private javax.swing.JTextField jTextFieldVisitingTeam;
    // End of variables declaration//GEN-END:variables
}
