/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.text.SimpleDateFormat;
import model.Championship;
import model.Match;
import model.Referee;
import model.Schedule;
import model.Stadium;
import model.Team;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tien Thanh
 */
public class ScheduleDAOTest {

    ScheduleDAO s = new ScheduleDAO();

    @Test
    //Standard: Match in Schedule and not update
    public void testCheckRoundStandard1() {
        Team homeTeam = new Team();
        Team visittingTeam = new Team();
        Referee referee = new Referee();
        Stadium stadium = new Stadium();
        Schedule schedule = new Schedule();
        schedule.setStadium(stadium);
        schedule.setReferee(referee);

        homeTeam.setName("Ha Noi");
        schedule.setHomeTeam(homeTeam);
        visittingTeam.setName("Hai Phong");
        schedule.setVisitingTeam(visittingTeam);
        schedule.setRound(1);
        Match match = new Match();
        match.setSchedule(schedule);
        int result = s.checkRound(schedule, match);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Assert.assertTrue(result);
        Assert.assertEquals("2019-06-15 16:00:00", sdf.format(match.getSchedule().getTime()));
        Assert.assertEquals("Hoang Pham Cong Khanh", match.getSchedule().getReferee().getName());
        Assert.assertEquals("San van dong Hang Day", match.getSchedule().getStadium().getName());
        return;
    }

    @Test
    // Exception: Match Updated
    public void testCheckRoundException1() {
        Team homeTeam = new Team();
        Team visittingTeam = new Team();
        Referee referee = new Referee();
        Stadium stadium = new Stadium();
        Schedule schedule = new Schedule();
        schedule.setStadium(stadium);
        schedule.setReferee(referee);

        homeTeam.setName("Becamex Binh Duong");
        schedule.setHomeTeam(homeTeam);
        visittingTeam.setName("Ha Noi");
        schedule.setVisitingTeam(visittingTeam);
        schedule.setRound(1);
        Match match = new Match();
        match.setSchedule(schedule);
        boolean result = s.checkRound(schedule, match);
        Assert.assertFalse(result);
        return;
    }
    @Test
    // Exception: Wrong Team
    public void testCheckRoundException2() {
        Team homeTeam = new Team();
        Team visittingTeam = new Team();
        Referee referee = new Referee();
        Stadium stadium = new Stadium();
        Schedule schedule = new Schedule();
        schedule.setStadium(stadium);
        schedule.setReferee(referee);

        homeTeam.setName("Ha Nam");
        schedule.setHomeTeam(homeTeam);
        visittingTeam.setName("Ha Noi");
        schedule.setVisitingTeam(visittingTeam);
        schedule.setRound(1);
        Match match = new Match();
        match.setSchedule(schedule);
        boolean result = s.checkRound(schedule, match);
        Assert.assertFalse(result);
        return;
    }
}
