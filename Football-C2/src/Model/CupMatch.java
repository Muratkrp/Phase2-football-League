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
public class CupMatch  extends Match {
    private String period;
     public  CupMatch()
    {
    }

    
    

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getPeriod() {
        return period;
    }

    
    @Override
    public String toString()
    {
//        return getStudentId() + "\t"
//                + ApplicationModel.findStudent(getStudentId()).getName()
//                + "\t"+ getMark() + "\t"
//                + getYear() + "\t" + getPeriod() + "\t"
//                + getWeighting()+"\n";
        return getTeamName()+ "\t" + getResult() + "\t"
                + getDate() + "\t" + getOpponent() + "\t" 
                + getAttendance()+ "\t" + getPeriod() + "\n" ;
    }
}





    

