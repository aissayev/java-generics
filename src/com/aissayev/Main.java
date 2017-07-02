package com.aissayev;

public class Main {

    public static void main(String[] args) {
	// write your code here
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);
        // adelaideCrows.addPlayer(pat);
        // adelaideCrows.addPlayer(beckham);

        System.out.println(adelaideCrows.numPlayers());

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);

//        Team<String> brokenTeam = new Team<>("this won't work");
//        brokenTeam.addPlayer("no-one");

//        Team<SoccerPlayer> brokenTeam = new Team<>("this won't work");
//        brokenTeam.addPlayer("no-one");


        Team<SoccerPlayer> soccerTeam = new Team<>("England");
        soccerTeam.addPlayer(beckham);
    }
}
