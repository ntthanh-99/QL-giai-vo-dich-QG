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
public class Championship implements java.io.Serializable{
    private int id;;
    private String name;
    private int numberOfTeam;

    public Championship() {
    }

    public Championship(int id, String name, int numberOfTeam) {
        this.id = id;
        this.name = name;
        this.numberOfTeam = numberOfTeam;
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

    public int getNumberOfTeam() {
        return numberOfTeam;
    }

    public void setNumberOfTeam(int numberOfTeam) {
        this.numberOfTeam = numberOfTeam;
    }
    
    
}
