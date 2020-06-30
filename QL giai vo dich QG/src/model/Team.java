/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Tien Thanh
 */
public class Team implements java.io.Serializable{
    private int id;
    private String name;
    private int numberOfPlayer;
    private Championship championship;
    private Stadium stadium;
    private Coach coach;
    private Sponsor sponsor;

    public Team(int id, String name, int numberOfPlayer, Championship championship, Stadium stadium, Coach coach, Sponsor sponsor) {
        this.id = id;
        this.name = name;
        this.numberOfPlayer = numberOfPlayer;
        this.championship = championship;
        this.stadium = stadium;
        this.coach = coach;
        this.sponsor = sponsor;
    }

    public Team() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPlayer() {
        return numberOfPlayer;
    }

    public void setNumberOfPlayer(int numberOfPlayer) {
        this.numberOfPlayer = numberOfPlayer;
    }

    public Championship getChampionship() {
        return championship;
    }

    public void setChampionship(Championship championship) {
        this.championship = championship;
    }

    public Stadium getStadium() {
        return stadium;
    }

    public void setStadium(Stadium stadium) {
        this.stadium = stadium;
    }

    public Coach getCoach() {
        return coach;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    public Sponsor getSponsor() {
        return sponsor;
    }

    public void setSponsor(Sponsor sponsor) {
        this.sponsor = sponsor;
    }
    
    
}
