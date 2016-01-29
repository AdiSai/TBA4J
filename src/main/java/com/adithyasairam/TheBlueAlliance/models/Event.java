package com.adithyasairam.thebluealliance.models;

/**
 * Created by Adi on 7/20/2015.
 */
public class Event {
    public String key;
    public String website;
    public boolean official;
    public String end_date;
    public String name;
    public String short_name;
    public Object facebook_eid;
    public Object event_district_string;
    public String venue_address;
    public int event_district;
    public String location;
    public String event_code;
    public int year;
    public Webcast[] webcast;
    public Alliance[] alliances;
    public String event_type_string;
    public String start_date;
    public int event_type;

    private static class Alliance {
        public Object[] declines;
        public String[] picks;
    }

    private static class Webcast
    {
        public String type;
        public String channel;
        public String file;
    }
}
