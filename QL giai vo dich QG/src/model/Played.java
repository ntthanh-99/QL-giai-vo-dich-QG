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
public class Played implements java.io.Serializable{
    private int id;
    private Match match;
    private Player player;
    private User creator;

    public Played() {
    }

    public Played(int id, Match match, Player player, User creator) {
        this.id = id;
        this.match = match;
        this.player = player;
        this.creator = creator;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Match getMatch() {
        return match;
    }

    public void setMatch(Match match) {
        this.match = match;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public User getCreator() {
        return creator;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }
    
    
}
