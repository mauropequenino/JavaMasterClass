package generics.challenge;

import generics.lesson_2.SoccerPlayer;

public class Main {
    public static void main(String[] args) {
        League<Team<FootballPlayer>> footballLeague = new League<>("AFL");

        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("Freamntle");
        Team<BaseBallPlayer> base= new Team<>("Chicago");

        footballLeague.add(adelaideCrows);
        footballLeague.add(melbourne);
        footballLeague.add(hawthorn);
        footballLeague.add(fremantle);

        footballLeague.showLeagueTab();

        BaseBallPlayer pat = new BaseBallPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team rawTeam = new Team("Raw Team");
        rawTeam.addPlayer(pat);
//        rawTeam.addPlayer(beckham);

        footballLeague.add(rawTeam);
        League<Team> rawLeague = new League<>("Raw");
        rawLeague.add(adelaideCrows);
        rawLeague.add(base);
        rawLeague.add(rawTeam);

        League reallyRow = new League("Really raw");
        reallyRow.add(adelaideCrows);
        reallyRow.add(base);
        reallyRow.add(rawTeam);

    }
}
