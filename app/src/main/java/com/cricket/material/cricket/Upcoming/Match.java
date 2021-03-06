
package com.cricket.material.cricket.Upcoming;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)

@JsonPropertyOrder({
    "date",
    "matchid",
    "matchno",
    "team1",
    "team2",
    "venue"
})
public class Match {

    @JsonProperty("date")
    private String date;
    @JsonProperty("matchid")
    private String matchid;
    @JsonProperty("matchno")
    private String matchno;
    @JsonProperty("team1")
    private String team1;
    @JsonProperty("team2")
    private String team2;
    @JsonProperty("venue")
    private String venue;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The date
     */
    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    /**
     * 
     * @param date
     *     The date
     */
    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * 
     * @return
     *     The matchid
     */
    @JsonProperty("matchid")
    public String getMatchid() {
        return matchid;
    }

    /**
     * 
     * @param matchid
     *     The matchid
     */
    @JsonProperty("matchid")
    public void setMatchid(String matchid) {
        this.matchid = matchid;
    }

    /**
     * 
     * @return
     *     The matchno
     */
    @JsonProperty("matchno")
    public String getMatchno() {
        return matchno;
    }

    /**
     * 
     * @param matchno
     *     The matchno
     */
    @JsonProperty("matchno")
    public void setMatchno(String matchno) {
        this.matchno = matchno;
    }

    /**
     * 
     * @return
     *     The team1
     */
    @JsonProperty("team1")
    public String getTeam1() {
        return team1;
    }

    /**
     * 
     * @param team1
     *     The team1
     */
    @JsonProperty("team1")
    public void setTeam1(String team1) {
        this.team1 = team1;
    }

    /**
     * 
     * @return
     *     The team2
     */
    @JsonProperty("team2")
    public String getTeam2() {
        return team2;
    }

    /**
     * 
     * @param team2
     *     The team2
     */
    @JsonProperty("team2")
    public void setTeam2(String team2) {
        this.team2 = team2;
    }

    /**
     * 
     * @return
     *     The venue
     */
    @JsonProperty("venue")
    public String getVenue() {
        return venue;
    }

    /**
     * 
     * @param venue
     *     The venue
     */
    @JsonProperty("venue")
    public void setVenue(String venue) {
        this.venue = venue;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
