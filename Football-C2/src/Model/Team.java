package Model;

import Control.Controller;
import java.util.ArrayList;

/**
 *
 * @author Yugeswaran
 */
public class Team {

    private int id;
    private String name;
    private String[] coaches;
    private String league;
    private String division;
    private boolean fullTime;

    /**
     *
     * @param id
     * @param name a String containing the name
     * @param coaches a String containing the coaches
     * @param division
     * @param league a String containing the league
     * @param fullTime a boolean containing the fulltime
     */
    public Team(int id, String name, String[] coaches, String league, String division, boolean fullTime) {
        this.id = id;
        this.name = name;
        this.coaches = coaches;
        this.league = league;
        this.division = division;
        this.fullTime = fullTime;
    }

    /**
     * Get the value of id
     *
     * @return the value of id
     */
    public int getId() {
        return id;
    }

    /**
     * Set the value of id
     *
     * @param id new value of id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the value of Name
     *
     * @param name new value of name
     */
    public void setName(String name) {
        this.name = name;
    }

    /** get coaches
     *
     * @return coaches as String
     */
    public String getCoaches() {
        return getArrayAsString(coaches);
    }

    /** set coaches to a array
     *
     * @param coaches
     */
    public void setCoaches(String coaches) {
        this.coaches = getStringAsArray(coaches);
    }

    /** set coaches to a array
     *
     * @param s 
     * @return result
     */
    private String[] getStringAsArray(String s) {
        String[] result = s.split(":");
        return result;
    }

    
    private String getArrayAsString(String[] a) {
        String result = "";
        for (String s : a) {
            result += s + " : ";
        }
        result = result.substring(0, result.length() - 3);
        return result;
    }

    /**
     * Get the value of league
     *
     * @return the value of league
     */
    public String getLeague() {
        return league;
    }

    /**
     * Set the value of league
     *
     * @param league new value of league
     */
    public void setLeague(String league) {
        this.league = league;
    }

    /**
     * Get the value of division
     *
     * @return the value of division
     */
    public String getDivision() {
        return division;
    }

    /**
     * Set the value of division
     *
     * @param division new value of division
     */
    public void setDivision(String division) {
        this.division = division;
    }

    /**
     * Get the value of fullTime
     *
     * @return the value of fullTime
     */
    public boolean getFullTime() {
        return fullTime;
    }

    /**
     * Set the value of fullTime
     *
     * @param fullTime new value of fullTime
     */
    public void setFullTime(boolean fullTime) {
        this.fullTime = fullTime;
    }
     
    

}
