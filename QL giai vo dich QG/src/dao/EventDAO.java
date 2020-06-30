/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Event;

/**
 *
 * @author Tien Thanh
 */
public class EventDAO extends DAO {

    public EventDAO() {
    }

    /*
    *Update event to database
     */
    public int UpdateEvent(Event event) {
        int result = 1;
        try {
            String sql1 = "SELECT * FROM qlgiaivodichqg.tblevent where time=? and type=? and description=? and played_id=?;";
            PreparedStatement ps1 = con.prepareCall(sql1);
            ps1.setString(1, event.getTime());
            ps1.setString(2, event.getType());
            ps1.setString(3, event.getDescription());
            ps1.setInt(4, event.getPlayed().getId());
            ResultSet rs = ps1.executeQuery();
            if (rs.next()) {
                result =0;
            }
            else{
                String sql2 = "INSERT INTO tblevent (time, type, description, match_id,played_id) VALUES (?,?,?,?,?);";
                try {
                    con.setAutoCommit(false);
                    PreparedStatement ps2 = con.prepareStatement(sql2);
                    ps2.setString(1, event.getTime());
                    ps2.setString(2, event.getType());
                    ps2.setString(3, event.getDescription());
                    ps2.setInt(4, event.getMatch().getId());
                    ps2.setInt(5, event.getPlayed().getId());
                    ps2.executeUpdate();
                    //con.commit(); //set comment in Jnit test
                } catch (SQLException ex) {
                    result = -1;
                    try {
                        con.rollback();
                        con.setAutoCommit(true);
                    } catch (SQLException ex1) {
                        ex1.printStackTrace();

                    }
                    ex.printStackTrace();

                } finally {
                    try {
                        //con.setAutoCommit(true);//set comment in JUnit test mode
                    } catch (Exception ex2) {
                        result = -1;
                        ex2.printStackTrace();
                    }
                }
            }
        } catch (SQLException ex3) {
            ex3.printStackTrace();
            result = -1;
        }
        return result;
    }
}
