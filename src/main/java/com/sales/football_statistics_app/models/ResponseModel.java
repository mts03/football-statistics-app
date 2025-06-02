package com.sales.football_statistics_app.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseModel implements Serializable {
    public TeamsModel team;

    public TeamsModel getTeam() {
        return team;
    }

    public void setTeam(TeamsModel team) {
        this.team = team;
    }
}
