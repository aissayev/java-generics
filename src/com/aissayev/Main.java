package com.aissayev;

public class Main {

    public static void main(String[] args) {
	// write your code here
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");
        SoccerPlayer zidane = new SoccerPlayer("Zidane");
        SoccerPlayer gotze = new SoccerPlayer("Gotze");

        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);

        System.out.println(adelaideCrows.numPlayers());

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);

//        Team<String> brokenTeam = new Team<>("this won't work");
//        brokenTeam.addPlayer("no-one");

//        Team<SoccerPlayer> brokenTeam = new Team<>("this won't work");
//        brokenTeam.addPlayer("no-one");

        Team<SoccerPlayer> england = new Team<>("England");
        england.addPlayer(beckham);

        Team<SoccerPlayer> france = new Team<>("France");
        france.addPlayer(zidane);

        Team<SoccerPlayer> germany = new Team<>("Germany");
        germany.addPlayer(gotze);

        england.matchResult(france, 2, 0);
        england.matchResult(germany, 1, 2);
        germany.matchResult(france, 3, 2);

        System.out.println("Rankings");
        System.out.println(england.getName() + ": " + england.ranking());
        System.out.println(france.getName() + ": " + france.ranking());
        System.out.println(germany.getName() + ": " + germany.ranking());

        System.out.println(england.compareTo(germany));
        System.out.println(germany.compareTo(england));
        System.out.println(england.compareTo(france));
        System.out.println(france.compareTo(england));
    }
}
