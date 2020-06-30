/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Match;
import model.Played;
import model.Player;
import model.Team;

/**
 *
 * @author Tien Thanh
 */
public class MatchDAO extends DAO {

    public MatchDAO() {
    }
  
    public int checkRound(Match match) {
        int result = -1;
        //boolean result = false;
        String sql = "SELECT m.id,m.time,t.name,y.name,y.capacity,m.score FROM tblmatch m INNER JOIN tblteam s ON s.id = m.team1_id INNER JOIN tblteam v ON v.id=m.team2_id INNER JOIN tblreferee t ON t.id=m.referee_id INNER JOIN tblstadium y ON y.id=m.stadium_id WHERE m.round=? and s.name=? and v.name=?;";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, match.getRound());
            ps.setString(2, match.getHomeTeam().getName());
            ps.setString(3, match.getVisitingTeam().getName());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                match.setId(rs.getInt(1));
                match.setTime(rs.getTimestamp(2));
                match.getReferee().setName(rs.getString(3));
                match.getStadium().setName(rs.getString(4));
                match.getStadium().setCapacity(rs.getInt(5));
                match.setScore(rs.getString(6));
                if (match.getScore().equals("")) {
                    result = 1;
                } else {
                    result = 0;
                }

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return result;
    }
    
    public boolean updateMatch(Match match) {
        try {
            con.setAutoCommit(false); //set comment in Jnit 
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String sql = "UPDATE tblmatch SET score=?, time=?, numberofspectator=? WHERE id=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, match.getScore());
            ps.setString(2,sdf.format(match.getTime()));
            ps.setInt(3, match.getNumberOfSpectator());
            ps.setInt(4, match.getId());
            ps.executeUpdate();
            //con.commit(); // set comment in JUnit test
        } catch (SQLException ex) {
            try {
                con.rollback();
                //con.setAutoCommit(true); //set comment in JUnit Test
                ex.printStackTrace();
                return false;
            } catch (SQLException ex1) {
                ex1.printStackTrace();
            }
        }
        return true;
    }
    public ArrayList<Played> getList(Team team,Match match){
        ArrayList<Played> result = new ArrayList<>();
        try {
            String sql="SELECT p.*,u.id FROM tblplayed u INNER JOIN tblmatch m on m.id= u.match_id INNER JOIN tblteam t on t.id=u.team_id INNER JOIN tblplayer p on p.id=u.player_id WHERE t.name=? and m.id=?";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1, team.getName());
            ps.setInt(2, match.getId());
            ResultSet rs= ps.executeQuery();
            while(rs.next()){
                Player player=new Player();
                Played played=new Played();
                player.setId(rs.getInt(1));
                player.setName(rs.getString("name"));
                player.setBirth(rs.getString("birth"));
                player.setPosition(rs.getString("position"));
                player.setTeam(team);
                
                played.setId(rs.getInt(7));
                played.setMatch(match);
                played.setPlayer(player);
                result.add(played);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return result;
    }
    
}
