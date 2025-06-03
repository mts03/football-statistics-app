package com.sales.football_statistics_app.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseModel implements Serializable {
    private TeamsModel team;
    private PregameFormModel pregameForm;

    public TeamsModel getTeam() {
        return team;
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
