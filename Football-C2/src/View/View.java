package View;

import Control.Controller;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Yugeswaran
 */
public class View extends JFrame {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Controller.loadFileTeam();
        Controller.loadFileMatches();
        Controller.loadFileCupMatches();
        Controller.loadFileLeagueMatches();

        mainWindow();
    }

    /**
     *
     */
    public static void mainWindow() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JButton viewTeamsBtn = new JButton("View Teams");
        JButton sortTeamsBtn = new JButton("View Matches");
        JButton viewCoachesBtn = new JButton("View Cup Matches");
        JButton sortCoachesBtn = new JButton("View League Matches");

        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
//       panel.setLayout(new GridLayout(4, 1));

        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(viewTeamsBtn, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        panel.add(sortTeamsBtn, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        panel.add(viewCoachesBtn, gbc);

        gbc.gridx = 1;
        gbc.gridy = 4;
        panel.add(sortCoachesBtn, gbc);

        viewTeamsBtn.setPreferredSize(new Dimension(300, 100));
        sortTeamsBtn.setPreferredSize(new Dimension(300, 100));
        viewCoachesBtn.setPreferredSize(new Dimension(300, 100));
        sortCoachesBtn.setPreferredSize(new Dimension(300, 100));

        viewTeamsBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
               viewTeams() ;
            }
        });

        sortTeamsBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                viewMatches();
            }
        });

        viewCoachesBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
               viewCupMatches() ;
            }
        });

        sortCoachesBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
               viewLeagueMatches() ;
            }
        });

        //  frame.setResizable(false);
        frame.add(panel);
        frame.setTitle("Main Manu");
        frame.setVisible(true);
        frame.setSize(1300, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
    }

    /**
     *
     */
    
    public static void viewTeams() {
        JFrame frame = new JFrame();
        JTable jt = new JTable();
        JPanel panel = new JPanel();
        String[][] data;
        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int data, int columns) {
                return false;
            }
        };

        Object[] columns = {"ID", "Name", "Coaches", "League", "Division", "Fulltime"};

        model.setColumnIdentifiers(columns);

        Object[] rowData = new Object[6];
        for (int i = 0; i < Controller.getTeamList().size(); i++) {
            rowData[0] = Controller.getTeamList().get(i).getId();
            rowData[1] = Controller.getTeamList().get(i).getName();
            rowData[2] = Controller.getTeamList().get(i).getCoaches();
            rowData[3] = Controller.getTeamList().get(i).getLeague();
            rowData[4] = Controller.getTeamList().get(i).getDivision();
            rowData[5] = Controller.getTeamList().get(i).getFullTime();
            model.addRow(rowData);
        }

        jt.setModel(model);

        jt.setPreferredScrollableViewportSize(new Dimension(1200, 500));
        jt.setFillsViewportHeight(true);
        JScrollPane jps = new JScrollPane(jt);
        jps.setVisible(true);
        panel.add(jps);

        frame.add(panel);
        frame.setTitle("View Teams");
        frame.setVisible(true);
        frame.setSize(1300, 700);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
    }

    
    
    public static void viewMatches() {
        JFrame frame = new JFrame();
        JTable jt = new JTable();
        JPanel panel = new JPanel();
        String[][] data;
        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int data, int columns) {
                return false;
            }
        };

        Object[] columns = {"ID", "Name", "Result", "Date", "Opponent", "Attendance"};

        model.setColumnIdentifiers(columns);

        Object[] rowData = new Object[6];
        for (int i = 0; i < Controller.getMatchList().size(); i++) {
            rowData[0] = Controller.getMatchList().get(i).getTeamId();
            rowData[1] = Controller.getMatchList().get(i).getTeamName();
            rowData[2] = Controller.getMatchList().get(i).getResult();
            rowData[3] = Controller.getMatchList().get(i).getDate();
            rowData[4] = Controller.getMatchList().get(i).getOpponent();
            rowData[5] = Controller.getMatchList().get(i).getAttendance();
            model.addRow(rowData);
        }

        jt.setModel(model);

        jt.setPreferredScrollableViewportSize(new Dimension(1200, 500));
        jt.setFillsViewportHeight(true);
        JScrollPane jps = new JScrollPane(jt);
        jps.setVisible(true);
        panel.add(jps);

        frame.add(panel);
        frame.setTitle("View Matches");
        frame.setVisible(true);
        frame.setSize(1300, 700);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
    }

    
   
    public static void viewCupMatches() {
        JFrame frame = new JFrame();
        JTable jt = new JTable();
        JPanel panel = new JPanel();
        String[][] data;
        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int data, int columns) {
                return false;
            }
        };

        Object[] columns = {"ID", "Name","Result", "Date", "Opponent", "Attendance", "Round"};

        model.setColumnIdentifiers(columns);

        Object[] rowData = new Object[7];
        for (int i = 0; i < Controller.getCupMatchList().size(); i++) {
            rowData[0] = Controller.getCupMatchList().get(i).getTeamId();
            rowData[1] = Controller.getCupMatchList().get(i).getTeamName();
            rowData[2] = Controller.getCupMatchList().get(i).getResult();
            rowData[3] = Controller.getCupMatchList().get(i).getDate();
            rowData[4] = Controller.getCupMatchList().get(i).getOpponent();
            rowData[5] = Controller.getCupMatchList().get(i).getAttendance();
            rowData[6] = Controller.getCupMatchList().get(i).getPeriod();
            model.addRow(rowData);
        }

        jt.setModel(model);

        jt.setPreferredScrollableViewportSize(new Dimension(1200, 500));
        jt.setFillsViewportHeight(true);
        JScrollPane jps = new JScrollPane(jt);
        jps.setVisible(true);
        panel.add(jps);

        frame.add(panel);
        frame.setTitle("View CupMatches");
        frame.setVisible(true);
        frame.setSize(1300, 700);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
    }

     public static void viewLeagueMatches() {
        JFrame frame = new JFrame();
        JTable jt = new JTable();
        JPanel panel = new JPanel();
        String[][] data;
        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int data, int columns) {
                return false;
            }
        };

        Object[] columns = {"ID", "Name", "Result", "Date", "Opponent", "Attendance","TicketPrice"};

        model.setColumnIdentifiers(columns);

        Object[] rowData = new Object[7];
        for (int i = 0; i < Controller.getLeagueMatchList().size(); i++) {
            rowData[0] = Controller.getLeagueMatchList().get(i).getTeamId();
            rowData[1] = Controller.getLeagueMatchList().get(i).getTeamName();
            rowData[2] = Controller.getLeagueMatchList().get(i).getResult();
            rowData[3] = Controller.getLeagueMatchList().get(i).getDate();
            rowData[4] = Controller.getLeagueMatchList().get(i).getOpponent();
            rowData[5] = Controller.getLeagueMatchList().get(i).getAttendance();
            rowData[6] = Controller.getLeagueMatchList().get(i).getTicketprice();
            model.addRow(rowData);
        }

        jt.setModel(model);

        jt.setPreferredScrollableViewportSize(new Dimension(1200, 500));
        jt.setFillsViewportHeight(true);
        JScrollPane jps = new JScrollPane(jt);
        jps.setVisible(true);
        panel.add(jps);

        frame.add(panel);
        frame.setTitle("View LeagueMatches");
        frame.setVisible(true);
        frame.setSize(1300, 700);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
    }
}

   