package com.adithyasairam.thebluealliance.models;

/**
 * Created by AdiSai on 1/24/16.
 */
public class Match {
    public String comp_level;
    public int match_number;
    public Video[] videos;
    public Object time_string;
    public int set_number;
    public String key;
    public int time;
    public Alliance[] alliances;
    public String event_key;

    private static class Alliance {
        public int auto;
        public int foul;
        public int score;
        public String[] teams;
    }

    private static class Video
    {
        public String type;
        public String key;
    }
}
