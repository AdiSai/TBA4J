package com.adithyasairam.tba4j.examples;

import com.adithyasairam.tba4j.Events;
import com.adithyasairam.tba4j.models.Event;

/**
 * Created by AdiSai on 7/19/16.
 */
public class Runner {
    public static void main(String[] args) {
        Event[] events = Events.getEvents(2016);
        for (Event e : events) {
            if (e.name.contains("Regional")) {
                Event.Webcast[] webcast = e.webcast;
                System.out.println(webcast[0].channel);
            }
        }
        System.out.println(new TeamExamples().getTeamName(226));
    }
}
