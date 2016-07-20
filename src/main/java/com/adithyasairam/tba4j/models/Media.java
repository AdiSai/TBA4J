package com.adithyasairam.tba4j.models;

/**
 * Created by AdiSai on 1/24/16.
 */
public class Media {
    public String type;
    public String foreign_key;
    public Details details;

    public static class Details
    {
        public String image_partial;
    }
}
