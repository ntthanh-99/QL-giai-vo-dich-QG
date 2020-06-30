/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Tien Thanh
 */
public class Match implements java.io.Serializable{
    private int id;
    private int round;
    private String score;
    private Date time;
    private int numberOfSpectator;
    private Team homeTeam;
    private Team visitingTeam;
    private Referee referee;
    private Stadium stadium;
    private User creator;
    private Championship championship;

    public Match() {
    }

    public Match(int id, int round, String score, Date time, int numberOfSpectator, Team homeTeam, Team visitingTeam, Referee referee, Stadium stadium, User creator, Championship championship) {
        this.id = id;
        this.round = round;
        this.score = score;
        this.time = time;
        this.numberOfSpectator = numberOfSpectator;
        this.homeTeam = homeTeam;
        this.visitingTeam = visitingTeam;
        this.referee = referee;
        this.stadium = stadium;
        this.creator = creator;
        this.championship = championship;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public int getNumberOfSpectator() {
        return numberOfSpectator;
    }

    public void setNumberOfSpectator(int numberOfSpectator) {
        this.numberOfSpectator = numberOfSpectator;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    public Team getVisitingTeam() {
        return visitingTeam;
    }

    public void setVisitingTeam(Team visitingTeam) {
        this.visitingTeam = visitingTeam;
    }

    public Referee getReferee() {
        return referee;
    }

    public void setReferee(Referee referee) {
        this.referee = referee;
    }

    public Stadium getStadium() {
        return stadium;
    }

    public void setStadium(Stadium stadium) {
        this.stadium = stadium;
    }

    public User getCreator() {
        return creator;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }

    public Championship getChampionship() {
        return championship;
    }

    public void setChampionship(Championship championship) {
        this.championship = championship;
    }
    
    
}
