package com.aissayev;

public class Main {

    public static void main(String[] args) {

        // Soccer - no league
        SoccerPlayer beckham = new SoccerPlayer("Beckham");
        SoccerPlayer zidane = new SoccerPlayer("Zidane");
        SoccerPlayer gotze = new SoccerPlayer("Gotze");

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

        // Football League
        League<Team<FootballPlayer>> footbalLeague = new League<>("NFL");
        Team<FootballPlayer> patriots = new Team<>("Patriots");
        Team<FootballPlayer> giants = new Team<>("Giants");
        Team<FootballPlayer> rams = new Team<>("Rams");
        Team<FootballPlayer> jets = new Team<>("Jets");

        footbalLeague.add(patriots);
        footbalLeague.add(giants);
        footbalLeague.add(rams);
        footbalLeague.add(jets);

        patriots.matchResult(giants, 1, 0);
        patriots.matchResult(rams, 5, 3);
        patriots.matchResult(jets, 3, 1);
        giants.matchResult(rams, 2, 1);
        giants.matchResult(jets, 2, 2);
        rams.matchResult(jets, 0, 3);

        footbalLeague.showLeagueTable();
    }
}
