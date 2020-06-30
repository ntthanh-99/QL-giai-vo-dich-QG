/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Time;

/**
 *
 * @author Tien Thanh
 */
public class Event implements java.io.Serializable{
    private int id;
    private String time;
    private String type;
    private String description;
    private Match match;
    private Played played;

    public Event() {
    }

    public Event(int id, String time, String type, String description, Match match, Played played) {
        this.id = id;
        this.time = time;
        this.type = type;
        this.description = description;
        this.match = match;
        this.played = played;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Match getMatch() {
        return match;
    }

    public void setMatch(Match match) {
        this.match = match;
    }

    public Played getPlayed() {
        return played;
    }

    public void setPlayed(Played played) {
        this.played = played;
    }
    
    
}
