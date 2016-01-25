package com.adithyasairam.TheBlueAllianceModels;

/**
 * Created by AdiSai on 1/24/16.
 */
public class Media {
    public String type;
    public String foreign_key;
    public Details details;

    private static class Details
    {
        public String image_partial;
    }
}
