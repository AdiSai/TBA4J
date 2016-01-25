package com.adithyasairam.TheBlueAllianceModels;

/**
 * Created by AdiSai on 1/24/16.
 */
public class Award {
    public String event_key;
    public int award_type;
    public String name;
    public RecipientList[] recipient_list;
    public int year;

    private static class RecipientList
    {
        public int team_number;
        public Object awardee;
    }
}
