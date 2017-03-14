package com.adithyasairam.tba4j.prescout;

import com.adithyasairam.javautils.helpers.Helper;
import com.adithyasairam.tba4j.Events;
import com.adithyasairam.tba4j.Teams;
import com.adithyasairam.tba4j.models.Event;
import com.adithyasairam.tba4j.models.Match;
import com.adithyasairam.tba4j.models.Team;

/**
 * Created by AdiSai on 3/13/17.
 */
public class PreScouter {
    public static void main(String[] args) {
        Team[] input = Events.getEventTeamsList(args[0]);
        Team[] output = new Team[input.length];
        for (int i = 0; i < input.length - 1; i++) {
            Team[] compared = compare(new Team[] { input[i], input[i+1] });
            output[i] = compared[0];
            output[i+1] = compared[1];
        }
    }

    private static Team[] compare(Team[] inputs) {
        Team[] outputs = new Team[inputs.length];
        Team team1 = inputs[0];
        Team team2 = inputs[1];
        String team1Key = team1.key;
        String team2Key = team2.key;
        Event[] team1Events = Teams.getTeamEvents(team1Key, 2017);
        Event[] team2Events = Teams.getTeamEvents(team2Key, 2017);
        int team1score = 0, team2score = 0;
        /* COMPARISONS */

        for (Event e : team1Events) {
            Match[] matches =  Events.getEventMatches(e.key);
            Match finalMatch = matches[matches.length - 1];
            for (Match.Alliance finalMatchAlliance : finalMatch.alliances) {
                String[] finalMatchTeams = finalMatchAlliance.teams;
                if (Helper.arrayContains(finalMatchTeams, team1Key)) { team1score++; }
            }
        }
        for (Event e : team2Events) {
            Match[] matches =  Events.getEventMatches(e.key);
            Match finalMatch = matches[matches.length - 1];
            for (Match.Alliance finalMatchAlliance : finalMatch.alliances) {
                String[] finalMatchTeams = finalMatchAlliance.teams;
                if (Helper.arrayContains(finalMatchTeams, team2Key)) { team2score++; }
            }
        }

        if (team1score >= team2score) {
            outputs[0] = team1;
            outputs[1] = team2;
        }
        else {
            outputs[0] = team2;
            outputs[1] = team1;
        }
        return outputs;
    }

}
