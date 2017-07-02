package com.aissayev;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by aissayev on 02/07/2017.
 */
public class League<T extends Team>{
  private String name;
  private ArrayList<T> league = new ArrayList<>();

  public League(String name) {
    this.name = name;
  }

  public boolean add(T team) {
    if(league.contains(team)) {
      return false;
    }
    league.add(team);
    return true;
  }

  public void showLeagueTable() {
    Collections.sort(league);
    int i = 1;
    for (T t: league) {
      System.out.println(i + ". " + t.getName() + " " + t.ranking() );
      i++;
    }

  }

}
