package UnitNine.Assignment;

import java.util.ArrayList;
public class UltimateTeam {
    // instance variables
    private ArrayList <UltimatePlayer> players;
    private ArrayList <Coach> coaches;
    // class constructor
    public UltimateTeam(ArrayList <UltimatePlayer> players, ArrayList <Coach> coaches) {
        this.players = players;
        this.coaches = coaches;
    }

    // Returns a string containing the names of all players with the "cutter" position on the team
    public String getCutters() {
        StringBuilder result = new StringBuilder();
        for (UltimatePlayer player: players) {
            if (player.getPosition().equals("cutter")) {
                result.append(player).append("\n");
            }
        }
        return result.toString();
    }
    // Returns a string containing the names of all players with the "handler" position on the team
    public String getHandlers() {
        StringBuilder result = new StringBuilder();
        for (UltimatePlayer player: players) {
            if (player.getPosition().equals("handler")) {
                result.append(player).append("\n");
            }
        }
        return result.toString();
    }
    // Returns a string containing the names of all coaches and players on the team
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("COACHES\n");
        for (Coach coach: coaches) {
            result.append(coach.toString()).append("\n");
        }
        result.append("\nPLAYERS\n");
        for (UltimatePlayer player: players) {
            result.append(player.toString()).append("\n");
        }
        return result.toString();
    }
}