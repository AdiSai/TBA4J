package com.adithyasairam.tba4j.models;

/**
 * Created by AdiSai on 1/24/16.
 */
public class Award {
    public String event_key;
    public int award_type;
    public String name;
    public RecipientList[] recipient_list;
    public int year;

    public static class RecipientList
    {
        public int team_number;
        public Object awardee;
    }
}
