/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import junit.framework.Assert;
import model.Match;
import model.Played;
import model.Team;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tien Thanh
 */
public class MatchDAOTest {
    MatchDAO m=new MatchDAO();
    @Test
    //Standard: update Match
    public void testUpdateMatchStandard1() {
 
    }

    /**
     * Test of getList method, of class MatchDAO.
     */
    @Test
    //Standard: get List Plaer homeTeam in the match
    public void testGetListStandard1() {
        Team homeTeam= new Team();
        homeTeam.setName("Ha Noi");
        Match match=new Match();
        match.setId(2);
        ArrayList<Played> list =m.getList(homeTeam, match);
        Assert.assertNotNull(list);
        Assert.assertEquals(13, list.size());
        Assert.assertEquals("Nguyen Van Dung", list.get(0).getPlayer().getName());
    }
    @Test
    public void testGetListStandard2() {
        Team visitingTeam= new Team();
        visitingTeam.setName("Hai Phong");
        Match match=new Match();
        match.setId(2);
        ArrayList<Played> list =m.getList(visitingTeam, match);
        Assert.assertNotNull(list);
        Assert.assertEquals(14, list.size());
    }
    
}
