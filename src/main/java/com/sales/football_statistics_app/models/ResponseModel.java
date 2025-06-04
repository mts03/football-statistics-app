package com.sales.football_statistics_app.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.coyote.Response;

import javax.xml.transform.Result;
import java.io.Serializable;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseModel implements Serializable {
    private TeamsModel id;
    private TeamsModel name;
    private TeamsModel team;
    private PregameFormModel pregameForm;
    private TeamsModel tournament;
    private List<ResultModel> results;
    private TeamsModel entity;

    public TeamsModel getEntity() {
        return entity;
    }

    public void setEntity(TeamsModel entity) {
        this.entity = entity;
    }

    public List<ResultModel> getResults() {
        return results;
    }

    public void setResults(List<ResultModel> results) {
        this.results = results;
    }

    public TeamsModel getId() {
        return id;
    }

    public void setId(TeamsModel id) {
        this.id = id;
    }

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
