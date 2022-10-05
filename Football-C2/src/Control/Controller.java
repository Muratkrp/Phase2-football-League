package Control;

import Model.CupMatch;
import Model.LeagueMatch;
import Model.Match;
import Model.Team;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.io.FileNotFoundException;
//import java.util.Collections;
//import java.util.Comparator;

public class Controller {

    /**This method read from the football_teams.txt and add them to a ArrayList 
     *
     */
    public static void loadFileTeam() {
        BufferedReader buffReader = null;
        int i = 0;
        try {
            String line;
            boolean full = false;
            buffReader = new BufferedReader(new FileReader("football_teams.txt"));
            buffReader.readLine();
            while ((line = buffReader.readLine()) != null) {
                String[] team = line.split(",");
                i++;
                String[] coaches = team[1].split(":");
                if (team[4].equalsIgnoreCase("Yes")) {
                    full = true;
                } else if (team[4].equalsIgnoreCase("No")) {
                    full = false;
                }
                addTeam(new Team(i, team[0], coaches, team[2], team[3], full));
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (buffReader != null) {
                    buffReader.close();
                }
            } catch (IOException cException) {
                cException.printStackTrace();
            }
        }
        System.out.println("File Loaded");
    }
    
    
public static ArrayList<Team> teamList = new ArrayList<>();

    /**
     * adds the object c to the ArrayList.
     *
     * @param c
     */
    public static void addTeam(Team c) {
        teamList.add(c);
    }

    /**
     *
     * @return TeamList
     */
    public static ArrayList<Team> getTeamList() {
        return teamList;
    }

    /**
     *
     * @param TeamList
     */
    public void setTeamList(ArrayList<Team> TeamList) {
        teamList = TeamList;
    }

    /**
     *Print all the team details to the output window.
     * 
     */
    public static void printAllTeams() {
        int h;

        for (h = 0; h < Controller.teamList.size(); h++) {
            System.out.println("Football Team " + Controller.teamList.get(h).getId() + " [Club Name: " + Controller.teamList.get(h).getName() + 
                    " \t Coaches: " + Controller.teamList.get(h).getCoaches() + 
                    " \t Leage: " + Controller.teamList.get(h).getLeague() + " \t Division: " + 
                    Controller.teamList.get(h).getDivision() + " \t Fulltime: " + Controller.teamList.get(h).getFullTime());
        }
    }
    public static void loadFileMatches() {
        BufferedReader buffReader = null;
        int i = 0;
        try {
            String line;
            boolean full = false;
            buffReader = new BufferedReader(new FileReader("football2-matches.txt"));
            buffReader.readLine();
            while ((line = buffReader.readLine()) != null) {
                String[] team = line.split(",");
                i++;
                String[] coaches = team[1].split(":");
                if (team[4].equalsIgnoreCase("Yes")) {
                    full = true;
                } else if (team[4].equalsIgnoreCase("No")) {
                    full = false;
                }
                addTeam(new Team(i, team[0], coaches, team[2], team[3], full));
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (buffReader != null) {
                    buffReader.close();
                }
            } catch (IOException cException) {
                cException.printStackTrace();
            }
        }
        System.out.println("File Loaded");
    }
    public static ArrayList<Match> matchList = new ArrayList<>();

    /**
     * adds the object c to the ArrayList.
     *
     * @param c
     */
    public static void addMatch(Match c) {
        matchList.add(c);
    }

    /**
     *
     * @return TeamList
     */
    public static ArrayList<Match> getMatchList() {
        return matchList;
    }

    /**
     *
     * @param TeamList
     */
    public void setMatchList(ArrayList<Match> MatchList) {
        matchList = MatchList;
    }

    /**
     *Print all the team details to the output window.
     * 
     */
    public static void printAllMatches() {
        int h;

        for (h = 0; h < Controller.teamList.size(); h++) {
            System.out.println("Football Team " + Controller.matchList.get(h).getTeamId() + " [Club Name: " + Controller.matchList.get(h).getTeamName() + 
                    " \t Results: " + Controller.matchList.get(h).getResult() + 
                    " \t Date: " + Controller.matchList.get(h).getDate() + " \t Opponent: " + 
                    Controller.matchList.get(h).getOpponent() + " \t Attendance: " + Controller.matchList.get(h).getAttendance());
        }
    }
    public static void loadFileCupMatches() {
        BufferedReader buffReader = null;
        int i = 0;
        try {
            String line;
            boolean full = false;
            buffReader = new BufferedReader(new FileReader("football3-cupmatches.txt"));
            buffReader.readLine();
            while ((line = buffReader.readLine()) != null) {
                String[] team = line.split(",");
                i++;
                String[] results = team[1].split(":");
                if (team[4].equalsIgnoreCase("Yes")) {
                    full = true;
                } else if (team[4].equalsIgnoreCase("No")) {
                    full = false;
                }
                addTeam(new Team(i, team[0], results, team[2], team[3], full));
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (buffReader != null) {
                    buffReader.close();
                }
            } catch (IOException cException) {
                cException.printStackTrace();
            }
        }
        System.out.println("File Loaded");
    }
    
