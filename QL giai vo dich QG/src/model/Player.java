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
public class Player implements java.io.Serializable{
    private int id;
    private String name;
    private String birth;
    private int number;
    private String position;
    private Team team;

    public Player() {
    }

    public Player(int id, String name, String birth, int number, String position, Team team) {
        this.id = id;
        this.name = name;
        this.birth = birth;
        this.number = number;
        this.position = position;
        this.team = team;
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

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
    public Object[] toObject(){
       return new Object[]{name};
   }

}
