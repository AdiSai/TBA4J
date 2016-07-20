package com.adithyasairam.tba4j.examples;

import com.adithyasairam.tba4j.Teams;
import com.adithyasairam.tba4j.models.Team;

/**
 * Created by AdiSai on 7/19/16.
 */
public class TeamExamples {
    public String getTeamName(int number) {
        return Teams.getTeam("frc" + number).nickname;
    }
}