     public static ArrayList<CupMatch> cupmatchList = new ArrayList<>();

    /**
     * adds the object c to the ArrayList.
     *
     * @param c
     */
    public static void addMCupMatch(CupMatch c) {
        cupmatchList.add(c);
    }

    /**
     *
     * @return TeamList
     */
    public static ArrayList<CupMatch> getCupMatchList() {
        return cupmatchList;
    }

    /**
     *
     * @param TeamList
     */
    public void setCupMatcList(ArrayList<CupMatch> CupMatchList) {
        cupmatchList = CupMatchList;
    }

    /**
     *Print all the team details to the output window.
     * 
     */
    public static void printAllCupMatches() {
        int h;

        for (h = 0; h < Controller.cupmatchList.size(); h++) {
            System.out.println("Football Team " + Controller.cupmatchList.get(h).getTeamId() + " [Club Name: " + Controller.cupmatchList.get(h).getTeamName() + 
                    " \t Results: " + Controller.cupmatchList.get(h).getResult() + 
                    " \t Date: " + Controller.cupmatchList.get(h).getDate() + " \t Opponent: " + 
                    Controller.cupmatchList.get(h).getOpponent() + " \t Attendance: " + Controller.cupmatchList.get(h).getAttendance() + 
                    " \t Round: " + Controller.cupmatchList.get(h).getPeriod());
        }
    }
    
    public static void loadFileLeagueMatches() {
        BufferedReader buffReader = null;
        int i = 0;
        try {
            String line;
            boolean full = false;
            buffReader = new BufferedReader(new FileReader("football3-leaguematches.txt"));
            buffReader.readLine();
            while ((line = buffReader.readLine()) != null) {
                String[] team = line.split(",");
                i++;
                String[] results = team[1].split(":");
                if (team[4].equalsIgnoreCase("Yes")) {
                    full = true;
                } else if (team[4].equalsIgnoreCase("No")) {
                    full = false;
                }
                addTeam(new Team(i, team[0], results, team[2], team[3], full));
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (buffReader != null) {
                    buffReader.close();
                }
            } catch (IOException cException) {
                cException.printStackTrace();
            }
        }
        System.out.println("File Loaded");
    }
     public static ArrayList<LeagueMatch> leaguematchList = new ArrayList<>();

    /**
     * adds the object c to the ArrayList.
     *
     * @param c
     */
    public static void addLeagueMatch(LeagueMatch c) {
        leaguematchList.add(c);
    }

    /**
     *
     * @return TeamList
     */
    public static ArrayList<LeagueMatch> getLeagueMatchList() {
        return leaguematchList;
    }

    /**
     *
     * @param TeamList
     */
    public void setLeagueMatcList(ArrayList<LeagueMatch> LeagueMatcList) {
        leaguematchList = LeagueMatcList;
    }

    /**
     *Print all the team details to the output window.
     * 
     */
    public static void printAllLeagueMatches() {
        int h;

        for (h = 0; h < Controller.teamList.size(); h++) {
            System.out.println("Match ID " + Controller.leaguematchList.get(h).getTeamId() + " [Club Name: " + Controller.leaguematchList.get(h).getTeamName() + 
                    " \t Results: " + Controller.leaguematchList.get(h).getResult() + 
                    " \t Date: " + Controller.leaguematchList.get(h).getDate() + " \t Opponent: " + 
                    Controller.leaguematchList.get(h).getOpponent() + " \t Attendance: " + Controller.leaguematchList.get(h).getAttendance() + 
                    " \t Ticket Price : " + Controller.leaguematchList.get(h).getTicketprice());
        }
}
    }

    
    
    
    
    
    
    
    
    
    
    
    
    

   //SOrting methods
    /** This is the method for sorting by league method
     * 
     *
     */
    /**
    public static Comparator<Team> leageComparator = new Comparator<Team>() {
        @Override
        public int compare(Team t1, Team t2) {

            String leage1 = t1.getLeague().toUpperCase();
            String leage2 = t2.getLeague().toUpperCase();
            return leage1.compareTo(leage2);

        }
    };

    /**
     * This sortByLeage() use collections to sort the teams by league name. When
     * the sorting is done it calls the printAllTeams() method to print all the
     * teams to the output window.
     */
   