package com.adithyasairam.tba4j;

import com.adithyasairam.tba4j.models.*;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Adi on 7/20/2015.
 */
public class Teams {
    public static Team getTeam(String teamKey)
    {
        Team teamToReturn = new Team();
        try
        {
            Gson gson = new GsonBuilder().create();
            String url = (Constants.TBA_API_URL + "team/" + teamKey);
            teamToReturn = gson.fromJson(DataRequest.getDataFromTBA(url), Team.class);
        }
        catch (Exception e) { e.printStackTrace(); }
        return teamToReturn;
    }

    public static Award[] getTeamEventAwards(String teamKey, String eventKey)
    {
        ArrayList<Award> teamEventAwardsToReturn = new ArrayList<>();
        try
        {
            Gson gson = new GsonBuilder().create();
            String url = (Constants.TBA_API_URL + "team/" + teamKey + "/event/" + eventKey + "/awards");
            Type listType = new TypeToken<ArrayList<Award>>() {}.getType();
            teamEventAwardsToReturn = gson.fromJson(DataRequest.getDataFromTBA(url), listType);
        }
        catch (Exception e) { e.printStackTrace(); }
        return Arrays.copyOf(teamEventAwardsToReturn.toArray(), teamEventAwardsToReturn.toArray().length, Award[].class);
    }

    public static Match[] getTeamEventMatches(String teamKey, String eventKey)
    {
        ArrayList<Match> teamEventMatchesToReturn = new ArrayList<>();
        try
        {
            Gson gson = new GsonBuilder().create();
            String url = (Constants.TBA_API_URL + "team/" + teamKey + "/event/" + eventKey + "/matches");
            Type listType = new TypeToken<ArrayList<Match>>() {}.getType();
            teamEventMatchesToReturn = gson.fromJson(DataRequest.getDataFromTBA(url), listType);
        }
        catch (Exception e) { e.printStackTrace(); }
        return Arrays.copyOf(teamEventMatchesToReturn.toArray(), teamEventMatchesToReturn.toArray().length, Match[].class);
    }

    public static Event[] getTeamEvents(String teamKey, int year)
    {
        ArrayList<Event> teamEventsToReturn = new ArrayList<>();
        try
        {
            Gson gson = new GsonBuilder().create();
            String url = (Constants.TBA_API_URL + "team/" + teamKey + "/" + year + "/events");
            Type listType = new TypeToken<ArrayList<Event>>() {}.getType();
            teamEventsToReturn = gson.fromJson(DataRequest.getDataFromTBA(url), listType);
        }
        catch (Exception e) { e.printStackTrace(); }
        return Arrays.copyOf(teamEventsToReturn.toArray(), teamEventsToReturn.toArray().length, Event[].class);
    }

    public static Award[] getTeamHistoricalAwards(String teamKey)
    {
        ArrayList<Award> teamHistoricalAwardsToReturn = new ArrayList<>();
        try
        {
            Gson gson = new GsonBuilder().create();
            String url = (Constants.TBA_API_URL + "team/" + teamKey + "/history/awards");
            Type listType = new TypeToken<ArrayList<Award>>() {}.getType();
            teamHistoricalAwardsToReturn = gson.fromJson(DataRequest.getDataFromTBA(url), listType);
        }
        catch (Exception e) { e.printStackTrace(); }
        return Arrays.copyOf(teamHistoricalAwardsToReturn.toArray(), teamHistoricalAwardsToReturn.toArray().length, Award[].class);
    }

    public static Event[] getTeamHistoryEvents(String teamKey)
    {
        ArrayList<Event> teamHistoricalEventsToReturn = new ArrayList<>();
        try
        {
            Gson gson = new GsonBuilder().create();
            String url = (Constants.TBA_API_URL + "team/" + teamKey + "/history/events");
            Type listType = new TypeToken<ArrayList<Event>>() {}.getType();
            teamHistoricalEventsToReturn = gson.fromJson(DataRequest.getDataFromTBA(url), listType);
        }
        catch (Exception e) { e.printStackTrace(); }
        return Arrays.copyOf(teamHistoricalEventsToReturn.toArray(), teamHistoricalEventsToReturn.toArray().length, Event[].class);
    }

    public static Media[] getTeamMedia(String teamKey, int year)
    {
        ArrayList<Media> teamMediaLocationsToReturn = new ArrayList<>();
        try
        {
            Gson gson = new GsonBuilder().create();
            String url = (Constants.TBA_API_URL + "team/" + teamKey + "/" + year + "/media");
            Type listType = new TypeToken<ArrayList<Media>>() {}.getType();
            teamMediaLocationsToReturn = gson.fromJson(DataRequest.getDataFromTBA(url), listType);
        }
        catch (Exception e) { e.printStackTrace(); }
        return Arrays.copyOf(teamMediaLocationsToReturn.toArray(), teamMediaLocationsToReturn.toArray().length, Media[].class);
    }
}
