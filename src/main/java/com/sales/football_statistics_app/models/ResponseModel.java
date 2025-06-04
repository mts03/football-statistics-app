package com.sales.football_statistics_app.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseModel implements Serializable {
    private TeamsModel name;
    private TeamsModel team;
    private PregameFormModel pregameForm;
    private TeamsModel tournament;

    public TeamsModel getTeam() {
        return team;
    }

    public TeamsModel getTournament() {
        return tournament;
    }

    public void setTournament(TeamsModel tournament) {
        this.tournament = tournament;
    }

    public TeamsModel getName() {
        return name;
    }

    public void setName(TeamsModel name) {
        this.name = name;
    }

    public void setTeam(TeamsModel team) {
        this.team = team;
    }

    public PregameFormModel getPregameForm() {
        return pregameForm;
    }

    public void setPregameForm(PregameFormModel pregameForm) {
        this.pregameForm = pregameForm;
    }
}
