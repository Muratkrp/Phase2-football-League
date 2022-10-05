/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author K1416170
 */
public class Match {
    private int teamId;
    private String teamName;
    private String result;
    private String date;
    private String opponent;
    private int attendance;

    // default constructor
    public  Match()
    {
    }

    public Match(int teamId, String teamName, String date, String opponent, int attendance) {
        this.teamId = teamId;
        this.teamName = teamName;
        this.date = date;
        this.opponent = opponent;
        this.attendance = attendance;
    }

   
    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

   
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setOpponent(String opponent) {
        this.opponent = opponent;
    }

    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }

    public String getTeamName() {
        return teamName;
    }

    public String getResult() {
        return result;
    }

    public String getDate() {
        return date;
    }

    public String getOpponent() {
        return opponent;
    }

    public int getAttendance() {
        return attendance;
    }

    
    @Override
    public String toString()
    {
//        return getStudentId() + "\t"
//                + ApplicationModel.findStudent(getStudentId()).getName()
//                + "\t"+ getMark() + "\t"
//                + getYear() + "\t" + getPeriod() + "\t"
//                + getWeighting()+"\n";
        return getTeamName()+ "\t"+ getResult() + "\t"
                + getDate() + "\t" + getOpponent() + "\t"
                + getAttendance()+"\n";
    }
}



    

